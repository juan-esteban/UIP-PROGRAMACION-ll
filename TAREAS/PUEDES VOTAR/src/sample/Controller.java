package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller  {




        @FXML
        private Button btn3;

    @FXML
        private Label btn1;
        @FXML
        private Label btn2, lbn3;
        @FXML
        private TextField txtNombre;
        @FXML
        private TextField txtEdad;
    int edad;

        @FXML
        private void imprimir (ActionEvent e) {
            edad=Integer.parseInt(txtEdad.getText());
            System.out.println("Tu nombre es: " + txtNombre.getText());
            System.out.println(" Tienes " + txtEdad.getText() + " años.");
            if(edad>=18){
                lbn3.setText(txtNombre.getText()+ " puede votar ");
            }
            else{
                lbn3.setText("  no puede votar ");
            }




        }


        @FXML
        private void Limpiar (ActionEvent e) {
            txtNombre.setText("");
            txtEdad.setText("");

        }




}






