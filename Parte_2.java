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
