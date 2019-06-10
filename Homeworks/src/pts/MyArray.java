package pts;

import java.util.Arrays;

public class MyArray {
    private String[] str = new String[5];

    public int length() {
        if (str == null) {
            return 0;
        }
        int len = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] != null) {
                len++;
            }
        }
        return len;
    }

    public void put(String st) {
        if (str == null) {
            str = new String[5];
        }

        for (int i = 0; i < str.length; i++) {
            if (str[i] == null) {
                str[i] = st;
                if (i + 1 > str.length) {
                    str = Arrays.copyOf(str, 2 * str.length);
                }
                break;
            }
        }

    }

    public String get() {
        if (str == null) {
            return "No more elements";
        }
        String print = str[0];
        if (str.length == 1) {
            str = null;
        } else {
            str = Arrays.copyOfRange(str, 1, str.length);
        }
        return print;
    }
}
