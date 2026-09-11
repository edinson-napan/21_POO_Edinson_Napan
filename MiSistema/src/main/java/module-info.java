module vallegrande.edu.pe.misistema {
    requires javafx.controls;
    requires javafx.fxml;

    opens vallegrande.edu.pe.misistema to javafx.fxml;
    exports vallegrande.edu.pe.misistema.view;
    exports vallegrande.edu.pe.misistema;
}