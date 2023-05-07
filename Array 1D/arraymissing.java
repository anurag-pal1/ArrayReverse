import java.util.Scanner;
public class arraymissing {
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
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        int sum_of_natural;
        sum_of_natural=((n+1)*(n+2))/2;
        System.out.println("Missing Number is: " + (sum_of_natural-sum));
    }
}
//Time Copmlexity=O(n)
//Space Complexity=O(1)
