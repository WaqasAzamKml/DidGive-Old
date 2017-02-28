package com.example.approsoft.didgive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Approsoft on 2/21/2017.
 */

public class ClickedItemSc11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clicked_item_sc11);

        Button chatWith11 = (Button) findViewById(R.id.btnchatwith);
        chatWith11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ClickedItemSc11.this, ChatWithCitemSc12.class);
                startActivity(myIntent);
            }
        });

    }
}