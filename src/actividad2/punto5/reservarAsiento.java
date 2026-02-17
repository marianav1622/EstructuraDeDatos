public class reservarAsiento {
public static void reservarAsiento (int fila, int col){
        if (fila >=0 && fila <8 && col >= 0 && col < 10) {
            if (sala[fila][col]=0) {
                sala[fila][col]=1;
                System.out.println("reservacion exitosamente en [" + fila +"][" + col +"]. " );  
            }else{
                System.out.println("El asiento ya esta ocupado.");
            
            }
        }
    
   }
}

