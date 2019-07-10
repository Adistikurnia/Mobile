package com.example.mobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class daftar extends AppCompatActivity {

    GridLayout secondGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        secondGrid = (GridLayout) findViewById(R.id.secondGrid);

        setSingleEvent((secondGrid));
    }

    private void setSingleEvent(GridLayout secondGrid) {
        for (int a = 0; a < secondGrid.getChildCount(); a++) {
            CardView cardView = (CardView) secondGrid.getChildAt(a);
            final int finalA = a;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (finalA == 0) {
                        Intent intent = new Intent(daftar.this, agro.class);
                        startActivity(intent);
                    } else if (finalA == 1) {
                        Intent intent = new Intent(daftar.this, setieng.class);
                        startActivity(intent);
                    } else if (finalA == 2) {
                        Intent intent = new Intent(daftar.this, TW.class);
                        startActivity(intent);
                    } else if (finalA == 3) {
                        Intent intent = new Intent(daftar.this, LS.class);
                        startActivity(intent);
                    } else if (finalA == 4) {
                        Intent intent = new Intent(daftar.this, TM.class);
                        startActivity(intent);
                    } else if (finalA == 5) {
                        Intent intent = new Intent(daftar.this, SK.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(daftar.this, "please set activity for this card item", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

    }
}
