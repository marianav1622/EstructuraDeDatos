package actividad2.punto6;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Producto> productos;

    public Carrito() {
        
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        
        if (!productos.contains(p)) {
            productos.add(p);
            System.out.println("Agregado: " + p.getNombre());
        } else {
            System.out.println("El producto ya está en el carrito.");
        }
    }

    public void eliminarProducto(int id) {
       
        productos.removeIf(p -> p.getId() == id);
    }

    public void mostrarCarrito() {
        System.out.println("Contenido del Carrito");
        for (Producto p : productos) {
            System.out.println(p);
        }
    }
}