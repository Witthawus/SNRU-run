package snru.dechalode.witthawus.snrurun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SignUp extends AppCompatActivity {

    public EditText nameEditText, UserEditText,passwordEditText;
    private RadioGroup radioGroup;
    private  RadioButton choice1RadioButton, choice2RadioButton, choice3RadioButton, choice4RadioButton, choice5RadioButton;
    private  String nameString, UserString, passwordString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        bindWidget();
    }   //mainMathod

    private void bindWidget() {

        nameEditText = (EditText) findViewById(R.id.editText);
        UserEditText = (EditText) findViewById(R.id.editText2);
        passwordEditText = (EditText) findViewById(R.id.editText3);
        radioGroup = (RadioGroup) findViewById(R.id.ragAvata);
        choice1RadioButton = (RadioButton) findViewById(R.id.radioButton);
        choice2RadioButton = (RadioButton) findViewById(R.id.radioButton2);
        choice3RadioButton = (RadioButton) findViewById(R.id.radioButton3);
        choice4RadioButton = (RadioButton) findViewById(R.id.radioButton4);
        choice5RadioButton = (RadioButton) findViewById(R.id.radioButton5);


    }



    public  void  clickSignUpSignSignUp(View view) {

        nameString = nameEditText.getText().toString();
        UserString = nameEditText.getText().toString();
        passwordString = nameEditText.getText().toString();


        //chek Space
        if (nameString.equals("") || UserString.equals("")  ||passwordString.equals("") ) {

            MyAlet myAlert = new MyAlet();
            myAlert.myDiaiog(this,"มีช่องว่าง","กรุณากรอกข็อมูลทุกช่อง");

        } else {
        }


    }

}   //class
