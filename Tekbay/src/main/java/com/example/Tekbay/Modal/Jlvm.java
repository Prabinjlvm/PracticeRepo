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
@Table(name="jlvm")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Jlvm {
      @Id
      @GeneratedValue(strategy=GenerationType.IDENTITY)
      
      private int br_id;
      private String location;
      private String address;
}
