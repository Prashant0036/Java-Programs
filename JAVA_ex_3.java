package com.company;

import java.util.Scanner;

public class JAVA_ex_3 {
    public static void main(String[] args) {
//        Scanner cid=new Scanner(System.in);
//        System.out.println("Enter first Number:" );
//        float b=cid.nextFloat();
//        System.out.println("Enter Second Number:" );
//        float c=cid.nextFloat();
////        boolean b1=cid.hasNextInt();
//        System.out.println("Is your first Number is greater than Second Number:" );
//        System.out.println( b>c);
String name="Prashant";
        System.out.println(name);

            Scanner cid=new Scanner(System.in);
            System.out.println("Please Enter Your Name:");
            String a=cid.nextLine();
            int noc=a.length();
            String lv= a.toLowerCase();
        String uv= a.toUpperCase();
            System.out.printf("Hey! Your Name contains %d Characters" ,noc);
            System.out.printf("Hey! The Lowercase version of Your Name is %s ",lv);
            System.out.printf("Hey! The Uppercase version of Your Name is %s ",uv);
//        System.out.println("Enter Distance in kilometre:");
//        float a=cid.nextFloat();
//        System.out.println("Your Distance in Miles is: " + a*0.621371192);
//        System.out.println("Enter the Number:");
//        System.out.println("Enter the Number:");
//        boolean b1=cid.hasNextFloat();
//        System.out.println("Is your number Float: "+ b1);

        }

    }

