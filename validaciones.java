import java.util.Scanner;

public class validaciones {
    public static int validarEntero_positivo(Scanner sc) {
    int numero;
    do{

        while(!sc.hasNextInt()){
            System.out.println("Error. Ingrese 1 o 2:");
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

}
