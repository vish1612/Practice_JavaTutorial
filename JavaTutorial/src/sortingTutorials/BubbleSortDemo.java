package sortingTutorials;

public class BubbleSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {87,58,11,108,7, 36, 19, 29, 12, 5 };
		int temp;
		for (int i = 0; i < a.length; i++) {
			int flag = 0;
			for (int j = 0; j < a.length - 1 - i; j++) // here we take a.length-1-i because in every round of sorting it
														// never goes till the last value because its already largest
														// value
			{
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					flag = 1;
				}
			}
			if(flag==0)
			{
				break;
			}
		}
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(+a[i]+" ");
		}
	}

}
