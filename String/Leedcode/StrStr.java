//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/885/
class StrStr {
    public int strStr(String haystack, String needle) {
       int index = -1;
        if (needle == "" || needle.length() == 0 || haystack.equals(needle)) {
            return 0;
        }
        if (haystack.length() > needle.length()) {
            for (int i = 0; i < haystack.length(); i++) {
                if (haystack.charAt(i) == needle.charAt(0)) {
                    index = i;
                    int k = i;
                    for (int j = 0; j < needle.length(); j++, k++) {
                        if ((k == haystack.length()) || (!(haystack.charAt(k) == needle.charAt(j)))) {
                            index = -1;
                            break;
                        }
                    }
                }
                if (index != -1) {
                    break;
                }
            }
        }
        return index;
    }
}
