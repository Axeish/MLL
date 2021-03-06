package mll.beans;

import java.io.Serializable;

import org.json.JSONArray;

public class Login implements Serializable {
	
	private static final long serialVersionUID = 4923954637381909334L;
	public static final String musicianType = "musician";
	public static final String adminUserType = "user";
	public static final String arUserType = "arUser";
	
	private User user = new User();
	private AdminUser admin = new AdminUser();
	private ARuser aruser=new ARuser();
	private Musician musician = new Musician();
	private JSONArray bands=new JSONArray();
	private boolean isValidUser;
	private String errMsg;
	private String type;
	private boolean canBrowse;
	private boolean canUpload;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public AdminUser getAdmin() {
		return admin;
	}
	public void setAdmin(AdminUser admin) {
		this.admin = admin;
	}
	public Musician getMusician() {
		return musician;
	}
	public void setMusician(Musician musician) {
		this.musician = musician;
	}
	public boolean isValidUser() {
		return isValidUser;
	}
	public void setValidUser(boolean isValidUser) {
		this.isValidUser = isValidUser;
	}
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isCanBrowse() {
		return canBrowse;
	}
	public void setCanBrowse(boolean canBrowse) {
		this.canBrowse = canBrowse;
	}
	public boolean isCanUpload() {
		return canUpload;
	}
	public void setCanUpload(boolean canUpload) {
		this.canUpload = canUpload;
	}
	public ARuser getAruser() {
		return aruser;
	}
	public void setAruser(ARuser aruser) {
		this.aruser = aruser;
	}
	
	public JSONArray getBands() {
		return bands;
	}
	public void setBands(JSONArray bands) {
		this.bands = bands;
	}
	
}
