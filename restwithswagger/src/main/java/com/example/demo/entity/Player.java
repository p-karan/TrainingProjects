package com.example.demo.entity;


import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;

@Data
@Component
@Entity
@Table(name="JPlayer")
public class Player {
    @Id
    private long playerId;
    @Length(max=10,min=3,message = "Player name should not be more than 10 chars")
    private String playerName;
    @DecimalMax("5.0")
    @DecimalMin("1.0")
    private double iccRanking;
}
