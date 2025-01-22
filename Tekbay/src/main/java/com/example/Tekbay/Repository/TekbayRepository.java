package com.example.Tekbay.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Tekbay.Modal.Tekbay;

public interface TekbayRepository extends JpaRepository<Tekbay,Integer > {

	List<Tekbay> findAll();

}
