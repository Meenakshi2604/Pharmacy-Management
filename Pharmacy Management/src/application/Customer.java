package application;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

class MedDetails{
	String medName = "";
	int qnty = 0;
	MedDetails(String medName, int qnty ){
		this.medName = medName;
		this.qnty = qnty;
	}
	public String toString() {
		return this.medName+this.qnty;
	}
}

public class Customer {
	private ArrayList<MedDetails> arr = new ArrayList<MedDetails>();

    @FXML
    private TextField cust_name;

    @FXML
    private TextField med_list;

    @FXML
    private TextArea address;

    @FXML
    private TextField phone;

    @FXML
    private TextField qnty;

    @FXML
    void addMore(ActionEvent event) {
    	String medicine = med_list.getText();
    	String quantity = qnty.getText();
    	int qnty1 = Integer.parseInt(quantity);
    	arr.add(new MedDetails(medicine,qnty1));
    	med_list.clear();
    	qnty.clear();
    	System.out.println(arr);
    }

    @FXML
    void submit(ActionEvent event) {
    	JFrame f=new JFrame();  
        JOptionPane.showMessageDialog(f,"Your medicines will be delivered soon.");
    }

}
