class MultiplyStrings {

    //Solution using BigInteger | valid solution | 
    //sample test : 505041410988047 3318139
    //ans: 1675797602414467284533
    public String multiply(String a,String b) {
        if(a.equals("0") || b.equals("0"))
            return "0";
            
        try {
            BigInteger n1 = new BigInteger(a);
            BigInteger n2 = new BigInteger(b);
            return n1.multiply(n2) + "";
        } catch (NumberFormatException ne){
            return "0";
        }
    }
}
