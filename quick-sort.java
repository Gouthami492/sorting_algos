
#include<iostream>
using namespace std;
void quicksort(int*,int,int);
int partition(int *,int ,int);
void swap(int* a,int* b)
 {
	 int temp;
	 temp=*a;
	 *a=*b;
	 *b=temp;

 }

int main()
{

		int n;
		//Scanner sc=new Scanner(System.in);
		cin>>n;
		int a[100];

		for(int i=0;i<n;i++)
		{
			cin>>a[i];
		}

		int low=0;
		int high=n-1;
		//System.out.println("Checking");
		quicksort(a,low,high);
		for(int i=0;i<n;i++)
		{
			cout<<a[i]<<" ";
		}


}
  void quicksort(int a[],int low,int high)
	{
	    //System.out.println("Hey checking!");
	    int partition1;
		if(low<high)
		{
			partition1=partition(a,low,high);
			quicksort(a,low,partition1-1);
			quicksort(a,partition1+1,high);
		}
	}
  int partition(int a[],int low,int high)
 {
	 int pi=a[high];
	 int i=low-1;
	 int j=low;
	for(j=low;j<=high-1;j++)
	 {
		 if(a[j]<=pi)
		 {
			 i++;
			 swap(&a[i],&a[j]);

		 }

	 }
	 swap(&a[i+1],&a[high]);

	 return i+1;
 }



