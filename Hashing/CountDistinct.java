import java.util.HashSet;
class CountDistinct{
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 1, 2, 3};

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        System.out.println("Count of distinct elements: " + set.size());


    }
}