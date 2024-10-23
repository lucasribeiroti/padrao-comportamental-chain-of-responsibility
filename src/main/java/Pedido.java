package src.main.java;

public class Pedido {

    private TipoPedido tipoPedido;
    private int dias;

    public Pedido(TipoPedido tipoPedido, int dias) {
        this.tipoPedido = tipoPedido;
        this.dias = dias;
    }

    public TipoPedido getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(TipoPedido tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
}
