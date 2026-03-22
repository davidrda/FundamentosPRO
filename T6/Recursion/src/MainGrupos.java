import controller.ControllerGrupos;
import model.Grupo;
import model.User;

public class MainGrupos {

    public static void main(String[] args) {

        // ==========================================
        User user1 = new User(1, "user1");
        User user2 = new User(2, "user2");
        User user3 = new User(3, "user3");
        User user4 = new User(4, "user4");
        User user5 = new User(5, "user5");
        User user6 = new User(6, "user6");

        // ==========================================

        Grupo fp = new Grupo();
        Grupo dam = new Grupo(); // subgrupo
        Grupo daw = new Grupo(); // subgrupo

        // ==========================================

        dam.addUser(user1);
        dam.addUser(user2);
        dam.addUser(user3);
        daw.addUser(user4);
        daw.addUser(user5);
        daw.addUser(user6);

        // ==========================================

        fp.addSubGrupo(daw);
        fp.addSubGrupo(dam);

        // ==========================================

        ControllerGrupos controllerGrupos = new ControllerGrupos();

        if (controllerGrupos.perteneceA(fp, user1)){

        }
    }
}
