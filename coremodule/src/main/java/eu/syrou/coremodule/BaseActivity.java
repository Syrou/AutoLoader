package eu.syrou.coremodule;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_base);

        Handler postDelay = new Handler();
        postDelay.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(BaseActivity.this, ListActivity.class);
                BaseActivity.this.startActivity(intent);
            }
        }, 1000);
    }
}
