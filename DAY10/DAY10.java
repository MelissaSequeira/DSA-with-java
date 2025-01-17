// class Solution {
//     public boolean areOccurrencesEqual(String s) {
//         HashMap<String, Integer> map= new HashMap<>();
//         char[] arrs = s.toCharArray();

//         for(int i=0;i<arrs.length;i++){
//             if(!map.containsKey(arrs[i])){
//                 String key = String.valueOf(arrs[i]);

//                 map.put(key,0);
//             }
//         }
//         for(String key:map.keySet()){
//             int count=0;
//             for(Character arr:arrs){
//                 if(key.equals(String.valueOf(arr))){
//                     count++;
//                 }
//             }
//             map.replace(key,count);
//         }
//         int first = -1;
//         for (Integer value : map.values()) {
//             first = value; // Get the first value
//             break;
//         }
        
// for (Integer value : map.values()) {
//             if (!value.equals(first)) {
//                 return false; 
//             }
//         }
//         return true;
//     }
// }

///O(n2) above

import java.util.HashMap;

class Solution {
    public boolean areOccurrencesEqual(String s) {
        // Create a HashMap to store character counts
        HashMap<Character, Integer> map = new HashMap<>();
        
        // Iterate through the string to count occurrences of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // Get the character at the current index
            // If the character is already in the map, increase its count, otherwise add it with count 1
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        // Get the first value in the map to compare with others
        int firstValue = -1;
        for (int value : map.values()) {
            firstValue = value; // Get the first count
            break; // Stop after getting the first value
        }
        
        // Compare all values with the first value
        for (int value : map.values()) {
            if (value != firstValue) {
                return false; // If any count doesn't match, return false
            }
        }
        
        // If all counts are the same, return true
        return true;
    }
}
//O(n)
