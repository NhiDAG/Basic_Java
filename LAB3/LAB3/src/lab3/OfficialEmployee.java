/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author ASUS
 */
public class OfficialEmployee extends Employee{
    private double OTtime;
    
    public OfficialEmployee(int ID, String fullName, int age, String birthday, int workDay, double OTtime) {
        super(ID, fullName, age, birthday, workDay, OTtime);
        this.OTtime = OTtime;

    }

    public OfficialEmployee(){
    }

    public double getOTtime() {
        return OTtime;
    }

    public void setOTtime(double OTtime) {
        this.OTtime = OTtime;
    }
    
    
    @Override
    public long calculateSalary(){
      return (long) (getWorkDay()*1000000*OTtime*100000);
    }
    
    @Override
    public String toString() {
        return "OfficialEmployee:\n" +super.toString();
    }
}
