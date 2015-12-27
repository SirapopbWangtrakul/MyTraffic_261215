package thailand.wangtrakul.sirapopb.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplishScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splish_screen);

        // Sound Effect.
        MediaPlayer introMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.intro_start_horse);
        introMediaPlayer.start();

        // Auto Run to MainActivity.
        Handler objHandler = new Handler();
        objHandler.postDelayed(new Runnable() {
            @Override
            public void run() {


                Intent objIntent = new Intent(SplishScreen.this, MainActivity.class);
                startActivity(objIntent);
                finish();

            }
        },6000);


    } // Main Method.

} // Main Class.
