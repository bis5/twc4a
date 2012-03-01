package jp.mydns.bis5.app.TwitterClient.activity;

import jp.mydns.bis5.app.TwitterClient.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.content.Intent;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;
import jp.mydns.bis5.app.TwitterClient.async.AsyncCallback;
import jp.mydns.bis5.app.TwitterClient.dto.Tweet;
import java.util.List;
import java.util.ArrayList;
import jp.mydns.bis5.app.TwitterClient.async.AsyncCallbackType;
import jp.mydns.bis5.app.TwitterClient.async.AsyncTwitterListener;
import twitter4j.AsyncTwitter;
import twitter4j.AsyncTwitterFactory;
import android.widget.ArrayAdapter;
import android.app.ListActivity;
/**
 * $id; HomeTimelineActivity.java 
 * @since 2012.03.01
 * @author bis5 <bis5@bis5.mydns.jp>
 */
public class HomeTimelineActivity extends ListActivity implements OnClickListener, OnItemClickListener, AsyncCallback {
	
	private Button btAccount = null;
	private Button btDM = null;
	private Button btFav = null;
	private Button btMension = null;
	private Button btTweet = null;
	private ListView listTl = null;
		
	@Override public void onFinishedTask(AsyncCallbackType type, List<Tweet> result) {
		if (type != AsyncCallbackType.HOME_TIMELINE) return;
		
		ArrayList<String> twlst = new ArrayList<String>();
		for (Tweet tweet : result) {
			String line = tweet.getName() + " : " + tweet.getText();
			twlst.add(line);
		}
		ArrayAdapter<String> adp = new ArrayAdapter<String>(getApplicationContext(),R.layout.hometl, twlst);
		setListAdapter(adp);
		
	}
	
	@Override public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hometl);
	
		btAccount = (Button)findViewById(R.id.hometl_btAccount);
		btDM = (Button)findViewById(R.id.hometl_btDM);
		btFav = (Button)findViewById(R.id.hometl_btFav);
		btMension = (Button)findViewById(R.id.hometl_btMension);
		btTweet = (Button)findViewById(R.id.hometl_btTweet);
		listTl = getListView();//(ListView)findViewById(R.id.list);
		
		btAccount.setOnClickListener(this);
		btDM.setOnClickListener(this);
		btFav.setOnClickListener(this);
		btMension.setOnClickListener(this);
		btTweet.setOnClickListener(this);
		listTl.setOnItemClickListener(this);
		
		Intent intent = getIntent();
		Bundle data = intent.getExtras();
		ConfigurationBuilder cbuild = new ConfigurationBuilder();
		cbuild.setOAuthAccessToken(data.getString("oauth_token"));
		cbuild.setOAuthAccessTokenSecret(data.getString("oauth_token_secret"));
		cbuild.setOAuthConsumerKey(LoginActivity.twitter_consumer_key);
		cbuild.setOAuthConsumerSecret(LoginActivity.twitter_consumer_secret);
		Configuration conf = cbuild.build();
		
		AsyncTwitter twitter = new AsyncTwitterFactory(conf).getInstance();
		twitter.addListener(new AsyncTwitterListener(this));
		twitter.getHomeTimeline();
	}
	
	/**
	 * Dispatch button/listview click events
	 * @author bis5
	 * @since 2012.03.01
	 */
	@Override public void onClick(View v) { 
		if (v == btAccount) 
			btAccountClick();
		else if (v == btDM)
			btDMClick();
		else if (v == btFav)
			btFavClick();
		else if (v == btMension)
			btMensionClick();
		else if (v == btTweet)
			btTweetClick();
		else
			finish();
	}
	
	/**
	 * call on hometl_btAccount click
	 * @author bis5
	 * @since 2012.03.01
	 */
	private void btAccountClick() {}
	/**
	 * call on hometl_btDM click
	 * @author bis5
	 * @since 2012.03.01
	 */
	private void btDMClick(){}
	/**
	 * call on hometl_btFav click
	 * @author bis5
	 * @since 2012.03.01
	 */
	private void btFavClick(){}
	/**
	 * call on hometl_btMension click
	 * @author bis5
	 * @since 2012.03.01
	 */
	private void btMensionClick(){}
	/**
	 * call on hometl_btTweet click
	 * @author bis5
	 * @since 2012.03.01
	 */
	private void btTweetClick(){}
	/**
	 * call on hometl_listTl click
	 * @author bis5
	 * @since 2012.03.01
	 */
	public void onItemClick(AdapterView<?> adpView, View view, int i, long l){
		
	}
	
}
