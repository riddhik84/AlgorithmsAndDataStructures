//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/885/
class StrStr {
    public int strStr(String haystack, String needle) {
      int index = -1;
        if (needle == "" || needle.length() == 0 || haystack.equals(needle)) {
            return 0;
        }
        if (haystack.length() > needle.length()) { //check this condition to start algo
            for (int i = 0; i < haystack.length(); i++) {
                if (haystack.charAt(i) == needle.charAt(0)) { //start needle loop with first char is found
                    index = i;
                    int k = i; //need k to loop haystack keep i of outer loop as is
                    for (int j = 0; j < needle.length(); j++, k++) {
                        // look for below conditions
                        if ((k == haystack.length()) || (haystack.charAt(k) != needle.charAt(j))) {
                            index = -1;
                            break;
                        }
                    }
                }
                if (index != -1) { //needle is found index will not be -1
                    break;
                }
            }
        }
        return index;
    }
}
