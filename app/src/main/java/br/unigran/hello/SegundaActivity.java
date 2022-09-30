package br.unigran.hello;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SegundaActivity extends AppCompatActivity {
    TextView secondActivityTitle;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        secondActivityTitle = findViewById(R.id.secondActivityTitle);
        name = getIntent().getStringExtra("name");

        secondActivityTitle.setText("Olá, " + name);
    }
}