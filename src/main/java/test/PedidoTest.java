package src.main.java.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.main.java.*;


class PedidoTest {

    FuncionarioRH rh;
    FuncionarioGerenteSenior gerenteSenior;
    FuncionarioGerenteImediato gerenteImediato;

    @BeforeEach
    void setUp() {
        rh = new FuncionarioRH(null);
        gerenteSenior = new FuncionarioGerenteSenior(rh);
        gerenteImediato = new FuncionarioGerenteImediato(gerenteSenior);
    }

    @Test
    void deveRetornarGerenteImediatoParaPedidoAte15Dias() {
        assertEquals("Gerente Imediato", gerenteImediato.aprovarPedido(new Pedido(TipoPedidoFerias.getTipoPedidoFerias(), 10)));
    }

    @Test
    void deveRetornarGerenteSeniorParaPedidoAte30Dias() {
        assertEquals("Gerente Sênior", gerenteImediato.aprovarPedido(new Pedido(TipoPedidoFerias.getTipoPedidoFerias(), 25)));
    }

    @Test
    void deveRetornarRHParaPedidoComMaisDe30Dias() {
        assertEquals("RH", gerenteImediato.aprovarPedido(new Pedido(TipoPedidoFerias.getTipoPedidoFerias(), 40)));
    }

    @Test
    void deveRetornarSemAprovacaoParaPedidoInvalido() {
        assertEquals("Sem aprovação", gerenteImediato.aprovarPedido(new Pedido(null, 40)));
    }
}
