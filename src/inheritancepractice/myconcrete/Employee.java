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
public class Employee {
    private String name;
    private String gender;
    private String jobTitle;
    private int age;
    private int employeeID;
    
    public Employee(String name, String gender, String jobTitle, int age, int employeeID){
        this.name = name;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.age = age;
        this.employeeID = employeeID;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getGender(){
        return gender;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
    
    public String getJobTitle(){
        return jobTitle;
    }
    
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getEmployeeID(){
        return employeeID;
    }
    
    public void setEmployeeID(int employeeID){
        this.employeeID = employeeID;
    }
}
