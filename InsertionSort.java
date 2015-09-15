/*
 * Simple Program to sort an array using Insertion Sort
 * Author: Anicia Dcosta
 */
public class InsertionSort {
	public static void main (String args[])
	{
		int[] arr1= {5,3,10,6,20};
		int i = 0;
		int j=0;
		int size = arr1.length;
		
		for(j=1; j<= size-1; j++)
		{
			int key = arr1[j];
			i = j-1;
			while((i >-1) && arr1[i] > key)
			{
				arr1[i+1] = arr1[i];
				i--;
			}
			arr1[i+1] = key;
		}
		
		System.out.println("The array is :" );
		for (int k =0; k < size; k++)
		{
			
			System.out.println(arr1[k]);
		}
	}

}
