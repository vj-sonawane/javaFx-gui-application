module com.vscode.javafxapplication {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.vscode.javafxapplication to javafx.fxml;
    exports com.vscode.javafxapplication;
}