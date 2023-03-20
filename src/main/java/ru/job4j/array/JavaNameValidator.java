package ru.job4j.array;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        if (name.isEmpty()) {
            return false;
        }
        char[] array = name.toCharArray();
        int charCode = name.codePointAt(0);
        if (isSpecialSymbol(charCode)
                || Character.isDigit(charCode)
                || isUpperLatinLetter(charCode)) {
            return false;
        } else {
            for (int i = 1; i < array.length; i++) {
                charCode = name.codePointAt(i);
                if (!isSpecialSymbol(charCode)
                        && !isUpperLatinLetter(charCode)
                        && !isLowerLatinLetter(charCode)
                        && !Character.isDigit(charCode)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isSpecialSymbol(int code) {
        return (code == 36 || code == 95);
    }

    public static boolean isUpperLatinLetter(int code) {
        return (code >= 65 && code <= 90);
    }

    public static boolean isLowerLatinLetter(int code) {
        return (code >= 97 && code <= 122);
    }
}
