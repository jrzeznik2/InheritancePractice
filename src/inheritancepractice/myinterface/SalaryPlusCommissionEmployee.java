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
public class SalaryPlusCommissionEmployee extends SalariedEmployee{
    private double annualCommission;
    private double weeklyPay;
    
    public SalaryPlusCommissionEmployee(String name, int employeeID, double annualSalary, double annualCommission){
        super(name, employeeID, annualSalary);
        this.annualCommission = annualCommission;
    }
    
    @Override
    public double getWeeklyPay(){
        this.weeklyPay = (annualSalary + annualCommission) / 52;
        return weeklyPay;
    }
    
    public double getAnnualCommission(){
        return annualCommission;
    }
    
    public void setAnnualCommission(double annualCommission){
        this.annualCommission = annualCommission;
    }
    
    
}
