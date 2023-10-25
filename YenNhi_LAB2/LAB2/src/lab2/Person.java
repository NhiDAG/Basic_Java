/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2;
//import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Person {
    //khai bao cac truong(field)
         private int id;
         private String name;
         private boolean gender;
         
    public Person(int id, String name, boolean gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
     //get accessor
    public Person(){
    }
    public int getId() {
        return this.id;
    }

    public void setId(int value) {
        this.id = value;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public boolean isMale() {
        return this.gender;
    }

    public void setMale(boolean value) {
        this.gender = value;
    }
    
    
    //phuong thuc nhap
//   bai 1
//        public void scanInfo() {
//            Scanner input = new Scanner(System.in);
//    
//            //nhap ID
//            System.out.print("Enter ID: ");
//            this.id = input.nextInt();
//            setId(this.id);
//            getId();
//
//       //Su dung ky tu dong moi con lai trong bo dem
//            input.nextLine();
//
//            //nhap ten
//            System.out.print("Enter Name: ");
//            this.name = input.nextLine();
//            setName(this.name);
//            getName();
//    
//            //nhap gioi tinh (neu la Male nhap true va nguoc lai nhap false)
//            System.out.print("Enter gender: ");
//            this.gender = input.nextBoolean();
//            setMale(this.gender);
//            isMale();
//        }
//    
//        public void printInfo() {
//            System.out.println("-----------------------------------");
//            System.out.println("| ID | Name | Male |");
//            System.out.printf("| %d | %s | %b |\n", this.id, this.name, this.gender);
//        } 

    //in noi dung thay vi dia chi cua noi dung bang toString() 
    @Override
    public String toString() {
        return " | " + id + " | " + name + " | " + gender + " | ";
    }
}




