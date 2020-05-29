/*
* Two stacks using an Array
*
* @author Riddhi Kakadia
*/


class TwoStacks<V> {
    private int maxSize;
    private V[] array;
	private int current1;
	private int current2;

    @SuppressWarnings("unchecked")
    public TwoStacks(int max_size) {
		//System.out.println(max_size);
        this.maxSize = max_size;
        array = (V[]) new Object[max_size];//type casting Object[] to V[]
		
		current1 = 0;
		current2 = maxSize -1;
    }

    //insert at top of first stack
    public void push1(V value) {
		//System.out.println(current1 + " " + current2);
		if(current1 > current2)
			throw new RuntimeException("Insufficiant Stack space");
		
		array[current1++] = value;
    }

    //insert at top of second stack
    public void push2(V value) {
		if(current1 > current2)
			throw new RuntimeException("Insufficiant Stack space");
		
		array[current2--] = value;
    }

    //remove and return value from top of first stack
    public V pop1() {
		//System.out.println("current1 " + current1);
		if(current1 > 0){
			V top = array[--current1];
			array[current1] = null;
			return top;
		}
		return null;
    }

    //remove and return value from top of second stack
    public V pop2() {
		//System.out.println("current2 " + current2);
		if(current2 < maxSize -1){
			V top = array[++current2];
			array[current2] = null;
			return top;
		}
		return null;
    }
	
	//Print current values in array for both stacks
	public void print(){
		for(V i : array){
			System.out.print(i + " ");
		}
		System.out.println();
	}
}