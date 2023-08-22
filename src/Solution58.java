import java.util.List;

/**
 * @auther: sylow
 * @date: 2023/8/22
 **/
public class Solution58 {
    public int lengthOfLastWord(String s) {
        Integer len = 0;
        while (s.lastIndexOf(" ", s.length() - 1 - len) == s.length() - len - 1) len++;
        return s.indexOf(" ", -1) == -1 ? s.length() : s.length() - len - s.lastIndexOf(" ", s.length() - 1 - len) - 1;
    }
}
