package com.example.jkhome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

   private Button b1;
   private EditText Username1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        b1=(Button)findViewById(R.id.start);
        Username1=(EditText)findViewById(R.id.name);


      b1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
              String usern = Username1.getText().toString();
              if (usern.isEmpty()) {
                  b1.setEnabled(false);
              } else {


              intent.putExtra("Stringusername12", usern);
              startActivity(intent);
               }
          }
      });



    }
}
