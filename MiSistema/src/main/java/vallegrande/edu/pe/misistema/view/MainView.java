package vallegrande.edu.pe.misistema.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MainView extends BorderPane {
    private Button btnInicio;
    private Button btnUsuarios;
    private Button btnProductos;
    private Button btnReportes;
    private Button btnConfiguracion;
    private Button btnCitas;

    public MainView() {
        crearMenu();
        mostrarInicio();
    }

    private void crearMenu() {
        VBox menu = new VBox(15);
        menu.setPadding(new Insets(25));
        menu.setPrefWidth(220);
        Label titulo = new Label("MI SISTEMA");
        titulo.setStyle(
                "-fx-font-size: 20px;" +
                        "-fx-font-weight: bold;" +
                        "-fx-text-fill: white;"
        );
        btnInicio = crearBoton("Inicio");
        btnUsuarios = crearBoton("Usuarios");
        btnProductos = crearBoton("Productos");
        btnReportes = crearBoton("Reportes");
        btnConfiguracion = crearBoton("Configuración");
        btnCitas = crearBoton("Citas");

        menu.getChildren().addAll(
                titulo,
                btnInicio,
                btnUsuarios,
                btnProductos,
                btnReportes,
                btnConfiguracion,
                btnCitas
        );
        menu.setStyle("-fx-background-color: #2563EB;");
        setLeft(menu);
    }

    private Button crearBoton(String texto) {
        Button boton = new Button(texto);
        boton.setPrefWidth(170);
        boton.setPrefHeight(40);
        boton.setStyle("-fx-background-color: white;" +
                "-fx-text-fill: #1E3A8A;" +
                "-fx-font-size: 14px;" +
                "-fx-background-radius: 8;"
        );
        return boton;
    }

    public void mostrarInicio() {
        VBox contenido = new VBox(10);
        contenido.setAlignment(Pos.CENTER);
        Label titulo = new Label("BIENVENIDO");
        titulo.setStyle("-fx-font-size: 24px; -fx-font-weight: bold; -fx-text-fill: #1E3A8A;");
        Label texto = new Label("Panel principal de mi sistema");
        texto.setStyle("-fx-font-size: 14px; -fx-text-fill: #666666;");
        contenido.getChildren().addAll(titulo, texto);
        setCenter(contenido);
    }

    public void mostrarUsuarios() {
        VBox contenido = crearContenedorBase("USUARIOS", "Gestión de personal y roles");
        HBox tarjetas = new HBox(15);
        tarjetas.getChildren().addAll(
                crearTarjeta("Carlos Perez", "Administrador"),
                crearTarjeta("Kiara Sanchez", "Administrador"),
                crearTarjeta("Juan Perez", "Supervisor")
        );
        contenido.getChildren().add(tarjetas);
        setCenter(contenido);
    }

    public void mostrarProductos() {
        VBox contenido = crearContenedorBase("PRODUCTOS", "Inventario y catálogo actual");
        HBox tarjetas = new HBox(15);
        tarjetas.getChildren().addAll(
                crearTarjeta("Laptop Lenovo", "s/ 2500.00"),
                crearTarjeta("Mouse Logitech", "s/ 70.00"),
                crearTarjeta("Teclado Mecánico", "s/ 250.00")
        );
        contenido.getChildren().add(tarjetas);
        setCenter(contenido);
    }

    public void mostrarReportes() {
        VBox contenido = crearContenedorBase("REPORTES", "Resumen de actividad reciente");
        HBox tarjetas = new HBox(15);
        tarjetas.getChildren().addAll(
                crearTarjeta("Ventas Mensuales", "Incremento del 15%"),
                crearTarjeta("Nuevos Clientes", "128 registros"),
                crearTarjeta("Rendimiento", "Sistema Óptimo")
        );
        contenido.getChildren().add(tarjetas);
        setCenter(contenido);
    }

    public void mostrarConfiguracion() {
        VBox contenido = crearContenedorBase("CONFIGURACION", "Ajustes del sistema y seguridad");
        HBox tarjetas = new HBox(15);
        tarjetas.getChildren().addAll(
                crearTarjeta("Perfil de Usuario", "Actualizar datos personales"),
                crearTarjeta("Seguridad", "Cambio de contraseñas"),
                crearTarjeta("Notificaciones", "Alertas activadas")
        );
        contenido.getChildren().add(tarjetas);
        setCenter(contenido);
    }

    public void mostrarCitas() {
        VBox contenido = crearContenedorBase("CITAS", "Calendario y eventos próximos");
        HBox tarjetas = new HBox(15);
        tarjetas.getChildren().addAll(
                crearTarjeta("Reunión de Equipo", "Hoy - 10:30 AM"),
                crearTarjeta("Revisión Técnica", "Mañana - 02:00 PM"),
                crearTarjeta("Auditoría", "Viernes - 09:00 AM")
        );
        contenido.getChildren().add(tarjetas);
        setCenter(contenido);
    }

    // --- Métodos de diseño UI reutilizables ---

    private VBox crearContenedorBase(String tituloTexto, String subtituloTexto) {
        VBox contenido = new VBox(20);
        contenido.setPadding(new Insets(40));

        Label titulo = new Label(tituloTexto);
        titulo.setStyle("-fx-font-size: 26px; -fx-font-weight: bold; -fx-text-fill: #1E3A8A;");

        Label subtitulo = new Label(subtituloTexto);
        subtitulo.setStyle("-fx-font-size: 14px; -fx-text-fill: #666666;");

        contenido.getChildren().addAll(titulo, subtitulo);
        return contenido;
    }

    private VBox crearTarjeta(String titulo, String detalle) {
        VBox tarjeta = new VBox(8);
        tarjeta.setPadding(new Insets(20));
        tarjeta.setPrefWidth(200);
        // Diseño de tarjeta con borde suave, fondo blanco y sombra ligera simulada
        tarjeta.setStyle("-fx-background-color: white;" +
                "-fx-background-radius: 8;" +
                "-fx-border-color: #E2E8F0;" +
                "-fx-border-radius: 8;");

        Label nombre = new Label(titulo);
        nombre.setStyle("-fx-font-size: 16px; -fx-font-weight: bold; -fx-text-fill: #333333;");

        Label info = new Label(detalle);
        info.setStyle("-fx-font-size: 14px; -fx-text-fill: #666666;");

        tarjeta.getChildren().addAll(nombre, info);
        return tarjeta;
    }

    public Button getBtnInicio() { return btnInicio; }
    public Button getBtnUsuarios() { return btnUsuarios; }
    public Button getBtnProductos() { return btnProductos; }
    public Button getBtnReportes() { return btnReportes; }
    public Button getBtnConfiguracion() { return btnConfiguracion; }
    public Button getBtnCitas() { return btnCitas; }
}
