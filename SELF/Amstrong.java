import java.util.Scanner;



public class Amstrong {

	public static void main(String[] args) 
	{
		int num,sum=0,temp,r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		temp=num;
		while(num>0)
		{
			r=num%10;
			sum=num+(r*r*r);
			num=num/10;
		}
		if(temp==sum) 
		{
			System.out.println("Number is Amstrong");
		}
		else
		{
			System.out.println("Number is not Amstrong");
					
		}
	}
}