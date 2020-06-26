
class MaximumOccuringCharacter{
    
    // Function to get maximum occuring 
    // character in given string str
    public static char getMaxOccuringChar(String line){
        char ch = '\u0000';
        
        //check null string etc here
        if(line == null || line.length() == 0){
            return ch;
        }
        
        //variable to keep track of max occurance
        int max = Integer.MIN_VALUE;
        
        //array with 128 chars - 0-127
        int[] arr = new int[128];
        
        //loop the string and increment the array position
        for(int i = 0; i < line.length(); i++){
            arr[line.charAt(i)] = ++arr[line.charAt(i)];
            //System.out.println(arr[line.charAt(i)]);
            
            if(arr[line.charAt(i)] > max){
                max = arr[line.charAt(i)];
            }
        }
        //loop the array start from a = 97 z = 122
        for(int i = 97; i <= 122; i++){
            if(arr[i] == max){
                ch = (char) i;
                return ch;
            }
        }
  
        return ch;
    }
    
}
