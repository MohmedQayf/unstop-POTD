import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int N = sc.nextInt();
        sc.nextLine();
        while (N > 0) {
            String st = sc.nextLine();
            if (st.startsWith("ENTER")) {
                int n = Integer.parseInt(st.substring(6));
                q.add(n);
            } else if (st.startsWith("EXIT")) {
               if(!q.isEmpty()) q.remove();
            }
            N--;
        }
        if (!q.isEmpty()) System.out.println(q.peek());
        else System.out.print("EMPTY");
    }
}