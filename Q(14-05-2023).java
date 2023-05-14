import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String fruits = sc.nextLine();
        String result = findFruitsLeftOver(fruits);
        System.out.println(result);
    }
    public static String findFruitsLeftOver(String fruits) 
    {
        StringBuilder sb = new StringBuilder(fruits);
        boolean isSmashPossible = true;
        while (isSmashPossible) 
        {
            isSmashPossible = false;
            for (int i = 0; i < sb.length() - 2; i++) 
            {
                if (sb.charAt(i) != sb.charAt(i+1) && sb.charAt(i+1) != sb.charAt(i+2) && sb.charAt(i) != sb.charAt(i+2)) 
                {
                    sb.delete(i, i+3);
                    isSmashPossible = true;
                    break;
                }
            }
        }
        return sb.length() > 0 ? sb.toString() : "No fruit is left over";
    }
}
