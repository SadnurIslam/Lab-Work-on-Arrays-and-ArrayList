public class RandomNumberArray {
    public static void main(String[] args) {
        int array[]= new int[10];
        int i;
        for(i=0;i<10;i++){
            array[i]= (int) (10*Math.random());
        }
        for(i=0;i<10;i=i+2){
            System.out.print(array[i]+" ");

        }
        System.out.println();
        for(i=0;i<10;i++){
            if(array[i]%2==0) {
                System.out.print(array[i] + " ");
            }

        }
        System.out.println();
        for(i=9;i>=0;i--) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
        System.out.println(array[0]+" "+array[9]);
    }
}
