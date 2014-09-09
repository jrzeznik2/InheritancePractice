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
public class Startup {
     public static void main(String[] args) {
         
        HourlyEmployee employee1 = new HourlyEmployee(12,30);
        SalariedEmployee employee2 = new SalariedEmployee(40000);
        SalaryPlusCommissionEmployee employee3 = new SalaryPlusCommissionEmployee(75000,15000);
        
     }
}
