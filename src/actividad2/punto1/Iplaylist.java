public interface Iplaylist {
void agregarCancion(Cancion c);
    void eliminarCancion(String titulo);
    Cancion reproduccionSiguiente();
    void vaciarLista();
    int obtenerCantidadCancion();    
}