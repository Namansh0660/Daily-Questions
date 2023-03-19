import java.util.Scanner; 
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        double n=sc.nextDouble();
        double m=sc.nextDouble();
        double thick=sc.nextDouble();
        double t=0;
        if(ch=='l' || ch=='L'){
            t=(m-n-1)*thick;
            System.out.println(t+"0");
        }
        if(ch=='r' || ch=='R'){
            if(n>m){
                t=(n-m+1)*thick;
            }
            else{
                t=(m-n+1)*thick;
            }
            System.out.println(t+"0");
        }
    }
}
