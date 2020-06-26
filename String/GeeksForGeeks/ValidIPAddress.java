class Solution {

    public boolean isValidIP(String s) {
        //check for null and empty
        if(s == null || s.length() == 0 || s.startsWith(".") || s.endsWith("."))
            return false;
            
        //split string with . check if result is 4
        //You need to escape the dot if you want to split on a literal dot
        //Otherwise you are splitting on the regex ., which means "any character".
        String[] values = s.split("\\.");
        //System.out.println("values.length " + values.length);
        if(values.length != 4)
            return false;
            
        //for each value check the boundries 0-255
        for(String ss : values){
            //check leading zeros with number
            if(ss.length() > 1 && ss.startsWith("0")){
                return false;
            }
            
            //check for exceltion in number parsing
            try{
                int t = Integer.parseInt(ss);
                //System.out.println("t: " + t);
                if(t < 0 || t > 255){
                    return false;
                }
            } catch (NumberFormatException ne){
                return false;
            }
        }
        //if all pass return true
        return true;
    }
}
