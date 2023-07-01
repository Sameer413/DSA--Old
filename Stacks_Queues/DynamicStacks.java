package Stacks_Queues;

public class DynamicStacks extends CustomStacks{
    public DynamicStacks(){
        super();
    }
    public DynamicStacks(int size){
        super(size);
    }
    public boolean push(int val){
        if (this.isFull()){
            int[] temp = new int[data.length * 2];
                for (int i = 0; i < data.length; i++) {
                    temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(val);
    }
}
