import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

public class metodos_vehiculo {
    
    public  LinkedList<vehiculo> llena_vehiculos (LinkedList<vehiculo> l , Scanner sc){
        boolean segir=true;

        while (segir){
            vehiculo v = new vehiculo();
            System.out.println("Ingrese los datos del vehiculo");
            System.out.println("Placa");
            v.setPlaca(sc.next());
            System.out.println("Marca");
            v.setMarca(sc.next());
            System.out.println("Modelo");
            v.setModelo(sc.nextInt());
            System.out.println("Precio");
            v.setPrecio(sc.nextFloat());
            System.out.println("Estado");
            v.setEstado(sc.next());
            l.add(v);

            System.out.println("Desea ingresar otro vehiculo 1) si  2) no ");
            int opt=sc.nextInt();

            if(opt!=1){
                segir=false;
            }
        }
        return l;
    }

    public LinkedList<vehiculo> modificar_vehiculo (LinkedList<vehiculo> l , Scanner sc){
        if(l.isEmpty()){
            System.out.println("Lista de vehiculos vacia, porfavor igrese datos");
            return l;
        }

        System.out.println("Ingrese la placa del vehiculo a modificar");
        String placa= sc.next();
        boolean bandera=false;
        for (vehiculo o : l) {
            if(o.getPlaca().equals(placa)){
                bandera=true;
                System.out.println("Ingrese los datos del vehiculo");
                System.out.println("Placa");
                o.setPlaca(sc.next());
                System.out.println("Marca");
                o.setMarca(sc.next());
                System.out.println("Modelo");
                o.setModelo(sc.nextInt());
                System.out.println("Precio");
                o.setPrecio(sc.nextFloat());
                System.out.println("Estado");
                o.setEstado(sc.next());
                System.out.println("vehiculo modificado");
                break;
            }
        }
        if(!bandera){
            System.out.println("Vehiculo no encontrado");
        }
        return l;
    }

    public LinkedList<vehiculo> borrar_vehiculo (LinkedList<vehiculo> l , Scanner sc){
        if(l.isEmpty()){
            System.out.println("Lista vacia, ingrese datos ");
            return l;
        }

            System.out.println("Ingrese la plca del vehiculo que desea eliminar");
            String placa=sc.next();
            Iterator<vehiculo> it = l.iterator();
            boolean encontrado=false;
            while(it.hasNext()){
                vehiculo v =it.next();

                if(v.getPlaca().equals(placa)){
                    it.remove();
                    encontrado=true;
                    System.out.println("vehiculo eliminado correctamente");
                break;

                }
            }

            if(!encontrado){
                System.out.println("vehiculo no encontrado, ingrese unaplaca existente");
            }
    
        return l;
    }

    public LinkedList<vehiculo> buscar_vehiculo (LinkedList<vehiculo> l , Scanner sc){
        if(l.isEmpty()){
            System.out.println("La lista esta vacia, ingrese datos");
            return l;
        }

        System.out.println("Ingrese la placa del vehiculo que desea buscar");
        String placa= sc.next();
        boolean encontrado=false;
        for (vehiculo c : l) {
            if(c.getPlaca().equals(placa)){
                encontrado=true;
                System.out.println("vehiculo  encontrado" );
                System.out.println("Placa:" + c.getPlaca());
                System.out.println("Marca:" + c.getMarca() );
                System.out.println("Modelo:" + c.getModelo());
                System.out.println("Precio:" + c.getPrecio());
                System.out.println("Estado:" + c.getEstado());
                break;
            }
        }

        if(!encontrado){
            System.out.println("placa no encontrada, ingrese una placa existente");
        }
        return l;
    }
}
