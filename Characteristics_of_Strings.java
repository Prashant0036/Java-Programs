package com.company;

import java.util.Scanner;

public class Characteristics_of_Strings {
    public static void main(String[] args) {

        String name="Prashant";
//        System.out.println(name);

        Scanner cid=new Scanner(System.in);
//        System.out.println("Please Enter Your Name:");
//        String a=cid.nextLine();
////        System.out.println("Which ch. no. do you want to explore? ");
////        int cn=cid.nextInt();
////        char ac=a.charAt(cn-1);
////        System.out.println(cn+ "th ch. is :"+ac);
//        System.out.println(a.indexOf("h",4));
//        System.out.println(a.indexOf("h"));
//        System.out.println(a.indexOf("a"));
//        System.out.println(a.lastIndexOf("a"));
//        System.out.println(a.lastIndexOf("a",4));
//        boolean b1=a.startsWith("Pra");
//        System.out.println(b1);
//        boolean b2=a.endsWith("ant");
//       System.out.println(b2);
//        System.out.println("Please Enter those ch. which you want to replace:");
//        String wc=cid.next();
//        char ww=cid.next().charAt(0);
//        System.out.println("you want to replace " + wc + " with :" );
////
//        String rc=cid.next();
//        String rn=a.replace(wc,rc);
//        System.out.println("Your Final Name is:" + rn);

//        int noc=a.length();
//        String lv= a.toLowerCase();
//        String uv= a.toUpperCase();
//        String tv=a.trim();
       // String sv=a.substring(1);
//        String sv1=a.substring(1,5);
//        String sv2=a.substring(0,noc-1);
//        System.out.printf("Hey! Your Name contains %d Characters" ,noc);
//        System.out.printf("Hey! The Lowercase version of Your Name is %s ",lv);
//        System.out.printf("Hey! The Uppercase version of Your Name is %s ",uv);
//        System.out.println("Hey! Your Name contains " + noc + " Characters" );
//        System.out.println("Hey! The Lowercase version of Your Name is " +lv);
//        System.out.println("Hey! The Uppercase version of Your Name is "+uv);
//        System.out.println("Hey! The Trimmed version of Your Name is "+tv);
      //  System.out.println("Hey! Your Name from 2nd Character is "+sv);
       // System.out.println("Hey! Your Name from 2nd to 5th Character is "+sv1);
//        System.out.println("Hey! Your Name without last Character is "+sv2);
//        System.out.println(a.length());
//String Pass="DilMangeMore";
//        System.out.println("Please! Enter Your Password: ");
//        String EnPass=cid.next();
//        System.out.println(EnPass.equals(Pass));
//        System.out.println(Pass.equalsIgnoreCase(EnPass));
//        System.out.printf("\"Dear Harrry, This Java Course is nice. Thanks\"  \n");
//        System.out.println(name.toLowerCase());
//        System.out.println("Enter Username:");
//        String usn=cid.nextLine();
//        System.out.println(usn.replace(" ","_"));
//        System.out.println(usn.indexOf("  "));
//        System.out.println(usn.indexOf("   "));
        String wish="\"Dear <name> ! Wishing You a Very Happy Birthday\" ";
        System.out.println("Enter Your Name:");
        String un=cid.nextLine();
        System.out.println(wish.replace("<name>",un));

    }
}
