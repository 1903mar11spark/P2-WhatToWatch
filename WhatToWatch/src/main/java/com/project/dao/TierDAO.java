package com.project.dao;

import com.project.beans.Admin;
import com.project.beans.Tier;
import com.project.beans.User;

public interface TierDAO {
	public Tier getTier(User user);
<<<<<<< HEAD
	public boolean updateTier(Admin admin);
	public Tier createTier(Tier tier);
=======
	public void updateTier(User user);
>>>>>>> 76e1437b3513d086ae424df705c99fadb3cd1ed0
}
