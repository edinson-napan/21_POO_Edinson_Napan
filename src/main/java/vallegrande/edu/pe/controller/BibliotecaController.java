package vallegrande.edu.pe.controller;

import java.util.ArrayList;
import vallegrande.edu.pe.model.Editorial;

import vallegrande.edu.pe.model.Libro;

import java.util.ArrayList;

public class BibliotecaController {

    //Lista donden almacenaremos nuestros libros
    private ArrayList<Libro> libros;

    private ArrayList<Editorial> editoriales = new ArrayList<>();

    //Constructor
    public BibliotecaController(){
        libros = new ArrayList<>();
    }

    //Registrar
    public void agregarLibro(Libro libro){
        libros.add(libro);
        System.out.println("Libro registrado correctamente");
    }

    //Listar
    public void listarLibros(){
        if(libros.isEmpty()){
            System.out.println("No hay libros registrados");
            return;
        }
        System.out.println("LISTA DE LIBROS");
        for ( Libro libro: libros){
            libro.mostrarLibro();
        }
    }
    //Buscar
    public void buscarLibro(String criterio){
        boolean encontrado = false;
        String texto = criterio.toLowerCase();
        for ( Libro libro: libros){
            if(libro.getTitulo().toLowerCase().contains(texto) ||
                    libro.getAutor().toLowerCase().contains(texto)) {
                libro.mostrarLibro();
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("No se encontro ningun libro");
        }
    }

    public void registrarEditorial(int id, String nombre, String pais) {

        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("El nombre de la editorial es obligatorio.");
            return;
        }

        Editorial editorial = new Editorial(id, nombre, pais);
        editoriales.add(editorial);

        System.out.println("Editorial registrada correctamente.");
    }

    public void listarEditoriales() {

        if (editoriales.isEmpty()) {
            System.out.println("No hay editoriales registradas.");
            return;
        }

        for (Editorial editorial : editoriales) {
            System.out.println(editorial);
        }
    }


}