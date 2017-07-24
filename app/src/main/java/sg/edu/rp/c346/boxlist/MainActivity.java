package sg.edu.rp.c346.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvBoxArrangementList;
    ArrayList<ColourRow> Colours;
    CustomAdapter caBoxArragement;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //step 4b
        lvBoxArrangementList = (ListView)findViewById(R.id.ListViewColours);
        Colours = new ArrayList<ColourRow>();


        caBoxArragement = new CustomAdapter(this, R.layout.colour_row, Colours);
        lvBoxArrangementList.setAdapter(caBoxArragement);


        //step 4c
        ColourRow item1 = new ColourRow("blue");
        Colours.add(item1);
        ColourRow item2= new ColourRow("orange");
        Colours.add(item2);
        ColourRow item3 = new ColourRow("");
        Colours.add(item3);

    }
}
