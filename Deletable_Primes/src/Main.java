import java.lang.reflect.Array;

public class Main {

    private static int ways = 0;
    private static long number = 4567;
    private static int[] iarr = toArr(number);


    public static void main(String[] args) {

        countWays(iarr,0);
        System.out.println(ways);


    }

    private static void countWays(int[] tmp,int i){
        if(checkPrime(tmp)){
            if(tmp.length == 1) ways++;
            else countWays(removeNumber(iarr,i),++i);
        }
    }

    private static long convertToLong(int[] arr){
        StringBuffer buffer = new StringBuffer();

        for (int i : arr) {
            buffer.append(i);
        }

        return Long.parseLong(buffer.toString());
    }

    private static int[] removeNumber(int[] tmp, int i){
        int[] ret = new int[tmp.length-1];

        int y = 0;
        for (int j = 0; j < tmp.length; j++) {
            if(j!=i){
                ret[y] = tmp[j];
                y++;
            }
        }
  
        return ret;
    }

    private static int[] toArr(long number) {
        String tmp = Long.toString(number);
        int[] ret = new int[tmp.length()];
        int i = 0;
        for (char c : tmp.toCharArray()) {
            ret[0] = Character.getNumericValue(c);
            i++;
        }
        return ret;
    }

    private static boolean checkPrime(int[] tmp) {
        long num = convertToLong(tmp);
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        return flag;
    }

}
