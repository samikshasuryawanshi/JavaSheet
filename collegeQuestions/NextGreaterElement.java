public class NextGreaterElement {
    public static int nextGreaterElement(int n) {
        char[] digits = (n + "").toCharArray();
        int i = digits.length - 2;

        // Step 1: Find first decreasing element from right
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }

        // If no such element exists, number is the largest permutation
        if (i < 0) return -1;

        // Step 2: Find element just larger than digits[i]
        int j = digits.length - 1;
        while (j > i && digits[j] <= digits[i]) {
            j--;
        }

        // Step 3: Swap them
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;

        // Step 4: Reverse the part after index i
        reverse(digits, i + 1, digits.length - 1);

        // Step 5: Convert back to integer safely
        try {
            long val = Long.parseLong(new String(digits));
            return (val <= Integer.MAX_VALUE) ? (int) val : -1;
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }

    public static void main(String[] args) {
        int n = 4321;
        System.out.println("Next Greater Element of " + n + " is: " + nextGreaterElement(n));
    }
}
