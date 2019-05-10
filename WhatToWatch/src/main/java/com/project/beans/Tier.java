package com.project.beans;

<<<<<<< HEAD
@Entity
@Table(name="TIER")
public class Tier {
	
	public Tier() {
		super();
	}
	
	public Tier(int tierId,User user, UserTier userTier) {
		super();
		this.tierId = tierId;
	}
	
	@Id
	@Column(name="TIER_ID")
	private int tierId;
	
	private User user;
	
	private UserTier userTier;
	
	
	public int getTierId() {
		return tierId;
	}
	public void setTierId(int tierId) {
		this.tierId = tierId;
	}
	public UserTier getUserTier() {
		return userTier;
	}

	public void setUserTier(UserTier userTier) {
		this.userTier = userTier;
	}

	@Override
	public String toString() {
		return "Tier [tierId=" + tierId + ", userTier=" + userTier + "]";
	}
	
	
	
	
	
	
	
	
=======
public enum Tier {
>>>>>>> 188ce81835753e10362237c3bdf587cf4b0ff363
	
	BASIC, PREMIUM, MODERATOR;

}
