package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.LinkedHashMap;
import java.util.Map;

public class Controller {


    @FXML
    private TextField messegTextField;
    @FXML
    private ListView<String> listView;
    private ObservableList<String> wordsList = FXCollections.observableArrayList();
    private ObservableList<Peapl> peapls = FXCollections.observableArrayList(
            new Peapl("Sviridov","Dmitrii"),
            new Peapl("Pupkin", "Vasya"),
            new Peapl("Gordeev","Ivan")
    );

    @FXML
    private TableView<Peapl> tableView;
    @FXML
    private TableColumn<Peapl, String> lastName;
    @FXML
    private TableColumn<Peapl, String> firstName;
    @FXML
    private void initialize(){
    listView.setItems(wordsList);
    tableView.setItems(peapls);
    lastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
    firstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
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
    @FXML
    private void showAbout(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About");
        alert.setHeaderText("Бла бла бла");
        alert.setContentText("LJsdldfg f;ldgkj dflg jkdflg ");
        alert.showAndWait();
    }


}
