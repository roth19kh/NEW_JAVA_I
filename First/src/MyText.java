public class MyText {

    public static String padRight(String str, int length) {
        if (str.length() >= length) {
            return str;
        }
        StringBuilder paddedStr = new StringBuilder(str);
        while (paddedStr.length() < length) {
            paddedStr.append(' ');
        }
        return paddedStr.toString();
    }

    public static String padRight(String str, int length, char padChar) {
        if (str.length() >= length) {
            return str;
        }
        StringBuilder paddedStr = new StringBuilder(str);
        while (paddedStr.length() < length) {
            paddedStr.append(padChar);
        }
        return paddedStr.toString();
    }

    public static String padLeft(String str, int length) {
        if (str.length() >= length) {
            return str;
        }
        StringBuilder paddedStr = new StringBuilder();
        while (paddedStr.length() < length - str.length()) {
            paddedStr.append(' ');
        }
        paddedStr.append(str);
        return paddedStr.toString();
    }

    public static String padLeft(String str, int length, char padChar) {
        if (str.length() >= length) {
            return str;
        }
        StringBuilder paddedStr = new StringBuilder();
        while (paddedStr.length() < length - str.length()) {
            paddedStr.append(padChar);
        }
        paddedStr.append(str);
        return paddedStr.toString();
    }
}