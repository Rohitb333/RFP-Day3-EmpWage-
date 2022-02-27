package com.javapackage.EmpWageProblem;


public class Uc4UsingSwitchCase {
    public static void main(String[] args) {
        // Constants
        int EmpWadgePerHr = 20;
        int EmpHr = 8;
        int IsFullTime = 1;
        int IsPartTime = 2;
        int Salary = 0;
        int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
        switch (empCheck) {
            case 0:
                EmpHr = 8;
                Salary = (EmpHr * EmpWadgePerHr);
                System.out.println("Employee Salary For Full Time Is : " + Salary);
                break;

            case 1:
                EmpHr = 4;
                Salary = (EmpHr * EmpWadgePerHr);
                System.out.println("Employee Salary For Part Time Is : " + Salary);
                break;

            case 2:
                EmpHr = 0;
                Salary = (EmpHr * EmpWadgePerHr);
                System.out.println("Employee Salary For Abscent Is : " + Salary);
                break;
        }
    }
}




