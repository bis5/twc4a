package jp.mydns.bis5.app.TwitterClient.activity;

import jp.mydns.bis5.app.TwitterClient.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.widget.Button;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;
import twitter4j.TwitterException;

import android.content.SharedPreferences;

import twitter4j.conf.ConfigurationBuilder;
import twitter4j.conf.Configuration;
import twitter4j.auth.OAuthAuthorization;

public class LoginActivity extends Activity {
	private static final String twitter_consumer_key = "XWfAxqPNUE27lIQGuBIdw";
    private static final String twitter_consumer_secret = "GLEPpFe5nLamrlTHrv8lpBtxOlaVRuJ5Dl86BSI0";
	static final String CALLBACK = "auth://twc4a";

	private RequestToken rtoken = null;

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!login()) {
	        setContentView(R.layout.login);
	        
	        Button btLogin = (Button)findViewById(R.id.bt_Login);
	        if(btLogin!=null)btLogin.setOnClickListener(new ButtonClickListener());
        } else {
        	finish();
        }
    }
    
    private boolean login() {
    	SharedPreferences pref = getSharedPreferences("TWC4A", MODE_PRIVATE);
    	String okey = pref.getString("oauth_token", null);
    	String okeys = pref.getString("oauth_token_secret", null);
    	
    	if (okey == null || okeys == null)
    		return false;
    	
    	Intent intent = new Intent(this, HomeTimelineActivity.class);
    	intent.putExtra("oauth_token", okey);
    	intent.putExtra("oauth_token_secret", okeys);
    	startActivity(intent);
    			    	
    	return true;
    }
    
    private OAuthAuthorization oauth = null;

    class ButtonClickListener implements OnClickListener {


    	@Override
    	public void onClick(View v) {
    		
    		ConfigurationBuilder confbuild = new ConfigurationBuilder();
    		confbuild.setOAuthConsumerKey(twitter_consumer_key);
    		confbuild.setOAuthConsumerSecret(twitter_consumer_secret);
    		Configuration conf = confbuild.build();
    		
    		oauth = new OAuthAuthorization(conf);
    		oauth.setOAuthAccessToken(null);
    		try{
    			rtoken = oauth.getOAuthRequestToken();
    		} catch (TwitterException ex) {
    			ex.printStackTrace();
    			finish();
    		}
    		Intent intent = new Intent(LoginActivity.this, OAuthActivity.class);
    		intent.putExtra("auth_url", rtoken.getAuthorizationURL());
    		//startActivity(intent);
    		startActivityForResult(intent,0);
    	}
    }
    
    @Override public void onActivityResult(int arg0, int arg1, Intent data) {
    	if (data == null || !data.getExtras().containsKey("pin")) return; //cancel
    	try {
	    	AccessToken atoken = oauth.getOAuthAccessToken(
	    			rtoken,
	    			data.getExtras().getString("pin")
	    			);
	    	
	    	SharedPreferences pref = getSharedPreferences("TWC4A", MODE_PRIVATE);
	    	SharedPreferences.Editor editor = pref.edit();
	    	editor.putString("oauth_token", atoken.getToken());
	    	editor.putString("oauth_token_secret", atoken.getTokenSecret());
	    	editor.putString("auth_status", "available");
	    	editor.commit();
    	} catch (TwitterException ex) {
    		ex.printStackTrace();
    		finish();
    	}

    }

    
}
