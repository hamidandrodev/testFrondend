package com.hamid.frondend.tes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtPertama,txtKedua,txtKetiga;
    CheckBox checkPertama,checkKedua,checkKetiga;
    int statusPertama=0,statusKedua=0,statusKetiga=0;
    Button btnTambah,btnKurang,btnKali,btnBagi;
    Double nilaiSatu,nilaiDua,nilaiTiga;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisial();
        inisialonCheck();
        inisialOnclik();
    }

    private void inisial(){
        txtPertama=findViewById(R.id.input_pertama);
        txtKedua=findViewById(R.id.input_kedua);
        txtKetiga=findViewById(R.id.input_ketiga);
        checkPertama=findViewById(R.id.check_pertama);
        checkKedua=findViewById(R.id.check_kedua);
        checkKetiga=findViewById(R.id.check_ketiga);
        btnTambah=findViewById(R.id.btn_tambah);
        btnKurang=findViewById(R.id.btn_kurang);
        btnKali=findViewById(R.id.btn_kali);
        btnBagi=findViewById(R.id.btn_bagi);
        hasil=findViewById(R.id.hasil);
    }

    private void inisialonCheck(){
        checkPertama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (((CheckBox) view).isChecked()) {
                    statusPertama = 1;
                }else{
                    statusPertama = 0;
                }
            }
        });
        checkKedua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (((CheckBox) view).isChecked()) {
                    statusKedua = 1;
                }else{
                    statusKedua = 0;
                }
            }
        });
        checkKetiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (((CheckBox) view).isChecked()) {
                    statusKetiga = 1;
                }else{
                    statusKetiga = 0;
                }
            }
        });
    }


    private void inisialOnclik(){
        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int status = statusPertama+statusKedua+statusKetiga;
                nilaiSatu = Double.parseDouble(txtPertama.getText().toString());
                nilaiDua = Double.parseDouble(txtKedua.getText().toString());
                nilaiTiga = Double.parseDouble(txtKetiga.getText().toString());
                if(status==0){
                    Toast.makeText(getApplicationContext(),"Centang tidak boleh kosong",Toast.LENGTH_LONG).show();
                }else if(status==1){
                    Toast.makeText(getApplicationContext(),"Centang minimal dua",Toast.LENGTH_LONG).show();
                }else{
                    if(statusPertama==1 && statusKedua==1 && statusKetiga==1){
                        hasil.setText(String.valueOf(nilaiSatu+nilaiDua+nilaiTiga));
                    }else if(statusPertama==1 && statusKedua==1){
                        hasil.setText(String.valueOf(nilaiSatu+nilaiDua));
                    }else if(statusPertama==1 && statusKetiga==1){
                        hasil.setText(String.valueOf(nilaiSatu+nilaiTiga));
                    }else if( statusKedua==1 && statusKetiga==1){
                        hasil.setText(String.valueOf(nilaiDua+nilaiTiga));
                    }
                }
            }
        });
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int status = statusPertama+statusKedua+statusKetiga;
                nilaiSatu = Double.parseDouble(txtPertama.getText().toString());
                nilaiDua = Double.parseDouble(txtKedua.getText().toString());
                nilaiTiga = Double.parseDouble(txtKetiga.getText().toString());
                if(status==0){
                    Toast.makeText(getApplicationContext(),"Centang tidak boleh kosong",Toast.LENGTH_LONG).show();
                }else if(status==1){
                    Toast.makeText(getApplicationContext(),"Centang minimal dua",Toast.LENGTH_LONG).show();
                }else{
                    if(statusPertama==1 && statusKedua==1 && statusKetiga==1){
                        hasil.setText(String.valueOf(nilaiSatu-nilaiDua-nilaiTiga));
                    }else if(statusPertama==1 && statusKedua==1){
                        hasil.setText(String.valueOf(nilaiSatu-nilaiDua));
                    }else if(statusPertama==1 && statusKetiga==1){
                        hasil.setText(String.valueOf(nilaiSatu-nilaiTiga));
                    }else if( statusKedua==1 && statusKetiga==1){
                        hasil.setText(String.valueOf(nilaiDua-nilaiTiga));
                    }
                }

            }
        });
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int status = statusPertama+statusKedua+statusKetiga;
                nilaiSatu = Double.parseDouble(txtPertama.getText().toString());
                nilaiDua = Double.parseDouble(txtKedua.getText().toString());
                nilaiTiga = Double.parseDouble(txtKetiga.getText().toString());
                if(status==0){
                    Toast.makeText(getApplicationContext(),"Centang tidak boleh kosong",Toast.LENGTH_LONG).show();
                }else if(status==1){
                    Toast.makeText(getApplicationContext(),"Centang minimal dua",Toast.LENGTH_LONG).show();
                }else{
                    if(statusPertama==1 && statusKedua==1 && statusKetiga==1){
                        hasil.setText(String.valueOf(nilaiSatu*nilaiDua*nilaiTiga));
                    }else if(statusPertama==1 && statusKedua==1){
                        hasil.setText(String.valueOf(nilaiSatu*nilaiDua));
                    }else if(statusPertama==1 && statusKetiga==1){
                        hasil.setText(String.valueOf(nilaiSatu*nilaiTiga));
                    }else if( statusKedua==1 && statusKetiga==1){
                        hasil.setText(String.valueOf(nilaiDua*nilaiTiga));
                    }
                }

            }
        });
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int status = statusPertama+statusKedua+statusKetiga;
                nilaiSatu = Double.parseDouble(txtPertama.getText().toString());
                nilaiDua = Double.parseDouble(txtKedua.getText().toString());
                nilaiTiga = Double.parseDouble(txtKetiga.getText().toString());
                if(status==0){
                    Toast.makeText(getApplicationContext(),"Centang tidak boleh kosong",Toast.LENGTH_LONG).show();
                }else if(status==1){
                    Toast.makeText(getApplicationContext(),"Centang minimal dua",Toast.LENGTH_LONG).show();
                }else{
                    if(statusPertama==1 && statusKedua==1 && statusKetiga==1){
                        hasil.setText(String.valueOf(nilaiSatu/nilaiDua/nilaiTiga));
                    }else if(statusPertama==1 && statusKedua==1){
                        hasil.setText(String.valueOf(nilaiSatu/nilaiDua));
                    }else if(statusPertama==1 && statusKetiga==1){
                        hasil.setText(String.valueOf(nilaiSatu/nilaiTiga));
                    }else if( statusKedua==1 && statusKetiga==1){
                        hasil.setText(String.valueOf(nilaiDua/nilaiTiga));
                    }
                }

            }
        });
    }


}