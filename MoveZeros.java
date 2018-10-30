package com.freya.moveZeros;


//Leetcode：将数组中每个0都移到数组末尾，保持非0序列不变，所有操作在原数组上进行。
public class MoveZeros {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] temp={10,2,0,0,12,4,0,5,0,3};
		
		int length=temp.length;
		
	    Boolean first=true;
		int flag=length;//falg:标记0位置；count：标记移动后数组前k项0的个数；num：0的总个数
		for (int i =0;i<length;i++)
		{
			if(temp[i]==0&&first==true)
			{
				flag=i;
				first=false;
			}
			if(temp[i]!=0)
			{
				if(flag<i)
				{
					temp[flag]=temp[i];
					flag++;
				}
			}	
		}
		for(int j=flag;j<length;j++)
		{
			temp[j]=0;
		}
		for (int k=0;k<length;k++)
		{
			System.out.print("  "+temp[k]);
		}
		

	}

}
