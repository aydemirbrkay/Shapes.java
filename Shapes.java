package lecturepractice.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Shapes extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Rectangle r1=new Rectangle(25,10,60,30);
        r1.setStroke(Color.BLACK);
        r1.setFill(Color.WHEAT);

        Rectangle r2=new Rectangle(25,50,60,30);
        r2.setFill(Color.GOLD);
        r2.setStroke(Color.GRAY);
        r2.setStrokeWidth(2);

        Rectangle r3=new Rectangle(25,90,60,30);
        r3.setArcHeight(15);
        r3.setArcWidth(25);

        Pane root=new Pane( );
        root.getChildren().addAll(r1,r2,r3);
        stage.setScene(new Scene(root,300,200));
        stage.show();
    }
}
