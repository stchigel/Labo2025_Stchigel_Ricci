package Tiendas.compragamer.Pago;

public class Transferencia extends Metodopago{
    private String alias;
    private Double saldo;

    public Transferencia(){
        super();
        alias="benja.falopa.falopa.falopa";
        saldo=0.07;
    }

    public Transferencia(String tipo, String alias, Double saldo) {
        super(tipo);
        this.alias = alias;
        this.saldo = saldo;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
