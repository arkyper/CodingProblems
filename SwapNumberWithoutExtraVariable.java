public class SwapNumberWithoutExtraVariable {
    public static void main(String[] args) {
        int first = -23;
        int second = -96;
        System.out.println("Before SWAP -> FIRST : " + first + " and SECOND : " + second);

        first = first + second;
        second = first - second;
        first = first - second;

        System.out.println("After SWAP -> FIRST : " + first + " and SECOND : " + second);

    }
}
