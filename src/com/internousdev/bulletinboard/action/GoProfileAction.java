package com.internousdev.bulletinboard.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bulletinboard.dao.ChangeIconDAO;
import com.internousdev.bulletinboard.dao.FollowDAO;
import com.internousdev.bulletinboard.dao.FooterInfoDAO;
import com.internousdev.bulletinboard.dao.ProfileDAO;
import com.internousdev.bulletinboard.dto.IconDTO;
import com.internousdev.bulletinboard.dto.UserDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author taka
 *
 */
public class GoProfileAction extends ActionSupport implements SessionAware {

	/** ユーザーID */
	private int userId;
	/** ユーザー名 */
	private String snsId;
	/** ユーザーアイコン */
	private String userIcon;
	/** フォローする側のアイコン */
	private int Do;
	/** フォローされる側のアイコン */
	private int done;
	/** フォロー番号 */
	private int followNum;
	/** フォロワー番号 */
	private int followerNum;
	/** EXP */
	private int point;
	/** レベル */
	private int userLevel;
	/**  */
	private int viewId;
	/** BIO */
	private String profile;
	/**  */
	private boolean isFollowing;
	private int talkInfo = 0;
	private int groupInfo = 0;
	/** プロフィールリスト */
	private UserDTO myData = new UserDTO();
	/** フォローリスト */
	private ArrayList<UserDTO> followList = new ArrayList<UserDTO>();
	/** フォロワーリスト */
	private ArrayList<UserDTO> followerList = new ArrayList<UserDTO>();
	/** アイコンリスト　*/
	public ArrayList<IconDTO> userIconList = new ArrayList<IconDTO>();
	/** セッション */
	private Map<String, Object> session;

	public String execute() {
		String result = ERROR;
		if (session.containsKey("userId")) {
			userId = (int) session.get("userId");
		} else {
			return result;
		}
		//@snsId のリンクから来た場合の処理
		if (snsId != null) {
			ProfileDAO dao = new ProfileDAO();
			//substringで@を取り除く
			viewId = dao.getViewId(snsId.substring(1));
		}

		if (viewId == 0) {
			viewId = userId;
		}

		FollowDAO fdao = new FollowDAO();
		isFollowing = fdao.chaeckIfFollowing(userId, viewId);

		ProfileDAO dao = new ProfileDAO();
		setMyData(dao.select(viewId));

		followList = fdao.getFollowList(viewId);
		setFollowNum((followList.size()));

		followerList = fdao.getFollowerList(viewId);
		setFollowerNum((followerList.size()));

		result = SUCCESS;

		FooterInfoDAO infodao = new FooterInfoDAO();
		setGroupInfo(infodao.groupInfoGet(userId));
		setTalkInfo(infodao.talkInfoGet(userId));

		ChangeIconDAO udao = new ChangeIconDAO();
		userIconList = udao.getUserIcon();

		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public ArrayList<UserDTO> getfollowList() {
		return followList;
	}

	public void setfollowList(ArrayList<UserDTO> followList) {
		this.followList = followList;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getSnsId() {
		return snsId;
	}

	public void setSnsId(String snsId) {
		this.snsId = snsId;
	}

	public String getUserIcon() {
		return userIcon;
	}

	public void setUserIcon(String userIcon) {
		this.userIcon = userIcon;
	}

	public int getFollowerNum() {
		return followerNum;
	}

	public void setFollowerNum(int followerNum) {
		this.followerNum = followerNum;
	}

	public int getFollowNum() {
		return followNum;
	}

	public void setFollowNum(int followNum) {
		this.followNum = followNum;
	}

	public int getDo() {
		return Do;
	}

	public void setDo(int Do) {
		this.Do = Do;
	}

	public int getDone() {
		return done;
	}

	public void setDone(int done) {
		this.done = done;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getUserLevel() {
		return userLevel;
	}

	public void setUserLevel(int userLevel) {
		this.userLevel = userLevel;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public UserDTO getMyData() {
		return myData;
	}

	public void setMyData(UserDTO myData) {
		this.myData = myData;
	}

	public ArrayList<UserDTO> getFollowList() {
		return followList;
	}

	public void setFollowList(ArrayList<UserDTO> followList) {
		this.followList = followList;
	}

	public ArrayList<UserDTO> getFollowerList() {
		return followerList;
	}

	public void setFollowerList(ArrayList<UserDTO> followerList) {
		this.followerList = followerList;
	}

	public int getViewId() {
		return viewId;
	}

	public void setViewId(int viewId) {
		this.viewId = viewId;
	}

	public boolean getIsFollowing() {
		return isFollowing;
	}

	public void setFollowing(boolean isFollowing) {
		this.isFollowing = isFollowing;
	}

	public int getTalkInfo() {
		return talkInfo;
	}

	public void setTalkInfo(int talkInfo) {
		this.talkInfo = talkInfo;
	}

	public int getGroupInfo() {
		return groupInfo;
	}

	public void setGroupInfo(int groupInfo) {
		this.groupInfo = groupInfo;
	}

	public ArrayList<IconDTO> getUserIconList() {
		return userIconList;
	}

	public void setUserIconList(ArrayList<IconDTO> userIconList) {
		this.userIconList = userIconList;
	}

}
