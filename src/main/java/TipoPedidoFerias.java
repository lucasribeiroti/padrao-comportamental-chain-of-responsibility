package src.main.java;

public class TipoPedidoFerias implements TipoPedido {

    private static TipoPedidoFerias tipoPedidoFerias = new TipoPedidoFerias();

    private TipoPedidoFerias() {}

    public static TipoPedidoFerias getTipoPedidoFerias() {
        return tipoPedidoFerias;
    }
}
