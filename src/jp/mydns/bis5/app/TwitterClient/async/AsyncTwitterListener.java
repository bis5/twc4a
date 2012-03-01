package jp.mydns.bis5.app.TwitterClient.async;

import twitter4j.AccountSettings;
import twitter4j.AccountTotals;
import twitter4j.Category;
import twitter4j.DirectMessage;
import twitter4j.Friendship;
import twitter4j.IDs;
import twitter4j.Location;
import twitter4j.PagableResponseList;
import twitter4j.Place;
import twitter4j.ProfileImage;
import twitter4j.QueryResult;
import twitter4j.RateLimitStatus;
import twitter4j.RelatedResults;
import twitter4j.Relationship;
import twitter4j.ResponseList;
import twitter4j.SimilarPlaces;
import twitter4j.Status;
import twitter4j.Trends;
import twitter4j.TwitterAPIConfiguration;
import twitter4j.TwitterException;
import twitter4j.TwitterListener;
import twitter4j.TwitterMethod;
import twitter4j.User;
import twitter4j.UserList;
import twitter4j.api.HelpMethods.Language;
import jp.mydns.bis5.app.TwitterClient.dto.Tweet;
import java.util.ArrayList;

/**
 * @author bis5
 *
 */
public class AsyncTwitterListener implements TwitterListener {

	private AsyncCallback callback = null;
	public void setAsyncCallback(AsyncCallback callback) {
		this.callback = callback;
	}
	
