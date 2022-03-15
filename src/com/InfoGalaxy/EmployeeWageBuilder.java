package com.InfoGalaxy;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        //UC_2: checkAttendeance
        final int WAGE_PER_HR = 20;
        final int FULL_DAY_HR = 8;
        int total_wage = 0;
        //UC-1: checkAttendeance
        Random random = new Random();
        int checkAttendeance = random.nextInt() % 2;
        if (checkAttendeance == 0) {
            System.out.println("Employee is Absent.");
        } else {
            System.out.println("Employee is Present.");
            total_wage = FULL_DAY_HR * WAGE_PER_HR;
        }
        System.out.println("Total wage = "+ total_wage);
        }
    }

