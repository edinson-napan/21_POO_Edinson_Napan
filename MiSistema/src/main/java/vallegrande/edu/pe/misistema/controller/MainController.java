package vallegrande.edu.pe.misistema.controller;

import vallegrande.edu.pe.misistema.view.MainView;

public class MainController {

    private MainView view;

    public MainController(MainView view) {
        this.view = view;
        inicializarEventos();
    }

    private void inicializarEventos() {
        // Conectamos cada botón de la vista con su respectivo método para cambiar el centro
        view.getBtnInicio().setOnAction(e -> view.mostrarInicio());
        view.getBtnUsuarios().setOnAction(e -> view.mostrarUsuarios());
        view.getBtnProductos().setOnAction(e -> view.mostrarProductos());
        view.getBtnReportes().setOnAction(e -> view.mostrarReportes());
        view.getBtnConfiguracion().setOnAction(e -> view.mostrarConfiguracion());
        view.getBtnCitas().setOnAction(e -> view.mostrarCitas());
    }
}
