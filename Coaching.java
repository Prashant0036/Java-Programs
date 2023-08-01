/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coaching;

import java.util.*;

public class Coaching {

    
    public static void main(String[] args) 
    {
       int row,col,sp;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter name");
       
       int n=5;
        for(row=n;row>=1;row--)
        {
            for(sp=(n-row);sp>0;sp--)
            {
                System.out.print(" ");
                for(col=1;col<=row;col++)
                    System.out.print(col);
            }
            System.out.println();
        }
    }
    
}
class Fifth
{
    public static void main(String[] args){
        for (int i = 5; i >= 0; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
    }
        for (int i = 0; i<= 5; i++){
            for (int j=1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}

class Third
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
 
        int rows = sc.nextInt();        
        for (int i= rows-1; i>=0; i--)
        {
            
            for (int j=0; j<=i; j++) { 
                //System.out.print("*"+ " "); 
                 System.out.print(j+ " "); 
            } 
            System.out.println(""); 
        } 
        ///////////////////////////////////////////////////
        for (int i=2; i<=rows; i++)
        {
            for(int j=1; j<=i; j++)
            {
                 //System.out.print("*"+ " ");
                 System.out.print(j+ " "); 
            }
            System.out.println("");
        }
    }
}
class Fourth
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: ");
        String name = sc.nextLine();
        int length=name.length();
        for(int row=length;row>=1;row--){
            for(int col=0; col<=row-1; col++){
                System.out.print(name.charAt(col));
            }
            System.out.println();
        }
    }
}
class Second{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        
        for (int i=1; i<=rows; i++)
        {
            for (int j=(rows-i); j>=1; j--) { 
                System.out.print(" "); 
            }
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println(""); 
        }
    }
 }
class First{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        
        for (int i=rows; i>=1; i--)
        {
            for (int j=1; j<=i; j++) { 
                System.out.print(j); 
            }
            for(int j=1; j>=rows; j++){
                System.out.print(" ");
            }
            System.out.println(""); 
        }
    }
 }

class sp_pattern{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        int n1=rows;
        int col;
        int k;
        
        for (int i=rows; i>=1; i--)
        {
            
             for(k=n1; k>=i; k--)
             {
                 System.out.print(" ");
             }
            
            
            for ( col=1; col<=i; col++) 
            { 
                //System.out.print(col+""); 
                 System.out.print("*"+""); 
                
            }
           
            System.out.println(""); 
        }
        
        ////////////////////////////////
        
         for (int i=2; i<=rows; i++)
        {
            
             for(k=n1-1; k>=1; k--)
             {
                 System.out.print(" ");
             }
            
            
            for ( col=1; col<=i; col++) 
            { 
                //System.out.print(col+""); 
                 System.out.print("*"+""); 
                
            }
           
            System.out.println(""); 
            n1--;
        }
        
        
        
        
        
        
        
        
        
    }
 }

