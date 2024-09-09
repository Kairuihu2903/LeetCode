class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        char[] charArray2 = t.toCharArray();
        Arrays.sort(charArray2);

        return new String(charArray).equals(new String(charArray2));
    }
}