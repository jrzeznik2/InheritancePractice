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
public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private double weeklyHours;
    private double weeklyPay;
    
    public HourlyEmployee(String name, String gender, String jobTitle, int age, int employeeID, double hourlyRate, double weeklyHours, double weeklyPay){
        super(name, gender, jobTitle, age, employeeID);
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.weeklyPay = weeklyPay;
    }
    
    public double getHourlyRate(){
        return hourlyRate;
    }
    
    public void setHourlyRate(double hourlyRate){
        this.hourlyRate = hourlyRate;
    }
    
    public double getWeeklyHours(){
        return weeklyHours;
    }
    
    public void setWeeklyHours(double weeklyHours){
        this.weeklyHours = weeklyHours;
    }
    
    public double getWeeklyPay(){
        return weeklyPay;
    }
    
    public void setWeeklyPay(double weeklyPay){
        this.weeklyPay = weeklyPay;
    }
    
    
}
