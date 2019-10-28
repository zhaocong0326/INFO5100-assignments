public class IsAnagram {
    public boolean isASnagram(String s, String t){
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a'] ++;
        }
        for (char c : t.toCharArray()) {
            count[c -'a'] --;
        }
        for (int n : count) {
            if (n != 0) {
                return false;
            }
        }
        return true;
    }
}
class IsAnagramTest {
    public static void main(String[] args) {
        IsAnagram test = new IsAnagram();
        String s = "anagram", t = "nagaram";
        String s2 = "rat", t2 = "car";
        System.out.println(test.isASnagram(s, t) +
                "\n" + test.isASnagram(s2, t2));
    }
}
