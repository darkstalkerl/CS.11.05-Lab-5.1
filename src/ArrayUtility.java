import java.util.Objects;

public class ArrayUtility {

    public static void print(int[] array) {
        StringBuilder n = new StringBuilder();
        for (int c : array) {
            n.append(c).append(" ");
        }
        n.deleteCharAt(n.length()-1);
        System.out.println(n);
    }

    public static int sum(int[] array) {
        int count = 0;
        for (int j : array) {
            count = count + j;
        }
        return count;
    }

    public static double average(int[] array) {
        int count = 0;
        for (int j : array) {
            count = count + j;
        }

        double average = (double) count / array.length *100;
        return (double) (int) average / 100;
    }

    public static int minimum(int[] array) {
        int min = array[0];
        for (int c : array) {
            if (c < min) {
                min = c;
            }
        }
        return min;
    }

    public static int maximum(int[] array) {
        int min = array[0];
        for (int c : array) {
            if (c > min) {
                min = c;
            }
        }
        return min;
    }

    public static int evenCount(int[] array) {
        int count = 0;
        for (int c : array) {
            if (c % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
        int[] n = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            n[i] = array[array.length -1 - i];
        }
        return n;
    }

    public static void reverseTwo(int[] array) {
        int z = 0;
        for (int i = 0; i < array.length/2; i++) {
            z = array[array.length-1-i];
            array[array.length-1-i] = array[i];
            array[i] = z;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int c : array) {
            if (num == c){return true;}
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (String c : array) {
            if (c.equals(str)){return true;}
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] *2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] *n;
        }
    }

    public static String toString(int[] array) {
        StringBuilder n = new StringBuilder();
        for (int c : array) {
            n.append(c).append(", ");
        }
        n.deleteCharAt(n.length()-1);
        n.deleteCharAt(n.length()-1);
        return n.toString();
    }

    public static boolean twoSum(int[] array, int num) {
        for (int c = 0; c < array.length; c++) {
            for (int d = 0; d < array.length; d++) {
                if (array[c] + array[d] == num && c!=d) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int z = array[array.length-1];
        for (int i = array.length-1; i > 0; i--) {
            array[i] = array[i-1];
        }
        array[0] = z;
    }

    public static void shiftLeft(int[] array) {
        int z = array[0];
        for (int i = 0; i < array.length-1; i++) {
            array[i] = array[i+1];
        }
        array[array.length-1] = z;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            shiftRight(array);
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        int[] z = new int[n];
        for (int i = 0; i < n; i++) {
            z[i] = array[i];
        }
        for (int i = 0; i < array.length-n; i++) {
            array[i] = array[i+n];
        }
        for (int i = 0; i < n; i++) {
            array[array.length-n+i] = z[i];
        }
    }
}
