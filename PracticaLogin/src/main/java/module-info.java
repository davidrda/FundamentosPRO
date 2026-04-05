module com.example.practicalogin {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;


    opens com.example.practicalogin.controller to javafx.fxml;
    exports com.example.practicalogin;
}