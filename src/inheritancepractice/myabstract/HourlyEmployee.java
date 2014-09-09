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
public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private double weeklyHours;
    private double weeklyPay;
    
    public HourlyEmployee(double hourlyRate, double weeklyHours){
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
    }
    
    @Override
    public void getWeeklyPay(){
        this.weeklyPay = hourlyRate * weeklyHours;
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
    
    public void setWeeklyPay(double weeklyPay){
        this.weeklyPay = weeklyPay;
    }
    
    
}
