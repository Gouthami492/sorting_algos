
public class Mergesort {
	public static void main(String[] args)
	{
		int arr[] = {12, 11, 13, 5, 6, 7};
		 
        System.out.println("Given Array");
       Merge.printArray(arr);
 
        Merge ob = new Merge();
        ob.sort(arr, 0, arr.length-1);
 
        System.out.println("\nSorted array");
       Merge.printArray(arr);
		
			
		
	}
}

	class Merge
	{
    void sort(int[] a,int l,int r)
    {
    	if(l<r)
    	{
    		int m=(l+r)/2;
    		
    		sort(a,l,m);
    		sort(a,m+1,r);
    		
    		merge(a,l,m,r);
    	}
    }
    
    void merge(int[] a,int l,int m,int r)
    {
    	int n1=m-l+1;
    	int n2=r-m;
    	int[] L=new int[n1];
    	int[] R=new int[n2];
    	
    	for(int i=0;i<n1;i++)
    	{
    		L[i]=a[i+l];
    	}
    	for(int j=0;j<n2;j++)
    	{
    		R[j]=a[j+m+1];
    	}
    	int i=0,j=0;
    	int k=l;
    	while(i<n1 && j<n2)
    	{
    		if(L[i]<=R[j])
    		{
    			a[k]=L[i];
    			i++;
    		}
    		else
    		{
    			a[k]=R[j];
    			j++;
    		}
    		k++;
    	}
    	while(i<n1)
    	{
    		a[k]=L[i];
    		i++;
    		k++;
    	}
    	while(j<n2)
    	{
    		a[k]=R[j];
    		j++;
    		k++;
    	}
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
   
	}
    
    

