import java.util.HashMap;

public class IsomorphicNo {
    public boolean isIsomorphic(String s, String t) {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(String.valueOf(s.charAt(i)))) {// key hai kya??
                if (!map.get(String.valueOf(s.charAt(i))).equals(String.valueOf(t.charAt(i)))) {// key ka value and
                                                                                                // assign karne vala
                                                                                                // value equal hai kya
                    return false;
                }
            } else {
                if (map.containsValue(String.valueOf(t.charAt(i)))) {
                    return false; // t.charAt(i) is already mapped to a different character If t[i] is already
                                  // used as a mapped value
                }
                map.put(String.valueOf(s.charAt(i)), String.valueOf(t.charAt(i)));
            }
        }
        return true;
    }

}