	public AsyncTwitterListener(AsyncCallback callback) {
		setAsyncCallback(callback);
	}
	
	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#addedUserListMember(twitter4j.UserList)
	 */
	@Override
	public void addedUserListMember(UserList arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#addedUserListMembers(twitter4j.UserList)
	 */
	@Override
	public void addedUserListMembers(UserList arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#checkedUserListMembership(twitter4j.User)
	 */
	@Override
	public void checkedUserListMembership(User arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#checkedUserListSubscription(twitter4j.User)
	 */
	@Override
	public void checkedUserListSubscription(User arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#createdBlock(twitter4j.User)
	 */
	@Override
	public void createdBlock(User arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#createdFavorite(twitter4j.Status)
	 */
	@Override
	public void createdFavorite(Status arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#createdFriendship(twitter4j.User)
	 */
	@Override
	public void createdFriendship(User arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#createdPlace(twitter4j.Place)
	 */
	@Override
	public void createdPlace(Place arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#createdUserList(twitter4j.UserList)
	 */
	@Override
	public void createdUserList(UserList arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#deletedUserListMember(twitter4j.UserList)
	 */
	@Override
	public void deletedUserListMember(UserList arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#destroyedBlock(twitter4j.User)
	 */
	@Override
	public void destroyedBlock(User arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#destroyedDirectMessage(twitter4j.DirectMessage)
	 */
	@Override
	public void destroyedDirectMessage(DirectMessage arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#destroyedFavorite(twitter4j.Status)
	 */
	@Override
	public void destroyedFavorite(Status arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#destroyedFriendship(twitter4j.User)
	 */
	@Override
	public void destroyedFriendship(User arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#destroyedStatus(twitter4j.Status)
	 */
	@Override
	public void destroyedStatus(Status arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#destroyedUserList(twitter4j.UserList)
	 */
	@Override
	public void destroyedUserList(UserList arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#disabledNotification(twitter4j.User)
	 */
	@Override
	public void disabledNotification(User arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#enabledNotification(twitter4j.User)
	 */
	@Override
	public void enabledNotification(User arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotAPIConfiguration(twitter4j.TwitterAPIConfiguration)
	 */
	@Override
	public void gotAPIConfiguration(TwitterAPIConfiguration arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotAccountSettings(twitter4j.AccountSettings)
	 */
	@Override
	public void gotAccountSettings(AccountSettings arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotAccountTotals(twitter4j.AccountTotals)
	 */
	@Override
	public void gotAccountTotals(AccountTotals arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotAllUserLists(twitter4j.ResponseList)
	 */
	@Override
	public void gotAllUserLists(ResponseList<UserList> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotAvailableTrends(twitter4j.ResponseList)
	 */
	@Override
	public void gotAvailableTrends(ResponseList<Location> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotBlockingUsers(twitter4j.ResponseList)
	 */
	@Override
	public void gotBlockingUsers(ResponseList<User> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotBlockingUsersIDs(twitter4j.IDs)
	 */
	@Override
	public void gotBlockingUsersIDs(IDs arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotCurrentTrends(twitter4j.Trends)
	 */
	@Override
	public void gotCurrentTrends(Trends arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotDailyTrends(twitter4j.ResponseList)
	 */
	@Override
	public void gotDailyTrends(ResponseList<Trends> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotDirectMessage(twitter4j.DirectMessage)
	 */
	@Override
	public void gotDirectMessage(DirectMessage arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotDirectMessages(twitter4j.ResponseList)
	 */
	@Override
	public void gotDirectMessages(ResponseList<DirectMessage> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotExistsBlock(boolean)
	 */
	@Override
	public void gotExistsBlock(boolean arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotExistsFriendship(boolean)
	 */
	@Override
	public void gotExistsFriendship(boolean arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotFavorites(twitter4j.ResponseList)
	 */
	@Override
	public void gotFavorites(ResponseList<Status> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotFollowersIDs(twitter4j.IDs)
	 */
	@Override
	public void gotFollowersIDs(IDs arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotFollowersStatuses(twitter4j.PagableResponseList)
	 */
	@Override
	public void gotFollowersStatuses(PagableResponseList<User> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotFriendsIDs(twitter4j.IDs)
	 */
	@Override
	public void gotFriendsIDs(IDs arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotFriendsStatuses(twitter4j.PagableResponseList)
	 */
	@Override
	public void gotFriendsStatuses(PagableResponseList<User> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotFriendsTimeline(twitter4j.ResponseList)
	 */
	@Override
	public void gotFriendsTimeline(ResponseList<Status> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotGeoDetails(twitter4j.Place)
	 */
	@Override
	public void gotGeoDetails(Place arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotHomeTimeline(twitter4j.ResponseList)
	 */
	@Override
	public void gotHomeTimeline(ResponseList<Status> arg0) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Tweet> ret = new ArrayList<Tweet>();
		for (Status status : arg0) {
			Tweet tweet = new Tweet();
			tweet.setId(status.getId());
			tweet.setDate(status.getCreatedAt().toLocaleString());
			tweet.setName(status.getUser().getName());
			tweet.setScreenName(status.getUser().getScreenName());
			tweet.setUserImageUrl(status.getUser().getProfileImageURL().toString());
		}
		callback.onFinishedTask(AsyncCallbackType.HOME_TIMELINE, ret);
	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotIncomingFriendships(twitter4j.IDs)
	 */
	@Override
	public void gotIncomingFriendships(IDs arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotLanguages(twitter4j.ResponseList)
	 */
	@Override
	public void gotLanguages(ResponseList<Language> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotLocationTrends(twitter4j.Trends)
	 */
	@Override
	public void gotLocationTrends(Trends arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotMemberSuggestions(twitter4j.ResponseList)
	 */
	@Override
	public void gotMemberSuggestions(ResponseList<User> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotMentions(twitter4j.ResponseList)
	 */
	@Override
	public void gotMentions(ResponseList<Status> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotNearByPlaces(twitter4j.ResponseList)
	 */
	@Override
	public void gotNearByPlaces(ResponseList<Place> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotNoRetweetIds(twitter4j.IDs)
	 */
	@Override
	public void gotNoRetweetIds(IDs arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotOutgoingFriendships(twitter4j.IDs)
	 */
	@Override
	public void gotOutgoingFriendships(IDs arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotPrivacyPolicy(java.lang.String)
	 */
	@Override
	public void gotPrivacyPolicy(String arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotProfileImage(twitter4j.ProfileImage)
	 */
	@Override
	public void gotProfileImage(ProfileImage arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotPublicTimeline(twitter4j.ResponseList)
	 */
	@Override
	public void gotPublicTimeline(ResponseList<Status> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotRateLimitStatus(twitter4j.RateLimitStatus)
	 */
	@Override
	public void gotRateLimitStatus(RateLimitStatus arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotRelatedResults(twitter4j.RelatedResults)
	 */
	@Override
	public void gotRelatedResults(RelatedResults arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotRetweetedBy(twitter4j.ResponseList)
	 */
	@Override
	public void gotRetweetedBy(ResponseList<User> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotRetweetedByIDs(twitter4j.IDs)
	 */
	@Override
	public void gotRetweetedByIDs(IDs arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotRetweetedByMe(twitter4j.ResponseList)
	 */
	@Override
	public void gotRetweetedByMe(ResponseList<Status> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotRetweetedByUser(twitter4j.ResponseList)
	 */
	@Override
	public void gotRetweetedByUser(ResponseList<Status> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotRetweetedToMe(twitter4j.ResponseList)
	 */
	@Override
	public void gotRetweetedToMe(ResponseList<Status> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotRetweetedToUser(twitter4j.ResponseList)
	 */
	@Override
	public void gotRetweetedToUser(ResponseList<Status> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotRetweets(twitter4j.ResponseList)
	 */
	@Override
	public void gotRetweets(ResponseList<Status> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotRetweetsOfMe(twitter4j.ResponseList)
	 */
	@Override
	public void gotRetweetsOfMe(ResponseList<Status> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotReverseGeoCode(twitter4j.ResponseList)
	 */
	@Override
	public void gotReverseGeoCode(ResponseList<Place> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotSentDirectMessages(twitter4j.ResponseList)
	 */
	@Override
	public void gotSentDirectMessages(ResponseList<DirectMessage> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotShowFriendship(twitter4j.Relationship)
	 */
	@Override
	public void gotShowFriendship(Relationship arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotShowStatus(twitter4j.Status)
	 */
	@Override
	public void gotShowStatus(Status arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotShowUserList(twitter4j.UserList)
	 */
	@Override
	public void gotShowUserList(UserList arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotSimilarPlaces(twitter4j.SimilarPlaces)
	 */
	@Override
	public void gotSimilarPlaces(SimilarPlaces arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotSuggestedUserCategories(twitter4j.ResponseList)
	 */
	@Override
	public void gotSuggestedUserCategories(ResponseList<Category> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotTermsOfService(java.lang.String)
	 */
	@Override
	public void gotTermsOfService(String arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotUserDetail(twitter4j.User)
	 */
	@Override
	public void gotUserDetail(User arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotUserListMembers(twitter4j.PagableResponseList)
	 */
	@Override
	public void gotUserListMembers(PagableResponseList<User> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotUserListMemberships(twitter4j.PagableResponseList)
	 */
	@Override
	public void gotUserListMemberships(PagableResponseList<UserList> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotUserListStatuses(twitter4j.ResponseList)
	 */
	@Override
	public void gotUserListStatuses(ResponseList<Status> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotUserListSubscribers(twitter4j.PagableResponseList)
	 */
	@Override
	public void gotUserListSubscribers(PagableResponseList<User> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotUserListSubscriptions(twitter4j.PagableResponseList)
	 */
	@Override
	public void gotUserListSubscriptions(PagableResponseList<UserList> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotUserLists(twitter4j.PagableResponseList)
	 */
	@Override
	public void gotUserLists(PagableResponseList<UserList> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotUserSuggestions(twitter4j.ResponseList)
	 */
	@Override
	public void gotUserSuggestions(ResponseList<User> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotUserTimeline(twitter4j.ResponseList)
	 */
	@Override
	public void gotUserTimeline(ResponseList<Status> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#gotWeeklyTrends(twitter4j.ResponseList)
	 */
	@Override
	public void gotWeeklyTrends(ResponseList<Trends> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#lookedUpFriendships(twitter4j.ResponseList)
	 */
	@Override
	public void lookedUpFriendships(ResponseList<Friendship> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#lookedupUsers(twitter4j.ResponseList)
	 */
	@Override
	public void lookedupUsers(ResponseList<User> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#onException(twitter4j.TwitterException, twitter4j.TwitterMethod)
	 */
	@Override
	public void onException(TwitterException arg0, TwitterMethod arg1) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#reportedSpam(twitter4j.User)
	 */
	@Override
	public void reportedSpam(User arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#retweetedStatus(twitter4j.Status)
	 */
	@Override
	public void retweetedStatus(Status arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#searched(twitter4j.QueryResult)
	 */
	@Override
	public void searched(QueryResult arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#searchedPlaces(twitter4j.ResponseList)
	 */
	@Override
	public void searchedPlaces(ResponseList<Place> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#searchedUser(twitter4j.ResponseList)
	 */
	@Override
	public void searchedUser(ResponseList<User> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#sentDirectMessage(twitter4j.DirectMessage)
	 */
	@Override
	public void sentDirectMessage(DirectMessage arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#subscribedUserList(twitter4j.UserList)
	 */
	@Override
	public void subscribedUserList(UserList arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#tested(boolean)
	 */
	@Override
	public void tested(boolean arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#unsubscribedUserList(twitter4j.UserList)
	 */
	@Override
	public void unsubscribedUserList(UserList arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#updatedAccountSettings(twitter4j.AccountSettings)
	 */
	@Override
	public void updatedAccountSettings(AccountSettings arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#updatedFriendship(twitter4j.Relationship)
	 */
	@Override
	public void updatedFriendship(Relationship arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#updatedProfile(twitter4j.User)
	 */
	@Override
	public void updatedProfile(User arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#updatedProfileBackgroundImage(twitter4j.User)
	 */
	@Override
	public void updatedProfileBackgroundImage(User arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#updatedProfileColors(twitter4j.User)
	 */
	@Override
	public void updatedProfileColors(User arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#updatedProfileImage(twitter4j.User)
	 */
	@Override
	public void updatedProfileImage(User arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#updatedStatus(twitter4j.Status)
	 */
	@Override
	public void updatedStatus(Status arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#updatedUserList(twitter4j.UserList)
	 */
	@Override
	public void updatedUserList(UserList arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/* (非 Javadoc)
	 * @see twitter4j.TwitterListener#verifiedCredentials(twitter4j.User)
	 */
	@Override
	public void verifiedCredentials(User arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
