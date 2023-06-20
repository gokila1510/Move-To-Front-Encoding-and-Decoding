package mini;
import java.util.function.*;
import java.util.stream.*;
import java.util.ArrayList;
import java.lang.Iterable;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author 21CS006
 */
public class Mini extends Application {
    public List<Integer> encode(String input, String symTable) {
    List<Integer> encoded = new ArrayList<>();
    for (char c : input.toCharArray()) {
        intidx = symTable.indexOf(c);
        if (idx != -1) {
            encoded.add(idx);
        }
    }
    return encoded;
 }
   public String decode(String input, String symTable) {
    // split on commas and remove any brackets
    String[] parts = input.replace("[", "").replace("]", "").split(", ");
    List<Integer>idxs = new LinkedList<>();
    for (String part : parts) {
        idxs.add(Integer.parseInt(part));
    }
    StringBuilder decoded = new StringBuilder();
    for (intidx : idxs) {
        if (idx>= 0 &&idx<symTable.length()) {
            decoded.append(symTable.charAt(idx));
        }
    }
    return decoded.toString();
}

    @Override
    public void start(Stage primaryStage) {
        Label l1=new Label("INPUT");    
        TextField t1=new TextField();
        t1.setMaxWidth(200);
        Label l2=new Label("Result");    
        TextField t2=new TextField();
        t2.setMaxWidth(200);
        Button b1 = new Button("Decoder");
        Button b2=new Button("Encoder");
        b1.setOnAction(new EventHandler<ActionEvent>() {
           
            @Override
            public void handle(ActionEvent event) {
                String input = t1.getText();
                String symTable = "abcdefghijklmnopqrstuvwxyz";
                String decoded = decode(input, symTable);
                t2.setText(decoded);
            }
             
        });
 
         b2.setOnAction(new EventHandler<ActionEvent>() {
           
            @Override
            public void handle(ActionEvent event){
               String input = t1.getText();
               String symTable = "abcdefghijklmnopqrstuvwxyz";
            List<Integer> encoded = encode(input, symTable);
            t2.setText(encoded.toString());
            }
        });
       
       VBoxvbox=new VBox(l1,t1,l2,t2,b1,b2);
       
        Scene scene = new Scene(vbox, 500, 400);
       
        primaryStage.setTitle("converter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @paramargs the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
   
}
