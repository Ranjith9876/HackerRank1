import java.util.Arrays;
import java.util.Scanner;

public class prog2 
{
	public static void main(String[] args)
	{
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Enter the length of the Array");
	    int n=scan.nextInt();
	    int arr[]=new int[n];
	    System.out.println("Enter the Array Elements");
	    for (int i = 0; i <= arr.length-1; i++)
	    {
			arr[i]=scan.nextInt();
		}
	   System.out.println("Sorting of the Array has happened");
	    Arrays.sort(arr);
	    int insum=0;
	    int test[]=new int[n];
	    for (int i = 0; i <= arr.length-1; i++) 
	    {
			insum=insum+arr[i];
		}
	    System.out.println("printing the Sum of Elements in the Array");
	    System.out.println(insum);
	    for (int i = 0; i <=test.length-1; i++) 
	    {
			int lastsum=0;
			for (int j = 0; j <=test.length-1; j++)
			{
				lastsum=lastsum+arr[i];
			}
			test[i]=lastsum;
		}
	    System.out.println("printing the test Array");
	    for (int i = 0; i <= test.length-1; i++)
	    {
			System.out.println(test[i]);
		}
	    System.out.println("Sorting the Test Array");
	    Arrays.sort(test);
	    System.out.println(Arrays.toString(test));
	    for (int i = 0; i <= test.length-1; i++) 
	    {
			if(test[i]>insum)
			{
				System.out.println("Output is  "+arr[i]);
				System.exit(0);
			}
		}
    }
}
