import java.util.Scanner;

public class prog1 
{
	public static void main(String[] args) {
		
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of the Array");
        int n=s.nextInt();
        System.out.println("Enter how many rotations are needed to be done");
        int rotations=s.nextInt();
       
        int arr[]=new int[n];
        System.out.println("Enter the Array elements");
		
         //Reading the Array Elements
        for(int i=0;i<=arr.length-1;i++)
        {
        	System.out.println("Enter the  "+i+"th element");
            arr[i]=s.nextInt();
        }
   
      //Rotating the Array     
      int help=0;
      try
      {     
      for(int j=1;j<=rotations;j++)
       {
    	  help=arr[arr.length-1];
    	  for (int i =n-1; i>0; i--) 
    	  {
    	      arr[i]=arr[i-1];	
          }
    	arr[0]=help;
      }
      }
      catch(Exception e)
      {
    	  System.out.println(e);
      }
    	  
        //printing the Rotated Array 
        System.out.println("Rotated Array is");
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.print(arr[i]);
        }
	}

}
