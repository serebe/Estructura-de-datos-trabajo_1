import java.util.*;
public class Finalizacion {
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     Vector <String> registros = new Vector<>();;
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
         }
         break;
     }
     else{
         System.out.println("Copiaste un tipo de vehiculo incorrecto, vuelve a copiarlo");
     }
     } 
     System.out.println("Registro de giro");
     while(true){ // revisar si la curva es la correcta y registro
     System.out.println("Desde qué vía se dirige el vehículo (vía origen).");
     via1= entrada.next();
     System.out.println("Hacia qué vía se dirige el vehículo (vía destino).");
     via2= entrada.next();
     if("33".equals(via1.concat(via2)) || "11".equals(via1.concat(via2)) || "12".equals(via1.concat(via2))|| "13".equals(via1.concat(via2)) || "22".equals(via1.concat(via2)) || "31".equals(via1.concat(via2))){
       if("12".equals(via1.concat(via2))|| "13".equals(via1.concat(via2)) || "31".equals(via1.concat(via2))){
           TG+=1;
       }
       break;  
     }
     else{
         System.out.println("Has copiado mal una via o un cruce incorrecto por favor vuelve a intentar");
     }  
     }
     if(N.equals("C")){// total de giros por Camion
        if("12".equals(via1.concat(via2))|| "13".equals(via1.concat(via2)) || "31".equals(via1.concat(via2))){
           TGC+=1;
       } 
     }
     if(N.equals("A")){// total de giros por Automovil
        if("12".equals(via1.concat(via2))|| "13".equals(via1.concat(via2)) || "31".equals(via1.concat(via2))){
           TGA+=1;
       } 
     }
     if(N.equals("M")){// total de giros por Motocicleta
        if("12".equals(via1.concat(via2))|| "13".equals(via1.concat(via2)) || "31".equals(via1.concat(via2))){
           TGM+=1;
       } 
     }
     registro= N.concat(via1.concat(via2));
      
     registros.add(registro);
     System.out.println("Desea introducir otro registro(si o no)");
     aclaracion= entrada.next();
     if("no".equals(aclaracion) || "n".equals(aclaracion)){
         System.out.println("Registro|indice");
         for(int i=0; i<registros.size(); i++){
         System.out.println(String.valueOf(registros.get(i))+"    |     "+String.valueOf(i));
         }
         System.out.println("Total de registros: ".concat(String.valueOf(registros.size())));
         System.out.println("Total de camiones: ".concat(String.valueOf(CC)));
         System.out.println("Total de motocicletas: ".concat(String.valueOf(CM)));
         System.out.println("Total de Automoviles: ".concat(String.valueOf(CA)));
         System.out.println("Total de Giros: ".concat(String.valueOf(TG)));
         System.out.println("Total de giros por Camiones: ".concat(String.valueOf(TGC)));
         System.out.println("Total de giros por Automoviles: ".concat(String.valueOf(TGA)));
         System.out.println("Total de giros por Motocicletas: ".concat(String.valueOf(TGM)));
         break;// para el while que comenzo desde arriba terminarlo
     }
     }
    while(true){
    System.out.println("Desea buscar un registro por su indice(1) o borrar un registro(2) o terminar(3)");
    int valop= entrada.nextInt();
    if(valop==1){
    System.out.println("Que indice desea buscar");
    int m=entrada.nextInt();
    System.out.println("Registro|indice");
    System.out.println(String.valueOf(registros.get(m))+"    |     "+String.valueOf(m));
    }
    if(valop==2){
    System.out.println("Que indice desea borrar");
    int n=entrada.nextInt();
    registros.remove(n);
    System.out.println("Registro|indice");
    for(int i=0; i<registros.size(); i++){
         System.out.println(String.valueOf(registros.get(i))+"    |     "+String.valueOf(i));
         }
    }
    if(valop>=3){
        break;
    }
    }

}
}    
