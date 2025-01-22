package com.example.Tekbay.Modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tekbay")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tekbay {
        
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	private String emp_name;
	private String designation;
	private Double salary;
	private Integer branch_id;
}
