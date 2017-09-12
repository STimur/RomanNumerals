import java.util.Collections;

public class Converter {
    static int[] keys = new int[13];
    static String[] dictionary = new String[13];

    static {
        keys[0] = 1;
        dictionary[0] = "I";
        keys[1] = 4;
        dictionary[1] = "IV";
        keys[2] = 5;
        dictionary[2] = "V";
        keys[3] = 9;
        dictionary[3] = "IX";
        keys[4] = 10;
        dictionary[4] = "X";
        keys[5] = 40;
        dictionary[5] = "XL";
        keys[6] = 50;
        dictionary[6] = "L";
        keys[7] = 90;
        dictionary[7] = "XC";
        keys[8] = 100;
        dictionary[8] = "C";
        keys[9] = 400;
        dictionary[9] = "CD";
        keys[10] = 500;
        dictionary[10] = "D";
        keys[11] = 900;
        dictionary[11] = "CM";
        keys[12] = 1000;
        dictionary[12] = "M";
    }

    String convert(Integer n) {
        if (n == null)
            return "";

        return convert(n, keys.length - 1);
    }

    String convert(int n, int keyIndex) {
        if (n == 0)
            return "";
        return insertAppropriateNumberOfKey(n, keyIndex) +
                convert(decrease(n, keyIndex), --keyIndex);
    }

    int decrease(int n, int keyIndex) {
        return n - n / keys[keyIndex] * keys[keyIndex];
    }

    String insertAppropriateNumberOfKey(int n, int keyIndex) {
        return String.join("", Collections.nCopies(n / keys[keyIndex], dictionary[keyIndex]));
    }
}