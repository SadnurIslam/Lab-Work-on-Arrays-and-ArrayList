import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SumWithoutSmallest sum = new SumWithoutSmallest();
        int arraySize= in.nextInt();
        System.out.println(sum.sumWithoutSmallest(arraySize));
    }
}
