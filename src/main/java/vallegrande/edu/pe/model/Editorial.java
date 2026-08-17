package vallegrande.edu.pe.model;

public class Editorial {

    private int id;
    private String nombre;
    private String pais;

    public Editorial(int id, String nombre, String pais) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public String toString() {
        return id + " - " + nombre + " - " + pais;
    }
}