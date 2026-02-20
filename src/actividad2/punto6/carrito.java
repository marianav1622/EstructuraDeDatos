package actividad2.punto6;
import java.util.ArrayList;
import java.util.List;
public class carrito {
private List<producto> listaProductos = new ArrayList<>();

    public void agregarProducto(producto p) {
        if (!listaProductos.contains(p)) {
            listaProductos.add(p);
            System.out.println("Agregado: " + p);
        } else {
            System.out.println("El producto ya existe en el carrito.");
        }
    }

    
    public void eliminarProducto(producto p) {
        if (listaProductos.remove(p)) {
            System.out.println("Eliminado: " + p);
        } else {
            System.out.println("El producto no estaba en el carrito.");
        }
    }

    public void mostrarCarrito() {
        System.out.println("--- Contenido del Carrito (" + listaProductos.size() + " items) ---");
        listaProductos.forEach(System.out::println);
    }
}
    
}
