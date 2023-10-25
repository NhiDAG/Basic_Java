
package lab4;

import java.util.Scanner;
import java.util.ArrayList;


public class Test {
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        //create 2 list of each 2 subclass
        ArrayList<NorthSoftBank> nList = new ArrayList<>();
        ArrayList<CentralSoftBank> cList = new ArrayList<>();

        //create menu to run each function
        boolean continueLoop = true;
        Scanner input = new Scanner(System.in);
        int choices = 0;
        while (continueLoop) {
            System.out.println("\nMenu:");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("1.Input SoftBanks'information");
            System.out.println("2.Calculate total numbers of employee in each SoftBank");
            System.out.println("3.Calculate total actual cost of SoftBank");
            System.out.println("4.Print total numbers of employee per types");
            System.out.println("5.Average salary of employee per types");
            System.out.println("6. Exit");
            System.out.println("---------------------------------------------------------------------");
            System.out.print("Your choice: ");
            choices = input.nextInt();
            input.nextLine();
            switch (choices) {
                case 1:
                    int ip;
                    do {
                        System.out.println("\nChoose the location of SoftBank to input:");
                        System.out.println("1. North Region");
                        System.out.println("2. Central Region");
                        System.out.println("3. Exit!");
                        System.out.print("Your choice: ");
                        ip = input.nextInt();
                        input.nextLine();
                        switch (ip) {
                            case 1:
                                NorthSoftBank n = scanNorthSoftBankInfo();
                                nList.add(n);
                                System.out.print("=> Successful adding!\n");
                                break;
                            case 2:
                                CentralSoftBank c = scanCentralSoftBankInfo();
                                cList.add(c);
                                System.out.print("=> Successful adding!\n");
                                break;
                            case 3:
                                System.out.println("Exit!");
                                break;
                            default:
                                System.out.println("Invalid choice!");
                        }
                    } while (ip > 3);
                    break;
                case 2:
                    System.out.printf("\nTotal of employees in North SoftBank: %d\n" , totalNorthEmployee(nList));
                    System.out.printf("Total of employees in Central SoftBank: %d\n" , totalCentralEmployee(cList));
                    break;
                case 3:
                    System.out.printf("\nThe actual cost of North SoftBank: %.2f\n", calculateNorthActualCost(nList));
                    System.out.printf("\nThe actual cost of Central SoftBank: %.2f\n", calculateCentralActualCost(cList));
                    System.out.printf("\n=> Total actual cost of Softbank: %.2f\n", (double)(calculateNorthActualCost(nList)+calculateCentralActualCost(cList)));
                    break;
                case 4:
                    int total;
                    do {
                        System.out.println("\nCalculate total employees per types of each SoftBank:");
                        System.out.println("1. North Region");
                        System.out.println("2. Central Region");
                        System.out.println("3. Total in SoftBank");
                        System.out.println("4. Exit!");
                        System.out.print("Your choice: ");
                        total = input.nextInt();
                        input.nextLine();
                        switch (total) {
                            case 1:
                                System.out.println("\nThe total employees per type in North SoftBank: ");
                                System.out.printf("-The total employees of seniors in North SoftBank: %d\n" , totalNorthSenior(nList));
                                System.out.printf("-The total employees of juniors in North SoftBank: %d\n" , totalNorthJunior(nList));
                                break;
                            case 2:
                                System.out.println("\nThe total employees per type in Central SoftBank: ");
                                System.out.printf("-The total employees of seniors in Central SoftBank: %d\n" ,totalCentralSenior(cList));
                                System.out.printf("-The total employees of juniors in Central SoftBank: %d\n" ,totalCentralJunior(cList));
                                System.out.printf("-The total employees of collaborators in Central SoftBank: %d\n" ,totalCentralCollaborators(cList));  
                                break;
                            case 3:
                                System.out.println("\nThe total employees per type in SoftBank: ");
                                System.out.printf("-The total employees of seniors in SoftBank: %d\n" ,(int) (totalNorthSenior(nList) + totalCentralSenior(cList)));
                                System.out.printf("-The total employees of juniors in SoftBank: %d\n" ,(int) (totalNorthJunior(nList) + totalCentralJunior(cList)));
                                System.out.printf("-The total employees of collaborators in SoftBank: %d\n" ,totalCentralCollaborators(cList));
                                break;
                            case 4:
                                System.out.println("Exit!");
                                break;
                            default:
                                System.out.println("Invalid choice!");
                        }
                    } while(total > 4);
                    break;
                case 5:
                    int average;
                    do {
                        System.out.println("\nCalculate average salary per types of each SoftBank:");
                        System.out.println("1. North Region");
                        System.out.println("2. Central Region");
                        System.out.println("3. Both");
                        System.out.println("4. Exit!");
                        System.out.print("Your choice: ");
                        average = input.nextInt();
                        input.nextLine();
                        switch (average) {
                            case 1:
                                System.out.println("\nThe average salary per type in North SoftBank: ");
                                System.out.printf("-The average salary of seniors in North SoftBank: %.2f\n" , averageSalaryNorthSenior(nList));
                                System.out.printf("-The average salary of juniors in North SoftBank: %.2f\n" , averageSalaryNorthJunior(nList));
                                break;
                            case 2:
                                System.out.println("\nThe average salary per type in Central SoftBank: ");
                                System.out.printf("-The average salary of seniors in Central SoftBank: %.2f\n" ,averageSalaryCentralSenior(cList));
                                System.out.printf("-The average salary of juniors in Central SoftBank: %.2f\n" ,averageSalaryCentralJunior(cList));
                                System.out.printf("-The average salary of collaborators in Central SoftBank: %.2f\n" ,averageSalaryCentralCollaborators(cList));  
                                break;
                            case 3:
                                System.out.println("\nThe average salary per type in North SoftBank: ");
                                System.out.printf("-The average salary of seniors in North SoftBank: %.2f\n" , averageSalaryNorthSenior(nList));
                                System.out.printf("-The average salary of juniors in North SoftBank: %.2f\n" , averageSalaryNorthJunior(nList));
                                System.out.println("---------------------------------------------------------------------");
                                System.out.println("The average salary per type in Central SoftBank: ");
                                System.out.printf("-The average salary of seniors in SoftBank: %.2f\n" ,averageSalaryCentralSenior(cList));
                                System.out.printf("-The average salary of juniors in SoftBank: %.2f\n" ,averageSalaryCentralJunior(cList));
                                System.out.printf("-The average salary of collaborators in SoftBank: %.2f\n" ,averageSalaryCentralCollaborators(cList));
                                break;
                            case 4:
                                System.out.println("Exit!");
                                break;
                            default:
                                System.out.println("Invalid choice");
                        }
                    } while(average > 4);
                      break;
                case 6:
                    System.out.printf("Exit program!\n");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid! Retry please!\n"); 
            }
        }
        while (choices > 6);
        input.close();
    }
