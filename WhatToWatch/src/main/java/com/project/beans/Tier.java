package com.project.beans;
//manually set the different tiers in driver class
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TIER")
public class Tier {
	
	public Tier() {
		super();
	}
	
	public Tier(int tierId, String userTier) {
		super();
		this.tierId = tierId;
	}
	@Id
	@Column(name="TIER_ID")
	private int tierId;
	
	
	private String userTier = "basic";//default basic, upgrade to premium then Moderator
	
	
	public int getTierId() {
		return tierId;
	}
	public void setTierId(int tierId) {
		this.tierId = tierId;
	}
	public String getUserTier() {
		return userTier;
	}

	public void setUserTier(String userTier) {
		this.userTier = userTier;
	}

	@Override
	public String toString() {
		return "Tier [tierId=" + tierId + ", userTier=" + userTier + "]";
	}
	
	
	
	
	
	
	
	
	

}
