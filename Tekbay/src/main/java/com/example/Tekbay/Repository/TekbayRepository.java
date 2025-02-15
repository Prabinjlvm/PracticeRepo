package com.example.Tekbay.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Tekbay.Common.JlvmDto;
import com.example.Tekbay.Modal.Tekbay;

public interface TekbayRepository extends JpaRepository<Tekbay,Integer > {

	List<Tekbay> findAll();
	
	@Query ("SELECT new com.example.Tekbay.Common.JlvmDto( t.emp_name, t.designation, j.location, j.address ) " +
	       "FROM Tekbay as t " +
	       "JOIN Jlvm as j ON t.branch_id = j.br_id " )
	List<JlvmDto> getCombinedData();

}
