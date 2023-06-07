package com.greedy.section01.advice.annotation;

public class AchievementResult {

	private int understandingScore; //���ص�
	private int satisfactionScore; //������
	private double employeementRate; // �����
	
	public AchievementResult(int understandingScore, int satifactionScore, double employeementRate) {
		this.understandingScore = understandingScore;
		this.satisfactionScore = satifactionScore;
		this.employeementRate = employeementRate;
	}

	public int getUnderstandingScore() {
		return understandingScore;
	}

	public void setUnderstandingScore(int understandingScore) {
		this.understandingScore = understandingScore;
	}

	public int getSatisfactionScore() {
		return satisfactionScore;
	}

	public void setSatifactionScore(int satisfactionScore) {
		this.satisfactionScore = satisfactionScore;
	}

	public double getEmployeementRate() {
		return employeementRate;
	}

	public void setEmployeementRate(double employeementRate) {
		this.employeementRate = employeementRate;
	}

	@Override
	public String toString() {
		return "AchievementResult [understandingScore=" + understandingScore + ", satisfactionScore=" + satisfactionScore
				+ ", employeementRate=" + employeementRate + "]";
	}
	
	
	
	
}
