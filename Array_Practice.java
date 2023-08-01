/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coaching;

import java.util.*;
import java.lang.*;

/**
 *
 * @author I BALL
 */
public class practice {
    
    
 public static boolean isOdd(int a){
 
 if(a%2!=0){
 return true;
 }
 else{
 
 return false;
 }
 
 }   
    
 public static int[] swap(int arr[],int i ,int k){
 
 int temp=arr[i];
 arr[i]=arr[k];
 arr[k]=temp;
 
 return arr;
 }   
    
public static void printArray(int arr[]){

for(int i=0;i<arr.length;i++){

    System.out.print(arr[i]+" ");
}
    System.out.println();

}
public static int[] revArray(int arr[]){

for(int p=0;p<arr.length/2;p++){
    
    int temp=arr[p];
    arr[p]=arr[arr.length-1-p];
    arr[arr.length-1-p]=temp;
    }
return arr;

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0;
        int c = 0;
        while (c < 5) {
            c++;
            System.out.println("Enter a binary Number:");
            String bin = sc.nextLine();
            int len = bin.length();
            // System.out.println(bin.charAt(0));
            int num = 0;
            for (int i = 0; i < len; i++) {

                char x = (bin.charAt(len - 1 - i));
                int y = (int) x;

                if (y == 48) {

                    num = 0;
                } else if (y == 49) {

                    num = 1;

                } else {

                    System.out.println("Should be contain only 0 and 1");
                    break;

                }

                double num1 = Math.pow(2, i) * num;

                sum = sum + num1;

            }
            System.out.println((int) sum);

        }
    }
}

class Family {

    int a, b;

    Family(int x, int y) {

        a = x;
        b = y;

    }

     void add() {

        System.out.println(a + b);
    }

    void sub() {

        System.out.println(a - b);

    }
 protected void finalize()  
{  
    System.out.println("final");
//resources to be close  
}  
    public static void main(String[] args) {
        Family ob = new Family(6, 3);
        ob.add();
        ob.sub();
        //ob.finalize();
    }
}

class str {

    public static void main(String[] args) {
        String nm = "Prashant";
        System.out.println(nm.charAt(0));
        int count = 0;
        int num;
        int len = nm.length();
        if (len % 2 == 0) {
            num = len / 2;
            System.out.print(nm.charAt(num - 1));
            System.out.println(nm.charAt(num));

        } else {

            num = (len + 1) / 2;
            System.out.println(nm.charAt(num - 1));

        }
        for (int i = 0; i < len; i++) {
            char c = nm.charAt(i);
            if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'o' || c == 'O' || c == 'u' || c == 'U' || c == 'I') {

                count++;

            }

        }
        System.out.println("There are " + count + " vowels in " + nm + ".");
    }

}

class array {

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 4};
        System.out.println(arr[0]);
        arr[0] = 3;
        System.out.println(arr[0]);

        int arr1[]; //or It forms in stack
        int[] arr2;//or
        int arr3[] = new int[5];
        arr1 = new int[4]; // It will occupy memory in Heap 

        int mulArr[][] = new int[3][3];

        String names[] = {"Ram", "john", "mac"}; //Array Literal
        String Name[] = new String[4];

        int mularr[][] = {{1, 3}, {2, 5}};
        System.out.println(mularr[0][0]);
        System.out.println(mularr[1][0]);
        System.out.println(mularr.length);
        for (String name : names) {

            System.out.println(name);
        }

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {

                max = arr[i];
            }

        }

        System.out.println("Maximum =" + max);

//                    System.out.println(max);
    }

}

class copy_arr {

    void sortArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {

            if (i == arr.length - 1) {
                break;
            }
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i = -1;
            }

        }

        for (int i : arr) {

            System.out.print(i + " ");

        }

    }

    public static void main(String[] args) {
        int arr[] = {9, 3, 2, 4};
        int arr1[] = arr; // Shallow copy
        int arr2[] = arr.clone(); //Deep copy
        int arr3[] = Arrays.copyOf(arr, 3); // Deep copy where 3 is length
        int arr4[] = Arrays.copyOfRange(arr, 2, 4); //Deep copy where 2 is included index and the 4 is excluded index

        for (int i : arr1) {
            System.out.print(i + " ");

        }
        System.out.println("");
        arr1[0] = 5;
        for (int i : arr1) {
            System.out.print(i + " ");

        }
        System.out.println("");
        for (int i : arr) {
            System.out.print(i + " ");

        }
        copy_arr ob = new copy_arr();
        ob.sortArray(arr);

    }

}

class sort_arr {

    static boolean isSorted(int arr[]) {
        boolean var = true;

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                break;

            }

