class Solution {
    public  String arrangeString(String s) {
        List<Character> letters = new ArrayList<>();
        int digitSum = 0;
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.add(c);
            } else if (Character.isDigit(c)) {
                digitSum += c - '0'; 
            }
        }
        Collections.sort(letters);
        StringBuilder sb = new StringBuilder();
        for (char c : letters) sb.append(c);
        if (digitSum > 0) sb.append(digitSum);

        return sb.toString();
    }
}