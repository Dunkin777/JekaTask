import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task18 {
    public static void main(String[] args) {
        int[] arr =  {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(resSumArr(arr));
        System.out.println(count7(717771237));
    }
    static int resSumArr(int[] arr){
        if (arr.length == 1) {
        return arr[0];
        }
        arr[1] += arr[0];
        int[] copiedArr = new int[arr.length-1];
        System.arraycopy(arr,1,copiedArr,0,copiedArr.length);
        return resSumArr(copiedArr);
    }

    static int count7(int n){
        String string = String.valueOf(n);
        Pattern pattern = Pattern.compile("[^7]");
        Matcher matcher = pattern.matcher(string);
        if (!matcher.find()){
            return string.length();
        }
        if (Character.getNumericValue(string.charAt(0)) == 7){
            string = string + "7";
        }
        String substring = string.substring(1);
        return count7(Integer.parseInt(substring));
    }
}
