module com.poo.templatelabo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.poo.templatelabo to javafx.fxml;
    exports com.poo.templatelabo;
}