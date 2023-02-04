import java.util.Arrays;

public class MergeArrays {
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];
        for (int i = 0; i < a1.length; i++) {
            result[i] = a1[i];
        }
        for (int i = 0; i < a2.length; i++) {
            result[a1.length + i] = a2[i];
        }
        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeArrays(new int[]{1, 2, 6, 8}, new int[]{3,4})));
    }
}
