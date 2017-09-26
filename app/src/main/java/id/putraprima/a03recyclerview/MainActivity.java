package id.putraprima.a03recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RiwayatSekolahAdapter mAdapter;
    private List<RiwayatSekolah> riwayatList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.listPendidikan);

        mAdapter = new RiwayatSekolahAdapter(riwayatList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareRiwayatData();
    }

    private void prepareRiwayatData() {
        RiwayatSekolah riwayat = new RiwayatSekolah(2015, "Institut Teknologi Sepuluh Nopember", "Pasca Sarjana");
        riwayatList.add(riwayat);
        riwayat = new RiwayatSekolah(2015, "Institut Teknologi Sepuluh Nopember", "Pasca Sarjana");
        riwayatList.add(riwayat);
        riwayat = new RiwayatSekolah(2015, "Institut Teknologi Sepuluh Nopember", "Pasca Sarjana");
        riwayatList.add(riwayat);
        riwayat = new RiwayatSekolah(2015, "Institut Teknologi Sepuluh Nopember", "Pasca Sarjana");
        riwayatList.add(riwayat);
        riwayat = new RiwayatSekolah(2015, "Institut Teknologi Sepuluh Nopember", "Pasca Sarjana");
        riwayatList.add(riwayat);
        riwayat = new RiwayatSekolah(2015, "Institut Teknologi Sepuluh Nopember", "Pasca Sarjana");
        riwayatList.add(riwayat);
        riwayat = new RiwayatSekolah(2015, "Institut Teknologi Sepuluh Nopember", "Pasca Sarjana");
        riwayatList.add(riwayat);
        riwayat = new RiwayatSekolah(2015, "Institut Teknologi Sepuluh Nopember", "Pasca Sarjana");
        riwayatList.add(riwayat);

        mAdapter.notifyDataSetChanged();
    }
}
