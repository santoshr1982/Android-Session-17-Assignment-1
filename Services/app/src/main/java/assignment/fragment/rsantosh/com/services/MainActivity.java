package assignment.fragment.rsantosh.com.services;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mPlay;
    private Button mStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPlay = (Button) findViewById(R.id.play);
        mStop = (Button) findViewById(R.id.stop);

        mPlay.setOnClickListener(this);
        mStop.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case (R.id.play):
                Intent playIntent = new Intent(this, MyService.class);
                startService(playIntent);
                break;

            case (R.id.stop):
                Intent StopIntent = new Intent(this, MyService.class);
                stopService(StopIntent);
                break;

        }

    }
}
