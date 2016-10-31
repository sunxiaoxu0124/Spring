package com.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class Activity {

	private String activityId;
	@Autowired
	private Reward reward;

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public Reward getReward() {
		return reward;
	}

	public void setReward(Reward reward) {
		this.reward = reward;
	}

	@Override
	public String toString() {
		return "Activity [activityId=" + activityId + ", reward=" + reward + "]";
	}

}
