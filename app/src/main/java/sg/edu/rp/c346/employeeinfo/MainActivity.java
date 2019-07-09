package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvjob;
    ArrayList<AndroidVersion> aljob;
    CustomAdapter aajob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvjob = findViewById(R.id.ListViewJob);

        aljob = new ArrayList<AndroidVersion>();
        aljob.add(new AndroidVersion("John","Software Technical Leader", 3400.0));
        aljob.add(new AndroidVersion("May","Programmer", 2200.0));

        aajob = new CustomAdapter(this, R.layout.row, aljob);
        lvjob.setAdapter(aajob);
    }
}
