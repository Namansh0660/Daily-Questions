import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        String[] initial = new String[n];
        String[] rotated = new String[n];

        for (int i = 0; i < n; i++) {
            initial[i] = scanner.nextLine().trim();
        }

        for (int i = 0; i < n; i++) {
            rotated[i] = scanner.nextLine().trim();
        }

        int index = -1;

        for (int i = 0; i < n; i++) {
            if (rotated[i].equals(initial[0])) {
                index = i;
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            if (!rotated[(index + i) % n].equals(initial[i])) {
                System.out.println("Shuffled");
                return;
            }
        }

        System.out.println("Not Shuffled");
    }
}
