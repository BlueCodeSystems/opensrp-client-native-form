package org.smartregister.nativeform;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ChildInfoActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_list);
        populateChildList();
    }

    private void populateChildList() {
        // Construct the data source
        ArrayList<ChildInfo> arrayOfUsers = ChildInfo.getChildInfo();
        // Create the adapter to convert the array to views
        ChildInfoAdapter adapter = new ChildInfoAdapter(this, arrayOfUsers);
        // Attach the adapter to a ListView
        ListView listView = (ListView) findViewById(R.id.lvChildInfo);
        listView.setAdapter(adapter);
    }

}
