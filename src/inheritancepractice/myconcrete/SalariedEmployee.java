/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritancepractice.myconcrete;


/**
 *
 * @author Jacob
 */
public class SalariedEmployee extends Employee{
    private double annualSalary;
    
    public SalariedEmployee(String name, String gender, String jobTitle, int age, int employeeID, double annualSalary){
        super(name, gender, jobTitle, age, employeeID);
        this.annualSalary = annualSalary;
    }
    
    public double getAnnualSalary(){
        return annualSalary;
    }
    
    public void setAnnualSalary(double annualSalary){
        this.annualSalary = annualSalary;
    }
}
