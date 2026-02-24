public class GestionCine {
    
    // 1. Declaración: Matriz de 8 filas por 10 asientos 80 en total
    private int[][] sala = new int[8][10];

    public static void main(String[] args) {
        GestionCine cine = new GestionCine();
        
        /*2. Inicialización Aunque Java inicializa en 0 por defecto, lo hacemos explícito*/ 
        cine.inicializarSala();

        // 3. Prueba de reserva
        cine.reservarAsiento(4, 5); // Reserva válida
        cine.reservarAsiento(4, 5); // Intento de reserva en asiento ocupado
        cine.reservarAsiento(9, 0); // Fuera de rango

        /*4. Búsqueda de contiguos*/
        cine.buscarContiguosEnFila(4);

        /*  5. Visualización*/
        cine.mostrarSala();
    }

    public void inicializarSala() {
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                sala[i][j] = 0; // 0 = Libre
            }
        }
    }

    /*Valida coordenadas y estado antes de asignar el valor 1 (Ocupado) */
    public void reservarAsiento(int fila, int col) {
        try {
            if (sala[fila][col] == 0) {
                sala[fila][col] = 1;
                System.out.println(" Reserva exitosa en [" + fila + "," + col + "]");
            } else {
                System.out.println(" El asiento [" + fila + "," + col + "] ya está ocupado.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(" Error El asiento [" + fila + "," + col + "] no existe.");
        }
    }

    /* Busca dos ceros seguidos en el eje horizontal (j).*/
    public void buscarContiguosEnFila(int fila) {
        boolean encontrados = false;
        for (int j = 0; j < sala[fila].length - 1; j++) {
            if (sala[fila][j] == 0 && sala[fila][j + 1] == 0) {
                System.out.println(" Sugerencia: Asientos contiguos libres en fila " + fila + ": Col " + j + " y " + (j + 1));
                encontrados = true;
                break;
            }
        }
        if (!encontrados) System.out.println(" No hay 2 asientos juntos en la fila " + fila);
    }

    
     /*Imprime la matriz*/
     
    public void mostrarSala() {
        System.out.println("\n--- MAPA ACTUAL DE LA SALA ---");
        for (int[] fila : sala) {
            for (int asiento : fila) {
                System.out.print(asiento == 0 ? "[L] " : "[X] ");
            }
            System.out.println(); /*Salto de línea al final de cada fila*/ 
    }
}
}