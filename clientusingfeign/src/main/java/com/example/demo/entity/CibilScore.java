package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class CibilScore {

        private long customerId;
        private String customerName;
        private String panCardNumber;
        private int cibilScore;


}
