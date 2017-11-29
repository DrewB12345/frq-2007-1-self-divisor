
/**
 * Write a description of class SelfDivisor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SelfDivisor {
    /**
     * Determines whether a given number is a self divisor
     *
     * @param number The number that is being tested
     * @return Whether or not the number is a self divisor
     */
    public static boolean isSelfDivisor(int number) {
        String str = String.valueOf(number);
        for (int i = 1; i <= str.length(); i++) {
            if (Integer.valueOf(str.substring(i-1,i)) != 0) {
                if (number % Integer.valueOf(str.substring(i-1,i)) != 0) {
                    return false;
                }
            }
        }
        return true;
    }
    
    /**
     * Finds a given amount of self divisors at and after a given starting point
     * 
     * @param start The first number that is checked
     * @param num The amount of self divisors that will be in the result
     * @return Self divisors after the starting point
     */
    public static int[] firstNumSelfDivisors(int start, int num) {
        int[] result = new int[num];
        int count = 0;
        while (count < num) {
            if (isSelfDivisor(start)) {
                result[count] = start;
                count++;
            }
            start++;
        }
        return result;
    }
}
