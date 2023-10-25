
package lab4;

public class NorthSoftBank extends Softbank{
    
    public NorthSoftBank(int ID, String name, String foundingDate, String address, int senior, int junior, double coefficientSalary){
        super(ID, name, foundingDate, address, senior, junior, coefficientSalary);      
    }

    public NorthSoftBank() {
    }
    
    
    @Override
    public int totalEmployee() {
        return (int) senior + junior; 
    }

    @Override
    public double calculateEstimatedCost() {
        return (long) (senior*5000*coefficientSalary + junior*2000*coefficientSalary);
    }

    @Override
    public double calculateActualCost() {
        return calculateEstimatedCost();
    }
    
    @Override
    public double calculateSeniorSalary() {
        return (double) (5000*coefficientSalary);
    }
    
    @Override
    public double calculateJuniorSalary() {
        return (double) (2000*coefficientSalary);
    }
    
    @Override
    public String toString() {
        return "SoftBank in the North Region:\n" +super.toString();
    }

}
