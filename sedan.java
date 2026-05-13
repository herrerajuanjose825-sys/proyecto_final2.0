public class sedan {
    private String tipo_combustible;
    private String trasmision;
    
    public sedan() {
    }

    public sedan(String tipo_combustible, String trasmision) {
        this.tipo_combustible = tipo_combustible;
        this.trasmision = trasmision;
    }

    public String getTipo_combustible() {
        return tipo_combustible;
    }
    public void setTipo_combustible(String tipo_combustible) {
        this.tipo_combustible = tipo_combustible;
    }
    public String getTrasmision() {
        return trasmision;
    }
    public void setTrasmision(String trasmision) {
        this.trasmision = trasmision;
    }
    
}
