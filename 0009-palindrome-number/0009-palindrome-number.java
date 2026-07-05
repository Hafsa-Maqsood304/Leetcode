class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int digit=0;
        int rev=0;
        while(temp>0){
            digit=temp%10;
            rev=(rev*10)+digit;
            temp=temp/10;
        }
        return rev==x;
    }
}