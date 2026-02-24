module com.example.testsjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testsjavafx to javafx.fxml;
    exports com.example.testsjavafx;
}