class Solution {
    //Bit by Bit calculation solution - 6ms
    public String addBinary(String a, String b) {
        int a_len = a.length();
        int b_len = b.length();
        int carry = 0;
        String result = "";
        
        int maxLen = Math.max(a_len, b_len);
        
        for(int i = 0; i < maxLen; i++){
            
            //ascii char for 0 = 48
            //ascii char for 1 = 49
            //This is done to convert char to int a.charAt(a_len - 1 - i) - '0'
            int p = i < a_len ? a.charAt(a_len - 1 - i) - '0' : 0;
            int q = i < b_len ? b.charAt(b_len - 1 - i) - '0' : 0;
            int tmp = p + q + carry;
            carry = tmp / 2; //only whne p and q both are 1 tmp will be 2.
            result = tmp % 2 + result;
        }
        
        return (carry == 0) ? result : "1" + result;        
    }
    
    //faster solution with stringbuilder - 1 ms
    public String addBinary_faster(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1;
        int val = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || val != 0) {
            if (i >= 0) {
                val += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                val += b.charAt(j) - '0';
                j--;
            }
            sb.append(val % 2);
            val /= 2;
        }
        return sb.reverse().toString();
    }
    
    
    //Basic solution. It will not work from very long values of String
    //for ex:
    //"10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101"
    //"110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"
    public String addBinary_Basic(String a, String b) {
        long num1 = Long.parseLong(a, 2);
        long num2 = Long.parseLong(b, 2);
        long sum = num1 + num2;
        
        return Long.toBinaryString(sum);
    }
}
