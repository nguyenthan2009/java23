import java.sql.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int []Array = new int[20];
        Array[0]=2;
        Array[1]=5;
        Array[2]=7;
        Array[3]=8;
        Array[4]=9;
        Array[5]=10;
        int m = Array.length;
        System.out.println(m);

        int n = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so");
        int so = sc.nextInt();
        int index =0;
        for(int i =0; i< n;i++){
            if(Array[i]==so){
                index = i;
            }
        }
       int n1 = delete(Array, n, index);
        for(int i=0;i<n1;i++){
            System.out.println(Array[i]);
        }

    }
    public static int delete(int[]Array,int n, int index ){
        for(int i = index; i<n;i++){
            Array[i]= Array[i+1];
        }
           return n-1;

    }
}
