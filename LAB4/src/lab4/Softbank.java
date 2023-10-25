package lab4;

import java.text.NumberFormat;

public abstract class Softbank {

    protected int ID;
    protected String name;
    protected String foundingDate;
    protected String address;
    protected int senior;
    protected int junior;
    protected double coefficientSalary;

    public Softbank(int ID, String name, String foundingDate, String address, int senior, int junior, double coefficientSalary) {
        this.ID = ID;
        this.name = name;
        this.foundingDate = foundingDate;
        this.address = address;
        this.senior = senior;
        this.junior = junior;
        this.coefficientSalary = coefficientSalary;
    }

    public Softbank(){
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoundingDate() {
        return foundingDate;
    }

    public void setFoundingDate(String foundingDate) {
        this.foundingDate = foundingDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSenior() {
        return senior;
    }

    public void setSenior(int senior) {
        this.senior = senior;
    }

    public int getJunior() {
        return junior;
    }

    public void setJunior(int junior) {
        this.junior = junior;
    }

    public double getCoefficientSalary() {
        return coefficientSalary;
    }

    public void setCoefficientSalary(double coefficientSalary) {
        this.coefficientSalary = coefficientSalary;
    }
    
    public abstract int totalEmployee();
    
    public abstract double calculateEstimatedCost();
    
    public abstract double calculateActualCost();
    
    public abstract double calculateSeniorSalary();
    
    public abstract double calculateJuniorSalary();
    
    
    //create format to print the output correctly
    @Override
    public String toString() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String formattedEstimatedCost = formatter.format(calculateEstimatedCost());
        String formattedActualCost = formatter.format(calculateActualCost());
        return "SoftBank ID: " +ID+"\n" + "SoftBank Name: " +name+"\n" + "SoftBank founding date: " +foundingDate+"\n" + "Address: " +address+"\n" 
                + "Numbers of Senior: " +senior+"\n" + "Numbers of Junior: " +junior+"\n" 
                + "Estimated Cost: " +calculateEstimatedCost()+"\n" + "Actual Cost: " +calculateActualCost()+"\n";
    }
    
}
