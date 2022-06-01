module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires io.github.bonigarcia.webdrivermanager;
    requires org.seleniumhq.selenium.api;
    requires org.seleniumhq.selenium.chrome_driver;
    requires org.seleniumhq.selenium.firefox_driver;
    requires java.net.http;

    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
}