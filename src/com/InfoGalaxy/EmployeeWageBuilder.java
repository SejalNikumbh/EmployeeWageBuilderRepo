package com.InfoGalaxy;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        //UC_2: checkAttendeance
        //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
        final int WAGE_PER_HR = 20;
        final int FULL_DAY_HR = 8;
        final int PART_TIME_HR = 4;
        int total_wage = 0;
        //UC-1: checkAttendeance
        Random random = new Random();
        int checkAttendeance = random.nextInt() % 2;
        if (checkAttendeance == 0) {
            System.out.println("Employee is Absent.");
        } else {
            System.out.println("Employee is Present.");
            int empType = random.nextInt()%2;
            switch(empType) {
                case 0:
                    System.out.println("Employee is part time");
                    total_wage = PART_TIME_HR * WAGE_PER_HR;
                    break;
                case  1:
                case -1:
                    System.out.println("Employee is Full time");
                    total_wage = FULL_DAY_HR * WAGE_PER_HR;
                break;
            }
        }
        System.out.println("Total wage = "+ total_wage);
        }
    }

