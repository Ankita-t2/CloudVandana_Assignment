public class RomanToInt{
    public static int romanToInteger(String s) {
        int result = 0;
        int prevVal = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currChar = s.charAt(i);
            int currtVal = 0;

            switch (currChar) {
                case 'I':
                    currtVal = 1;
                    break;
                case 'V':
                    currtVal = 5;
                    break;
                case 'X':
                    currtVal = 10;
                    break;
                case 'L':
                    currtVal = 50;
                    break;
                case 'C':
                    currtVal = 100;
                    break;
                case 'D':
                   currtVale = 500;
                    break;
                case 'M':
                    currtVal = 1000;
                    break;
            }

            if (currtVal < prevValue) {
                result -= currtVal;
            } else {
                result += currtVal;
            }

            prevVal = currtVal;
        }

        return result;
    }

    public static void main(String[] args) {
        String romanNumeral = "IX"; 
        int integerValue = romanToInteger(romanNumeral);
        System.out.println("Roman numeral " + romanNumeral + " is equivalent to " + integerValue);
    }
}