//------------------------------------------------------------------------------
    //input information of 2 SoftBank 
    public static  NorthSoftBank scanNorthSoftBankInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ID:");
        int ID = input.nextInt();

        input.nextLine();

        System.out.println("Enter SoftBank's name:");
        String name = input.nextLine();

        System.out.println("Enter SoftBank's founding date:");
        String foundingDate = input.nextLine();

        System.out.println("Enter address:");
        String address = input.nextLine();

        System.out.println("Enter numbers of senior:");
        int senior = input.nextInt();

        System.out.println("Enter numbers of junior:");
        int junior = input.nextInt();
        
        System.out.println("Enter numbers of co-efficient salary of North SoftBank:");
        double coefficientSalary = input.nextDouble();

        return new NorthSoftBank(ID ,name ,foundingDate ,address ,senior ,junior ,coefficientSalary);
    }

    public static CentralSoftBank scanCentralSoftBankInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ID:");
        int ID = input.nextInt();

        input.nextLine();

        System.out.println("Enter SoftBank's name:");
        String name = input.nextLine();

        System.out.println("Enter SoftBank's founding date:");
        String foundingDate = input.nextLine();

        System.out.println("Enter address:");
        String address = input.nextLine();

        System.out.println("Enter numbers of senior:");
        int senior = input.nextInt();

        System.out.println("Enter numbers of junior:");
        int junior = input.nextInt();
        
        System.out.println("Enter numbers of collaborator:");
        int collaborators = input.nextInt();
        
        System.out.println("Enter numbers of co-efficient salary of Central SoftBank:");
        double coefficientSalary = input.nextDouble();
        
        return new CentralSoftBank(ID ,name ,foundingDate ,address ,senior ,junior ,coefficientSalary ,collaborators);
    }
//------------------------------------------------------------------------------
    //calculate the total employee of SoftBank
    public static int totalNorthEmployee(ArrayList<NorthSoftBank> nList){
        int sum = 0;
        for (NorthSoftBank nEmp : nList) {
            if (nEmp instanceof NorthSoftBank) {
                sum += nEmp.totalEmployee();
            }
        }
        return sum;
    }

    public static int totalCentralEmployee(ArrayList<CentralSoftBank> cList){
        int sum = 0;
        for (CentralSoftBank cEmp : cList) {
            if (cEmp instanceof CentralSoftBank) {
                sum += cEmp.totalEmployee();
            }
        }
        return sum;
    }
