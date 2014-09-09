/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritancepractice.myabstract;



/**
 *
 * @author Jacob
 */
public class SalariedEmployee extends Employee{
    protected double annualSalary;
    private double weeklyPay;
    
    public SalariedEmployee(double annualSalary){
        this.annualSalary = annualSalary;
    }
    
    @Override
    public void getWeeklyPay(){
        this.weeklyPay = annualSalary / 52;
    }
    
    public double getAnnualSalary(){
        return annualSalary;
    }
    
    public void setAnnualSalary(double annualSalary){
        this.annualSalary = annualSalary;
    }
}
