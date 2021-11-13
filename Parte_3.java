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
      
