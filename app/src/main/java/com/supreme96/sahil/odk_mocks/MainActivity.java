package com.supreme96.sahil.odk_mocks;

import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blank_forms_list);
        /*NestedScrollView nsv = (NestedScrollView) findViewById(R.id.nsv);
        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        nsv.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
            @Override
            public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                if (scrollY > oldScrollY) {
                    fab.show();
                } else {
                    fab.hide();
                }
            }
        });*/
    }
}
