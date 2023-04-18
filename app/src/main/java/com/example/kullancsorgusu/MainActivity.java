package com.example.kullancsorgusu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText ad=findViewById(R.id.ad_edt);
        EditText sifre =findViewById(R.id.sifre_edt);
        Button giris=findViewById(R.id.giris_btn);

        giris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tutucuad=ad.getText().toString();
                String tutucusifre=sifre.getText().toString();
                if(TextUtils.isEmpty(tutucuad)||TextUtils.isEmpty(tutucusifre)){
                    Toast.makeText(MainActivity.this,"bütün alanları doldurun..",Toast.LENGTH_LONG).show();
                }
                else if(tutucuad.equals("rabia")&&tutucusifre.equals("1234")){

                    Intent gecis= new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(gecis);
                }
                else {
                    Toast.makeText(MainActivity.this,"Kullanıcı adı ya da şifre yanlıs", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}