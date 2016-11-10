package QuickSort;

public class Qs {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 5, 4, 1, 2, 3 };
		new Qs().quickSort(data, 0, 4);
		for(int n: data)
			System.out.println(n);

	}

	public void quickSort(int[] arr, int left, int right) {
		int i, j, temp;
		i = left;
		j = right;
		int pivot = arr[(left + right) / 2];

		while (i <= j) {
			while (arr[i] < pivot)
				i++;

			while (arr[j] > pivot)
				j--;

			if (i <= j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}

		if (left < i - 1)
			quickSort(arr, left, i - 1);
		if (i < right)
			quickSort(arr, i, right);
	}
	
	public void swap(int[] arr, int a, int b)
	{
		int temp;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] =temp;
	}

}

