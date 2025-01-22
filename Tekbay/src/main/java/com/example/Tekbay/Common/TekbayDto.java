package com.example.Tekbay.Common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TekbayDto {
        private int id;
        private String designation;
        private Double salary;
}
