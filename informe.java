import java.util.LinkedList;

public class informe {
        public void generarInforme(
        LinkedList<cliente> clientes,
        LinkedList<vehiculo> vehiculos,
        LinkedList<contranto> contratosActivos,
        LinkedList<contranto> contratosFinalizados) {
        
        if(clientes.isEmpty() ||
                vehiculos.isEmpty() ||
                contratosActivos.isEmpty()){

        System.out.println("Alguna lista esta vacia");
        return;
}
        String informe = "";

        informe += "\n=================================\n";
        informe += "           CLIENTES\n";
        informe += "=================================\n";

        for (cliente c : clientes) {

        informe += "Cedula: " + c.getCedula() + "\n";
        informe += "Nombre: " + c.getNombre() + "\n";
        informe += "Telefono: " + c.getTelefono() + "\n";
        informe += "-----------------------------\n";
}

        informe += "\n=================================\n";
        informe += "          VEHICULOS\n";
        informe += "=================================\n";

        for (vehiculo v : vehiculos) {

        informe += "Placa: " + v.getPlaca() + "\n";
        informe += "Marca: " + v.getMarca() + "\n";
        informe += "Modelo: " + v.getModelo() + "\n";
        informe += "Precio: " + v.getPrecio() + "\n";
        informe += "Estado: " + v.getEstado() + "\n";
        informe += "-----------------------------\n";
}

        informe += "\n=================================\n";
        informe += "      CONTRATOS ACTIVOS\n";
        informe += "=================================\n";

        for (contranto c : contratosActivos) {

        informe += "Cedula Cliente: "
                + c.getCedula_cliente() + "\n";

        informe += "Placa Vehiculo: "
                + c.getPlaca_vehiculo() + "\n";

        informe += "Fecha Inicio: "
                + c.getFecha_inicio() + "\n";

        informe += "Fecha Fin: "
                + c.getFecha_fin() + "\n";

        informe += "-----------------------------\n";
}

        informe += "\n=================================\n";
        informe += "    CONTRATOS FINALIZADOS\n";
        informe += "=================================\n";

        for (contranto c : contratosFinalizados) {

        informe += "Cedula Cliente: "
                + c.getCedula_cliente() + "\n";

        informe += "Placa Vehiculo: "
                + c.getPlaca_vehiculo() + "\n";

        informe += "Fecha Inicio: "
                + c.getFecha_inicio() + "\n";

        informe += "Fecha Fin: "
                + c.getFecha_fin() + "\n";

        informe += "-----------------------------\n";


        informe += "\n=================================\n";
        informe += "    TOTAL DE INGRESOS\n";
        informe += "=================================\n";


}
        System.out.println(informe);
}
}
