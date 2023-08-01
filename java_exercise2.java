package com.company;

import java.util.Scanner;


public class java_exercise2 {
    public static void main(String[] args) {
Scanner sc = new  Scanner(System.in);
        int min=1;
        int max=3;
        int b=(int)
                (Math.random()*(max-min+1)+min);
        int i;
for(i=1;i<=3;++i){
        System.out.println("Enter R for Rock, P for Paper, S for scissor: ");
        char ui=sc.next().charAt(0);   // ui= User input R= Rock P= Paper S= Scissor
        if(ui=='R' && b==1){
            System.out.println("It's Tie because Computer have also chosen Rock");

        }
        else if( ui=='R' && b==2 ){
            System.out.println("ohhh! You have lost because Because Computer have chosen Paper");
        }
        else if( ui=='R' && b==3 ){
            System.out.println("Congrats! You have won because Computer have chosen Scissor");
        }
        else if( ui=='P' && b==1 ){
            System.out.println("Congrats! You have won because Computer have chosen Rock");
        }
        else if( ui=='P' && b==2 ){
            System.out.println("It's Tie because Computer have also chosen Paper");
        }
        else if( ui=='P'&& b==3 ){
            System.out.println("ohhh! You have lost because Computer have chosen Scissor");
        }
        else if( ui=='S' && b==1 ){
            System.out.println("ohhh! You have lost because Computer have chosen Rock");
        }

        else if( ui=='S' && b==2 ){
            System.out.println("Congrats! You have won because Computer have chosen Paper");
        }
        else if( ui=='S'&& b==3 ){
            System.out.println("It's Tie because Computer have also chosen Scissor");
        }
else{
            System.out.println("Please Enter a valid value and Try again");
        }
    }
}}
