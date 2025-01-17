class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map= new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        char[] ch= s.toCharArray();
        int sum=0;
        // for(Character str:ch){
        //     sum = sum+map.get(str);
        // }
        int i=0;
        while(i<ch.length-1){
            if(map.get(ch[i])>=map.get(ch[i+1])){
                sum = sum+map.get(ch[i]);
                i++;
            }
            else{
                sum = sum+(map.get(ch[i+1])-map.get(ch[i]));
                i=i+2;
            }
        }
        if (i == ch.length - 1) {
            sum += map.get(ch[i]);
        }
        return sum;
    }
}