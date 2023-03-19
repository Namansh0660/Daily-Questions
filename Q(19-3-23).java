import java.util.Scanner;
public class Main
{
    int convert(int n,int n1,int m)
    {
        if(m>n){
            int t=(m-n+n1)%7;
            if(t<7)
                return t-1;
        }
        else
        {
            int t=(n-m-n1)%7;
            if(t<7);
                return 7-t-1;
        }
        return 0;
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int n1=sc.nextInt();
      int m=sc.nextInt();
      String str[]={"Monday","Tuesday","Wednesday","Thrusday","Friday","Saturday","Sunday"};
      Main ob=new Main();
      System.out.println(str[ob.convert(n,n1,m)]);
    }
}
