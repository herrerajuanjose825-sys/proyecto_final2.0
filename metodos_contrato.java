import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

public class metodos_contrato {

    public LinkedList<contranto> registrar_contrto(LinkedList<contranto> l, Scanner sc) {
        boolean r = true;

        while (r) {

            contranto c = new contranto();

            System.out.println("Ingrese la cedula del cliente");
            String aux = validaciones.validar_cedula(sc);

            boolean existeCliente = false;

            for (contranto o : l) {
                if (aux.equalsIgnoreCase(o.getCedula_cliente())) {
                    existeCliente = true;
                    break;
                }
            }

            if (existeCliente) {
                System.out.println("El cliente ya tiene un contrato activo");
                continue;
            }

            c.setCedula_cliente(aux);

            System.out.println("Ingrese la placa del vehiculo");
            String aux2 = validaciones.validar_placa(sc);

            boolean existeVehiculo = false;

            for (contranto o : l) {
                if (aux2.equalsIgnoreCase(o.getPlaca_vehiculo())) {
                    existeVehiculo = true;
                    break;
                }
            }

            if (existeVehiculo) {
                System.out.println("El vehiculo ya se encuentra alquilado");
                continue;
            }

            c.setPlaca_vehiculo(aux2);

            System.out.println("Ingrese la fecha de inicio del contrato");
            c.setFecha_inicio(sc.next());

            System.out.println("Ingrese la fecha de finalizacion del contrato");
            c.setFecha_fin(sc.next());

            l.add(c);

            System.out.println("Desea registrar un nuevo contrato?");
            System.out.println("1. Si");
            System.out.println("2. No");

            int opt =validaciones.validarEntero_positivo(sc);

            if (opt == 2) {
                r = false;
            }
        }

        return l;
    }

    public LinkedList<contranto> modificar_contrato(LinkedList<contranto> l, Scanner sc) {
        if (l.isEmpty()) {
            System.out.println("La lista esta vacia");
            return l;
        }

        boolean r = true;

        while (r) {

            boolean encontrado = false;

            System.out.println("Ingrese la cedula del titular del contrato");
            String aux = validaciones.validar_cedula(sc);

            for (contranto o : l) {

                if (o.getCedula_cliente().equalsIgnoreCase(aux)) {

                    encontrado = true;

                    System.out.println("Ingrese la nueva fecha de inicio");
                    o.setFecha_inicio(sc.next());

                    System.out.println("Ingrese la nueva fecha de finalizacion");
                    o.setFecha_fin(sc.next());

                    System.out.println("Contrato modificado correctamente");
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("Contrato no encontrado");
            }

            System.out.println("Desea continuar?");
            System.out.println("1. Si");
            System.out.println("2. No");

            int opt = validaciones.validarEntero_positivo(sc);

            if (opt == 2) {
                r = false;
            }
        }

        return l;
    }

    public LinkedList<contranto> finalizar_contrato(LinkedList<contranto> l, LinkedList<contranto> finalizados, Scanner sc) {
        if (l.isEmpty()) {
            System.out.println("La lista esta vacia");
            return l;
        }

        boolean r = true;

        while (r) {

            boolean encontrado = false;

            System.out.println("Ingrese la cedula del contrato a eliminar");
            String cedula = validaciones.validar_cedula(sc);

            Iterator<contranto> it = l.iterator();

            while (it.hasNext()) {

                contranto o = it.next();

                if (o.getCedula_cliente().equalsIgnoreCase(cedula)) {
                    finalizados.add(o);
                    it.remove();
                    encontrado = true;

                    System.out.println("Contrato eliminado correctamente");
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("Contrato no encontrado");
            }

            System.out.println("Desea finaliznar otro contrato?");
            System.out.println("1. Si");
            System.out.println("2. No");

            int opt = validaciones.validarEntero_positivo(sc);

            if (opt == 2) {
                r = false;
            }
        }

        return l;
    }

    public LinkedList<contranto> buscar_contrato(LinkedList<contranto> l, Scanner sc) {
        if (l.isEmpty()) {
            System.out.println("La lista esta vacia");
            return l;
        }

        boolean r = true;

        while (r) {

            boolean encontrado = false;

            System.out.println("Ingrese la cedula del usuario que desea consultar");
            String cedula = validaciones.validar_cedula(sc);

            for (contranto o : l) {

                if (o.getCedula_cliente().equalsIgnoreCase(cedula)) {

                    encontrado = true;

                    System.out.println("CONTRATO ENCONTRADO ");
                    System.out.println("Cedula Cliente: " + o.getCedula_cliente());
                    System.out.println("Placa Vehiculo: " + o.getPlaca_vehiculo());
                    System.out.println("Fecha Inicio: " + o.getFecha_inicio());
                    System.out.println("Fecha Fin: " + o.getFecha_fin());

                    break;
                }
            }

            if (!encontrado) {
                System.out.println("Contrato no encontrado");
            }

            System.out.println("Desea continuar?");
            System.out.println("1. Si");
            System.out.println("2. No");

            int opt = validaciones.validarEntero_positivo(sc);

            if (opt == 2) {
                r = false;
            }
        }

        return l;
    }
}