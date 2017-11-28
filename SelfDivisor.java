
/**
 * Write a description of class SelfDivisor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SelfDivisor {
    /**
     * Constructor for objects of class SelfDivisor
     */
    public SelfDivisor() {
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
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
    
    public void printArray(int[] result) {
        for (int i = 0; i < result.length; i++) {
            if (i > 0) {
               System.out.print(", ");
            }
            System.out.print(result[i]);
        }
        System.out.println();
    }
}
