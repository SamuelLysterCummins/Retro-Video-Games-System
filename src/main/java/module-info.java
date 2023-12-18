module com.example.retrovideogamesystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.retrovideogamesystem to javafx.fxml;
    exports com.example.retrovideogamesystem;
}