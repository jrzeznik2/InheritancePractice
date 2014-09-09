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
public class SalaryPlusCommissionEmployee extends SalariedEmployee{
    private double annualCommission;
    
    public SalaryPlusCommissionEmployee(String name, String gender, String jobTitle, int age, int employeeID, double annualSalary, double annualCommission){
        super(name, gender, jobTitle, age, employeeID,annualSalary);
        this.annualCommission = annualCommission;
    }
    
    public double getAnnualCommission(){
        return annualCommission;
    }
    
    public void setAnnualCommission(double annualCommission){
        this.annualCommission = annualCommission;
    }
    
    
}
