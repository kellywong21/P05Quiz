package sg.edu.rp.c346.p05_quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvTicket;
    CheckBox cbone;
    CheckBox cbRound;
    TextView tvpax;
    Button btnminus;
    TextView tvnum;
    Button btnplus;
    Button btnsubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTicket = findViewById(R.id.tvTicket);
        cbone = findViewById(R.id.cbone);
        cbRound = findViewById(R.id.cbRound);
        tvpax = findViewById(R.id.tvpax);
        btnminus = findViewById(R.id.btnminus);
        tvnum = findViewById(R.id.tvnum);
        btnplus = findViewById(R.id.btnplus);
        btnsubmit = findViewById(R.id.btnsubmit);

        cbone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FlightDetails.class);
                String cbonetext = "";
                if (cbone.isChecked()){
                    intent.putExtra("OneTrip", "One Trip");}
                    else{
                    intent.putExtra("RoundTrip", "Round Trip");





                }startActivity(intent);
            }
        });
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FlightDetails.class);

            }
        });


    }
}
