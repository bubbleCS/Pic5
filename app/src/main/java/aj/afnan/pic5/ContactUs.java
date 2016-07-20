package aj.afnan.pic5;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class ContactUs extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String[] Option_names;
    TypedArray Icon_id;
    TypedArray Move_id;


    List<RowItem> rowItems;
    ListView mylistview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        setTitle("اتصل بنا");


       // getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
      //  getSupportActionBar().setCustomView(R.layout.action_bar);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab); //home icon
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Home = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(Home);
            }
        });

        rowItems = new ArrayList<RowItem>(); //to display content of every row in ListView

        Option_names = getResources().getStringArray(R.array.Option_Name_ContactUs); //to take name of button from array in string.xml
        Icon_id = getResources().obtainTypedArray(R.array.OptionIcon_ContactUs);//to take icon of button from array in string.xml
        Move_id = getResources().obtainTypedArray(R.array.MoveIcon);//to take arrow icon from array in string.xml


        for (int i = 0; i < 4; i++) {
            RowItem item = new RowItem(Option_names[i], Icon_id.getResourceId(i, -1), Move_id.getResourceId(i, -1));
            rowItems.add(item); //to save every row item in array
        }

        mylistview = (ListView) findViewById(R.id.listViewMangment); //to create list view
        CustomAdapter1 adapter = new CustomAdapter1(this, rowItems);
        mylistview.setAdapter(adapter);

        mylistview.setOnItemClickListener(this);

    }
    @Override
    public void onItemClick (AdapterView< ? > parent, View view,int position, long id){//move to new activity

        if (position == 0) {
            Intent SendEmail = new Intent(getApplicationContext(), SendEmail.class);
            startActivity(SendEmail);
        }
        if (position == 1) {
            Intent intent = new Intent(getApplicationContext(), WebViewActivity.class);
            String name = "http://www.tvtc.gov.sa/Arabic/Departments/Departments/pt/AboutDepartment/Pages/Employeetel.aspx";
            Bundle bundle = new Bundle();
            bundle.putString("name", name);
            intent.putExtras(bundle);
            startActivity(intent);
        }
        if (position == 2) {
            Intent WhereUs = new Intent(getApplicationContext(), MapsActivity.class);
            startActivity(WhereUs);
        }
        if (position == 3) {
            Intent intent = new Intent(getApplicationContext(), WebViewActivity.class);
            String name = "https://twitter.com/tvtc_pt";
            Bundle bundle = new Bundle();
            bundle.putString("name", name);
            intent.putExtras(bundle);
            startActivity(intent);
        }

    }


}



