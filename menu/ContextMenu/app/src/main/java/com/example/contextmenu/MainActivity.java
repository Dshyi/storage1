package com.example.contextmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = new TextView(this);
        tv.setText("上下文菜单的载体");
        tv.setTextSize(30);
        registerForContextMenu(tv);
        setContentView(tv);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        super.onContextItemSelected(item);
        switch (item.getItemId()) {
            case 1:
                break;
            case 2:
                break;
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenuInfo menuInfo) {
        // TODO Auto-generated method stub
        menu.add(0, 1, 1, "新建");
        menu.add(0, 2, 2, "打开");
        super.onCreateContextMenu(menu, v, menuInfo);
    }

}