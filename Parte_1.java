import java.util.*;
public class Estructura_De_datos {
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     ArrayList<String> registros= new ArrayList();
     int CM=0,CA=0,CC=0,TG=0,TGC=0,TGA=0,TGM=0;  // contadores de los resgistros
     String N,via1,via2, registro,aclaracion;     // Declaracion de variables
     while(true){
     System.out.println("Introduce el tipo de vehiculo(camión C, automóvil A, motocicleta M)");
     while(true){ // revisar si es igual a camion, automovil o motocicleta
     N= entrada.next();
     if("C".equals(N) || "A".equals(N) || "M".equals(N)){
         if("C".equals(N)){
             CC+=1;
         }
         if("A".equals(N)){
             CA+=1;
         }
         if("M".equals(N)){
             CM+=1;
