module com.h2s.kafka.kafkaclients {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.h2s.kafka.kafkaclients to javafx.fxml;
    exports com.h2s.kafka.kafkaclients;
}