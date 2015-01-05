package com.example.notifications;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by qiuzhangzhi on 14/12/27.
 */
public class SpecialActivity extends Activity{

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        text.setText("Special activity");
        setContentView(text);

    }
}
