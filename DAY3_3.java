//recursion print names

class Solution {

    void printGfg(int N) {
        if(N>0){
            System.out.print("GFG"+" ");
            printGfg(N-1);
        }
    }
}
