package com.mozilla.cd.lighthousecam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

public class MainActivity extends AppCompatActivity {

    // API key for IBM Watson. 200 free queries per day, will expire around Christmas.
    // FIXME: We need to store the API key out of the source tree.
    private static final String WATSON_API_KEY = "f048f5f96f4c662650a8dbe25d533d853f0d6430";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.err.println("[Yoric] MainActivity: onCreate start");
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        System.err.println("[Yoric] MainActivity: onCreate complete");
    }

    /// Setup UX
    @Override
    public void onStart() {
        System.err.println("[Yoric] MainActivity: onStart start");

        super.onStart();

        final android.view.View view = (android.view.View) this.findViewById(R.id.activity_main);

        final View.OnClickListener onClick = new View.OnClickListener() {
            public void onClick(View v) {
                System.err.println("[Yoric] MainActivity: User has clicked");
            }
        };
        view.setOnClickListener(onClick);
        System.err.println("[Yoric] MainActivity: onStart complete");
    }
}
