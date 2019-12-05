package com.example.bootquickstart.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private long bookNumber;
    private String bookName;
}
