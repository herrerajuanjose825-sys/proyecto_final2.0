import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

public class metodos_clientes {

    public LinkedList<cliente>  llenar_lista_cliente (LinkedList<cliente> l, Scanner sc){
        boolean continuar= true;
        while (continuar) {
        System.out.println("Ingrese la cedula");
        String opt=validaciones.validar_cedula(sc);
        for (cliente o : l) {
            if(o.getCedula().equalsIgnoreCase(opt)){
                continuar= false;
                System.out.println("La cedula ya se encuentra registrada");
                return l;
            }
            
        }
        
        cliente c= new cliente();
        sc.nextLine();
        c.setCedula(opt);
        System.out.println("Ingrese el nombre");
        c.setNombre(validaciones.validar_nombres(sc));
        System.out.println("Ingrese el apellido");
        c.setApellido(validaciones.validar_nombres(sc));
        System.out.println("Ingrese la direccion de correo electronico ");
        c.setDireccion(sc.next());
        System.out.println("Ingrese su numero movil ");
        c.setTelefono(validaciones.validar_celular(sc));
        System.out.println("Ingrese su licencia ");
        c.setLicencia(validaciones.validar_licencia(sc));
        l.add(c);
        System.out.println("desea continuar ingresando datos 1) si 2) no ");
        int op=validaciones.validarEntero_positivo(sc);
        if(op!=1){
            continuar=false;
            }
        }

        return l;
    }

    public LinkedList<cliente> modificar_cliente (LinkedList<cliente> l ,Scanner sc){
        if(l.isEmpty()){
            System.out.println("La lista esta vacia, porfavor ingrese datos ");
            return l;
        }

        System.out.println(" Ingrese el numero de la cedula del cliente que desea modificar");
        String modificar1= validaciones.validar_cedula(sc);
        boolean encontrado=false;

        for (cliente o : l) {
            if(o.getCedula().equals(modificar1)){
                encontrado=true;
                System.out.println("Usuario: "+ o.getNombre() + " encontrado" );
                System.out.println("Ingrese los datos nuevos del usuario");
                System.out.println("Ingrese el nombre");
                o.setNombre(validaciones.validar_nombres(sc));
                System.out.println("Ingrese la cedula");
                o.setCedula(validaciones.validar_cedula(sc));
                System.out.println("Ingrese el apellido");
                o.setApellido(validaciones.validar_nombres(sc));
                System.out.println("Ingrese la direccion ");
                o.setDireccion(sc.next());
                System.out.println("Ingrese su numero movil ");
                o.setTelefono(validaciones.validar_celular(sc));
                System.out.println("Ingrese su licencia ");
                o.setLicencia(validaciones.validar_licencia(sc));

                break;
            }
        }

        if(!encontrado){
            System.out.println("cliente no encontrado ");
        }

        return l;

    }
    
    public LinkedList<cliente> eliminar_Clientes (LinkedList<cliente> l ,Scanner sc){
        boolean encontrado= false;
        if(l.isEmpty()){
            System.out.println("Lista vacia porfavor ingrese datos");
            return l;
        }

        System.out.println(" Ingrese el numero de la cedula del cliente que desea eliminar");
        String borrar = validaciones.validar_cedula(sc);
        Iterator<cliente> it = l.iterator();

        while (it.hasNext()) {
        cliente o = it.next();

        if (o.getCedula().equals(borrar)) {
            it.remove();
            encontrado = true;
            System.out.println("Cliente eliminado correctamente");
            break;
        }
    }

    if (!encontrado) {
        System.out.println("No se encontró un cliente con esa cédula");
    }
        return l;
    }

    public LinkedList<cliente> mostrar_cliente (LinkedList<cliente> l ,Scanner sc){

        if(l.isEmpty()){
            System.out.println("La lista esta vacia, porfavor ingrese datos ");
            return l;
        }

        System.out.println(" Ingrese el numero de la cedula del cliente que desea Buscar");
        String buscar= validaciones.validar_cedula(sc);
        boolean encontrado=false;

        for (cliente o : l) {
            if(o.getCedula().equals(buscar)){
                encontrado=true;
                System.out.println("Usuario encontrado" );
                System.out.println("Nombre:" + o.getNombre());
                System.out.println("Apellido:" + o.getApellido() );
                System.out.println("Cedula:" + o.getCedula());
                System.out.println("Telefono:" + o.getTelefono());
                System.out.println("Direccion:" + o.getDireccion());
                System.out.println("Licencia:" + o.getLicencia());
                break;
            }
        }

        if(!encontrado){
            System.out.println("cliente no encontrado no encontrado");
        }

        return l;

    }
    
}
