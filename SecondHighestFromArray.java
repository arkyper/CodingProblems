import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighestFromArray {
    public static void main(String[] args) {
        // int arr[] = {23, 37, 4, 52, 6, 77, 890, 890};

        List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9);

//        Doing it with Sorting method
//        int len = arr.length;
//
//        for (int i = 0; i < len; i++) {
//            for (int j = 0; j < len - i-1; j++) {
//                if (arr[j] > arr[j+1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        System.out.println(arr[len-2]);



//        int largest = Integer.MIN_VALUE;
//        int second_largest = Integer.MIN_VALUE;
//
//        for (int num : arr) {
//            if (num > largest) {
//                second_largest = largest;
//                largest = num;
//            } else if (num > second_largest && num != largest) {
//                second_largest = num;
//            }
//        }
//        System.out.println(second_largest);

        // int secondHighest = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        // System.out.println(secondHighest);

        int secondLowest = list.stream().sorted().distinct().skip(1).findFirst().get();
        System.out.println(secondLowest);
    }
}
