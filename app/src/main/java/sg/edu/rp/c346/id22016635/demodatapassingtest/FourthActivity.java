package sg.edu.rp.c346.id22016635.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {
    TextView tvDub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tvDub = findViewById(R.id.textViewact4);
        Intent intentReceived = getIntent();
        double value = intentReceived.getDoubleExtra("value",9.9);
        tvDub.setText("Double value received is: " + value);
    }
}