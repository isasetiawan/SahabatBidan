package com.example.azaqo.sahabatbidan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DataIbuatauAnak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_ibu_atau_anak);
        ImageButton ibu = (ImageButton) findViewById(R.id.btnDataIbu);
        ibu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(),DataPasien.class));
            }
        });
    }
}
