import java.util.*;

class LongestUniqueSubstring {

    public static void main(String[] args) {

        String str = "programming";

        Set<Character> set = new HashSet<>();

        int left = 0;
        String longest = "";

        for(int right = 0; right < str.length(); right++) {

            while(set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));

            if(right - left + 1 > longest.length()) {
                longest = str.substring(left, right + 1);
            }
        }

        System.out.println(longest);
    }
}
