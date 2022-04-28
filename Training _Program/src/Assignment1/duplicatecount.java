//Duplicate number count
package Assignment1;

public class duplicatecount {
	public static void main(String[] args) {
		
		int[] arr= {2,6,7,6,2,2,19};
		int count=0;
		int n=2;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				count=count+1;
			}
		}
		System.out.println("count:"+count);
	}

}
