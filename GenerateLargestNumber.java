import java.util.Arrays;

public class GenerateLargestNumber {

    static String largestNum(int num[]) {
        int n = num.length;
        String strArray[] = new String[n];
        for (int i = 0; i < n; i++) {
            strArray[i] = String.valueOf(num[i]);
        }
        Arrays.sort(strArray, (a, b) -> (b + a).compareTo(a + b));
        String str = "";
        for (String s : strArray) {
            str = str + s;
        }
        return str;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6, 7, 90};
        System.out.println(largestNum(arr));

        String largestNumber = Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .sorted((a, b) -> (b + a).compareTo(a + b))
                .reduce((a, b) -> (a + b))
                .get();
        System.out.println(largestNumber);
    }
}
