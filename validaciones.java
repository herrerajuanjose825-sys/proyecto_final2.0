import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class validaciones {
    public static int validarEntero_positivo(Scanner sc) {
    int numero;
    do{
        
        while(!sc.hasNextInt()){
            System.out.println("Ingrese un numero entero ");
            sc.next();
        }

        numero = sc.nextInt();

        if(numero != 1 && numero != 2){
            System.out.println(
                "Solo se permiten las opciones 1 o 2");
        }

    }while(numero != 1 && numero != 2);

    return numero;
}

    public static String validar_cedula(Scanner sc){

    boolean r=false;
    String cedula;
    do{
        cedula = sc.next();

        if(!cedula.matches("\\d+")  || cedula.length()>11 || cedula.length()<6){
            System.out.println(" La cedula solo puede contener numeros y un tamaño entre 6 y 11 digitos");
        }

    }while(!cedula.matches("\\d+") && cedula.length()>11 ||cedula.length()<6);

    return cedula;
}

    public static String validar_placa(Scanner sc){

    String placa;

    do{

        placa = sc.next().toUpperCase();

        if(!placa.matches("[A-Z]{3}[0-9]{3}")){
            System.out.println(
            " La placa debe tener el formato ABC123");
        }

    }while(!placa.matches("[A-Z]{3}[0-9]{3}"));

    return placa;
}

    public static String validar_nombres(Scanner sc){

    String nombre;

    do{

        nombre = sc.nextLine().toUpperCase();

        if(nombre.length() > 10 ||
            nombre.length() < 3 ||
            !nombre.matches("[A-Z ]+")){

            System.out.println(
                "El nombre debe tener entre 3 y 10 letras y solo contener caracteres alfabeticos");
        }

    }while(nombre.length() > 10 ||
            nombre.length() < 3 ||
            !nombre.matches("[A-Z ]+"));

    return nombre;
}

    public static String validar_celular(Scanner sc){
        String celular;
        do{
            celular= sc.next();
            if(celular.length()!=10 || !celular.matches("[0-9]+")){
                System.out.println("El celular debe de contener 10 digitos y solo ingresar numeros ");
            }
        }while(celular.length()!=10 || !celular.matches("[0-9]+"));
        return celular;
    }

    public static String validar_licencia(Scanner sc){
        String cedula;
        do{
            cedula= sc.next();
            if(cedula.length()!=10 || !cedula.matches("[0-9]+")){
                System.out.println("La licencia debe de contener 10 digitos y solo ingresar numeros ");
            }
        }while(cedula.length()!=10 || !cedula.matches("[0-9]+"));
        return cedula;
    }

    public static String validarFecha(Scanner sc){

    DateTimeFormatter formato =
            DateTimeFormatter.ofPattern("dd/MM/yyyy");

    String fecha;

    while(true){

        fecha = sc.next();

        try{

            LocalDate.parse(fecha, formato);

            return fecha;

        }catch(DateTimeParseException e){

            System.out.println(
                "Fecha invalida. Use el formato dd/MM/yyyy");
        }
    }
}

    public static String validar_marca(Scanner sc){
        String marca;
        do{
            marca=sc.next().toUpperCase();
            if(!marca.matches("[A-Z]+")){
                System.out.println("No ingrese numeros ni carateres especiales  ");
            }
        }while(!marca.matches("[A-Z]+"));
        return marca;
    }

    public static int validar_modelo(Scanner sc){
        int modelo;
        do{
            
            while(!sc.hasNextInt()){
                System.out.println("Ingrese un numero entero");
                sc.next();
}
            modelo=sc.nextInt();

            if(String.valueOf(modelo).length()!=4 && modelo < 1950){
                System.out.println("El modelo debe ser un año de digitos mayor a 1950");
            }

        }while(String.valueOf(modelo).length()!=4 || modelo < 1950);
        return modelo;
    }

    public static String validar_estado(Scanner sc){
        String estado, aux= "DISPONIBLE", aux1="ARRENDADO";

        do{
            estado= sc.next().toUpperCase();
            if(!estado.equals(aux) && !estado.equals(aux1)){
                System.out.println("Ingrese disponible o arrendado");
            }
        }while(!estado.equals(aux) && !estado.equals(aux1));

        return estado;
    }

    public static float validar_precio(Scanner sc){
        float precio;
        do{
            while(!sc.hasNextInt()){
                System.out.println("debe de ingresar valores numericos");
                sc.next();
            }
            precio=sc.nextFloat();
            if(precio<= 0){
                System.out.println("ingrese un valor valido ");
            }
        }while(precio<= 0);
        return precio;
    }
}
