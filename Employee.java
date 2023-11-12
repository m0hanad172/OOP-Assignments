/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2employeeclass;

/**
 *
 * @author USER
 */
public class Employee {
     String name ;
    int socialSecurityNum ;
    float wage;
    int workingHours;
    
    void displayInfo(){
        
        System.out.println("name: "+this.name+" socialSecurityNum: "+socialSecurityNum);
    }
    
    void displaySalary(){
        System.out.println("the salary :"+this.wage*this.workingHours);
    }
    
}
