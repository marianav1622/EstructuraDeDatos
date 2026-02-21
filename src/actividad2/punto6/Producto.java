package actividad2.punto6;
import java.util.Objects;

public class Producto {
    private int id;
    private String nombre;
    private double precio;

    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }

   
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return id == producto.id; 
    }

    public int hashCode() {
        return Objects.hash(id);
    }


    public String toString() {
        return String.format("ID: %d | %-15s | Precio: $%.2f", id, nombre, precio);
    }
}