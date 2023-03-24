import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HelloWorld extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TextField button = new TextField();
        
        Group root = new Group();
        root.getChildren().add(button);
        primaryStage.setScene(new Scene(root, 400 , 300));
        primaryStage.show();
        
    }
}