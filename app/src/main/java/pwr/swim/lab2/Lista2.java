package pwr.swim.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Lista2 extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private String[] list = new String[12];
    private ListView lista2;

    Lista2(){
        list[0] = "Test1";
        list[1] = "Test2";
        list[2] = "Test3";
        list[3] = "Test4";
        list[4] = "Test5";
        list[5] = "Test6";

        list[6] = "Test7";
        list[7] = "Test8";
        list[8] = "Test9";
        list[9] = "Test10";
        list[10] = "Test11";
        list[11] = "Test12";
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista2);

        lista2 = findViewById(R.id.listView);
        lista2.setOnItemClickListener(this);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_multiple_choice,
                list
        );
        lista2.setAdapter(adapter2);
    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id){
        String napis = "";
        SparseBooleanArray zaznaczone = lista2.getCheckedItemPositions();
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
