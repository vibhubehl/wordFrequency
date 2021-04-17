import java.util.Scanner;
import java.io.File;


public class MFG_unit_test{

    public static void insert_test(){
        MaxFrequencyHeap heap = new MaxFrequencyHeap();

        Entry e1 = new Entry("word", 6);
		Entry e2 = new Entry("heap", 9);
		Entry e3 = new Entry("bst", 1);
		Entry e4 = new Entry("test", 13); 
		Entry e5 = new Entry("computer", 2);
        Entry e6 = new Entry("computer", 5);

        heap.insert(e1);
        heap.insert(e2);
        heap.insert(e3);
        heap.insert(e4);
        heap.insert(e5);
        heap.insert(e6);
        heap.printall();
    }

    public static void removetest(){
        MaxFrequencyHeap heap = new MaxFrequencyHeap();

        Entry e1 = new Entry("word", 6);
		Entry e2 = new Entry("heap", 9);
		Entry e3 = new Entry("bst", 1);
		Entry e4 = new Entry("test", 13); 
		Entry e5 = new Entry("computer", 2);

        heap.insert(e1);
        heap.insert(e2);
        heap.insert(e3);
        heap.insert(e4);
        heap.insert(e5);
        heap.removeMax();
        //System.out.println( heap.removeMax().getFrequency() );
        heap.printall();
    }



    public static void main(String[] args){
        insert_test();
    }

}