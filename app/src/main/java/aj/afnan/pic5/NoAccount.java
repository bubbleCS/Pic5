package aj.afnan.pic5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NoAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_account);
        setTitle("رقم حساب الادارة");

        TouchImageView img = new TouchImageView(this);
        img.setImageResource(R.drawable.account);
        img.setMaxZoom(4f);
        setContentView(img);

    }
}
