package com.training.sc;

import java.time.LocalDate;
import java.util.Scanner;

public class UserInput {
    private String username;
    private String email;
    private long phone;
    private LocalDate date;

    public static void main(String[] args) {
        UserInput ui= new UserInput();
        Scanner sc=new Scanner(System.in);
        ui.username=sc.next();
        ui.email=sc.next();
        ui.phone=sc.nextLong();
        ui.date=LocalDate.now();


    }
}
