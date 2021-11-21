    module com.mycompany.gestionpracticasdeempresas {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.gestionpracticasdeempresas to javafx.fxml;
    exports com.mycompany.gestionpracticasdeempresas;
    requires org.hibernate.orm.core;
    requires java.base;
}
