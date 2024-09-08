class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int length = s.length();
        
        for (int i = 0; i < length; i++) {
            char current = s.charAt(i);
            if (i < length - 1) {
                char next = s.charAt(i + 1);
                
                if (current == 'I' && next == 'V') {
                    sum += 4;
                    i++;
                } else if (current == 'I' && next == 'X') {
                    sum += 9;
                    i++;
                } else if (current == 'X' && next == 'L') {
                    sum += 40;
                    i++;
                } else if (current == 'X' && next == 'C') {
                    sum += 90;
                    i++;
                } else if (current == 'C' && next == 'D') {
                    sum += 400;
                    i++;
                } else if (current == 'C' && next == 'M') {
                    sum += 900;
                    i++;
                } else {
                    sum += getValue(current);
                }
            } else {
                sum += getValue(current);
            }
        }
        return sum;
    }

    private int getValue(char romanChar) {
        switch (romanChar) {
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
            default:
                return 0;
        }
    }
}
