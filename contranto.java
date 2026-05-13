public class contranto {
    private String id_contrato;
    private String cedula_cliente;
    private String placa_vehiculo;
    private String  fecha_inicio;
    private String fecha_fin;
    private int total_dias;
    private float valor_total;

    public contranto() {
    }

    public contranto(String id_contrato, String cedula_cliente, String placa_vehiculo, String fecha_inicio,
            String fecha_fin, int total_dias, float valor_total) {
        this.id_contrato = id_contrato;
        this.cedula_cliente = cedula_cliente;
        this.placa_vehiculo = placa_vehiculo;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.total_dias = total_dias;
        this.valor_total = valor_total;
    }
    
    public String getId_contrato() {
        return id_contrato;
    }
    public void setId_contrato(String id_contrato) {
        this.id_contrato = id_contrato;
    }
    public String getCedula_cliente() {
        return cedula_cliente;
    }
    public void setCedula_cliente(String cedula_cliente) {
        this.cedula_cliente = cedula_cliente;
    }
    public String getPlaca_vehiculo() {
        return placa_vehiculo;
    }
    public void setPlaca_vehiculo(String placa_vehiculo) {
        this.placa_vehiculo = placa_vehiculo;
    }
    public String getFecha_inicio() {
        return fecha_inicio;
    }
    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }
    public String getFecha_fin() {
        return fecha_fin;
    }
    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
    public int getTotal_dias() {
        return total_dias;
    }
    public void setTotal_dias(int total_dias) {
        this.total_dias = total_dias;
    }
    public float getValor_total() {
        return valor_total;
    }
    public void setValor_total(float valor_total) {
        this.valor_total = valor_total;
    }

    
}
