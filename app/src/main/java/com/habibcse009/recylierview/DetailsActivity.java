package com.habibcse009.recylierview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
ImageView imgFlag;
TextView txtName,txtDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        txtName=findViewById(R.id.txt_countryname);
        txtDescription=findViewById(R.id.txt_descripsion);
        imgFlag=findViewById(R.id.img_countryflag);

        String getName=getIntent().getExtras().getString("name");
        int getFlag=getIntent().getExtras().getInt("flag");
        txtName.setText(getName);
        imgFlag.setImageResource(getFlag);
        if(getName.equals("Bangladesh")){
            txtDescription.setText(R.string.bd);
        }
    }
}
