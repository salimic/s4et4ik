package com.example.salimic.s4et4ik;

import android.media.MediaPlayer;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvOut, kol;
    int count, k1;
    private MediaPlayer notoficat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        tvOut =(TextView) findViewById(R.id.tvOut);
        tvOut.setText("Let's Go");
        kol = (TextView) findViewById(R.id.kol);
        count=0;
        notoficat=MediaPlayer.create(this, R.raw.zvuk);
    }
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        //k1=Integer.parseInt(kol.toString());
        if (count==k1) {notoficat.start();}
        switch (keyCode) {
            case KeyEvent.KEYCODE_MENU:
                Toast.makeText(this, "Нажата кнопка Меню", Toast.LENGTH_SHORT)
                        .show();
                return true;
            case KeyEvent.KEYCODE_SEARCH:
                Toast.makeText(this, "Нажата кнопка Поиск", Toast.LENGTH_SHORT)
                        .show();
                return true;
            case KeyEvent.KEYCODE_BACK:
                onBackPressed();
                return true;
            case KeyEvent.KEYCODE_VOLUME_UP:
                //Toast.makeText(this, "Нажата кнопка громкости", Toast.LENGTH_SHORT)
                //        .show();
                count++;
                tvOut.setText(Integer.toString(count));
                //event.startTracking();
                return true;
            case KeyEvent.KEYCODE_VOLUME_DOWN:
               // Toast.makeText(this, "Нажата кнопка громкости", Toast.LENGTH_SHORT)
                //        .show();
                count++;
                tvOut.setText(Integer.toString(count));
                return false;
        }
        return super.onKeyDown(keyCode, event);
    }
}
