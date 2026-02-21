public class ReservaCine {

    public static void main(String[] args) {
        // 1. Declaración: Sala de 8 filas x 10 asientos
        int[][] sala = new int[8][10];

        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                sala[i][j] = 0;
            }
        }

     
        reservarAsiento(sala, 3, 4);
        reservarAsiento(sala, 3, 5); 
        System.out.println("Hay 2 contiguos en fila 3: " + buscarContiguos(sala, 3));
        
        visualizarSala(sala);
    }

    
    public static void reservarAsiento(int[][] sala, int fila, int col) {
        if (fila >= 0 && fila < 8 && col >= 0 && col < 10) {
            if (sala[fila][col] == 0) {
                sala[fila][col] = 1;
                System.out.println("Asiento [" + fila + "][" + col + "] reservado.");
            } else {
                System.out.println("El asiento ya está ocupado.");
            }
        } else {
            System.out.println("Coordenadas fuera de rango.");
        }
    }

   
    public static boolean buscarContiguos(int[][] sala, int fila) {
        if (fila < 0 || fila >= 8) return false;
        
   
        for (int j = 0; j < 9; j++) {
            if (sala[fila][j] == 0 && sala[fila][j + 1] == 0) {
                return true; 
            }
        }
        return false;
    }

    
    public static void visualizarSala(int[][] sala) {
        System.out.println("\n--- MAPA DE LA SALA ---");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(sala[i][j] + " ");
            }
            System.out.println();
        }
    }
}