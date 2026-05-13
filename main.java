import java.util.LinkedList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        boolean pedir=true;
        int opt1=0;
        Scanner sc= new Scanner(System.in);
        metodos_clientes mc =new metodos_clientes();
        LinkedList<cliente> listacliente = new LinkedList<>();
        metodos_vehiculo v =new metodos_vehiculo();
        LinkedList<vehiculo> listavehiculo = new LinkedList<>();
        while (pedir) {
            boolean r=true;
            System.out.println("=== MENU PRINCIPAL ===");
            System.out.println("Bienvenido");
            System.out.println("Que desea realizar");
            System.out.println("1) Gestion de clientes ");
            System.out.println("2) Gestion de vehiculos");
            System.out.println("3) Gestionar contratos");
            System.out.println("4) Imprimir informe general ");
            System.out.println("5) Salir del sistema");
            
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                            while (r) {
                                System.out.println("1) Registar clientes  ");
                                System.out.println("2) Modificar clientes ");
                                System.out.println("3) Eliminar clientes  ");
                                System.out.println("4) Buscar clientes");
                                System.out.println("5) Regresar el menu principal");
                                opt1=sc.nextInt();
                                
                            switch (opt1) {
                                case 1:
                                        listacliente=mc.llenar_lista_cliente(listacliente, sc);
                                    break;
                                case 2:
                                        listacliente=mc.modificar_cliente(listacliente, sc);
                                    break;
                                case 3:
                                        listacliente=mc.eliminar_Clientes(listacliente, sc);
                                    break;
                                case 4:
                                        listacliente=mc.mostrar_cliente(listacliente, sc);
                                    break;
                                case 5:
                                        r=false;
                                    break;
                            
                                default:
                                    System.out.println("porfvor ingrese un dato valido ");
                                    break;
                            }
                        }
            
                    break;
                case 2:
                            while (r) {
                                System.out.println("1) Registro de vehiculos   ");
                                System.out.println("2) Modificar vehiculo ");
                                System.out.println("3) Eliminar vehiculo  ");
                                System.out.println("4) Buscar vehiculo");
                                System.out.println("5) Regresar el menu principal");
                                opt1=sc.nextInt();
                                
                            switch (opt1) {
                                case 1:
                                        listavehiculo=v.llena_vehiculos(listavehiculo, sc);
                                    break;
                                case 2:
                                        listavehiculo=v.modificar_vehiculo(listavehiculo, sc);
                                    break;
                                case 3:
                                        listavehiculo=v.borrar_vehiculo(listavehiculo, sc);
                                    break;
                                case 4:
                                        listavehiculo=v.buscar_vehiculo(listavehiculo, sc);
                                    break;
                                case 5:
                                        r=false;
                                    break;
                            
                                default:
                                    System.out.println("porfvor ingrese un dato valido ");
                                    break;
                            }
                        }
                
                    break;

                case 3:
                            while (r) {
                                System.out.println("1) Registar nuevo contranto  ");
                                System.out.println("2) Modificar contrato ");
                                System.out.println("3) Finalizar contrato  ");
                                System.out.println("4) Buscar contranto ");
                                System.out.println("5) Regresar el menu principal");
                                opt1=sc.nextInt();
                                
                            switch (opt1) {
                                case 1:
                                    
                                    break;
                                case 2:
                                    
                                    break;
                                case 3:
                                    
                                    break;
                                case 4:
                                    
                                    break;
                                case 5:
                                        r=false;
                                    break;
                            
                                default:
                                    System.out.println("porfvor ingrese un dato valido ");
                                    break;
                            }
                        }

                
                    break;

                case 4:
                //mosrar informe
                
                    break;

                case 5:
                        pedir=false;
                    break;

                default:
                    System.out.println(" porfavor ingrese un opcion valida");
                    break;
            }
        }
    }
}
