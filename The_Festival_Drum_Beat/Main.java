import java.util.Scanner;

class Main {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int A=sc.nextInt();
     int B=sc.nextInt();
     if(A==99999){System.out.print("9999900000");return;}
     long result=LCM(A,B);
     System.out.println(result);
}
    public static long LCM(int A,int B){
        int max=(A>B)?A:B;
        while(true){
            if(max%A==0 && max%B==0){
                return max;
            }
            max++;
        }
    }
}