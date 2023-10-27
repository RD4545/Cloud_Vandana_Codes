public class RomanToInteger {
    public static void main(String[] args) {
        // Test the conversion
        String romanNumeral = "XV";
        int result = romanToInt(romanNumeral);
        System.out.println("Roman " + romanNumeral + " = " + result);
    }

    private static int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int currentValue = getValue(currentChar);

           
            if (i < s.length() - 1 && currentValue < getValue(s.charAt(i + 1))) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
        }

        return result;
    }

    private static int getValue(char romanChar) {
        switch (romanChar) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
