package application;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class gg extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Rectangle rectangle = new Rectangle(0,0,50,50);
		KeyValue xValue = new KeyValue(rectangle.xProperty(), 100);
		KeyValue yValue = new KeyValue(rectangle.yProperty(), 100);
		
		KeyFrame keyFrame = new KeyFrame(Duration.millis(1000), xValue, yValue);
		
		Timeline timeline = new Timeline();
		timeline.getKeyFrames().addAll(keyFrame);
		timeline.play();
		
		Group root = new Group();
		root.getChildren().add(rectangle);
		primaryStage.setScene(new Scene(root, 400, 300));
		primaryStage.show();
		
	}
}


