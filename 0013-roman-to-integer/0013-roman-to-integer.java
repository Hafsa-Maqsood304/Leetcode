class Solution {
    public int romanToInt(String s) {

        int value = 0;
        char[] romans = s.toCharArray();

        for (int i = 0; i < romans.length; i++) {

            if (romans[i] == 'I') {

                if (i + 1 < romans.length &&
                    (romans[i + 1] == 'V' || romans[i + 1] == 'X'))
                    value -= 1;
                else
                    value += 1;
            }

            else if (romans[i] == 'V') {
                value += 5;
            }

            else if (romans[i] == 'X') {

                if (i + 1 < romans.length &&
                    (romans[i + 1] == 'L' || romans[i + 1] == 'C'))
                    value -= 10;
                else
                    value += 10;
            }

            else if (romans[i] == 'L') {
                value += 50;
            }

            else if (romans[i] == 'C') {

                if (i + 1 < romans.length &&
                    (romans[i + 1] == 'D' || romans[i + 1] == 'M'))
                    value -= 100;
                else
                    value += 100;
            }

            else if (romans[i] == 'D') {
                value += 500;
            }

            else if (romans[i] == 'M') {
                value += 1000;
            }

            else {
                System.out.println("Not a roman letter!");
            }
        }

        return value;
    }
}