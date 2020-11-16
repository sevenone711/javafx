package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {


    @FXML
    private TextField messegTextField;
    @FXML
    private ListView<String> listView;
    ObservableList<String> wordsList = FXCollections.observableArrayList();
    @FXML
    private void initialize(){
    listView.setItems(wordsList);
    }
    @FXML
    public void addWordToList(){
        String word = messegTextField.getText();
        if (!word.isBlank()){
            listView.getItems().add(word);
        }
        messegTextField.setText("");
    }
    @FXML
    public void close(){
        System.exit(0);
    }
    @FXML
    public void cleanChat(){
        listView.getItems().clear();
    }


}
