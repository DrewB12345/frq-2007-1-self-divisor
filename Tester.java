
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester {
    public static void main(String[] args) {        
        SelfDivisor s1 = new SelfDivisor();
        SelfDivisor s2 = new SelfDivisor();
        SelfDivisor s3 = new SelfDivisor();
        
        System.out.println(s1.isSelfDivisor(126));
        s1.printArray(s1.firstNumSelfDivisors(10, 5));
    }
}
