package src.main.java;

public class FuncionarioGerenteSenior extends Funcionario {

    public FuncionarioGerenteSenior(Funcionario superior) {
        listaPedidos.add(TipoPedidoFerias.getTipoPedidoFerias());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gerente Sênior";
    }

    protected boolean podeAprovar(Pedido pedido) {
        return pedido.getDias() <= 30;
    }
}