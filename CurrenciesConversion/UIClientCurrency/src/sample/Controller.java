package sample;

import bean.Currency;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

import javafx.event.ActionEvent ;
import service.SendToServer;

import java.io.IOException;

public class Controller {
    @FXML
    private TextArea quantity,output;

    @FXML private ComboBox<String> currencyFrom,currencyTo;

    public void convert(ActionEvent event) throws IOException, ClassNotFoundException {

        String currencyF= currencyFrom.getValue();
        String currencyT= currencyTo.getValue();
        double qnt = Double.parseDouble(quantity.getText());
        Currency currency = new Currency(currencyF,currencyT,qnt);
        Currency result = SendToServer.send(currency);
        output.setText(result.getResult());
    }
    public void change(ActionEvent event) throws IOException, ClassNotFoundException {
        String temp = currencyFrom.getValue();
        currencyFrom.setValue(currencyTo.getValue());
        currencyTo.setValue(temp);
        quantity.setText(output.getText());
        convert(event);
    }
    public void clear(){
        output.clear();
        quantity.clear();
    }
    public void close(){
        Main.close();
    }

}