            if (arr[i] > arr[i + 1]) {
                var = false;
                break;
            }

        }

        return var;
    }

    static int[] s_and_l(int arr[]) {
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < arr[i - 1]) {

                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
                i = 0;
            }

        }
        int result[] = new int[2];
        result[0] = arr[0];
        result[1] = arr[arr.length - 1];
        for (int j : result) {
            System.out.println(j);

        }
        return result;
    }

    public static void main(String[] args) {

        int arr[] = {0, 1, 2, 2, 4};

        boolean result = isSorted(arr);
        System.out.println(result);
        s_and_l(arr);

    }

}


class targetSum{

    static int no_of_pairs(int arr[],int sum){
    int count=0;
    for(int i=0;i<arr.length;i++){
    
    
    for(int j=i+1;j<arr.length;j++){
    
    if (arr[i]+arr[j]==sum){
    
    count+=1;
    }
    
    }
    
    
    }
    return count;
    }
    
    static void trpl(){
    
    int arr[]={1,4,5,6,3};
    int len=arr.length;
    int sum=12;
    int c=0;
    for(int i=0;i<len;i++){
    
    for(int j=i+1;j<len;j++){
    
    for(int k=j+1;k<len;k++){
    
    if (arr[i]+arr[j]+arr[k]==sum){
    c+=1;
    
    }

    }
    
    }
    
    }
        System.out.println("Tripling = "+c);
    
    }
    public static void main(String[] args) {
        
    int arr[]={1,1,1,1};
    int sum=2;
    System.out.println("Total Pairs are "+no_of_pairs(arr,sum));    
    trpl();    
    }
        
}

class arr_mani{
    public static void main(String[] args) {
        int arr[]={1,2,3,2,1,3,4,4,6};
        int len=arr.length;
        int count;
        for (int i=0;i<len;i++){
                          count=0;

             for (int j=0;j<len;j++){

             if(arr[i]==arr[j]){
             count++;
             
             }
             
              }
             if (count==1){
                     System.out.println(arr[i]);

             }
        }
        
    }
       


}
class arr1{

    static void fun1(){
         int arr[]={1,2,3,1,2,4,5,4};
        int ans=-1;
        
        int len=arr.length;
        for(int i=0;i<len;i++){
        
        for(int j=i+1;j<len;j++){
        if(arr[i]==arr[j]){
        
        ans=arr[i];
        }
            
        }
        
        }
        System.out.println("Last repeating element is "+ans);
        
    }
        
    static void sec_small_ele(){
             int arr[]={1,2,3,1,2,4,5,4};
                      int len=arr.length;
              int small=Integer.MAX_VALUE;
         for(int i=0;i<len;i++){
         if (arr[i]<small){
         
         small =arr[i];
         
         }
         
         }
         System.out.println("smallest "+small);
         for(int i=0;i<len;i++){
         
         if(arr[i]==small){
         arr[i]=Integer.MAX_VALUE;
         }
         
         }
         small=Integer.MAX_VALUE;
         for(int i=0;i<len;i++){
         if (arr[i]<small){
         
         small =arr[i];
         
         }
         
         }
         System.out.println("2nd smallest "+small);
    }
    
    static void neg_pos(){
             int arr[]={-1,2,-3,1,2,4,-5,4};
                      int len=arr.length;
    for(int i=1;i<len;i++){
    
    if(arr[i]>0){
    int temp=arr[i];
    arr[i]=arr[i-1];
    arr[i-1]=temp;
    
    
    }
    
    }
    for(int i=0;i<len;i++){
    
        System.out.println(arr[i]);
    }
    
    }
    
    
    public static void main(String[] args) {
 //fun1();      
   //    sec_small_ele();
      neg_pos();

}
}
class arr2{

static int  missingNumber(int arr[],int N){
    int j;


for(int i=1;i<N;i++){

for(j=0;j<N-1;j++){
if (i==arr[j]){
break;
}


}
if(j==N-1){

    System.out.println(i+" is missing");
}

}

return 0;
}


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array");
        int N=sc.nextInt();
        int arr[] = new int[N-1];
     for(int i=0;i<N-1;i++){
         System.out.println("Enter "+(i+1)+" Element");
         arr[i]=sc.nextInt();
     
     }
        missingNumber(arr,N);
    }

}

class arr3 extends practice{
    
    

    static int[] shiftArray(int arr[],int k){
    int shift;
    if (k<arr.length){
    
    shift=k;
    
    }
    else{
    shift=k%arr.length;
    }
    int []revArr=new int[arr.length];
    for(int i=0;i<shift;i++){
    
        arr=revArray(arr).clone();
    
    
        for(int j=1;j<(arr.length/2)+1;j++){
            
                int temp=arr[j];
                arr[j]=arr[arr.length-j];
                arr[arr.length-j]=temp;
                        }
                        
    }
        return arr;
    
    
    
    }
    
