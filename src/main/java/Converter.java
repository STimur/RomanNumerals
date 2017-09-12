import java.util.Collections;

public class Converter {
    private static DictionaryItem[] dictionary = new DictionaryItem[13];

    static {
        dictionary[0] = new DictionaryItem(1, "I");
        dictionary[1] = new DictionaryItem(4, "IV");
        dictionary[2] = new DictionaryItem(5, "V");
        dictionary[3] = new DictionaryItem(9, "IX");
        dictionary[4] = new DictionaryItem(10, "X");
        dictionary[5] = new DictionaryItem(40, "XL");
        dictionary[6] = new DictionaryItem(50, "L");
        dictionary[7] = new DictionaryItem(90, "XC");
        dictionary[8] = new DictionaryItem(100, "C");
        dictionary[9] = new DictionaryItem(400, "CD");
        dictionary[10] = new DictionaryItem(500, "D");
        dictionary[11] = new DictionaryItem(900, "CM");
        dictionary[12] = new DictionaryItem(1000, "M");
    }

    public String convert(Integer n) {
        if (n == null)
            return "";
        return countNumberOfDictionaryItemForNumber(n, dictionary.length - 1);
    }

    private String countNumberOfDictionaryItemForNumber(int n, int i) {
        if (n == 0)
            return "";
        return insertAppropriateNumberOfDictionaryItemForNumber(n, i) +
                countNumberOfDictionaryItemForNumber(decrease(n, i), i-1);
    }

    private String insertAppropriateNumberOfDictionaryItemForNumber(int n, int i) {
        return String.join("", Collections.nCopies(n / dictionary[i].arabicValue, dictionary[i].romanValue));
    }

    private int decrease(int n, int i) {
        return n - n / dictionary[i].arabicValue * dictionary[i].arabicValue;
    }

    private static class DictionaryItem {
        final int arabicValue;
        final String romanValue;

        public DictionaryItem(int arabicValue, String romanValue) {
            this.arabicValue = arabicValue;
            this.romanValue = romanValue;
        }
    }
}