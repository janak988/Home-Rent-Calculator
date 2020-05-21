package com.example.jkhome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    private TextView e1;
    private EditText e2;
    private EditText e3;
    private TextView e4;
    private TextView np;
    private TextView dwater;
    private EditText tpeople;
    private EditText twater;
    private EditText fread;
    private EditText lread;
    private EditText roomholder;
    private TextView setread;
    private Button summ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        e1=(TextView)findViewById(R.id.getusername);
        e2=(EditText) findViewById(R.id.npeople);
        e3=(EditText) findViewById(R.id.roomkopaisa);
        e4=(TextView) findViewById(R.id.summary123Answer);
        np=(TextView) findViewById(R.id.okmotor);
        tpeople=(EditText) findViewById(R.id.tp);
        twater=(EditText) findViewById(R.id.tb);
        dwater=(TextView)findViewById(R.id.ds);
        setread=(TextView)findViewById(R.id.show);
        fread=(EditText) findViewById(R.id.start);
        lread=(EditText) findViewById(R.id.end);
        roomholder=(EditText) findViewById(R.id.rh);
        summ=(Button) findViewById(R.id.summary);

        lread.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                int sr= Integer.parseInt(fread.getText().toString());
                int lr= Integer.parseInt(lread.getText().toString());
                int xyz= lr-sr ;
                setread.setText("बिजुली रकम रु "+xyz*15);

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });









        tpeople.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                int totalpeople= Integer.parseInt(tpeople.getText().toString());
                int totalwater= Integer.parseInt(twater.getText().toString());
                int p= Integer.parseInt(e2.getText().toString());
                int x=totalwater/totalpeople;
                dwater.setText("खानेपानी को रकम  रु  " +x*p);

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });



        e2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                int o= Integer.parseInt(e2.getText().toString());
                int ss=o*100;
                np.setText("मोटरको रु "+ ss  +"  [" +o+"*" + "100" +"]");

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        String Getdata=getIntent().getStringExtra("Stringusername12");

        e1.setText(" " +Getdata);


        summ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main3Activity.this,Main4Activity.class);

                int o= Integer.parseInt(e2.getText().toString());
                int ss=o*100;
                int totalpeople= Integer.parseInt(tpeople.getText().toString());
                int totalwater= Integer.parseInt(twater.getText().toString());
                int p= Integer.parseInt(e2.getText().toString());
                int x=totalwater/totalpeople;
                int y=x*p;
                int sr= Integer.parseInt(fread.getText().toString());
                int lr= Integer.parseInt(lread.getText().toString());
                int xyz= lr-sr ;
                int total8=xyz*15;
                int room =Integer.parseInt(e3.getText().toString());
                int sumadd= room+total8+y+ss ;
                e4.setText(""+sumadd);





                String romh= roomholder.getText().toString();
                String BijuliE =setread.getText().toString();
                String motorrE =np.getText().toString();
                String drinkw =dwater.getText().toString();
                String rents =e3.getText().toString();
                String checks =e1.getText().toString();

                intent.putExtra("bhada",rents);
                intent.putExtra("roomname",romh);
                intent.putExtra("motor",motorrE);
                intent.putExtra("drinkwater",drinkw);
                intent.putExtra("meter",BijuliE);
                intent.putExtra("checker",checks);

                String tc =e4.getText().toString();

                intent.putExtra("StringAnswer",tc);
                startActivity(intent);
            }
        });





    }
}
