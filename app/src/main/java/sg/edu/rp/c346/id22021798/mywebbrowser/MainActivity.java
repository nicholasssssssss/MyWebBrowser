package sg.edu.rp.c346.id22021798.mywebbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnLoad;
    WebView wvMyPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wvMyPage=findViewById(R.id.wvMyPage);
        btnLoad=findViewById(R.id.buttonLoad);

        wvMyPage.setWebViewClient(new WebViewClient());

        btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.rp.edu.sg/soi/home";
                wvMyPage.loadUrl((url));
            }
        });
    }
}