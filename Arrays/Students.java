import java.util.Scanner;


public  class Students{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0;i<n;i++){
        if(arr[i]<0){
            System.err.println("Invalid age");
        }
        else if(arr[i]>=18){
            System.out.println("The person with the age "+ arr[i]+ "can vote");
        }else System.out.println("The person with the age "+ arr[i]+ " cannot vote");
    }
    }
}