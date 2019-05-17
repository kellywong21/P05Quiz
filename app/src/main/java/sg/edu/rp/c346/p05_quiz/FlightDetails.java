package sg.edu.rp.c346.p05_quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FlightDetails extends AppCompatActivity {
    TextView tvTrip;
    TextView tvcost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flight_details);
        tvTrip = findViewById(R.id.tvTrip);
        tvcost = findViewById(R.id.tvcost);

        Intent intentReceived = getIntent();
        String trip = intentReceived.getStringExtra("OneTrip");
        tvTrip.setText("You have selected " + trip  );
    }
}
