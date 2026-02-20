import java.util.LinkedList;
import java.util.Queue;

public class callCenter {
    public static void main(String[] args) {
        /*Definición: Declarar la cola*/
        Queue<String> colaSoporte = new LinkedList<>();

        /*Llegada (Enqueue) Agregamos clientes a la cola*/
        colaSoporte.offer("Cliente A");
        colaSoporte.offer("Cliente B");
        colaSoporte.offer("Cliente C");

        /*Próximo en Fila para ver quién es el siguiente sin atenderlo aun*/
        String siguiente = colaSoporte.peek();
        System.out.println("Siguiente en espera (sin retirar). " + siguiente);

        /*Atención (Dequeue) Procesamos la cola hasta que esté vacía*/
        System.out.println("Iniciando atención");
        while (colaSoporte.isEmpty()) {
            /*extrae y elimina el elemento al frente de la cola*/
            String atendido = colaSoporte.poll();
            System.out.println("Atendiendo a. " + atendido);
        }

        /* Diferencia de Métodos (Manejo de Vacío)
        /*
         * DIFERENCIA CLAVE:
         * .poll(): Si la cola está vacía retorna 'null'. Es más seguro para flujos de control.
         * .remove(): Si la cola está vacía, lanza una excepción 'NoSuchElementException " un NoSuchElementException es cuando intenta acceder a un elemento que no existe en una estructura de datos"'. 
         *            Se usa solo si estás seguro de que DEBE haber datos.
         */
        
        /* Verificación*/ 
        if (colaSoporte.poll() == null) {
            System.out.println("La cola está vacía. No hay más clientes por atender.");
        }
    }

}