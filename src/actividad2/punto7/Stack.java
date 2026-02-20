package actividad2.punto7;
import java.util.Stack;
import java.util.EmptyStackException;

public class Stack {
    public static void main(String[] args) {
        // 1. Instancia: Creación de la pila
        Stack<String> historial = new Stack<>();

        System.out.println("--- 🌐 Iniciando Navegación ---");

        // Agregando URLs
        navegar(historial, "google.com");
        navegar(historial, "github.com");
        navegar(historial, "stackoverflow.com");

        // Ver página actual
        if (!historial.empty()) {
            System.out.println("\n👀 URL actual (Peek): " + historial.peek());
        }

        // 4. Regreso (Pop): Simular botón "Atrás"
        System.out.println("\n--- ⬅️ Presionando botón 'Atrás' ---");
        retroceder(historial);
        retroceder(historial);

        // Vaciar la pila y manejar robustez
        System.out.println("\n--- ⚠️ Intentando vaciar el historial ---");
        retroceder(historial); // Queda vacía después de esto
        retroceder(historial); // Intento en pila vacía
    }

    /**
     * Método auxiliar para Push
     */
    public static void navegar(Stack<String> pila, String url) {
        pila.push(url);
        System.out.println("Navegando a: " + url);
    }

    /**
     * Método auxiliar para Pop con validación de robustez
     */
    public static void retroceder(Stack<String> pila) {
        try {
            if (!pila.empty()) {
                String paginaRecuperada = pila.pop();
                System.out.println("Regresando de: " + paginaRecuperada);
                
                if (!pila.empty()) {
                    System.out.println("Ahora estás en: " + pila.peek());
                } else {
                    System.out.println("Estás en la página de inicio (Historial vacío).");
                }
            } else {
                System.out.println("Error: No hay más páginas en el historial.");
            }
        } catch (EmptyStackException e) {
            System.out.println("Excepción capturada: La pila está vacía.");
        }
    }
}

