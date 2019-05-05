package com.project.dao;

import com.project.beans.Admin;
import com.project.beans.Tier;
import com.project.beans.User;

public interface TierDAO {
	public Tier getTier(User user);
	public boolean updateTier(Admin admin);
	public Tier createTier(Tier tier);

}
