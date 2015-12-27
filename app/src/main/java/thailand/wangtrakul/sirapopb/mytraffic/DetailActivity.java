package thailand.wangtrakul.sirapopb.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    // Explicit.
    private ImageView imageTraffic;
    private TextView DetailList;
    private TextView MainList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Binding Widget.
        initWidget();
        // Show View.
        showView();

    }// Main Method.

    public void clickBack(View view) {
        finish();
    }


    private void showView() {

        //  Receive Value From Intent.
        String strTitle = getIntent().getStringExtra("Title");
        int intImage = getIntent().getIntExtra("Image", R.drawable.traffic_01);
        int intIndex = getIntent().getIntExtra("Index", 0);

        // Show Title.
        MainList.setText(strTitle);

        // Show Image.
        imageTraffic.setImageResource(intImage);

        // Show Detail list.
        String[] detailString = getResources().getStringArray(R.array.detail_long);
        DetailList.setText(detailString[intIndex]);


    } // Show View Data.

    private void initWidget() {
        MainList = (TextView) findViewById(R.id.textView4);
        DetailList = (TextView) findViewById(R.id.textView5);
        imageTraffic = (ImageView) findViewById(R.id.imageView2);
    } // Initial Method Widget.

} // Main Detail Activity.
