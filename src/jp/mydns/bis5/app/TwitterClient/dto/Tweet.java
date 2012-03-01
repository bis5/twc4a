package jp.mydns.bis5.app.TwitterClient.dto;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Tweet data object
 * @author bis5
 * @since 2012.03.01
 */
public class Tweet implements Parcelable {
	
	private long id = -1L;
	private String screenName = "";
	private String name = "";
	private String text = "";
	private String date = "";
	private String userImageUrl = "";

	/**
	 * set user id
	 * @param id user id
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * get user id
	 * @return userid as long
	 */
	public long getId() {
		return id;
	}
	/**
	 * set user screen name
	 * @param screenName user screen name
	 */
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	/**
	 * get user screen name
	 * @return screen name
	 */ 
	public String getScreenName() {
		return screenName;
	}
	/**
	 * set username
	 * @param name username
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * get username
	 * @return username
	 */
	public String getName() {
		return name;
	}
	/**
	 * set tweet body
	 * @param text tweet body
	 */
	public void setText(String text) {
		this.text = text;
	}
	/**
	 * get tweet body
	 * @return tweet body	
	 */
	public String getText() {
		return text;
	}
	/**
	 * set tweet date
	 * @param date tweet date
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * get tweet date
	 * @return tweet date as string
	 */
	public String getDate() {
		return date;
	}
	/**
	 * set user image icon url
	 * @param userImageUrl user image icon url
	 */
	public void setUserImageUrl(String userImageUrl) {
		this.userImageUrl = userImageUrl;
	}
	/**
	 * get user image icon url
	 * @return user image icon url
	 */
	public String getUserImageUrl() {
		return userImageUrl;
	}
		
	/* (非 Javadoc)
	 * @see android.os.Parcelable#describeContents()
	 */
	@Override
	public int describeContents() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	/* (非 Javadoc)
	 * @see android.os.Parcelable#writeToParcel(android.os.Parcel, int)
	 */
	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeLong(id);
		dest.writeString(screenName);
		dest.writeString(name);
		dest.writeString(text);
		dest.writeString(date);
		dest.writeString(userImageUrl);
	}
	
	public Tweet() {}
	
	public Tweet(Parcel source) {
		id = source.readLong();
		screenName = source.readString();
		name = source.readString();
		text = source.readString();
		date = source.readString();
		userImageUrl = source.readString();
	}
	
	public static final Parcelable.Creator<Tweet> CREATOR = new Parcelable.Creator<Tweet>() {
		@Override public Tweet createFromParcel(Parcel source) {
			return new Tweet(source);
		}
		
		@Override public Tweet[] newArray(int size) {
			return null;
			
		}
		
	};
}
