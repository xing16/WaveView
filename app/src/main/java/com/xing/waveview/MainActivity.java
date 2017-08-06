package com.xing.waveview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.xing.waveviewlib.WaveView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final WaveView waveView = (WaveView) findViewById(R.id.wave_view);
        waveView.setOnCenterWaveClickListener(new WaveView.OnCenterWaveClickListener() {
            @Override
            public void onCenterWaveClick() {
                Log.i(TAG, "onCenterWaveClick: ");
                waveView.toggle();
                Toast.makeText(MainActivity.this, waveView.isWaveRunning() ? "start" : "stop",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
