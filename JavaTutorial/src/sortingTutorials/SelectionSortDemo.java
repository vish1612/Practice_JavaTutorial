package sortingTutorials;

public class SelectionSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {87,58,11,108,7, 36,3, 19, 29, 12, 5 };
		int temp,min;
		
		for(int i=0;i<a.length;i++)
		{
			min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
