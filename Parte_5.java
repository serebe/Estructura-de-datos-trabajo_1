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
