package com.freya.moveZeros;


//Leetcode����������ÿ��0���Ƶ�����ĩβ�����ַ�0���в��䣬���в�����ԭ�����Ͻ��С�
public class MoveZeros {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] temp={10,2,0,0,12,4,0,5,0,3};
		
		int length=temp.length;
		
	    Boolean first=true;
		int flag=length;//falg:���0λ�ã�count������ƶ�������ǰk��0�ĸ�����num��0���ܸ���
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
