import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        var scanner = new Scanner(System.in);
            System.out.print("Ingrese el numero de filas que desea: ");
            var valor = scanner.nextInt();
            int[][] board = new int[valor][];

            for (int row = 0 ; row < board.length ; row++){
                System.out.printf("Ingrese el numero de columnas que desea en la fila %d: ", row+1);
                valor = scanner.nextInt();
                board[row] = new int[valor];

                for (int colum = 0; colum < board[row].length; colum ++) {
                    System.out.printf("Ingrese el valor en la fila %d columna %d: ", row+1, colum+1);
                    valor = scanner.nextInt();
                    board[row][colum] = valor;
                }

            }

            System.out.println();
            System.out.println("Su board es: ");
            for (int row = 0; row < board.length; row++) {
                for (int colum = 0; colum < board[row].length; colum++) {
                    System.out.print(board[row][colum] + " ");
                }
                System.err.println();
            }
            scanner.close();
}   
}
