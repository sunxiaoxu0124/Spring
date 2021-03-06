package com.demo.entity;

import org.springframework.stereotype.Component;

@Component
public class Reward {

	private String rewardId = "";
	private String rewardName = "";
	private int number = 0;
	private int limit = 0;

	public String getRewardId() {
		return rewardId;
	}

	public void setRewardId(String rewardId) {
		this.rewardId = rewardId;
	}

	public String getRewardName() {
		return rewardName;
	}

	public void setRewardName(String rewardName) {
		this.rewardName = rewardName;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	@Override
	public String toString() {
		return "Reward [rewardId=" + rewardId + ", rewardName=" + rewardName + ", number=" + number + ", limit=" + limit
				+ "]";
	}

}
