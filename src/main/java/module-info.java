module org.example.oopandjavafxassignment_csc325 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.oopandjavafxassignment_csc325 to javafx.fxml;
    exports org.example.oopandjavafxassignment_csc325;
}