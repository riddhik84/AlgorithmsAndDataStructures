class RotatedStringsCheck{

    /*  Function to check if two strings are rotations of each other
    *   s1, s2: are the input strings
    */
    public static boolean areRotations(String s, String x ) {
        //check for null and empty strings
        if(s == null || x == null)
            return false;
            
        //return (s.length() == x.length()) && ((s + s).indexOf(x) != -1); 
        
        return (s.length() == x.length()) && ((x + x).contains(s));
    }
    
}
