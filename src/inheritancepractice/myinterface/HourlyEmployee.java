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
public class HourlyEmployee implements Employee {
    private String name;
    private int employeeID;
    private double hourlyRate;
    private double weeklyHours;
    private double weeklyPay;
    
    public HourlyEmployee(String name, int employeeID, double hourlyRate, double weeklyHours){
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
    }
    
    @Override
    public double getWeeklyPay(){
        this.weeklyPay = hourlyRate * weeklyHours;
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
    
    public double getHourlyRate(){
        return hourlyRate;
    }
    
    public double getWeeklyHours(){
        return weeklyHours;
    }
    
    
}
