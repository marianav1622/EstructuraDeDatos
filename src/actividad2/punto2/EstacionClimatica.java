public class EstacionClimatica {

    public static void main(String[] args) {
        // 1. Inicialización: Arreglo primitivo de tamaño fijo (24 horas)
        double[] temperaturas = new double[24];

        // 2. Simulación de Datos: Llenado del arreglo mediante iteración
        System.out.println("--- Registrando temperaturas del día ---");
        for (int i = 0; i < temperaturas.length; i++) {
            // Asigna valores aleatorios entre 0.0 y 40.0
            temperaturas[i] = Math.random() * 40;
        }
        System.out.println("Lecturas completadas con éxito.\n");

        // 3. Acceso O(1): Acceso directo por índice (Mediodía)
        // La complejidad O(1) significa que no importa el tamaño del arreglo,
        // el acceso al dato es instantáneo conociendo su posición.
        System.out.println("Acceso Directo (Hora 12): " + temperaturas[12] + "°C");

        System.out.println("\n--- Prueba de Límites de Memoria ---");
        
        // 4 y 5. Prueba de Límites y Captura de Error
        try {
            // Intentamos acceder a la posición 24 (que sería el elemento 25)
            System.out.println("Intentando registrar la hora 25...");
            temperaturas[24] = 25.5; 
            
        } catch (ArrayIndexOutOfBoundsException e) {
            // Explicación del error según la naturaleza del Array
            System.err.println("ERROR: Se ha intentado exceder el límite del arreglo.");
            System.err.println("Causa: Los arreglos en Java son estáticos. " +
                               "El tamaño " + temperaturas.length + " es fijo.");
            System.err.println("Detalle técnico: El índice máximo permitido es " + 
                               (temperaturas.length - 1));
        }
    }
}