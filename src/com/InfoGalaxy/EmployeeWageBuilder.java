package com.InfoGalaxy;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
    //UC_1: checkAttendeance
        Random random = new Random();
        int checkAttendeance = random.nextInt()%2;{
            System.out.println(("Attendance ="+checkAttendeance));
        }
        if (checkAttendeance == 0) {
            System.out.println("Employee is Absent.");
        } else if(checkAttendeance == 1) {
            System.out.println("Employee is Present.");

        }
        else{
            System.out.println(("Employee is Invalid"));
        }
    }
}
