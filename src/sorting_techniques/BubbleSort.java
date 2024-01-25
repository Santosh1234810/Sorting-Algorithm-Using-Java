package sorting_techniques;

public class BubbleSort {
	
	public static void printArray(int arr[])
	{
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[] = {7,8,3,2,1};
		
//		Bubble Sort
		for (int i=0; i<arr.length; i++) //count the (n-1) iteration
		{
			for (int j=0; j<arr.length-i-1; j++)
			{
				if (arr[j] > arr[j+1]) 
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		printArray(arr);
	}
}
