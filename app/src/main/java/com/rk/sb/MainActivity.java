package com.rk.sb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SeekBar SB_1_IDJAVA;
    TextView TV_1_IDJAVA;
    String X = "Saya Menyukai Teknologi";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SB_1_IDJAVA = findViewById(R.id.SB_1_IDXML);
        TV_1_IDJAVA = findViewById(R.id.TV_1_IDXML);

        TV_1_IDJAVA.setText(X);

        SB_1_IDJAVA.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                TV_1_IDJAVA.setTextSize(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                /* Biarkan Kosong */
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                /* Biarkan Kosong */
            }
        });

    }
}
