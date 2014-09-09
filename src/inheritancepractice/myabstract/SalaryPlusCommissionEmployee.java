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
public class SalaryPlusCommissionEmployee extends SalariedEmployee{
    private double annualCommission;
    private double weeklyPay;
    
    public SalaryPlusCommissionEmployee(double annualSalary, double annualCommission){
        super(annualSalary);
        this.annualCommission = annualCommission;
    }
    
    @Override
    public void getWeeklyPay(){
        this.weeklyPay = (annualSalary + annualCommission) / 52;
    }
    
    public double getAnnualCommission(){
        return annualCommission;
    }
    
    public void setAnnualCommission(double annualCommission){
        this.annualCommission = annualCommission;
    }
    
    
}
