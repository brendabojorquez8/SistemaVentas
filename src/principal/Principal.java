package principal;

import control.ControlCategoria;
import vistas.Menu;

public class Principal {

    public static void main(String[] args) {

        ControlCategoria control = new ControlCategoria();

        Menu menu = new Menu();
        menu.setVisible(true);
    }

}
