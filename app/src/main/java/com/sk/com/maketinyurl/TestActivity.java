package com.sk.com.maketinyurl;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.sk.com.tinyurl.TinyManager;

public class TestActivity extends AppCompatActivity
{
    EditText url_tex;
    TextView final_resulrt;
    Button create_data;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        progressDialog=new ProgressDialog(this);
        progressDialog.setMessage("Creating url");
        final_resulrt=findViewById(R.id.final_resulrt);
        create_data=findViewById(R.id.create_data);
        url_tex=findViewById(R.id.url_tex);
        create_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(url_tex.getText().length()>0)
                {
                    creatTintyUrl(url_tex.getText().toString());
                }
            }
        });
        url_tex.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after){}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                final_resulrt.setText("");
            }
            @Override
            public void afterTextChanged(Editable s) {}
        });
    }


    private void creatTintyUrl(String long_url)
    {
        progressDialog.show();
        TinyManager.getTinnyUrl(long_url, new TinyManager.Callback()
        {
            @Override
            public void onSuccess(String url)
            {
                progressDialog.cancel();
                final_resulrt.setText(url);
            }
            @Override
            public void onError(String error)
            {
                progressDialog.cancel();
                final_resulrt.setText(error);
            }
        });
    }
}
