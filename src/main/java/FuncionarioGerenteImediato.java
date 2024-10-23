package src.main.java;

public class FuncionarioGerenteImediato extends Funcionario {

    public FuncionarioGerenteImediato(Funcionario superior) {
        listaPedidos.add(TipoPedidoFerias.getTipoPedidoFerias());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gerente Imediato";
    }

    protected boolean podeAprovar(Pedido pedido) {
        return pedido.getDias() <= 15;
    }
}
