import java.util.Scanner;

public class SumWithoutSmallest {
    public int sumWithoutSmallest(int size){
        Scanner in = new Scanner(System.in);
        int []array= new int[size];
        int i,sum=0,smallestNumber= Integer.MAX_VALUE;
        for(i=0;i<size;i++){
            array[i]=in.nextInt();
            sum=sum+array[i];
            if(array[i]<smallestNumber){
                smallestNumber=array[i];
            }
        }
        return sum-smallestNumber;
    }
}
