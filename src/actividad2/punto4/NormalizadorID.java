package actividad2.punto4;

public class NormalizadorID {
    public static void main(String[]args){
        String idSucio = " User_123 ";
         String idLimpio = idSucio.trim().toUpperCase().substring(0, 8);
    System.out.println("--- Prueba de Inmutabilidad ---");
        System.out.println("ID Original: '" + idSucio + "' | ID Hash: " + System.identityHashCode(idSucio));
        System.out.println("ID Limpio:   '" + idLimpio + "' | ID Hash: " + System.identityHashCode(idLimpio));
        StringBuilder constructor = new StringBuilder(idLimpio);

        // 5. Inversión: Usamos el método eficiente .reverse()
        constructor.reverse();
        String idInvertido = constructor.toString();

        System.out.println("\n--- Resultado Final ---");
        System.out.println("ID Procesado: " + idLimpio);
        System.out.println("ID Invertido: " + idInvertido);

        // EXTRA: Ejemplo con un bucle for (Inversión manual para practicar)
        System.out.println("\nInversión manual usando for:");
        String manual = "";
        for (int i = idLimpio.length() - 1; i >= 0; i--) {
            manual += idLimpio.charAt(i); // ¡Ojo! Esto es ineficiente en bucles largos
        }
        System.out.println("Manual: " + manual);
    }

}
