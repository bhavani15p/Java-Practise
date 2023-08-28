package QueuesUsingArrays;
import java.util.Arrays;

public class DynamicQueue extends Queue {

    public DynamicQueue() throws Exception {
        this(defaultCapacity);
    }

    public DynamicQueue(int capacity) throws Exception {
        super(capacity);
    }

    public void enqueue(int value) throws Exception{
        if(this.size == this.arr.length){
            int[] temp = new int[2 * this.arr.length];
            for(int i=0; i<this.size; i++){
                temp[i] = this.arr[(this.front + i)%this.arr.length];
            }
            this.arr = temp;
            this.front = 0;
        }
        super.enqueue(value);

    }

}