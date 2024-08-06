import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 4, 5);

//        List<Integer> evenList = list.stream().filter(n -> n%2==0).collect(Collectors.toList());
//        List<Integer> oddList = list.stream().filter(n -> n%2!=0).collect(Collectors.toList());

//        int sumOdd = 0;
//        int sumEven = 0;
//        for (int i : evenList) {
//            sumEven += i;
//        }
//        for (int i : oddList) {
//            sumOdd += i;
//        }

        int sumEven = list.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        int sumOdd = list.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of Even Numbers : " + sumEven);
        System.out.println("Sum of Odd Numbers : " + sumOdd);
    }
}
