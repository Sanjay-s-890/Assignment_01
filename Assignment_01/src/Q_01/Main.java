package Q_01;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        cnt(arr);
    }
    public static void cnt(int arr[])
    {
        List<Integer> l = new ArrayList<>();
        for(int i =0; i<arr.length ; i++)
        {
            int c=0;
            for(int j=1;j<=arr[i]/2;j++)
            {
                if(arr[i]%j == 0)
                {
                    c++;
                }
            }
            l.add(++c);
        }
        System.out.println(l);
    }

}
