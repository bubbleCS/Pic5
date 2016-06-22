package aj.afnan.pic5;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ManagementActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String[] Option_names;
    TypedArray Icon_id;
    TypedArray Move_id;


    List<RowItem> rowItems;
    ListView mylistview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_management);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
       getSupportActionBar().setCustomView(R.layout.action_bar);
        //getSupportActionBar().setTitle("عن الادارة");


       // setTitle("عن الادارة"); //title of activity

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab); //home icon
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        rowItems = new ArrayList<RowItem>(); //to display content of every row in ListView

        Option_names = getResources().getStringArray(R.array.Option_Name); //to take name of button from array in string.xml
        Icon_id = getResources().obtainTypedArray(R.array.OptionIcon);//to take icon of button from array in string.xml
        Move_id = getResources().obtainTypedArray(R.array.MoveIcon);//to take arrow icon from array in string.xml


        for (int i = 0; i < 5; i++) {
            RowItem item = new RowItem(Option_names[i], Icon_id.getResourceId(i, -1), Move_id.getResourceId(i, -1));
            rowItems.add(item); //to save every row item in array
        }

        mylistview = (ListView) findViewById(R.id.listViewMangment); //to create list view
        CustomAdapter adapter = new CustomAdapter(this, rowItems);
        mylistview.setAdapter(adapter);

        mylistview.setOnItemClickListener(this);

    }
        @Override
        public void onItemClick (AdapterView < ? > parent, View view,int position, long id){//move to new activity

            if (position == 0) {
                Intent AboutUs = new Intent(getApplicationContext(), AboutUs.class);
                startActivity(AboutUs);
            }
            if (position == 1) {
                Intent AboutUs = new Intent(getApplicationContext(), Branches.class);
                startActivity(AboutUs);
            }
            if (position == 2) {
                Intent AboutUs = new Intent(getApplicationContext(), NoAccount.class);
                startActivity(AboutUs);
            }
            if (position == 3) {
                Intent AboutUs = new Intent(getApplicationContext(), WebSite.class);
                startActivity(AboutUs);
            }
            if (position == 4) {
                Intent AboutUs = new Intent(getApplicationContext(), Location.class);
                startActivity(AboutUs);
            }

        }


    }



