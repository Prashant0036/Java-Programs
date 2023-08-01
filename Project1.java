package project1;

/**
 *
 * @author I BALL
 */
import java.util.*;



public class Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name:");
        String nm = sc.nextLine();
        System.out.println("Enter your Roll No.:");
        long rn = sc.nextLong();
        System.out.println("Enter Your Subjects Marks Below");
        System.out.println("--------------------------");
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {

            System.out.println(" Enter Your " + (i + 1) + " Subject Marks:");
            arr[i] = sc.nextInt();

        }
        int total = 0;
        for (int i = 0; i < 5; i++) {

            total = total + arr[i];
        }
        double per = (double) total / 5;
        System.out.println("-------------------------");
        System.out.println("Student name :" + nm);
        System.out.println("Roll No. :" + rn);

        for (int j = 0; j < 5; j++) {
            System.out.println(" Your Subject" + (j + 1) + " marks:" + arr[j]);
        }
        System.out.println("Your Total Marks :" + total);
        System.out.println("Congrats! You got " + per + " percent");
        String div;
        System.out.println("--------------------------");
if(per>=60){

div="You secured First Div.";
}
else if(per>=45&&per<60){

div="You secured Second Div.";
}
else if(per>=33&&per<45){
div="You secured Third Div.";}
    
   else{
    
    div="Hard Luck ! Try Next Year";
}
        System.out.println(div);
}
}