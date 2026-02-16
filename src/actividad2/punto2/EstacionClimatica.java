public class EstacionClimatica{
    public static void main(String []args){
        double[] temperatura = new double[24];

for (int i=0; i<= temperatura.length; i++){
     temperatura[i] = Math.random() * 40;
}
double tempMediodia = temperatura[12]; 
System.out.println("temperatura a las 12:00 (12 horas: )" + tempMediodia);
try{
    temperatura[24] = 25;
}catch ( ArrayIndexOutOfBoundsException e ){
    System.err.println("ERROR DETECTADO: " + e.toString());
     System.out.println("No se puede acceder a la posición 24 porque está fuera de los límites.");
}
    }
}
