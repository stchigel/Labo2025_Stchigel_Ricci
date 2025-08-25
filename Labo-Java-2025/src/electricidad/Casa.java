package electricidad;

public class Casa extends Vivienda{
    private int techado;
    private int tapado;
    public static int precioporKW = 100;

    public Casa() {
        super();
        this.techado = 0;
        this.tapado = 0;
    }

    public Casa(String direccion, int codigoPostal, Duenio duenio, int techado, int tapado) {
        super(direccion, codigoPostal, duenio);
        this.techado = techado;
        this.tapado = tapado;
    }

    public int getTechado() {
        return techado;
    }

    public void setTechado(int techado) {
        this.techado = techado;
    }

    public int getTapado() {
        return tapado;
    }

    public void setTapado(int tapado) {
        this.tapado = tapado;
    }

    public static int getPrecioporKW() {
        return precioporKW;
    }

    public static void setPrecioporKW(int precioporKW) {
        Casa.precioporKW = precioporKW;
    }

    @Override
    public Double calcConsumo(Mes mes) {
        Double total=0.0;
        total+=super.getConsumo().get(mes)*precioporKW;

        int pos = mes.ordinal();
        Mes anterior;
        if(pos <= 1){
            anterior = Mes.values()[pos];
        } else {
            anterior = Mes.values()[pos-1];
        }

        if(super.getConsumo().get(mes)<=super.getConsumo().get(anterior)*0.9){
            total*=0.95;
        }

        return total;
    }
}
