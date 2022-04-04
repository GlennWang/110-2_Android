package com.example.a109590003_hw6_1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox [] check = new CheckBox[5]; //為啥不能直接在這給值?
    private String string;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        check[0] = findViewById(R.id.checkBox);
        check[1] = findViewById(R.id.checkBox3);
        check[2] = findViewById(R.id.checkBox4);
        check[3] = findViewById(R.id.checkBox5);
        check[4] = findViewById(R.id.checkBox6);
        string = "Topping：";
    }

    public void ShowToast(View view) {
        for (int i = 0; i < 5; i++ ){
            if(check[i].isChecked()){
                string = string + check[i].getText().toString() + ' ';
            }
        }
        Toast toast = Toast.makeText(this, string, Toast.LENGTH_SHORT);
        toast.show();
    }
}