package actividad2.punto6;
import java.util.Objects;
public class producto {
     private int id;
    private String nombre;
    private double precio;

    public producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
 
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        producto producto = (producto) o;
        return id == producto.id; 
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    
    public String toString() {
        return nombre + " ($" + precio + ")";
    }
}

