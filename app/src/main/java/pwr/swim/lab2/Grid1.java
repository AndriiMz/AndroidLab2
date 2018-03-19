
package pwr.swim.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import common.MyAdapter;

public class Grid1 extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private GridView grid;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid1);


        grid = (GridView) findViewById(R.id.gridView);
        grid.setOnItemClickListener(this);
        grid.setAdapter(new MyAdapter(this));
    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id){
        String napis = "";
        SparseBooleanArray zaznaczone = grid.getCheckedItemPositions();
        for(int i = 0; i < zaznaczone.size(); i++) {
            if(zaznaczone.valueAt(i)) {
                int indeks = zaznaczone.keyAt(i);
                napis += (" " + String.valueOf(indeks + 1));
            }
        }

        Toast.makeText(
                getApplicationContext(),
                "Wybrałeś:" + napis,
                Toast.LENGTH_SHORT
        ).show();
    }
}
