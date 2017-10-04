package id.putraprima.a03recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Intent intent = getIntent();
        String message = intent.getStringExtra("NAMA_SEKOLAH");
        TextView text = (TextView) findViewById(R.id.namaSekolah);
        text.setText(message);
    }
}
