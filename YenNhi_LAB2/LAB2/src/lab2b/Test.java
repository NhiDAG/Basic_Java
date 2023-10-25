/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2b;

import lab2.Person;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Test {

    public static ArrayList<Person> personList = new ArrayList<>();

    public static void main(String[] args) {
        
        //tao doi tuong cua lop Person
        Person p = new Person();
//------------------------------------------------------------------------------
        // bai 1
        // goi phuong thuc cua doi tuong Person
        //     p.scanInfo();
        //     p.printInfo();
        
        //bai 2
        // printInfo(p);
//------------------------------------------------------------------------------
//        //tao ArrayList chua doi tuong cua Person
//         // bai 3
//            //khoi tao them 2 doi tuong cua lop Person
//                Person p1 = new Person (1,"Nguyen Van A",true);
//                Person p2 = new Person (2,"Tran Thi B",false);
//            //2 doi tuong con lai
//                Person p3 = new Person ();
//                Person p4 = new Person ();
//    
//            //khai bao mang perArr
//                Person[] perArr = new Person[4];
//                    perArr[0] = p1;
//                    perArr[1] = p2;
//                    perArr[2] = p3;
//                    perArr[3] = p4;
//    
//                for (int i = 0; i < perArr.length; i++) {
//                    printInfo(perArr[i]);
//                } 
//            //cho nguoi dung nhap 2 phan tu con lai
//                for (int i = 2; i < perArr.length; i++) {
//                    System.out.print("\nEnter informations of person "+ (i+1) +"\n");
//                    scanInfo(perArr[i]);
//                    printInfo(perArr[i]);
//                } 
//            //sort theo phan tu ten
//                for (int i = 0 ; i < perArr.length - 1; i++){
//                    for (int j = 0; j < perArr.length - i - 1; i++){
//                        
//                        }
//                    }   
//                }
                     
//------------------------------------------------------------------------------
//        //them 2 doi tuong duoc khoi tao va them vao ArrayList
//        Person person1 = new Person(1, "Vo Thi C", false);
//        personList.add(0, person1);
//        Person person2 = new Person(2, "Le Van D", true);
//        personList.add(1, person2);
//        //in ra 2 doi tuong
//        printInfo(person1);
//        printInfo(person2);
//
//        //them 2 doi tuong de nguoi dung nhap vao
//        //nhap thong tin cua person 7 va 8
//        for (int i = 2; i < 4; i++) {
//            System.out.println("\nEnter information of person " + (i + 1));
//            Person pers = new Person();
//            scanInfo(pers);
//            printInfo(pers);
//            personList.add(i, pers);
//        }
    //Assignment 4  
        Person person1 = new Person();
        personList.add(0, person1);
        Person person2 = new Person();
        personList.add(1, person2);

        for (int i = 0; i < 4; i++) {
            System.out.println("\nEnter information of person " + (i + 1));
            Person pers = new Person();
            scanInfo(pers);
            printInfo(pers);
            personList.add(i, pers);
        }
        
        //goi ham sort ten doi tuong
        sortByName();
        //goi ham search doi tuong
        searchByName();
    }
        
//------------------------------------------------------------------------------
    public static void scanInfo(Person p) {
        Scanner input = new Scanner(System.in);

        //nhap ID
        System.out.print("Enter ID:");
        int id = input.nextInt();
        p.setId(id);
        p.getId();

        //Su dung ky tu dong moi con lai trong bo dem
        input.nextLine();

        //nhap ten
        System.out.print("Enter Name:");
        String name = input.nextLine();
        p.setName(name);
        p.getName();

        //nhap gioi tinh (neu la Male nhap true va nguoc lai nhap false)
        System.out.print("Enter Gender:");
        boolean gender = input.nextBoolean();
        p.setMale(gender);
        p.isMale();
    } 
            

    public static void printInfo(Person p) {
        System.out.println("-----------------------------------");
        System.out.println("| ID | Name | Male |");
        System.out.printf("| %d | %s | %b |\n", p.getId(), p.getName(), p.isMale());

    }
//------------------------------------------------------------------------------
    //sort doi tuong bang ten
    public static void sortByName() {
        for (int i = 0; i < personList.size() - 1; i++) {
            for (int j = 0; j < personList.size() - i - 1; j++) {
                //tra ve phan tu j cua personList
                //so sanh hai chuoi 
                if (personList.get(j).getName().compareTo(personList.get(j + 1).getName()) > 0) {
                    Person temp = personList.get(j);
                    personList.add(j, personList.get(j + 1));
                    personList.remove(j + 1);
                    personList.add(j + 1, temp);
                    personList.remove(j + 2);
                }
            }
        }
        //in ra doi tuong sau sort
        System.out.println("PersonList after sorted by name:");
        System.out.println("-----------------------------------");
        System.out.println("| ID | Name | Male |");
        for (Person person : personList) {
            System.out.println("" + person);
        }
    }
//------------------------------------------------------------------------------
    //search doi tuong
    public static void searchByName() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter person's name you want to search for: ");
        String searchForName = input.nextLine();
        ArrayList<Person> result = new ArrayList<>();
        for (Person pers : personList) {
            if (pers.getName().equalsIgnoreCase(searchForName)) {
                result.add(pers);
            }
        }
        if (result.isEmpty()) {
            System.out.println("Person not found");
        } 
        else {
            System.out.println("-----------------------------------");
            System.out.println("| ID | Name | Male |");
            for (Person person : result) {
                System.out.println("" + person);
            }
        }
    }
}
