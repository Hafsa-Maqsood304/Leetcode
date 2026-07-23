class Solution {
    public int mySqrt(int x) {
        int i=0;
        long sq=0;
        long nextsq=0;
        long presq=0;
        while(sq!=x){
             i++;

            if(x<nextsq&&x>presq) 
            {
                return i-1;
            }          

            sq=(long)i*i;
            nextsq=(long)(i+1)*(i+1);
            presq=(long)(i-1)*(i-1); 

        }

        return i;
    }
}