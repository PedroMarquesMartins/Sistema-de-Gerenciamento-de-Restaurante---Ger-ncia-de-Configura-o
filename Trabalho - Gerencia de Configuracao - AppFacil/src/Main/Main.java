package Main;


import BancoDeDados.Outros.CriarDB;
import Telas.Garcom.TelaAdicionarPedidos;
import Telas.Garcom.TelaPedidos;
import Telas.Gestor.TelaAdicionarAoCardapio;
import Telas.Sistema.TelaLogin;
import Telas.Sistema.TelaZero;

import javax.swing.*;

public class main {

    public static void main(String[] args) throws Exception {
        if (!CriarDB.bancoExiste()) //Checa se banco ja existe, caso nao existir cria o arquivo do banco
        {
            CriarDB.criarArquivo();
            JOptionPane.showMessageDialog(null, "Banco Criado!\nArquivo: "+CriarDB.localbanco);
        }

        new TelaAdicionarAoCardapio().setVisible(false);
        new TelaLogin().setVisible(false);
        new TelaZero().setVisible(false);
        new TelaAdicionarPedidos().setVisible(true);
        new TelaPedidos().setVisible(true);

    }
}