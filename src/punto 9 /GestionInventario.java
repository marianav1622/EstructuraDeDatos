import java.util.HashMap;
import java.util.Map;

public class GestionInventario {
    public static void main(String[] args) {
        // 1. Estructura: Declaración del Mapa (Key: SKU, Value: Nombre)
        Map<String, String> inventario = new HashMap<>();

        // 2. Inserción: Agregando productos iniciales
        inventario.put("A001", "Laptop Dell");
        inventario.put("B020", "Monitor LG 24\"");
        inventario.put("C300", "Teclado Mecánico");

        System.out.println("Inventario inicial: " + inventario);

        // 3. Colisión/Actualización: Insertar misma clave con distinto valor
        System.out.println("\n--- Intentando duplicar clave 'A001' ---");
        inventario.put("A001", "Laptop HP"); 

        // 4. Verificación de Unicidad
        // El valor "Laptop Dell" es reemplazado por "Laptop HP"
        System.out.println("Valor actual de A001: " + inventario.get("A001"));
        
        // 5. Búsqueda Rápida
        System.out.println("\n--- Demostración de Búsqueda ---");
        
        // Producto existente
        String producto = inventario.get("B020");
        System.out.println("Búsqueda B020: " + (producto != null ? producto : "No encontrado"));

        // Producto inexistente (devuelve null)
        String inexistente = inventario.get("Z999");
        System.out.println("Búsqueda Z999: " + (inexistente != null ? inexistente : "No encontrado (null)"));
    }
}