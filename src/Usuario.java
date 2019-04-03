import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

public class Usuario {

    public static void main(String[] args) {

        Usuario pepe=new Usuario("erpepe","Jose","miJose" );
        Usuario manolo=new Usuario("manolo cabezabolo", "Manuel", "lolo");
        Usuario inma=new Usuario("ivanna", "Inmaculada Concepción", "123456");
        Usuario bea=new Usuario("piticlin", "Beatriz", "nofea");
        Usuario lobo=new Usuario("lobo", "Manuel Francisco", "mf");
        Usuario reme=new Usuario("bonica", "Remedios", "reme");

        Usuario pepe2=new Usuario("ose","Jose","5555" );
        Usuario manolo2=new Usuario("lolo", "Manuel", "qwerty");
        Usuario inma2=new Usuario("ia", "Inmaculada Concepción", "notengo");
        Usuario reme2=new Usuario("xxoo", "Remedios", "xx0011");

        //ComparadorUsuarios comparaNombre=new ComparadorUsuarios();

        //TreeSet<Usuario> listaUsuario=new TreeSet<Usuario>(comparaNombre);

        TreeSet<Usuario> listaUsuario=new TreeSet<Usuario>(new Comparator<Usuario>() {
            @Override
            public int compare(Usuario o1, Usuario o2) {
                String nombreA=o1.getNombreReal();
                String nombreB=o2.getNombreReal();
                return nombreA.compareTo(nombreB);
            }
        });

        listaUsuario.add(pepe);
        listaUsuario.add(manolo);
        listaUsuario.add(inma);
        listaUsuario.add(bea);
        listaUsuario.add(lobo);
        listaUsuario.add(reme);

        listaUsuario.add(pepe2);
        listaUsuario.add(manolo2);
        listaUsuario.add(inma2);
        listaUsuario.add(reme2);

        for (Usuario u:listaUsuario) {
            System.out.println(u);
        }

        System.out.println("-----------------------------");

        Iterator<Usuario> it=listaUsuario.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }



    }

    private String nombre;
    private String nombreReal;
    private String contrasenya;

    public Usuario(String nombre, String nombreReal, String contrasenya) {
        this.nombre = nombre;
        this.nombreReal = nombreReal;
        this.contrasenya = contrasenya;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreReal() {
        return nombreReal;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    @Override
    public String toString() {
        return "Usuario: " +nombre+ ", Nombre real: "+nombreReal+", password: "+contrasenya;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return nombreReal.equals(usuario.nombreReal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreReal);
    }
}

/*class ComparadorUsuarios implements Comparator<Usuario>{

    @Override
    public int compare(Usuario o1, Usuario o2) {
        String nombreA=o1.getNombreReal();
        String nombreB=o2.getNombreReal();
        return nombreA.compareTo(nombreB);
    }

}*/
