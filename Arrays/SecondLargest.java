import java.util.*;
public class RotateArray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(Arrays.toString(RotateLeft(arr,k)));
    }
    public static int[] RotateLeft(int[] arr,int k)
    {
        int n=arr.length;
        k=k%n;
        int[] newArr=new int[n];
        int a=0;
        for(int i=k;i<n;i++)
        {
            newArr[a++]=arr[i];
        }
        for(int i=0;i<k;i++)
        {
            newArr[a++]=arr[i];
        }
        return newArr;
    }
    public static int[] RotateRight(int[] arr,int k)
    {
        int n=arr.length;
        k=k%n;
        int[] newArr=new int[n];
        int a=0;
        for(int i=n-k;i<n;i++)
        {
            newArr[a++]=arr[i];
        }
        for(int i=0;i<n-k;i++)
        {
            newArr[a++]=arr[i];
        }
        return newArr;
    }
}