    public static void main(String[] args) {
        
        int arr[]={7,4,7,3,74,9};
        for (int i=0;i<arr.length/2;i++){
        
        int temp=arr[i];
        arr[i]=arr[(arr.length-1)-i];
        arr[(arr.length-1)-i]=temp;
        
        }
        printArray(arr);
        int arr1[]={1,2,3,4,5,6};
        int k=2;
        int [] returnArray=shiftArray(arr1,k);
        printArray(returnArray);
        int []arr2={1,2,3,4};
        int rev_arr2[]=revArray(arr2);
        printArray(rev_arr2);
    }
        


}
class arr4 extends practice{


    
    static void askQuery(int arr[]){
    Scanner sc=new Scanner(System.in);
    int freqArray[]=new int [100000+1];
       
    for(int j=0;j<arr.length;j++){
    
    int temp=arr[j];
    freqArray[temp]=1;
    
    }
    for (int q=0;q<5;q++){
    
        System.out.println("Enter "+(q+1)+" Number to find.");
        int query=sc.nextInt();
        if(freqArray[query]==1){
            System.out.println("Yes");
        
        }
        else{
        
            System.out.println("No");
        }
    }
    
    
    }
    
    
    static int[] sort01Array(int arr[]){
        
    
        int count=0;
        for(int i=0;i<arr.length;i++){
        
        if (arr[i]==0){
        count++;
        }
        }
        for(int j=0;j<count;j++){
        
        arr[j]=0;
        }
        for(int k=count;k<arr.length;k++){
        
        arr[k]=1;
        }
        
    return arr;
    }
    
    static int[] segre_01Arr(int arr[]){
    
    int n=arr.length;
    
    int left=0;
    int right=n-1;
    while(left<right){
        //1 1 0 1 0 0 1 1 1
    if(arr[left]==1&&arr[right]==0){
    
    
     arr= swap(arr,left,right);
     left++;
     right--;
    }
    else if(arr[left]==1&&arr[right]==1){
    
    right--;
    
    }
    else if(arr[left]==0&&arr[right]==0){
    left++;
    
    }
    else{
    
    left++;
    right--;
    }
     
    } 
    return arr;
    
    }
    
    
    static int[] segre_odd_even_arr(int arr[]){
    int n=arr.length;
    int left=0;
    int right=n-1;
    while(left<right){
    
    if(isOdd(arr[left]) && isOdd(arr[right])==false){
    
    arr=swap(arr,left,right);
    left++;
    right--;
    
    }
    else if(isOdd(arr[left]) && isOdd(arr[right])){
    
        
    right--;
    
    }
    else if(isOdd(arr[left])==false && isOdd(arr[right])==false){
    
        
    left++;    
    }
    else{
    
    left++;
    right++;
    }
    
    
    
    }
    
    
    return arr;
    }
    public static void main(String[] args) {
        
        int arr[]={5,1000,95474,4566,8697,100000,54786};
        //askQuery(arr);
        
        int arr1[]={1,1,0,1,0,0,1,1,1,0,1,1,0,1};
        int arr2[]=arr1.clone();
       printArray( sort01Array(arr1));
       
       printArray(segre_01Arr(arr2));
       
       
       
       int arr3[]={1,9,3,4,5,6,7,8,10,56,54,69};
       printArray(segre_odd_even_arr(arr3));
        
    }
    
    

}


class infixAndPrefix extends practice{

    static int[] prefixProblem(int arr[]){
    int n=arr.length;
        
    int arr1[]= new int [n];
    
    arr1[0]=arr[0];
    for(int i=1;i<n;i++){
    arr1[i]=arr1[i-1]+arr[i];
    
    }
        
        
    return arr1;
    }
    
    static int[] prefixProblem1(int arr[]){
    int n=arr.length;
        
    
    
    
    for(int i=1;i<n;i++){
    
    arr[i]=arr[i-1]+arr[i];
    
    }
        
        
    return arr;
    }
   static int rangeSum(int arr[],int l, int r){
int sum=0;

for(int i=l-1;i<r;i++){

sum+=arr[i];
}
return sum;
}
    
    
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

        int arr[]={1,6,3,4,2};
        // output- 1,7,10,14,16
        
        printArray(prefixProblem(arr));
                printArray(prefixProblem1(arr));
          
        
        for(int i=0;i<5;i++){
        int l=sc.nextInt();
        int r=sc.nextInt();

            System.out.println(rangeSum(arr,l,r));
        
        }

    }



}

class prefixSuffix extends practice{
static void printPrefixSuufix(int arr[]){
int n=arr.length;
int arr1[]=arr.clone();
int prefixArray[]=new int[n];
int suffixArray[]=new int[n];


// for prefix Array
prefixArray[0]=arr[0];

for(int i=1;i<n;i++){
prefixArray[i]=prefixArray[i-1]+arr[i];

}


// for suffix Array
suffixArray[n-1]=arr[n-1];

for(int i=2;i<n;i++){
suffixArray[n-i]=arr[n-i]+suffixArray[n-i-1];

}
printArray(prefixArray);
printArray(suffixArray);


}



    public static void main(String[] args) {
        
        int arr[]={5,3,2,6,3,1};
        printPrefixSuufix(arr);
    }


}

