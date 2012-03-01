package jp.mydns.bis5.app.TwitterClient.async;
import java.util.List;
import jp.mydns.bis5.app.TwitterClient.dto.Tweet;
public interface AsyncCallback {
	public void onFinishedTask(AsyncCallbackType type, List<Tweet> result);
}
