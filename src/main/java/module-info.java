module org.zerock.myapp {
    requires java.base;

    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    opens org.zerock.myapp
            to  javafx.fxml,
                javafx.graphics,
                javafx.media;
} // module

