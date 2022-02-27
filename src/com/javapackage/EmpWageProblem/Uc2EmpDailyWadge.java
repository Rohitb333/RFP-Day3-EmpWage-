package com.javapackage.EmpWageProblem;

public class Uc2EmpDailyWadge {
    public static void main(String[] args)
    {
        // Constants
        int EmpWadgePerHr = 20;
        int EmpHr = 8;
        int IsPresent = 1;
        int salary = 0;

        // Computation
        double empCheck = Math.floor(Math.random()*10)%2;
        if ( empCheck == IsPresent )
        {
            salary = (EmpHr * EmpWadgePerHr);
            System.out.println( "Employee Salary is : " +salary);
        }
        else
        {
            System.out.println("Employee Salary is : " +salary);
        }
    }
}
