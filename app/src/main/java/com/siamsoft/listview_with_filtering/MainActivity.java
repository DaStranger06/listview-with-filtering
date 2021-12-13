package com.siamsoft.listview_with_filtering;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

public class MainActivity extends AppCompatActivity {

    ListView levi;
    SearchView srcv;

    String[] arr = {"Bob", "Subrata", "Fahim", "tuhin", "Siam", "Siam", "Siam", "Siam", "Siam", "Siam", "Siam", "Siam", "Siam", "Siam", "Siam", "Siam", "Siam", "Siam"};

    ArrayAdapter<String> adp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      levi = findViewById(R.id.lv);

      srcv = findViewById(R.id.sv);

      adp = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arr);
      levi.setAdapter(adp);

      srcv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
          @Override
          public boolean onQueryTextSubmit(String query) {
              return false;
          }

          @Override
          public boolean onQueryTextChange(String nt) {

              adp.getFilter().filter(nt);
              return false;


          }
      });

    }
}