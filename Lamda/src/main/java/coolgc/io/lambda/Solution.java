package coolgc.io.lambda;
import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.function.IntPredicate;

    public class Solution {

        interface PerformOperation {
            boolean check(int a);
        }
        static class MyMath {
            public boolean checker(PerformOperation p, int num) {
                return p.check(num);
            }

            private PerformOperation isPalindrome() {
                StringBuilder b = new StringBuilder();
                return n -> {
                    b.append(n);
                    return Integer.parseInt(b.reverse().toString()) == n;
                };
            }

            private PerformOperation isPrime() {
                IntPredicate isPrimePredicate = n -> BigInteger.valueOf(n).isProbablePrime(1);
                return (n -> isPrimePredicate.test(n));
            }

            private PerformOperation isOdd() {
                return n -> n % 2 != 0;
            }
        }
            public static void main(String[] args) throws IOException {

                MyMath ob = new MyMath();
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int T = Integer.parseInt(br.readLine());
                PerformOperation op;
                boolean ret = false;
                String ans = null;
                while (T-- > 0) {
                    String s = br.readLine().trim();
                    StringTokenizer st = new StringTokenizer(s);
                    int ch = Integer.parseInt(st.nextToken());
                    int num = Integer.parseInt(st.nextToken());
                    if (ch == 1) {
                        op = ob.isOdd();
                        ret = ob.checker(op, num);
                        ans = (ret) ? "ODD" : "EVEN";
                    } else if (ch == 2) {
                        op = ob.isPrime();
                        ret = ob.checker(op, num);
                        ans = (ret) ? "PRIME" : "COMPOSITE";
                    } else if (ch == 3) {
                        op = ob.isPalindrome();
                        ret = ob.checker(op, num);
                        ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

                    }
                    //System.out.println(ans);
                }
            }
}