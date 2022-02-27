package com.javapackage.EmpWageProblem;

public class Uc3PartTimeEmpWadge
{
    public static void main(String[] args)
    {
        // Constants
        int EmpWadgePerHr = 20;
        int EmpHr = 8;
        int IsFullTime = 1;
        int IsPartTime = 2;
        int Salary = 0;
        // Computation
        double empCheck =Math.floor(Math.random()*10)%3;
        if (empCheck == IsFullTime)
        {
            Salary = (EmpHr * EmpWadgePerHr);
            System.out.println("Employee Salary For Full Time Is : " + Salary);
        }
        else if (empCheck == IsPartTime) {
            EmpHr =4;
            Salary = (EmpHr * EmpWadgePerHr);
            System.out.println("Employee Salary For Part Time Is : " + Salary);
        }
        else
        System.out.println("Employee Salary For Abscent is : " +Salary);
        }

    }

