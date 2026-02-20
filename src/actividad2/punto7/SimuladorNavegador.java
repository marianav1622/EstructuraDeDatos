import java.util.Stack;
import java.util.EmptyStackException;

public class SimuladorNavegador {
    public static void main(String[] args) {
        // 1. Instancia
        Stack<String> historial = new Stack<>();

        // 2. Navegación (Push)
        System.out.println("--- Navegando ---");
        visitarPagina(historial, "google.com");
        visitarPagina(historial, "github.com");
        visitarPagina(historial, "stackoverflow.com");

        // 3. Consulta (Peek)
        if (!historial.empty()) {
            System.out.println("\nURL Actual (viendo): " + historial.peek());
        }

        // 4. Regreso (Pop) y 5. Validación
        System.out.println("\n--- Presionando botón 'Atrás' ---");
        while (true) {
            try {
                if (!historial.empty()) {
                    String paginaRetorno = historial.pop();
                    System.out.println("Regresando de: " + paginaRetorno);
                    
                    if (!historial.empty()) {
                        System.out.println("Ahora estás en: " + historial.peek());
                    } else {
                        System.out.println("Has llegado a la página de inicio (Historial vacío).");
                        break;
                    }
                }
            } catch (EmptyStackException e) {
                System.out.println("Error: No hay más páginas en el historial.");
                break;
            }
        }
    }

    private static void visitarPagina(Stack<String> pila, String url) {
        pila.push(url);
        System.out.println("Navegando a: " + url);
    }
}