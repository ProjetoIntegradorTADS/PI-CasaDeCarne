package Classes;

import br.sp.senac.d160.TelasCasaDeCarnes.MenuPrincipal;

/**
 * @author Filipe Ribeiro dos Santos, Salomao Felipe Lima, Giovanna Prates, Carlos Eduardo Montoya
 */
public class CasaDeCarne {
/**
 * Nossa classe main do projeto
 */
    public static void main(String[] args) {
        MenuPrincipal tela = new MenuPrincipal();
        tela.setVisible(true);
        tela.setDefaultCloseOperation(MenuPrincipal.DO_NOTHING_ON_CLOSE);
        tela.setDefaultCloseOperation(MenuPrincipal.EXIT_ON_CLOSE);
    }
}
