
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester {
    public static void main(String[] args) {                
        System.out.println(SelfDivisor.isSelfDivisor(126));
        int[] divisors = SelfDivisor.firstNumSelfDivisors(10, 5);
        for (int d:divisors) {
            System.out.print(d + " ");
        }
    }
}
