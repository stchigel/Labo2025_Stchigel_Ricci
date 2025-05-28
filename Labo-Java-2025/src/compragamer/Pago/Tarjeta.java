package compragamer.Pago;

public class Tarjeta extends Metodopago {
    private int numero;
    private int codSeg;
    private Double saldo;
    private String banco;

    public Tarjeta(){
        super();
        numero=0;
        codSeg=0;
        saldo=0.0;
        banco="N/A";
    }

    public Tarjeta(String tipo, int numero, int codSeg, Double saldo, String banco) {
        super(tipo);
        this.numero = numero;
        this.codSeg = codSeg;
        this.saldo = saldo;
        this.banco = banco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCodSeg() {
        return codSeg;
    }

    public void setCodSeg(int codSeg) {
        this.codSeg = codSeg;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }
}
