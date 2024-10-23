package src.main.java;

public class FuncionarioRH extends Funcionario {

    public FuncionarioRH(Funcionario superior) {
        listaPedidos.add(TipoPedidoFerias.getTipoPedidoFerias());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "RH";
    }

    protected boolean podeAprovar(Pedido pedido) {
        return pedido.getDias() > 30;
    }
}
