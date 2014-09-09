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
public class Startup {
     public static void main(String[] args) {
         
        HourlyEmployee employee1 = new HourlyEmployee("Bob","Male","IT Repair",25,1,12,30,2520);
        SalariedEmployee employee2 = new SalariedEmployee("Joe","Male","IT Manager",30,2,40000);
        SalaryPlusCommissionEmployee employee3 = new SalaryPlusCommissionEmployee("Jack","Male","CEO",40,3,75000,15000);
        
        System.out.println("Employee ID: " + employee1.getEmployeeID() + "\nEmployee Name: " + employee1.getName()
                + "\nEmployee Gender: " + employee1.getGender()  + "\nEmployee Age: " + employee1.getAge()
                + "\nEmployee Job Title: " + employee1.getJobTitle() + "\nEmployee Rate: " + employee1.getHourlyRate()  
                + "\nEmployee Hours: " + employee1.getWeeklyHours()  + "\nEmployee Weekly Pay: " + employee1.getWeeklyPay());
        
        System.out.println("Employee ID: " + employee2.getEmployeeID() + "\nEmployee Name: " + employee2.getName()
                + "\nEmployee Gender: " + employee2.getGender()  + "\nEmployee Age: " + employee2.getAge()
                + "\nEmployee Job Title: " + employee2.getJobTitle() + "\nEmployee Salary: " + employee2.getAnnualSalary());
        
        System.out.println("Employee ID: " + employee3.getEmployeeID() + "\nEmployee Name: " + employee3.getName()
                + "\nEmployee Gender: " + employee3.getGender()  + "\nEmployee Age: " + employee3.getAge()
                + "\nEmployee Job Title: " + employee3.getJobTitle() + "\nEmployee Salary: " + employee3.getAnnualSalary() 
                + "\nEmployee Commission: " + employee3.getAnnualCommission());
     }
}
