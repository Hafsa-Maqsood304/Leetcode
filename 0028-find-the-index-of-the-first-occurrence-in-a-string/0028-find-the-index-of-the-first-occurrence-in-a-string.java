class Solution {
    public int strStr(String haystack, String needle) {

        if (needle.length() == 0)
            return 0;

        char[] temp = haystack.toCharArray();

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            boolean isEqual = true;

            for (int j = 0; j < needle.length(); j++) {

                if (needle.charAt(j) != temp[i + j]) {
                    isEqual = false;
                    break;
                }
            }

            if (isEqual)
                return i;
        }

        return -1;
    }
}