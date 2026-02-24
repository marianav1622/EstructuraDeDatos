package actividad2.punto6;
public class Main {
    public static void main(String[] args) {
        Carrito miCarrito = new Carrito();
        /*cuando el ArrayList llena su
capacidad inicial (10 por defecto), crea internamente un nuevo array más
grande y copia los elementos (operación O(n)).*/
        Producto p1 = new Producto(101, "Laptop Gaming", 1200.00);
        Producto p2 = new Producto(102, "Mouse Óptico", 25.50);
        /* Intentar agregar duplicado */
        miCarrito.agregarProducto(p1);
        miCarrito.agregarProducto(p2);
        miCarrito.agregarProducto(p1); 
        
        miCarrito.mostrarCarrito();
    }
}