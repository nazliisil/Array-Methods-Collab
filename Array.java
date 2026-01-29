package Lab0;

import java.util.Random;

public class Array {

    public static int[] randomArrayCreator(int length){
        int[] newArray = new int[length];
        Random rand = new Random();
        for(int i = 0; i < length; i++) {
            newArray[i] = rand.nextInt(101);
        }
        return newArray;
    }
    
    public static int getMin(int[] array){
        int min = 101;
        for(int number : array) {
            if(number < min) {
                min = number;
            }
        }
        return min;
    }

    public static int getMax(int[] array){
        int max = 0;
        for(int number : array) {
            if(number > max) {
                max = number;
            }
        }
        return max;
    }

    public static double average(int[] sampleArray){
        int sum=0;
        for(int i=0;i<sampleArray.length;i++){
            sum=sum+sampleArray[i];
        }
        return (double)sum/sampleArray.length;
    }
    public static double[] differenceAverage(int[] sampleArray){
        double average=average(sampleArray);
        double[] finalArray=new double[sampleArray.length];
        for (int i=0;i<sampleArray.length;i++){
            finalArray[i]=sampleArray[i]-average;
        }
        return finalArray;
    }
    public static int evenSum(int[] sampleArray){
        int sum=0;
        for (int i=0;i<sampleArray.length;i++){
            if(i%2==0){
                sum=sum+sampleArray[i];
            }
        }
        return sum;
    }
    public static int oddSum(int[] sampleArray){
        int sum=0;
        for (int i=0;i<sampleArray.length;i++){
            if(i%2==1){
                sum=sum+sampleArray[i];
            }
        }
        return sum;
    }
}
