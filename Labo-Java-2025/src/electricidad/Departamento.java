package electricidad;

public class Departamento extends Vivienda{
    private int ambientes;
    public static int precioporKW = 50;

    public Departamento(int ambientes) {
        super();
        this.ambientes = 0;
    }

    public Departamento(String direccion, int codigoPostal, Duenio duenio, int ambientes) {
        super(direccion, codigoPostal, duenio);
        this.ambientes = ambientes;
    }

    public int getAmbientes() {
        return ambientes;
    }

    public void setAmbientes(int ambientes) {
        this.ambientes = ambientes;
    }

    @Override
    public Double calcConsumo(Mes mes) {
        Double total=0.0;
        total+=super.getConsumo().get(mes)*precioporKW;

        Mes[] meses = Mes.values();
        int pos = mes.ordinal();
        int anteriorPos = (pos - 1 + meses.length) % meses.length;
        Mes anterior = meses[anteriorPos];

        if(super.getConsumo().get(mes)<=super.getConsumo().get(anterior)*0.9){
            total*=0.95;
        }

        return total;
    }
}
