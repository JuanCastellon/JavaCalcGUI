/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package castellon_juan_18b_project;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.lang.Math.*;

/**
 *
 * @author rcc
 */
public class FXMLDocumentController implements Initializable {
    //Declaring stringbuilder objects for utility
    public StringBuilder current = new StringBuilder();
    public StringBuilder total = new StringBuilder();
    
    String lastOp="";
    boolean deciUse=false;           //Tells me if the input already has decimal
    
    //The actual answer for this thing
    public float answer=0;
    
    //Declaring all the buttons
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button button9;
    @FXML
    private Button button0;
    @FXML
    private Button percent;
    @FXML
    private Button sqRoot;
    @FXML
    private Button square;
    @FXML
    private Button inverse;
    @FXML
    private Button clrEvry;
    @FXML
    private Button clrCurr;
    @FXML
    private Button bckSpc;
    @FXML
    private Button divide;
    @FXML
    private Button multiply;
    @FXML
    private Button subtract;
    @FXML
    private Button add;
    @FXML
    private Button plusMin;
    @FXML
    private Button decimal;
    @FXML
    private Button compute;
    
    //The two text fields
    @FXML
    private TextField currInp;
    @FXML
    private TextField totInp;
    
    //Declaring all the ActionEvents for each button
    @FXML
    public void press1(ActionEvent event){
        if(currInp.getText().equals("0")||currInp.getText().equals(Float.toString(answer))){
            currInp.setText(button1.getText());
        }
        else{
            currInp.appendText(button1.getText());
        }
    }
    @FXML
    private void press2(ActionEvent event){
        if(currInp.getText().equals("0")||currInp.getText().equals(Float.toString(answer))){
            currInp.setText(button2.getText());
        }
        else{
            currInp.appendText(button2.getText());
        }
    }
    @FXML
    private void press3(ActionEvent event){
        if(currInp.getText().equals("0")||currInp.getText().equals(Float.toString(answer))){
            currInp.setText(button3.getText());
        }
        else{
            currInp.appendText(button3.getText());
        }
    }
    @FXML
    private void press4(ActionEvent event){
        if(currInp.getText().equals("0")||currInp.getText().equals(Float.toString(answer))){
            currInp.setText(button4.getText());
        }
        else{
            currInp.appendText(button4.getText());
        }
    }
    @FXML
    private void press5(ActionEvent event){
        if(currInp.getText().equals("0")||currInp.getText().equals(Float.toString(answer))){
            currInp.setText(button5.getText());
        }
        else{
            currInp.appendText(button5.getText());
        }
    }
    @FXML
    private void press6(ActionEvent event){
        if(currInp.getText().equals("0")||currInp.getText().equals(Float.toString(answer))){
            currInp.setText(button6.getText());
        }
        else{
            currInp.appendText(button6.getText());
        }
    }
    @FXML
    private void press7(ActionEvent event){
        if(currInp.getText().equals("0")||currInp.getText().equals(Float.toString(answer))){
            currInp.setText(button7.getText());
        }
        else{
            currInp.appendText(button7.getText());
        }
    }
    @FXML
    private void press8(ActionEvent event){
        if(currInp.getText().equals("0")||currInp.getText().equals(Float.toString(answer))){
            currInp.setText(button8.getText());
        }
        else{
            currInp.appendText(button8.getText());
        }
    }
    @FXML
    private void press9(ActionEvent event){
        if(currInp.getText().equals("0")||currInp.getText().equals(Float.toString(answer))){
            currInp.setText(button9.getText());
        }
        else{
            currInp.appendText(button9.getText());
        }
    }
    @FXML
    private void press0(ActionEvent event){
        if(currInp.getText().equals("0")||currInp.getText().equals(Float.toString(answer))){
            currInp.setText(button0.getText());
        }
        else{
            currInp.appendText(button0.getText());
        }
    }
    @FXML
    public void pressAdd(ActionEvent event){
        totInp.appendText(currInp.getText());
        totInp.appendText(" + ");
        
        answer+=Float.parseFloat(currInp.getText());
        
        currInp.clear();
        currInp.appendText(Float.toString(answer));
        
        lastOp="+";
        deciUse=false;
        
    }
    @FXML
    public void pressMinus(ActionEvent event){
        totInp.appendText(currInp.getText());
        totInp.appendText(" - ");
        
        if(answer==0){
            answer+=Float.parseFloat(currInp.getText());
        }
        else{
            answer-=Float.parseFloat(currInp.getText());
        }
        currInp.clear();
        currInp.appendText(Float.toString(answer));
        
        lastOp="-";
        deciUse=false;
    }
    @FXML
    private void pressMult(ActionEvent event){
        totInp.appendText(currInp.getText());
        totInp.appendText(" x ");
        
        if(answer==0){
            answer+=Float.parseFloat(currInp.getText());
        }
        else{
            answer*=Float.parseFloat(currInp.getText());
        }
        currInp.clear();
        currInp.appendText(Float.toString(answer));
        
        lastOp="x";
        deciUse=false;
    }
    @FXML
    private void pressDiv(ActionEvent event){
        totInp.appendText(currInp.getText());
        totInp.appendText(" ÷ ");
        
        if(answer==0){
            answer+=Float.parseFloat(currInp.getText());
        }
        else{
            answer/=Float.parseFloat(currInp.getText());
        }
        currInp.clear();
        currInp.appendText(Float.toString(answer));
        
        lastOp="÷";
        deciUse=false;
    }
    @FXML
    private void pressPercent(ActionEvent event){
        answer=(Float.parseFloat(currInp.getText())/100);
        currInp.clear();
        currInp.setText(Float.toString(answer));
        
        try{
            FileOutputStream output = new FileOutputStream("answers.txt");
            ObjectOutputStream out = new ObjectOutputStream(output);
            out.writeObject(answer);
            out.close();
            output.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
        answer=0;
    }
    @FXML
    private void pressPlusMin(ActionEvent event){
        float compare=0;
        String temp;
        
        temp=currInp.getText();
        compare=Float.parseFloat(temp);
        
        if(compare>0){
            compare*=-1.0f;
            temp=Float.toString(compare);
            currInp.setText(temp);
        }
        else if(compare<0){
            compare*=-1.0f;
            temp=Float.toString(compare);
            currInp.setText(temp);
        }
        else if(currInp.getText().equals("0.")){
            temp="-0.";
            currInp.setText(temp);
        }
        else if(currInp.getText().equals("-0.")){
            temp="0.";
            currInp.setText(temp);
        }
    }
    @FXML
    private void pressRoot(ActionEvent event){
        answer=(float) Math.sqrt(Float.parseFloat(currInp.getText()));
        currInp.clear();
        currInp.setText(Float.toString(answer));
        
        try{
            FileOutputStream output = new FileOutputStream("answers.txt");
            ObjectOutputStream out = new ObjectOutputStream(output);
            out.writeObject(answer);
            out.close();
            output.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
        answer=0;
        deciUse=true;
    }
    @FXML
    private void pressSquare(ActionEvent event){
        answer=(Float.parseFloat(currInp.getText())*Float.parseFloat(currInp.getText()));
        currInp.clear();
        currInp.setText(Float.toString(answer));
        
        try{
            FileOutputStream output = new FileOutputStream("answers.txt");
            ObjectOutputStream out = new ObjectOutputStream(output);
            out.writeObject(answer);
            out.close();
            output.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
        answer=0;
        deciUse=true;
    }
    @FXML
    private void pressInverse(ActionEvent event){
        answer=(1/Float.parseFloat(currInp.getText()));
        currInp.clear();
        currInp.setText(Float.toString(answer));
        
        try{
            FileOutputStream output = new FileOutputStream("answers.txt");
            ObjectOutputStream out = new ObjectOutputStream(output);
            out.writeObject(answer);
            out.close();
            output.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
        answer=0;
        deciUse=true;
    }
    @FXML
    private void pressBack(ActionEvent event){
        StringBuilder temp = new StringBuilder();
        temp.append(currInp.getText());
        temp.setLength(temp.length()-1);
        if(temp.length()==1){
            currInp.setText("0");
            deciUse=false;
        }
        if(currInp.getText(0, temp.length()).equals(".")){
            deciUse=false;
            temp.setLength(temp.length()-1);
            currInp.setText(temp.toString());
        }
        if(currInp.getText().equals("-0.")){
            currInp.clear();
        }
        currInp.clear();
        currInp.appendText(temp.toString());
        if(currInp.getText().equals("")){
            currInp.setText("0");
            deciUse=false;
        }
    }
    @FXML
    private void pressCE(ActionEvent event){
        currInp.clear();
        currInp.appendText("0");
    }
    @FXML
    private void pressC(ActionEvent event){
        currInp.clear();
        currInp.appendText("0");
        totInp.clear();
        answer=0;
    }
    
    @FXML
    private void pressDeci(ActionEvent event){
        if(deciUse){
            //do nothing, decimal already been placed
        }
        else if(currInp.getText().equals(Float.toString(answer))){
            currInp.clear();
            currInp.appendText("0.");
            deciUse=true;
        }
        else{
            currInp.appendText(".");
            deciUse=true;
        }
    }
    @FXML
    private void pressEqual(ActionEvent event){
        if(lastOp.equals("")){
            //Do nothing. There is nothing to compute.
        }
        else if(lastOp.equals("+")){
            answer+=Float.parseFloat(currInp.getText());
            currInp.setText(Float.toString(answer));
            totInp.clear();
            
            try{
                FileOutputStream output = new FileOutputStream("answers.txt");
                ObjectOutputStream out = new ObjectOutputStream(output);
                out.writeObject(answer);
                out.close();
                output.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
            
            answer=0;
        }
        else if(lastOp.equals("-")){
            answer-=Float.parseFloat(currInp.getText());
            currInp.setText(Float.toString(answer));
            totInp.clear();
            
            try{
                FileOutputStream output = new FileOutputStream("answers.txt");
                ObjectOutputStream out = new ObjectOutputStream(output);
                out.writeObject(answer);
                out.close();
                output.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
            
            answer=0;
        }
        else if(lastOp.equals("x")){
            answer*=Float.parseFloat(currInp.getText());
            currInp.setText(Float.toString(answer));
            totInp.clear();
            
            try{
                FileOutputStream output = new FileOutputStream("answers.txt");
                ObjectOutputStream out = new ObjectOutputStream(output);
                out.writeObject(answer);
                out.close();
                output.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
            
            answer=0;
        }
        else if(lastOp.equals("÷")){
            answer/=Float.parseFloat(currInp.getText());
            currInp.setText(Float.toString(answer));
            totInp.clear();
            
            try{
                FileOutputStream output = new FileOutputStream("answers.txt");
                ObjectOutputStream out = new ObjectOutputStream(output);
                out.writeObject(answer);
                out.close();
                output.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
            
            answer=0;
        }
        lastOp="";
        deciUse=true;
    }
    
    
    
//    @FXML
//    private Label label;
//    
//    @FXML
//    private void handleButtonAction(ActionEvent event) {
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");
//    }
    
    //All the code regarding everything goes in here
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
