package jp.mydns.bis5.app.TwitterClient.activity;

import jp.mydns.bis5.app.TwitterClient.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class OAuthActivity extends Activity {

	@Override public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.oauth);

		/*Button btPin = (Button)findViewById(R.id.oauth_btPin);
		btPin.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				EditText editPin = (EditText)findViewById(R.id.oauth_editPin);
				Intent intent = getIntent();

				intent.putExtra("pin", editPin.getText().toString());
				setResult(Activity.RESULT_OK, intent);
				finish();
			}
		})*/;

		WebView wv = (WebView)findViewById(R.id.oauth_webview);

		wv.setWebViewClient(new WebViewClient() {
			@Override public void onPageFinished(WebView v, String url) {
				super.onPageFinished(v, url);
				if (url != null && url.startsWith(LoginActivity.CALLBACK)) {
					String[] urlParams = url.split("\\?")[1].split("&");
					
					String oauthToken = "";
					String oauthVerifier = "";
					
					if (urlParams.length < 2) {
						Intent intent = getIntent();
						intent.putExtra("oauth_token", "");
						intent.putExtra("oauth_verifier", "");
						setResult(Activity.RESULT_CANCELED, intent);
						finish();
					}
					if (urlParams[0].startsWith("oauth_token")) {
						oauthToken = urlParams[0].split("=")[1];
					} else if (urlParams[1].startsWith("oauth_token")) {
						oauthToken = urlParams[1].split("=")[1];
					}
					
					if (urlParams[0].startsWith("oauth_verifier")) {
						oauthVerifier = urlParams[0].split("=")[1];
					} else if (urlParams[1].startsWith("oauth_verifier")) {
						oauthVerifier = urlParams[1].split("=")[1];
					}
					
					Intent intent = getIntent();
					intent.putExtra("oauth_token", oauthToken);
					intent.putExtra("oauth_verifier", oauthVerifier);
					
					setResult(Activity.RESULT_OK,intent);
					finish();
				}
			}

		});
		wv.loadUrl(this.getIntent().getExtras().getString("auth_url"));
	}

}
