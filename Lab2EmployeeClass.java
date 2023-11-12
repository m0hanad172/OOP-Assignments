/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2employeeclass;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Lab2EmployeeClass {

    public static void main(String[] args) {
       
        Employee e1=new Employee ();
        e1.name="ali";
        e1.socialSecurityNum=233;
        e1.wage=3.5f;
        e1.workingHours=2;
        e1.displayInfo();
        e1.displaySalary();
        Employee e2=new Employee ();
        Scanner in=new Scanner (System.in);
        e2.name=in.next();
        e2.socialSecurityNum=in.nextInt();
        e2.wage=in.nextFloat();
        e2.workingHours=in.nextInt();
        
        e2.displayInfo();
        e2.displaySalary();
        
        
        
        
        
        
        
        
        
        
    }
}
