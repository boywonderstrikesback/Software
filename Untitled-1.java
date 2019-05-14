import java.util.Arrays;
class ArrayTest {
    public static void main(String[] args) {
        int[] myArray = new int[] { 3, 4, 6, 8, 2, 1, 9};
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}