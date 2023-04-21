package CursoJava;

import java.util.Properties;

public class EjemploPropiedadesDelSistema {
    public static void main(String[] args) {
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String workspace = System.getProperty("user.workspace");
        System.out.println("workspace = " + workspace);

        String javaHome = System.getProperty("java.home");
        System.out.println("javaHome = " + javaHome);

        Properties p = System.getProperties();
        p.list(System.out);
    }
}
