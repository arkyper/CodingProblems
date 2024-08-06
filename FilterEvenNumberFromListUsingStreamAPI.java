import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumberFromListUsingStreamAPI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        List<Integer> even_list = list.stream().filter(n -> n%2==0).collect(Collectors.toList());

        for (int i : even_list) {
            System.out.println(i);
        }

    }
}
