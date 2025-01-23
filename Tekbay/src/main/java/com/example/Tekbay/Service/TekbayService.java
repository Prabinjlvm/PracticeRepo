package com.example.Tekbay.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.Tekbay.Common.ApiResponse;
import com.example.Tekbay.Common.JlvmDto;
import com.example.Tekbay.Common.TekbayDto;
import com.example.Tekbay.Modal.Tekbay;
import com.example.Tekbay.Repository.TekbayRepository;

@Service
public class TekbayService {
       
	@Autowired
	TekbayRepository tekbayRespository;
	public ResponseEntity<Object> getTekbay(){
		List<Tekbay> getResult = tekbayRespository.findAll();
		ApiResponse<List<Tekbay>> getResponse = new ApiResponse<>(true,"Data retrieved successfully",getResult,HttpStatus.OK.value());
		return ResponseEntity.ok(getResponse);
	}
	
	public ResponseEntity<Object> postTekbay(Tekbay tekbay){
		
		Tekbay newTekbay = tekbayRespository.save(tekbay);
		ApiResponse<Tekbay> postResponse = new ApiResponse<>(true,"Data added successfully",newTekbay,HttpStatus.OK.value());
		return ResponseEntity.ok(postResponse);
	}
	
	public ResponseEntity<Object> deleteTekbay(int id){
		if(!tekbayRespository.existsById(id)) {
			ApiResponse<String> failedDelete = new ApiResponse<>(false,"Data not found",null,HttpStatus.NOT_FOUND.value());
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(failedDelete);
		}
		else {
			tekbayRespository.deleteById(id);
			ApiResponse<String> successDelete = new ApiResponse<>(true,"Data deleted successfully",null,HttpStatus.OK.value());
			return ResponseEntity.ok(successDelete);
		}
	}
   
	public ResponseEntity<Object> updateTekbay(int id,TekbayDto tekbayDto){
		if(!tekbayRespository.existsById(id)) {
			ApiResponse<String> failedUpdate = new ApiResponse<>(false,"Data not found",null,HttpStatus.NOT_FOUND.value());
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(failedUpdate);
		}
		else {
			Tekbay existingTekbay = tekbayRespository.findById(id).orElse(null);
			existingTekbay.setDesignation(tekbayDto.getDesignation());
			existingTekbay.setSalary(tekbayDto.getSalary());
			
			Tekbay updatedTekbay = tekbayRespository.save(existingTekbay);
			ApiResponse<Tekbay> successupdate = new ApiResponse<>(true,"Data updated successfully",updatedTekbay,HttpStatus.OK.value());
			return ResponseEntity.ok(successupdate);
		}
	}
	
	public ResponseEntity<Object> getCombinedData(){
		List<JlvmDto> combined = tekbayRespository.getCombinedData();
		ApiResponse<List<JlvmDto>> combinedResponse = new ApiResponse<>(true,"Data retrieved successfully",combined,HttpStatus.OK.value());
		return ResponseEntity.ok(combinedResponse);
	}
}














