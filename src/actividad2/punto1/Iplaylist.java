public interface Iplaylist {
    /* Firmas de Métodos: métodos abstractos sin cuerp */
    void agregarCancion(Cancion c);
    void eliminarCancion(String titulo);
    Cancion reproduccionSiguiente();
    void vaciarLista();
    int obtenerCantidadCancion();    
}