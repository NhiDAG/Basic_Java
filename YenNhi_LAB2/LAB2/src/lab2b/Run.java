///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package lab2b;
//
//
//import lab2.Person;
//import java.util.Scanner;
//
//
///**
// *
// * @author ASUS
// */
//public class Run {
//
//    public static void main(String[] args) {
//        Person p1 = new Person();
//        Person p2 = new Person();
//        Person p3 = new Person();
//        Person p4 = new Person();
//
//        //khai bao mang perArr
//        Person[] perArr = new Person[4];
//        perArr[0] = p1;
//        perArr[1] = p2;
//        perArr[2] = p3;
//        perArr[3] = p4;
//        
//        .searchName();
//    }
////------------------------------------------------------------------------------
//        public static void scanInfo(Person p) {
//        Scanner input = new Scanner(System.in);
//
//        //nhap ID
//        System.out.print("Enter ID:");
//        int id = input.nextInt();
//        p.setId(id);
//        p.getId();
//
//        //Su dung ky tu dong moi con lai trong bo dem
//        input.nextLine();
//
//        //nhap ten
//        System.out.print("Enter Name:");
//        String name = input.nextLine();
//        p.setName(name);
//        p.getName();
//
//        //nhap gioi tinh (neu la Male nhap true va nguoc lai nhap false)
//        System.out.print("Enter Gender:");
//        boolean gender = input.nextBoolean();
//        p.setMale(gender);
//        p.isMale();
//    }
//
//    public static void printInfo(Person p) {
//        System.out.println("-----------------------------------");
//        System.out.println("| ID | Name | Male |");
//        System.out.printf("| %d | %s | %b |\n", p.getId(), p.getName(), p.isMale());
//
//    }
////------------------------------------------------------------------------------
//    public static void searchName(Person[] perArr) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("\nEnter person's name you want to search for: ");
//        String searchForName = input.nextLine();
//        String result = input.nextLine();
//    for (int i = 0; i < perArr.length; i++){
//        String pers = Person[] perArr;
//            if (pers.getName().equalsIgnoreCase(searchForName)) {
//                perAr[].remove(pers);
//            }
//        }
//        if (result.isEmpty()) {
//            System.out.println("Person not found");
//        } else {
//            System.out.println("-----------------------------------");
//            System.out.println("| ID | Name | Male |");
//            for (Person person : result) {
//                System.out.println("" + person);
//            }
//        }   
//        }
//    }
//}
