//sum of cube of numbers

class Solution {
    int sumOfSeries(int n) {
        int sum=0;
        if(n<1){
            return 0;
        }
        else{
        return n*n*n+sumOfSeries(n-1);}
    }
}
