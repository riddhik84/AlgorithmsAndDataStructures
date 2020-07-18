class PrisonCellsAfterNDays {
    public int[] prisonAfterNDays(int[] cells, int N) {
        //System.out.println("Day 0 " + Arrays.toString(cells));
        //N = (N-1)%14 +1;
        
        //The pattern repeats after 14 days
        //That means the pattern for Day1 and Day15 are same
        //So N = N%14
        //If N%14 is 0 we make N=14 else N = N%14
        N= N%14==0 ? 14 : N%14; 
        
        int day = 1;
        while(day <= N){
            //moveValues(cells);
            int[] result = new int[8];
            for(int i = 0; i <= 5; i++){
                int mid = i+1;
                int last = i+2;
                if(cells[i] == cells[last]){
                    result[mid] = 1;
                } else {
                    result[mid] = 0;
                }
            }
            result[0] = 0;
            result[cells.length - 1] = 0;
            //System.out.println("Day " + day + " " + Arrays.toString(result));
            
            cells = result.clone();
            //System.out.println(Arrays.toString(cells));
            
            day++;
        }
        return cells;
    }
}
