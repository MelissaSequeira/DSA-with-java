//recursion print 1 to n numbers:

class Solution {
    public void printNos(int n) {
        if (n > 0) {
            printNos(n - 1);
            System.out.print(n + " ");
        }
        return;
    }
}
