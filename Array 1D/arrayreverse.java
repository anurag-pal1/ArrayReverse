import java.util.Scanner;
public class arrayreverse {
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("Enter size of array: ");
    n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter array elements: ");
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<n/2;i++)
    {
         int temp=arr[i];
         arr[i]=arr[n-i-1];
         arr[n-i-1]=temp;    
    }
    System.out.println("Reversal of array is: ");
    for(int i=0;i<n;i++)
    {
        System.out.print(arr[i]+" ");
    }
}
}
//Time Complexity==O(n)
//Space Complexity==O(1)