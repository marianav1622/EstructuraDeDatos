import java.util.HashMap;
import java.util.Map;

public class inventario {
    public static void main(String[] args) {
        /*. Estructura Declaración e Instanciación*/
       
        Map<String, String> inventario = new HashMap<>();

        /*Insertar productos con inventarios*/
        inventario.put("A001", "Laptop Dell");
        inventario.put("B002", "Monitor LG 24'");
        inventario.put("C003", "Teclado Mecánico");

        /*Colisión/Actualización Insertar un nuevo producto con una clave*/
     
        inventario.put("A001", "Laptop HP"); 

        /*verificar que el valor se ha actualizado*/
        System.out.println("Verificación de Unicidad");
        System.out.println("Producto A001: " + inventario.get("A001"));
        // Explicación: HashMap no permite claves duplicadas. Al usar un SKU existente,
        // el método put() reemplaza el valor anterior ("Laptop Dell") por el nuevo.

        /*Búsqueda Rápida*/
        System.out.println("\n--- Búsqueda Eficiente ---");
        String skuExistente = "B002";
        String skuInexistente = "Z999";

        System.out.println("Resultado '" + skuExistente + "': " + inventario.get(skuExistente));
        System.out.println("Resultado '" + skuInexistente + "': " + inventario.get(skuInexistente));
    }
}

