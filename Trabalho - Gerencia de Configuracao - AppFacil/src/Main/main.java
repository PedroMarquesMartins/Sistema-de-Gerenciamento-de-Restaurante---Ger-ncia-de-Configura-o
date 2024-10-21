package Main;


import Telas.Garcom.TelaAdicionarPedidos;
import Telas.Garcom.TelaPedidos;
import Telas.Gestor.TelaAdicionarAoCardapio;
import Telas.Sistema.TelaLogin;
import Telas.Sistema.TelaZero;

public class main {

    public static void main(String[] args) throws Exception {
        
        boolean status = false;

        new TelaAdicionarAoCardapio().setVisible(false);
        new TelaLogin().setVisible(false);
        new TelaZero().setVisible(false);
        new TelaAdicionarPedidos().setVisible(true);
        new TelaPedidos().setVisible(true);

    }
}