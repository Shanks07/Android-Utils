package com.qiyu.blogandroiddemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.qiyu.blogandroiddemo.utils.NumberUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numberPrice = (TextView) findViewById(R.id.price_number);

        String priceNumber = "123456789";
        numberPrice.setText(NumberUtils.getMoneyType(priceNumber));

    }
}
