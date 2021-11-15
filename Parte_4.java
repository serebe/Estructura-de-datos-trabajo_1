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