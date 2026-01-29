/* This is the main class where the user can execute different methods of the Array class. */

import java.util.Scanner;

import Lab0.Array;

public class Main{

    public static void main(String[] args) {
        
        //Scanner to get user input
        Scanner in = new Scanner(System.in);
        System.out.print("Creating a random array of length: ");
        int length = in.nextInt();
        int[] usersArray = Array.randomArrayCreator(length);

        System.out.print("The array: ");
        for(int j = 0; j < usersArray.length; j++){
            System.out.print(usersArray[j] + " ");
        }


        boolean keepGoing = true;

        while(keepGoing){

            //Displaying the options
            System.out.println();
            System.out.println("MENU OPTIONS: ");
            System.out.println("1. Find the maximum element of the array.");
            System.out.println("2. Find the minimum element of the array.");
            System.out.println("3. Find the average of the array.");
            System.out.println("4. Form a new array which shows each element's difference from the average value.");
            System.out.println("5. Find the sum of elements on even indexes.");
            System.out.println("6. Find the sum of elements on odd indexes.");
            System.out.println("Press Q to exit.");
            System.out.println("Pick an option: ");

            if (in.hasNextInt()){

                int option = in.nextInt();

                if(option == 1){
                    int max = Array.getMax(usersArray);
                    System.out.println("The maximum element is: " + max);
                }

                else if(option == 2){
                    int min = Array.getMin(usersArray);
                    System.out.println("The minimum elemnt is:" + min);
                }

                else if(option == 3){
                    double average = Array.average(usersArray);
                    System.out.println("The average is: " + average);
                }

                else if(option == 4){
                    double[] differencedUserArray = Array.differenceAverage(usersArray);
                    System.out.println("The new elements are: ");
                    for(int i = 0; i < length; i++){
                        System.out.print(differencedUserArray[i] + " ");
                    }

                    System.out.println();
                }

                else if(option == 5){
                    int sumOfOdds = Array.oddSum(usersArray);
                    System.out.println("The sum of elements with odd indexes: " + sumOfOdds);
                }

                else if(option == 6){
                    int sumOfEvens = Array.evenSum(usersArray);
                    System.out.println("The sum of elements with even indexes: " + sumOfEvens);
                }

                else{
                    System.out.println("Please enter a valid option number.");
                }
            }

            else if(in.nextLine().equals("Q")){
                System.out.print("Quitting.");
                keepGoing = false;
            
            }
        }

    }
}