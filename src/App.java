import java.util.Scanner;

class App {
    public static int solution(int n) {
        int ans = 0;
        for (int i = 1; i <= n; ++i) {
            ans += i;
        }
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner inp = new Scanner( System.in );
        int n;

        System.out.print("Enter a number: ");
        n = inp.nextInt();
        // for (int i = 0; i < n; ++i) {
        //     System.out.printf("%d ", i);
        // }
        
        System.out.println("S = " + solution(n));

    }
}
