import java.util.Scanner;

public class Matrix {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int n = in.nextInt();
        System.out.print("Введите количество столбцов: ");
        int m = in.nextInt();

        int arr_n [][];
        arr_n = new int[n][m];
        int length = arr_n.length;

        for ( n = 0; n < arr_n.length; n++) {
            for ( m = 0; m < arr_n[n].length; m++) {
                System.out.print("Введите элемент в матрице [" + n + "][" + m + "]: ");
                arr_n[n][m] = in.nextInt();

            }
        }
        System.out.println("Первая строка матрицы: ");
        for ( n = 0; n < 1; n++) {
            for ( m = 0; m < arr_n[n].length; m++) {
                arr_n[0][m] = arr_n[0][m]*3;
                System.out.print(arr_n[0][m] + " ");
            }
        }
    }
}
