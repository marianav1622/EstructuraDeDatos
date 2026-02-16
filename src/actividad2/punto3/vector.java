import java.util.ArrayList;
import java.util.Vector;

public class vector{
   public static void main(String[]args){

        Vector<String> logTransacciones = new Vector<>();
        logTransacciones.add("pago");
        logTransacciones.add("Deposito");
        logTransacciones.add("Retiro");
        logTransacciones.add("trasaccion");
        logTransacciones.add("abono");
        //**los métodos de Vector son synchronized, lo que bloquea el objeto para otros hilos mientras uno lo usa esto garantiza que solo un hilo pueda acceder al Vector a la vez */
        int unMillon = 1000000;

        // Prueba con Vector
        long tiempoInicioV = System.currentTimeMillis();
        Vector<Integer> v = new Vector<>();
        for (int i = 0; i < unMillon; i++) {
            v.add(i); // Vector pone un "candado" en cada vuelta
        }
        long tiempoFinV = System.currentTimeMillis();

        // Prueba con ArrayList
        long tiempoInicioAL = System.currentTimeMillis();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < unMillon; i++) {
            al.add(i); // ArrayList no pone candados, va directo
        }
        long tiempoFinAL = System.currentTimeMillis();

        // Resultados
        System.out.println("Tiempo con Vector (Seguro): " + (tiempoFinV - tiempoInicioV) + " ms");
        System.out.println("Tiempo con ArrayList (Rápido): " + (tiempoFinAL - tiempoInicioAL) + " ms");
   
    } 
}

