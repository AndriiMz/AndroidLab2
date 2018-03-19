package pwr.swim.lab2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Lista3 extends AppCompatActivity {
    String[] ltxt1 = {"Pozycja nr 1", "Pozycja nr 2", "Pozycja nr 3","Pozycja nr 4",
            "Pozycja nr 5", "Pozycja nr 6","Pozycja nr 7","Pozycja nr 8",
            "Pozycja nr 9", "Pozycja nr 10"
    };
    String[] ltxt2 = {"Tekst 1", "Tekst 2", "Tekst 3", "Tekst 4", "Tekst 5",
            "Tekst 6", "Tekst 7", "Tekst 8", "Tekst 9", "Tekst 10"
    };

    public class MyAdapter extends BaseAdapter {
        private LayoutInflater inflater = null;
        public  int getCount() {
            return ltxt1.length;
        }
        public Object getItem(int position) {
            return position;
        }
        public long getItemId(int position) {
            return position;
        }
        public View getView(int poss, View cView, ViewGroup parent) {
            View mV;
            inflater = (LayoutInflater)
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            if(cView == null) {
                cView = inflater.inflate(R.layout.list_row, null);
            }
            mV = cView;

            TextView tv1 = (TextView)mV.findViewById(R.id.row_tv1);
            tv1.setText(ltxt1[poss]);
            TextView tv2 = (TextView)mV.findViewById(R.id.row_tv2);
            tv2.setText(ltxt2[poss]);

            return mV;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista3);


        MyAdapter adp = new MyAdapter();
        ListView lista3 = (ListView)findViewById(R.id.listView3);
        lista3.setAdapter(adp);
    }
}
