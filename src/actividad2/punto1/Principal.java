public class Principal {
    public static void main(String[] args) {
        
        System.out.println(" Sistema de Reproducción Iniciado.");
        /* 1. Agregar canciones */
        Cancion c1 = new Cancion("EL FINAL", 3.50);
        Cancion c2 = new Cancion("CON EL CORAZON", 3.20);
        /*2. Reproducir la siguiente */
        System.out.println("Cargando canciones..");
        System.out.println("Canción creada: " + c1.getTitulo());
        System.out.println("Canción creada: " + c2.getTitulo());
        
        System.out.println("Estructura de IPlaylist definida correctamente.");
    }
}