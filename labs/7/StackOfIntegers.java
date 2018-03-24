
public class StackOfIntegers {
	int nums[]=new int[1];
	int count;
	StackOfIntegers() {
		nums[0]=1;
		count=0;
	}
	public void addInteger(int n) {
		count++;
        if (count>=nums.length) {
            int temp[] = new int[count+1];
            for(int x=0;x<count;x++) {
            	temp[x]=nums[x];
            }
            nums=temp.clone();
        }
        nums[count-1] = n;
    }
	public int getValueAt(int index) {
		return nums[index];
	}
	public void displayValues(){
		for(int x=0;x<count;x++) {
			System.out.print(nums[x]);
			if(x<count-1) System.out.print(",");
		}
	}
}
