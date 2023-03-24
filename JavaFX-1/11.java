import javafx.application.Application;
import javafx.concurrent.Worker.State;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class gg<JSObject> extends Application {
	private static final State SUCCEEDED = null;

	public static void gg(String[] args) { launch(args); }
	
	@Override
	public void start (Stage primaryStage) throws Exception {
		WebView webView = new WebView();
		WebEngine webEngine = webView.getEngine();
		webEngine.loadContent("<div id='div'> hello world</div>" +
		"<script>document.getElementById('div').style.color='blue';" +		
		"function changeColor() {" +
		" document.getElementById('div').style.color='green';" +
		" document.getElementById('div').innerHTML = getHello('Max')" +
		")</script>" +
		"");
		JSObject jsObject = (JSObject) webEngine.executeScript("window");
		jsObject.setMember("myClass", new MyClass());
		webEngine.getLoadWorker()
		.stateProperty()
		.addListener( (obs,oldValue,newValue) -> {
			if (newValue == SUCCEEDED) {
				webEngine.executeScript("changeColor();");
			}
		});
		
	    Group group = new Group();
	    group.getChildren().addAll(webView);
	    group.getChildren().addAll();
	    primaryStage.setScene(new Scene(group, 400, 300));
	    primaryStage.show();
	}
	public class MyClass {
		String getHello(String name) {
			return "Hello" + name;
		}
	}
}