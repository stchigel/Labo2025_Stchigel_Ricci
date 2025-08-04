package Pagos;

public enum TipoDiseñador {
    UX(8), UI(7), IT(12);

    private int comision;

    TipoDiseñador(int comision) {
        this.comision = comision;
    }

    public int getComision() {
        return comision;
    }
}
