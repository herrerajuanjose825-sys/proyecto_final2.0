import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

public class metodos_vehiculo {
    
    public LinkedList<vehiculo> llena_vehiculos(LinkedList<vehiculo> l, Scanner sc) {

    boolean seguir = true;

    while (seguir) {

        System.out.println("Tipo de vehiculo");
        System.out.println("1. Sedan");
        System.out.println("2. SUV");

        int tipo = validaciones.validarEntero_positivo(sc);

        vehiculo v;

        switch (tipo) {

            case 1:
                v = new sedan();
                break;

            default:
                v = new suv();
                break;

        }
        System.out.println("Placa:");
        String opt1 = validaciones.validar_placa(sc);

        for (vehiculo o : l) {
            if(o.getPlaca().equalsIgnoreCase(opt1)){
                System.out.println("La placa ya se encuentra registrada");
                seguir=false;
                return l;
            }
        }

        v.setPlaca(opt1);
        System.out.println("Marca:");
        v.setMarca(validaciones.validar_marca(sc));

        System.out.println("Modelo:");
        v.setModelo(validaciones.validar_modelo(sc));

        System.out.println("Precio:");
        v.setPrecio(validaciones.validar_precio(sc));

        System.out.println("Estado:");
        v.setEstado(validaciones.validar_estado(sc));

        
        if (v instanceof sedan) {

            sedan s = (sedan) v;

            System.out.println("Tipo de conbustible:");
            s.setTipo_combustible(sc.next());

            System.out.println("Tipo de trasmiccion ");
            s.setTrasmision(sc.next());
        }

        if (v instanceof suv) {

            suv s = (suv) v;

            System.out.println("Tipo de traccion ");
            s.setTraccion(sc.next());

            System.out.println("Capacidad del maletero:");
            s.setCapacidad_maletero(sc.nextFloat());
        }

        l.add(v);

        System.out.println("Desea ingresar otro vehiculo?");
        System.out.println("1. Si");
        System.out.println("2. No");

        int op = validaciones.validarEntero_positivo(sc);

        if (op != 1) {
            seguir = false;
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
        String placa= validaciones.validar_placa(sc);
        boolean bandera=false;
        for (vehiculo o : l) {
            if(o.getPlaca().equalsIgnoreCase(placa)){
                bandera=true;
                System.out.println("Ingrese los datos del vehiculo");
                System.out.println("Placa");
                o.setPlaca(validaciones.validar_placa(sc));
                System.out.println("Marca");
                o.setMarca(validaciones.validar_marca(sc));
                System.out.println("Modelo");
                o.setModelo(validaciones.validar_modelo(sc));
                System.out.println("Precio");
                o.setPrecio(validaciones.validar_precio(sc));
                System.out.println("Estado");
                o.setEstado(validaciones.validar_estado(sc));
                
            if (o instanceof sedan) {

                sedan s = (sedan) o;

                System.out.println("Tipo de conbustible:");
                s.setTipo_combustible(sc.next());

                System.out.println("Tipo de trasmiccion ");
                s.setTrasmision(sc.next());
            }

            if (o instanceof suv) {

                suv s = (suv) o;

                System.out.println("Tipo de traccion ");
                s.setTraccion(sc.next());

                System.out.println("Capacidad del maletero:");
                s.setCapacidad_maletero(sc.nextFloat());
            }

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
            String placa=validaciones.validar_placa(sc);
            Iterator<vehiculo> it = l.iterator();
            boolean encontrado=false;
            while(it.hasNext()){
                vehiculo v =it.next();

                if(v.getPlaca().equalsIgnoreCase(placa)){
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
        String placa= validaciones.validar_placa(sc);
        boolean encontrado=false;
        for (vehiculo c : l) {
            if(c.getPlaca().equalsIgnoreCase(placa)){
                encontrado=true;
                System.out.println("vehiculo  encontrado" );
                System.out.println("Placa:" + c.getPlaca());
                System.out.println("Marca:" + c.getMarca() );
                System.out.println("Modelo:" + c.getModelo());
                System.out.println("Precio:" + c.getPrecio());
                System.out.println("Estado:" + c.getEstado());
                if (c instanceof sedan) {

                sedan s = (sedan) c;

                System.out.println("Tipo de conbustible:"+ s.getTipo_combustible());
                System.out.println("Tipo de trasmiccion "+ s.getTrasmision());
                
            }

            if (c instanceof suv) {

                suv s = (suv) c;

                System.out.println("Tipo de traccion: "+ s.getTraccion());
                System.out.println("Capacidad del maletero:" + s.getCapacidad_maletero());
            }
                break;
            }
        }

        if(!encontrado){
            System.out.println("placa no encontrada, ingrese una placa existente");
        }
        return l;
    }
}
