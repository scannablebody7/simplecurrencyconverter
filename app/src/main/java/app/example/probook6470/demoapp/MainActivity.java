package app.example.probook6470.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convert(View view){
        EditText dollar = (EditText) findViewById(R.id.dollarText);

        Double dollartv = Double.parseDouble(dollar.getText().toString());

        Double poundAmount = dollartv * 0.75;

        Toast.makeText(MainActivity.this, "£" + poundAmount.toString(), Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
