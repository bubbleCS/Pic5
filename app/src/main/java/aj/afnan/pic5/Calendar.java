package aj.afnan.pic5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Calendar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        Intent intent = new Intent(getApplicationContext(), PDFView.class);
        String name = "http://docs.google.com/gview?embedded=http://stc.sa/fingerprint/index.html?url=www.tvtc.gov.sa%2FArabic%2FDepartments%2FDepartments%2Fpt%2FPages%2Fdefault.aspx";
        Bundle bundle = new Bundle();
        bundle.putString("name", name);
        intent.putExtras(bundle);
        startActivity(intent);

    }
}
