import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();

        int arr[] = new int[10];
        for(int i=0;i<10;i++){
            arr[i]= n*(i+1);
        }
        for(int i=0;i<10;i++){
            System.out.println(arr[i]+ " ");
        }
    }
}
