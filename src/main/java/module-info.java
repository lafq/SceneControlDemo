module com.example.scenecontroldemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.scenecontroldemo to javafx.fxml;
    exports com.example.scenecontroldemo;
}