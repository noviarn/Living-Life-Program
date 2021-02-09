package umn.ac.id.uts;

import java.util.ArrayList;

public class Healthy extends Human {
	private int muscle=50;
	private int fat=15;
	private int stressLevel=4;
	private double weight;
	public ArrayList<String> activities = new ArrayList<String>();
	
	public Healthy() {}
	public Healthy(String name, int age) {
		super(name, age);
	}
	
	public double getWeight() {
		weight=fat*0.3 + muscle*0.6;
		return weight;
	}
	
	public int getFat() {
		return fat;
	}
	
	public int getMuscle() {
		return muscle;
	}
	
	public int getStressLevel() {
		return stressLevel;
	}
	
	public double updateWeight() {
		return weight;
	}
	
	public void eat(Food food) {	
		stressLevel=stressLevel+2;
		muscle=muscle-food.muscle;
		fat=fat+food.fat;
		activities.add(new String(food.name));
	}
	
	public void workout(Exercise exercise) {
		stressLevel=stressLevel-2;
		muscle=muscle+exercise.muscle;
		fat=fat-exercise.fat;
		activities.add(new String(exercise.name));
	}
}