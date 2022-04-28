//maximum number
package Assignment1;
interface max
{
	public int maxNo();
}
public class maxNumber {
	public static void main(String[] args) {
		max m=() -> {
			int arr[]= {24,33,54,87,71,68,19};
			int maxnum=arr[0];
			for(int i=0;i<arr.length;i++)
			{
		      if(arr[i]>maxnum)
				maxnum=arr[i];
				}
		
			return maxnum;
		};
		System.out.println("maximum number:"+m.maxNo());	
	

	}
}
