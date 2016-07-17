package aj.afnan.pic5;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class GuidesActivity  extends ListActivity {


    String[] Guide = {
            "دليل تعليمات التدريب",
            "القواعد والاجراءات التنفيذية للائحة التدريب في منشآت التدريب الأهلية",
            "لائحة التدريب في منشآت التدريب الأهلي",
            "لائحة تنظيم الشهادات الإحترافية",
            "ضوابط الشهادات الإحترافية"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guides);
       // setTitle("الأدلة واللوائح");







        //Listview adapter
        setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,Guide));
    }
    public void onListItemClick(ListView parent, View v,
                                int position, long id) {

        //                            Intent i = new Intent (Intent.ACTION_VIEW , Uri.parse("http://www.tvtc.gov.sa/Arabic/Departments/Departments/pt/trainingprograms/Medtermcourses/Pages/default.aspx"))


        if (position == 0) {
            //Intent intent = new Intent (Intent.ACTION_VIEW , Uri.parse("http://tvtc.gov.sa/Arabic/Departments/Departments/pt/InformationCenter/ReportsAndGuides/Documents/training_guids.pdf"));
          /*  Intent intent = new Intent(getApplicationContext(), PDFView.class);
            String name = "http://tvtc.gov.sa/Arabic/Departments/Departments/pt/InformationCenter/ReportsAndGuides/Documents/training_guids.pdf";
            Bundle bundle = new Bundle();
            bundle.putString("name", name);
            intent.putExtras(bundle);
            startActivity(intent);*/

            Intent i = new Intent(getApplicationContext(), PDFView.class);
            startActivity(i);


        }
        if (position == 1) {

            Intent intent = new Intent(getApplicationContext(), PDFView.class);
            String name = "http://www.tvtc.gov.sa/Arabic/Departments/Departments/pt/MediaCenter/Memos/Documents/new_rule1.pdf";
            Bundle bundle = new Bundle();
            bundle.putString("name", name);
            intent.putExtras(bundle);
            startActivity(intent);

        }
        if (position == 2) {
            Intent intent = new Intent(getApplicationContext(), PDFView.class);
            String name = "http://www.tvtc.gov.sa/Arabic/Departments/Departments/pt/InformationCenter/ReportsAndGuides/Documents/new_rule2.pdf";
            Bundle bundle = new Bundle();
            bundle.putString("name", name);
            intent.putExtras(bundle);
            startActivity(intent);
        }
        if (position == 3) {
            Intent intent = new Intent(getApplicationContext(), PDFView.class);
           // Intent intent = new Intent (Intent.ACTION_VIEW , Uri.parse( "https://docs.google.com/gview?embedded=true&url=http://tvtc.gov.sa/Arabic/Departments/Departments/pt/InformationCenter/ReportsAndGuides/Documents/pro_cer.pdf"));
            String name = "http://www.tvtc.gov.sa/Arabic/Departments/Departments/pt/InformationCenter/ReportsAndGuides/Documents/pro_cer.pdf";
            Bundle bundle = new Bundle();
            bundle.putString("name", name);
            intent.putExtras(bundle);
            startActivity(intent);
        }
        if (position == 4) {
            Intent intent = new Intent(getApplicationContext(), PDFView.class);
            String name ="http://www.tvtc.gov.sa/Arabic/Departments/Departments/pt/prof_cer/Documents/rulesofproftranining.pdf";
            Bundle bundle = new Bundle();
            bundle.putString("name", name);
            intent.putExtras(bundle);
            startActivity(intent);
        }

    }
}
