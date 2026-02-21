import java.util.HashMap;
import java.util.Map;

public class GestionAlmacen {
    public static void main(String[] args) {
        
        Map<String, String> inventario = new HashMap<>();

        
        inventario.put("A001", "Laptop Dell");
        inventario.put("B002", "Televisor Sony");
        inventario.put("C003", "Teclado");

        System.out.println("--- Estado Inicial ---");
        System.out.println("Inventario: " + inventario);

    
        inventario.put("A001", "Laptop Dell PH");

        System.out.println(" Verificación de Unicidad ");
        String valorActual = inventario.get("A001");
        System.out.println("Valor en 'A001': " + valorActual); 
      

        
        System.out.println(" Búsqueda de Eficiencia O(1) ");
        
       
        System.out.println("Buscando B002: " + inventario.get("B002"));
        
        // Producto inexistente
        System.out.println("Buscando Z999: " + inventario.get("Z999")); // Retorna null
    }
}