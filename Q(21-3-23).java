import java.util.Scanner;
public class Main
{
    int newsum(int ar[][],int i,int j)
    {
        int sum;
        sum=ar[i][j]+ar[i][j+1]+ar[i+1][j]+ar[i+1][j+1];
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Main ob=new Main();
        int m=sc.nextInt();
        int n=sc.nextInt();
        int ar[][]=new int[m][n];
        int sum=0;
        int max=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                sum=ar[i][j]+ar[i][j+1]+ar[i+1][j]+ar[i+1][j+1];
                if(max<sum)
                {
                    max=sum;
                }
                else
                    continue;
            }
        }
        if(m==n)
            System.out.println(max);
        else
            System.out.print(max);
        for(int i=0;i<m-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(ob.newsum(ar,i,j)==max)
                {
                    System.out.print((i+1)+"\t"+(j+1)+"\n"+ar[i][j]+"\t"+ar[i][j+1]+"\t"+ar[i+1][j]+"\t"+ar[i+1][j+1]);
                }
            }
            System.out.println();
        }
    }
}
