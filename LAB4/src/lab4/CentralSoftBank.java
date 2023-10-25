
package lab4;

    public class CentralSoftBank extends Softbank{
        private int collaborators;
    
    public CentralSoftBank(int ID, String name, String foundingDate, String address, int senior, int junior, double coefficientSalary, int collaborators){
        super(ID, name, foundingDate, address, senior, junior, coefficientSalary);
        this.collaborators = collaborators;
    }

    public CentralSoftBank() {
    }
  
    public int getCollaborators() {
        return collaborators;
    }

    public void setCollaborators(int collaborators) {
        this.collaborators = collaborators;
    }
    
    @Override
    public int totalEmployee(){
        return (int) senior + junior + collaborators;
    }
    
    @Override
    public double calculateEstimatedCost() {
        return (double) (senior*5000*coefficientSalary + junior*2000*coefficientSalary);
    }

    @Override
    public double calculateActualCost() {
        return (double) (calculateEstimatedCost() + collaborators*1000);
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
        return "SoftBank in the Central Region:\n" +super.toString();
    }
}
