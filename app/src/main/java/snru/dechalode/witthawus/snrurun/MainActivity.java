package snru.dechalode.witthawus.snrurun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }   //Main Method onCreate

    public void Clicksingupmain(View view) {
        startActivity(new Intent(MainActivity.this,SignUp.class));  //เปิดหน้าใหม่
    }
}   //Mainciass นี้คือคลาสหลัก
