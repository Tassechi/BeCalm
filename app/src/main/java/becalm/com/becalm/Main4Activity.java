package becalm.com.becalm;

import android.graphics.Color;
import android.graphics.Point;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class Main4Activity extends AppCompatActivity {

    private Button btn_color,btn_color1,btn_color2,btn_color3,btn_color4,btn_color5,btn_color6,btn_color7,btn_color8,btn_color9;

    MediaPlayer mp,mp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        btn_color = findViewById(R.id.button0);
        btn_color1 = findViewById(R.id.button1);
        btn_color2 = findViewById(R.id.btncolor2);
        btn_color3 = findViewById(R.id.btncolor3);
        btn_color4 = findViewById(R.id.btncolor4);
        btn_color5 = findViewById(R.id.btncolor5);
        btn_color6 = findViewById(R.id.btncolor6);
        btn_color7 = findViewById(R.id.btncolor7);
        btn_color8 = findViewById(R.id.btncolor8);
        btn_color9 = findViewById(R.id.btncolor9);


        Display display = getWindowManager(). getDefaultDisplay();
        Point size = new Point();
        display. getSize(size);
        int width = size.x;
        final int cellSize = (int)(width / 3);
        btn_color.setWidth(cellSize);
        btn_color.setHeight(cellSize);
        btn_color1.setWidth(cellSize);
        btn_color1.setHeight(cellSize);
        btn_color2.setWidth(cellSize);
        btn_color2.setHeight(cellSize);
        btn_color3.setWidth(cellSize);
        btn_color3.setHeight(cellSize);
        btn_color4.setWidth(cellSize);
        btn_color4.setHeight(cellSize);
        btn_color5.setWidth(cellSize);
        btn_color5.setHeight(cellSize);
        btn_color6.setWidth(cellSize);
        btn_color6.setHeight(cellSize);
        btn_color7.setWidth(cellSize);
        btn_color7.setHeight(cellSize);
        btn_color8.setWidth(cellSize);
        btn_color8.setHeight(cellSize);


        btn_color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                colorRandomForButton(btn_color);
            }
        });

        btn_color1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                colorRandomForButton(btn_color1);

            }
        });
        btn_color2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                colorRandomForButton(btn_color2);

            }
        });
        btn_color3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                colorRandomForButton(btn_color3);

            }
        });
        btn_color4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                colorRandomForButton(btn_color4);

            }
        });
        btn_color5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                colorRandomForButton(btn_color5);

            }
        });

        btn_color6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                colorRandomForButton(btn_color6);

            }
        });
        btn_color7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                colorRandomForButton(btn_color7);

            }
        });
        btn_color8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                colorRandomForButton(btn_color8);

            }
        });
        btn_color9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //colorRandomForButton(btn_color7);
                int randX = (int)(Math.random()*3);
                int randY = (int)(Math.random()*3);
                btn_color9.setX(randX*cellSize);
                btn_color9.setY(randY*cellSize);

            }
        });
    }

    private void colorRandomForButton(Button btn_color4) {
        Random random = new Random();
    int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(257));
        btn_color4.setBackgroundColor(color);
        Toast.makeText(this, "Try Again", Toast.LENGTH_SHORT).show();
        mp = MediaPlayer.create(this,R.raw.tryagain);
        if (mp.isPlaying()){
            mp.pause();
        }else{
            mp.start();
        }
    }


    private void playMusic(){
        mp2 = MediaPlayer.create(this,R.raw.cancion_inicial);
        if (mp2.isPlaying()){
            mp2.pause();
        }else{
            mp2.start();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        mp2.stop();
    }

    @Override
    protected void onResume() {
        super.onResume();
        playMusic();
    }
}
