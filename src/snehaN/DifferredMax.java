/* Array assignments
 	Q10
 */
package snehaN;
import java.util.Scanner;
public class DifferredMax
{
	void findDiffered(int x[],int y[])
	{
            	boolean flag=false;
            	for(int i=0;i<x.length;i++)
            	{
            		if(x[i]==y[i])
            		{
            			continue;
            		}
            		else{
            			System.out.println("Values are not matching at index "+i);

                            if(x[i]>y[i])
                            {
                            	System.out.println("From "+x[i]+" and "+y[i]+" max value is "+x[i]);

                            }
                            else
                            {
                            System.out.println("From "+x[i]+" and "+y[i]+" max value is "+y[i]);
                            }
            			}
            	}
    }

			public static void main(String[] args) 
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter first array ");
				String line=sc.nextLine();
				String[] data=line.split(" ");
				int arr[]=new int[data.length];
				for(int i=0;i<arr.length;i++)
				{	
					arr[i]=Integer.parseInt(data[i]);
				}

				System.out.println("Enter second array ");
				String line2=sc.nextLine();
				String[] data2=line2.split(" ");
				int arr2[]=new int[data2.length];
				for(int j=0;j<arr2.length;j++)
				{
					arr2[j]=Integer.parseInt(data2[j]);
				}

				DifferredMax m1=new DifferredMax();
				m1.findDiffered(arr,arr2);
    }  
}