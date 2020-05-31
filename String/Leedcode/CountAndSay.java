//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/886/

class CountAndSay {
    public String countAndSay(int n) {
        String output = "";
        if (n == 1) {
            output = "1";
        } else if (n == 2) {
            output = "11";
        } else if (n >= 3) {
            output = "11";
            int lengthN = 2;
            while (lengthN != n) {
                String input = output + "#";
                char[] inputChars = input.toCharArray();
                //String tmp = "";
                StringBuilder tmp = new StringBuilder();
                int count = 1;
                for (int i = 0; i < inputChars.length - 1; i++) {
                    if (inputChars[i] == inputChars[i + 1]) {
                        count++;
                    } else {
                        //tmp = tmp + count + inputChars[i];
                        tmp.append(count).append(inputChars[i]);
                        count = 1;
                    }
                }
                output = tmp.toString();
                lengthN++;
            }
        }
        return output;
        
    }
}