//-------------------------------------------------------------------------
    //calculate the actual cost of SoftBank
    public static double calculateNorthActualCost(ArrayList<NorthSoftBank> nList) {
        double sum = 0;
        for(NorthSoftBank nActualCost : nList){
            sum += nActualCost.calculateActualCost();
        }
        return sum;
    }
    
    public static double calculateCentralActualCost(ArrayList<CentralSoftBank> cList) {
        double sum = 0;
        for(CentralSoftBank cActualCost : cList){
            sum += cActualCost.calculateActualCost();
        }
        return sum;
    }
    
//-------------------------------------------------------------------------
    //calculate the total employee in each type in SoftBank
    //North SoftBank
    public static int totalNorthSenior(ArrayList<NorthSoftBank> nList){
        int senior =0 ;
        for (NorthSoftBank totalNorthSenior : nList){
            if (totalNorthSenior instanceof NorthSoftBank) {
                senior += totalNorthSenior.getSenior();
            }
        }
        return senior;
    } 
    
    public static int totalNorthJunior(ArrayList<NorthSoftBank> nList){
        int junior = 0;
        for (NorthSoftBank totalNJunior : nList){
            if (totalNJunior instanceof NorthSoftBank) {
                junior += totalNJunior.getJunior();
            }
        }
        return junior;
    } 
    //-------------------------------------------------------
    //Central SoftBank
    public static int totalCentralSenior(ArrayList<CentralSoftBank> cList){
        int senior =0 ;
        for (CentralSoftBank totalCSenior : cList){
            if (totalCSenior instanceof CentralSoftBank) {
                senior += totalCSenior.getSenior();
            }
        }
        return senior;
    } 
    
    public static int totalCentralJunior(ArrayList<CentralSoftBank> cList){
        int junior = 0;
        for (CentralSoftBank totalCSenior : cList){
            if (totalCSenior instanceof CentralSoftBank) {
                junior += totalCSenior.getJunior();
            }
        }
        return junior;
    }  
    
    public static int totalCentralCollaborators(ArrayList<CentralSoftBank> cList){
        int collaborators = 0;
        for (CentralSoftBank totalCollaborators : cList){
            collaborators += totalCollaborators.getCollaborators();
        }
        return collaborators;
    }
//--------------------------------------------------------------------------
    //calculate the average salary of each employee in North SoftBank
    public static double averageSalaryNorthSenior(ArrayList<NorthSoftBank> nList){
        double sum = 0;
        int count = 0;
        for (NorthSoftBank seniorSalary : nList) {
            if (seniorSalary instanceof NorthSoftBank) {
                sum += seniorSalary.calculateSeniorSalary();
                count++;
            }
        }
        double averageSalary = sum / count;
        return averageSalary;
    }
    
    public static double averageSalaryNorthJunior(ArrayList<NorthSoftBank> nList){
        double sum = 0;
        int count = 0;
        for (NorthSoftBank juniorSalary : nList) {
            if (juniorSalary instanceof NorthSoftBank) {
                sum += juniorSalary.calculateJuniorSalary();
                count++;
            }
        }
        double averageSalary = sum / count;
        return averageSalary;
    }
    
    //----------------------------------------------------------------------
    //calculate the average salary of each employee in Central SoftBank
    public static double averageSalaryCentralSenior(ArrayList<CentralSoftBank> cList){
        double sum = 0;
        int count = 0;
        for (CentralSoftBank seniorSalary : cList) {
            if (seniorSalary instanceof CentralSoftBank) {
                sum += seniorSalary.calculateSeniorSalary();
                count++;
            }
        }
        double averageSalary = sum / count;
        return averageSalary;
    }
    
    public static double averageSalaryCentralJunior(ArrayList<CentralSoftBank> cList){
        double sum = 0;
        int count = 0;
        for (CentralSoftBank juniorSalary : cList) {
            if (juniorSalary instanceof CentralSoftBank) {
                sum += juniorSalary.calculateJuniorSalary();
                count++;
            }
        }
        double averageSalary = sum / count;
        return averageSalary;
    }
    
    public static double averageSalaryCentralCollaborators(ArrayList<CentralSoftBank> cList){
        double collaboratorSalary = 0;
        double sum = 0;
        int count = 0;
        for (CentralSoftBank collaboratesSalary : cList) {
            if (collaboratesSalary instanceof CentralSoftBank) {
                collaboratorSalary = (double) (1000*collaboratesSalary.getCoefficientSalary());
                sum += collaboratorSalary;
                count++;
            }
        }
        double averageSalary = sum / count;
        return averageSalary;
    }
}
