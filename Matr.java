import java.util.Scanner;
public class Matr {
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("size");
        int size = sc.nextInt();
        int sum = 0;
        int el;
		System.out.println("elementi matrici");

        for (int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                el = sc.nextInt();

                if(i == j) {
                    sum += el;
                }
            }
        }

        System.out.println(sum);
    }
}