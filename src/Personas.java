import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class Personas {
    private static final String[] nombres = { "La lupita", "Donatello", "Leonardo", "Michelangelo", "Raphael", "Naruto", "Helen Chufe", "Alba Sura", "Goku", "Hinata" };
    private static final List<String> nombresAleatorios = new ArrayList<String>();

    static {
        for (String nombre : nombres) {
            nombresAleatorios.add(nombre);
        }
        Collections.shuffle(nombresAleatorios, new Random());
    }

    private String nombre;
    private boolean tieneEspada;
    private boolean esMillonario;
    private boolean estaMamado;
    private boolean estaFeo;
    private boolean miedoCucarachas;
    private boolean estaCansado;
    private boolean estaEnfermo;
    private boolean estaTriste;
    private boolean estaFeliz;

    public Personas() {
        this.nombre = nombresAleatorios.remove(0);
        this.tieneEspada = new Random().nextBoolean();
        this.esMillonario = new Random().nextBoolean();
        this.estaMamado = new Random().nextBoolean();
        this.estaFeo = new Random().nextBoolean();
        this.miedoCucarachas = new Random().nextBoolean();
        this.estaCansado = new Random().nextBoolean();
        this.estaEnfermo = new Random().nextBoolean();
        this.estaTriste = new Random().nextBoolean();
        this.estaFeliz = new Random().nextBoolean();
    }
    
    public String getNombre() {
        return nombre;
    }

    public boolean getTieneEspada() {
        return tieneEspada;
    }

    public boolean getEsMillonario() {
        return esMillonario;
    }
    public boolean getEstaMamado() {
        return estaMamado;
    }
    public boolean getEstaFeo() {
        return estaFeo;
    }

    public boolean getMiedoCucarachas() {
        return miedoCucarachas;
    }

    public boolean getEstaCansado() {
        return estaCansado;
    }

    public boolean getEstaEnfermo() {
        return estaEnfermo;
    }

    public boolean getEstaTriste() {
        return estaTriste;
    }

    public boolean getEstaFeliz() {
        return estaFeliz;
    }


}