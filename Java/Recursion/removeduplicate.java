

public class rmdup {
    public static void dup(String s, int idx, StringBuilder newstr, boolean map[]) {
        if (idx == (s.length() - 1)) {
            System.out.println(newstr);
            return;
        }
        char curChar = s.charAt(idx);
        if (map[curChar - 'a'] == true) {
            dup(s, idx + 1, newstr, map);

        } else {
            map[curChar - 'a'] = true;
            dup(s, idx + 1, newstr.append(curChar), map);
        }

    }

    public static void main(String[] args) {
        String s = "chaitanyakarale  ";
        dup(s, 0, new StringBuilder(""), new boolean[26]);

    }

}
