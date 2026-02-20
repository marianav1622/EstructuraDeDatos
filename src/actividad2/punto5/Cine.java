public class Cine {
    
    static int[][] sala = new int[8][10];

    public static void main(String[] args) {
 
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                sala[i][j] = 0;
            }
        }

    }
    public static void reservarAsiento(int fila, int col) {
        if (fila >= 0 && fila < 8 && col >= 0 && col < 10) {
            if (sala[fila][col] == 0) {
                sala[fila][col] = 1;
            }
        }
    }

    public static void buscarContiguos(int fila) {
        for (int j = 0; j < 9; j++) { 
            if (sala[fila][j] == 0 && sala[fila][j + 1] == 0) {
                System.out.println("Contiguos libres en fila " + fila + ": columnas " + j + " y " + (j + 1));
            }
        }
    }

    public static void mostrarSala() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(sala[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
