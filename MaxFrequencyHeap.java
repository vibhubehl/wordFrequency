
public class MaxFrequencyHeap implements PriorityQueue {
	
	private static final int DEFAULT_CAPACITY = 10;
	private Entry[] data;
	private int size;
	
	public MaxFrequencyHeap() {
		data = new Entry[DEFAULT_CAPACITY];
		size = 0;
	}
	
	public MaxFrequencyHeap(int size) {
		data = new Entry[size];
		size = 0;
	}
	
	public void insert(Entry element) {
	

		// case overflow pending

		data[size] = element;

		size = size + 1;
		int i = size - 1;
		while( (i > 0) && (data[i].getFrequency() > data[(i-1)/2].getFrequency()) ){
			
			swap( (i-1)/2,i);
			i = (i-1)/2;

		}

	}

	public Entry removeMax() { 

		if(size == 0){
			System.out.println("Heap Empty");
			return null;
		}


		Entry temp = data[0];
		data[0] = data[size - 1];
		size = size - 1;
		int i = 0;

		while(i < size){

			// 2 internal children
			if(2*i + 1 < size){

				// 2 internal children
				if(data[i].getFrequency() >= data[2*i + 1].getFrequency() && data[i].getFrequency() >= data[2*i + 2].getFrequency() ){
					return temp;
				}
				else{
					int j;

					if(data[2*i + 1].getFrequency() >= data[2*i + 2].getFrequency() ){
						j = 2*i + 1;
					}
					else{
						j = 2*i + 2;
					}

					swap(i, j);
					i = j;
				}

			}
			// zero/1 internal nodes
			else{
				
				// one internal child
				if(2*i + 1 < size){
					if(data[i].getFrequency() < data[2*i + 1].getFrequency() ){
						swap(i, 2*i + 1);
					}
				}
				return temp;
			}

		}		

	
		return temp;
	}
	
	public boolean isEmpty() {
		
		if(size == 0){
			return true;
		}
		
		return false;
	}
	
	public int size() {

		return size; 
	}
	
	public void printall(){
		int i = 0;

		while(i < size){
			System.out.println(data[i].getFrequency());
			i += 1;
		}

		//System.out.println(size);
	}

	private void swap(int place1, int place2){
		Entry t = data[place1];
		data[place1] = data[place2];
		data[place2] = t;
	}

}
 
