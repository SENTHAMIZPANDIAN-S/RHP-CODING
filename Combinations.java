import java.util.*;
class Solution {
    public List<String> generateCombinations(String s) {
        List<String> result = new ArrayList<>();
        backtrack(0, s, new StringBuilder(), result);
        return result;
    }
    private void backtrack(int index, String s, 
                           StringBuilder current, 
                           List<String> result) {
        if (index == s.length()) {
            if (current.length() > 0) result.add(current.toString());
            return;
        }
        current.append(s.charAt(index));
        backtrack(index + 1, s, current, result);
        current.deleteCharAt(current.length() - 1);
        backtrack(index + 1, s, current, result);
    }
}
