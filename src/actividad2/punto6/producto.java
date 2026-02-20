package actividad2.punto6;

public class producto {
     private int id;
    private String nombre;
    private double precio;

    public producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Paso 1: Implementación de equals para validación de existencia
    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        producto producto = (producto) o;
        return id == producto.id; // Comparamos por ID único
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    
    public String toString() {
        return nombre + " ($" + precio + ")";
    }
}

