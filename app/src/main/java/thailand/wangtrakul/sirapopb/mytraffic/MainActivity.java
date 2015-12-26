package thailand.wangtrakul.sirapopb.mytraffic;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    // Explicit
    private ListView trafficListView;
    private Button aboutMeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Bind Widget.
        bindWidget();
        // Button Controller.
        bottonController();
    } // Main Method.

    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);
    }

    private void bottonController() {

        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Sound Effect.
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.bee);
                buttonMediaPlayer.start();
            }// Event.
        });
    } // Button Controller.

}// This is Main Start.