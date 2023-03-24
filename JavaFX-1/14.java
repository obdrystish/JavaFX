package application;
import javafx.collections.FXCollections;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main extends Application {
	public static void main(String[]args) { launch(); }
	
	@Override
	public void start (Stage primaryStage) throws Exception {
		MyService myService = new MyService();
		myService.setOnSucceeded(new EventHandler<WorkerStateEvent>());
		public void hangle(WorkerStateEvent t) {
			System.out.println("dobe:" + t.getSource().getValue());
		}
	});
	myServise.start();
	
	Group root = new Group();
	primaryStage.setScene(new Scene(root, 500, 500));
	primaryStage.show();
}

static class MyService extends Service<Sting> {
	
}