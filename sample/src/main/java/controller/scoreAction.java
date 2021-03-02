package controller;

import com.opensymphony.xwork2.ActionSupport;

public class scoreAction extends ActionSupport {
	private Integer score;

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public String execute() throws Exception {
		if (getScore() >= 60) {
			return "yes";
		} else {
			return "no";
		}

	}

}