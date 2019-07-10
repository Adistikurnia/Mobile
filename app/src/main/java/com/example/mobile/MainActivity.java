package com.example.mobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        setSingleEvent((mainGrid));
    }

    private void setSingleEvent(GridLayout mainGrid) {
        for (int i = 0; i < mainGrid.getChildCount();i++) {
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (finalI == 0) {
                        Intent intent = new Intent(MainActivity.this, daftar.class);
                        startActivity(intent);
                    } else if (finalI == 1) {
                        Intent intent = new Intent(MainActivity.this, bantuan.class);
                        startActivity(intent);
                    } else if (finalI == 2) {
                        Intent intent = new Intent(MainActivity.this, tentang.class);
                        startActivity(intent);
                    } else if (finalI == 3) {
                        finish();
                    }
                    else
                        {
                        Toast.makeText(MainActivity.this,"please set activity for this card item",Toast.LENGTH_SHORT).show();
                    }

                }
            });
        }

    }

}
