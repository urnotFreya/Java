package com.freya.sort;

import java.util.LinkedList;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//关于数组的排序Merge和BubbleSort
//		int Nosort[]= {23,9,9,15,88,63};
//		Nosort=MergeSort(Nosort,0,Nosort.length-1);
//		for(int i=0;i<Nosort.length;i++)
//		{
//			System.out.println(Nosort[i]);
//		}
		//关于链表的排序
		LinkedList<Integer> Nosort=new LinkedList<Integer>();
		for(int i=0;i<10;i++)
		{
			int temp=(int) (Math.random()*12)+1;
			Nosort.add(temp);
		}
		for(int k=0;k<Nosort.size();k++)
		{
			System.out.print("  "+Nosort.get(k));
			
		}
		System.out.println("\nSorting:");
		Nosort=InsertSort(Nosort);
		for(int k=0;k<Nosort.size();k++)
		{
			System.out.print("  "+Nosort.get(k));
		}

	}
    public	static int[] BubbleSort(int[] Nosort)
	{
		
		int length=Nosort.length;
		int flag=length;
		//int [] Sorted=new int[length];
		for(int i=0;i<flag;i++)
		{
			for(int j=1;j<length;j++)
			{
				if(Nosort[j]<Nosort[j-1])
				{
					int temp;
					temp=Nosort[j];
					Nosort[j]=Nosort[j-1];
					Nosort[j-1]=temp;
					flag=j;
				}
			}
			
		}
		return Nosort;
			
	}
	public static int[] MergeSort(int[] Nosort,int lo,int hi)
	{
		int mi=(hi+lo)/2;
		if(lo<hi) {
		MergeSort(Nosort,lo,mi);
		MergeSort(Nosort,mi+1,hi);
		Nosort=Merge(Nosort,lo,mi,hi);
		}
		return Nosort;
	}
	public static int[] Merge(int[] temp,int lo,int mi,int hi)
	{
		int[] A=new int[hi-lo+1];
		int i=0;
		int j=lo;
		int k=mi+1;
		while(j<=mi&&k<=hi)
		{
			if(temp[j]<temp[k]) A[i++]=temp[j++];
			else A[i++]=temp[k++];
		}
		while(j<=mi)
		{
			A[i++]=temp[j++];
		}
		while(k<=hi)
		{
			A[i++]=temp[k++];
		}
		for(int t=0;t<=(hi-lo);t++)
		{
			temp[t+lo]=A[t];
		}
		
		
//		int[] l=new int [mi-lo+1];
//		for(int i=0;i<=(mi-lo);) {l[i++]=temp[i++];}
//		int[] r=new int[hi-mi];
//		for(int i=0;i<(hi-mi);) {r[i++]=temp[++mi];}
//		int i=0,j=0,k=0;
//		while(j<l.length&&k<r.length)
//		{
//			while(j<l.length&&l[j]<=r[k]) temp[i++]=l[j++];
//			while(k<r.length&&r[k]<=l[j]) temp[i++]=r[k++];
//		}
//		while(j<l.length) {temp[i++]=l[j++];}
//		while(k<r.length) {temp[i++]=r[k++];}
		
		
		return temp; 
	}
	public static LinkedList<Integer> SelectionSort(LinkedList<Integer> Nosort) 
	{
		int length=Nosort.size();
		int max=Nosort.getFirst(),tail=Nosort.size(),flag=0,j;
		LinkedList<Integer> sorted=new LinkedList<Integer>();
		for(int i=0;i<length;i++)
		{
			flag=0;
		    max=Nosort.getFirst();
			for(j=1;j<tail;j++)
			{
				if(max<Nosort.get(j)) 
				{
					max=Nosort.get(j);
					flag=j;
				}
			}
			sorted.addFirst(max);
			Nosort.remove(flag);
			tail--;
		}
		return sorted;
	}
    public static LinkedList<Integer> InsertSort(LinkedList<Integer> Nosort)
    {
    	int count=Nosort.size()-1;
    	LinkedList<Integer> sorted=new LinkedList<Integer>();
    	sorted.addFirst(Nosort.getFirst());
    	Nosort.removeFirst();
    	int j;
    	for(int i=0;i<count;i++)
    	{
    		int temp=Nosort.getFirst();
    		for(j=0;j<sorted.size();j++)
    		{	
    			if(temp<=sorted.get(j))
    			{
    				sorted.add(j,temp);
    				Nosort.removeFirst();
    				break;
    			}
    			
    		}
    		if(j==(sorted.size()))
			{
				sorted.addLast(temp);
				Nosort.removeFirst();
			}
    		
    	}
    	return sorted; 
    }
	
}
