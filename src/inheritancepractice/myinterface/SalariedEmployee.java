/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritancepractice.myinterface;




/**
 *
 * @author Jacob
 */
public class SalariedEmployee implements Employee{
   private String name;
    private int employeeID;
    protected double annualSalary;
    private double weeklyPay;
    
    public SalariedEmployee(String name, int employeeID, double annualSalary){
        this.annualSalary = annualSalary;
    }
    
    @Override
    public double getWeeklyPay(){
        this.weeklyPay = annualSalary / 52;
        return weeklyPay;
    }
    
    @Override
    public String getName(){
        this.name = name;
        return name;
    }
    
    @Override
    public int getEmployeeID(){
        this.employeeID = employeeID;
        return employeeID;
    }
    
    public double getAnnualSalary(){
        return annualSalary;
    }
    
    public void setAnnualSalary(double annualSalary){
        this.annualSalary = annualSalary;
    }
}
