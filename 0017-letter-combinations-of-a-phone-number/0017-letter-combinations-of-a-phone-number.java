class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        if (digits.length() == 0) {
            return result;
        }

        String[] letters = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        backtrack(digits, 0, "", result, letters);

        return result;
    }

    public void backtrack(String digits, int index, String current,
                           List<String> result, String[] letters) {

        if (index == digits.length()) {
            result.add(current);
            return;
        }

        String chars = letters[digits.charAt(index) - '0'];

        for (int i = 0; i < chars.length(); i++) {
            backtrack(
                digits,
                index + 1,
                current + chars.charAt(i),
                result,
                letters
            );
        }
    }
}