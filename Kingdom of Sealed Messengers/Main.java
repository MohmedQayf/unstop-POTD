import java.util.*;

class Main {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       HashSet<Integer> set=new HashSet<>();
       int N=sc.nextInt();
       int result=0;
       int M=sc.nextInt();
       if(M==0){
           System.out.println(N);
           return;
       }
       int[][] arr=new int[M][2];
       for (int i = 0; i < M; i++) {
           for(int j=0;j<2;j++)
           {
            arr[i][j]=sc.nextInt();
           }
           
            if(set.contains(arr[i][0])){
                set.add(arr[i][1]);
            }
            else{
                set.add(arr[i][0]);
                set.add(arr[i][1]);
                result++;
            }
           
       }
       System.out.println(result);
       sc.close();
    }
}