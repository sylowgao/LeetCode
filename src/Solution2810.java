/**
 * @auther: sylow
 * @date: 2023/8/22
 **/
public class Solution2810 {
    private String s, sTemp, sEnd;

    public String finalString(String s) {
        this.s = s;
        sEnd = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'i') {
                sEnd = sEnd + s.charAt(i);
            } else {
                sTemp = sEnd;
                sEnd = "";
                for (int j = sTemp.length() - 1; j >= 0; j--) {
                    sEnd = sEnd + sTemp.charAt(j);
                }
            }
        }
        return sEnd;
    }
}
