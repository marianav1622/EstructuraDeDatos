public interface InerIplaylist {
void agregarCancion(cancion c);
    void eliminarCancion(String titulo);
    cancion reproduccionSiguiente();
    void vaciarLista();
    int obtenerCantidadCancion();    
}