package JAVA;
import java.util.*;
public class Arrays {
    public static void main(String[] args){
        //type[] arrayName = new type[size];
        //type arrayName[]={1,2,3,4,5}

        /*int[] marks = new int[3];
        marks[0]= 20;
        marks[1]=30;
        marks[2]=50;

        for(int i=0; i<3; i++){
            System.out.println(marks[i]);
        }

        //taking array as an input from the user
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        //loop for insertion in array
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        //loop for printing the array values.
        for(int i=0; i<size; i++){
            if(arr[i]==x){
            System.out.println("Number found at:" + i);
            }
        }*/


//----------------------------------------------------------------------------------------------------------------------



        //take input names and print them
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of names:");
//        int size = sc.nextInt();
        System.out.println("Start entering your names:");
        String names[] = new String[3];
                                                                       //BHASAD
        for(int i=0; i< names.length; i++){
            names[i]=sc.nextLine();
        }

        for(int i=0; i< names.length; i++){
            System.out.println(names[i]);
        }
//        System.out.println(names.length);
//        System.out.println(names[0]);
//        if(names[0]==""){
//            System.out.println("true");
//        }
//        System.out.println(names[2]);
        //syed  aman hasan       elements
        //  0    1     2         indexes
        //  1    2     3         length




//----------------------------------------------------------------------------------------------------------------------



        //find minimum and maximum
        /*int arr[] = {3,5,2,6,4,6,3,7};
        int min = arr[0];
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]<min)
                min = arr[i];
        }
        System.out.println("the smallest number is:" + min);

        int max = arr[0];
        for (int i=0; i<arr.length; i++){
            if(arr[i]>max)
                max = arr[i];
        }
        System.out.println("The maximum number is:" + max);*/



//----------------------------------------------------------------------------------------------------------------------



        //above question with input of an array from the user.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int min=arr[0];
        int max=arr[0];

        for (int i=0; i<size; i++){
            if(min>arr[i])
                min = arr[i];

            if(max<arr[i])
                max = arr[i];
        }
        System.out.println("The smallest number of your array is:" + min);
        System.out.println("The greatest number of your array is:" + max);*/



//----------------------------------------------------------------------------------------------------------------------



        //array is sorted or not
        /*int arr[] = {4,5,2,7,4,8,2,7};
        boolean isAscending = true;
        for(int i=0; i<arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                isAscending = false;
            }
        }

            if(isAscending){
                System.out.println("Array is sorted.");}
            else{
            System.out.println("Array is not sorted");
        }*/



//----------------------------------------------------------------------------------------------------------------------





        //Finding the maximum and minimum with the Integer.MIN_VALUE and Integer.MAX_VALUE
        /*Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int min= Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]<min)
                min = arr[i];

            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Greatest number is:" + max);
        System.out.println("Smallest number is:" + min);*/

    }
}


