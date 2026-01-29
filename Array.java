package Lab0;

public class Array {
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
