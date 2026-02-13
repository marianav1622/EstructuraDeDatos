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
   
    } 
}

