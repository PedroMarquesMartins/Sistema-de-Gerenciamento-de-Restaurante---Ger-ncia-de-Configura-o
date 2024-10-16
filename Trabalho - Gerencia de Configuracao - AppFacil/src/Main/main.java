package Main;


import Telas.Gestor.TelaAdicionarAoCardapio;
import Telas.Sistema.TelaLogin;
import Telas.Sistema.TelaZero;

public class main {

    public static void main(String[] args) throws Exception {
        
        boolean status = false;

        new TelaAdicionarAoCardapio().setVisible(true);
        new TelaLogin().setVisible(true);
        new TelaZero().setVisible(true);

    }
}