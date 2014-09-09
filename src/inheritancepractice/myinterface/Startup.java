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
public class Startup {
     public static void main(String[] args) {
         
        HourlyEmployee employee1 = new HourlyEmployee("Bob",1,12,30);
        SalariedEmployee employee2 = new SalariedEmployee("Joe",2,40000);
        SalaryPlusCommissionEmployee employee3 = new SalaryPlusCommissionEmployee("Jack",3,75000,15000);
        
     }
}
