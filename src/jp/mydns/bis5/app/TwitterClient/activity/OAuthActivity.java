package jp.mydns.bis5.app.TwitterClient.activity;

import jp.mydns.bis5.app.TwitterClient.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class OAuthActivity extends Activity {
	
	@Override public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.oauth);
		
		Button btPin = (Button)findViewById(R.id.oauth_btPin);
		btPin.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				EditText editPin = (EditText)findViewById(R.id.oauth_editPin);
				Intent intent = getIntent();
				
				intent.putExtra("pin", editPin.getText().toString());
				setResult(Activity.RESULT_OK, intent);
				finish();
			}
		});
		
		WebView wv = (WebView)findViewById(R.id.webview);
		wv.loadUrl(this.getIntent().getExtras().getString("auth_url"));
	}

}
