package src.main.java;

import java.util.ArrayList;

public abstract class Funcionario {

    protected ArrayList<TipoPedido> listaPedidos = new ArrayList<>();
    private Funcionario funcionarioSuperior;

    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }

    public abstract String getDescricaoCargo();

    public String aprovarPedido(Pedido pedido) {
        if (listaPedidos.contains(pedido.getTipoPedido()) && podeAprovar(pedido)) {
            return getDescricaoCargo();
        } else {
            if (funcionarioSuperior != null) {
                return funcionarioSuperior.aprovarPedido(pedido);
            } else {
                return "Sem aprovação";
            }
        }
    }

    protected abstract boolean podeAprovar(Pedido pedido);
}
