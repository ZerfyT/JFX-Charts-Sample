module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;

//    requires org.controlsfx.controls;
    requires javafx.graphics;

    opens com.centrefx.charts to javafx.fxml;
    exports com.centrefx.charts;
}