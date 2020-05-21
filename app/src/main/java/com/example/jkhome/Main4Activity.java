package com.example.jkhome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    private TextView room;
    private TextView elec;
    private TextView motor1;
    private TextView khanepani;
    private TextView bhada1;
    private Button setResult;
    private TextView Totalcalculate;
    private TextView setAnswer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        room = (TextView) findViewById(R.id.roomnameholder);
        elec = (TextView) findViewById(R.id.bijuli);
        Totalcalculate = (TextView) findViewById(R.id.totalCalc);
        khanepani = (TextView) findViewById(R.id.peune_pani);
        motor1= (TextView) findViewById(R.id.motor);
        bhada1= (TextView) findViewById(R.id.bhada);
        setResult=(Button)findViewById(R.id.result);
        setAnswer= (TextView) findViewById(R.id.answer);


        String Getrent = getIntent().getStringExtra("roomname");
        room.setText("कोठामा बस्ने " + Getrent);

        String Getelec = getIntent().getStringExtra("meter");
        elec.setText(" " + Getelec);

        String Getelecc = getIntent().getStringExtra("motor");
        motor1.setText("" + Getelecc);


        String Geteleccc = getIntent().getStringExtra("drinkwater");
        khanepani.setText(" " + Geteleccc);

        String Getelecccc = getIntent().getStringExtra("bhada");
        bhada1.setText("कोठा भाडा रु " + Getelecccc);

        String Geteled = getIntent().getStringExtra("checker");
        setAnswer.setText("यो डाटा कोठा भाँडा मालिक" + Geteled +" बाट तयार पारीएको हो |");

        setResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ssss =getIntent().getStringExtra("StringAnswer");

                Totalcalculate.setText("कुल कोठा भाडाको रकम रु " +ssss);
            }
        });


    }
}
