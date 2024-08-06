public class Anagram {

    static boolean isAnagram(String strA, String strB) {
        if (strA.length() != strB.length())
            return false;

        int arr[] = new int[256];

        for (char ch : strA.toCharArray()) {
            arr[ch]++;
        }
        for (char ch : strB.toCharArray()) {
            arr[ch]--;
        }

        for (int val : arr)
            if(val != 0)    return false;
        return true;
    }



    public static void main(String[] args) {
        String str1 = "IH I am KAR" ;
        String str2 = "HI I a'm ARK";

        if (isAnagram(str1, str2))
            System.out.println("It's Anagram");
        else
            System.out.println("Not Anagram");

    }
}
