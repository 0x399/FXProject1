module com.example.fx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.apache.logging.log4j;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires java.mail;
    requires spring.beans;
    requires spring.core;
    requires spring.context.support;


    opens com.example.fx to javafx.fxml;
    exports com.example.fx;
}