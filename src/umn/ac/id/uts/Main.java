package umn.ac.id.uts;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	static Scanner scanner1 = new Scanner(System.in);
	static Scanner scanner2 = new Scanner(System.in);
	static Healthy[] healthy = new Healthy[100];
	static Unhealthy[] unhealthy = new Unhealthy[100];
	static Human human = new Human();
	static Exercise[] exercise = new Exercise[100];
	static Food[] food = new Food[100];
	public static int inputHealthy, inputUnhealthy, inputExercise, inputFood;
	
	public static void entBack() {
		System.out.println("\nPress Enter to go back.");
		scanner2.nextLine();
	}
	
	public static void tampilanAwal() {
		String healthyName, unhealthyName;
		int healthyAge, unhealthyAge;
		
		System.out.println("-------------------------------------------");
		System.out.println("\t\tLiving Live");
		System.out.println("-------------------------------------------");
		System.out.println("Healthy");
		System.out.print("Name : ");
		healthyName=scanner2.nextLine();
		System.out.print("Age : ");
		healthyAge=scanner1.nextInt();
		healthy[inputHealthy] = new Healthy(healthyName, healthyAge);
		System.out.println("Healthy character is added");
		System.out.println("Unhealthy");
		System.out.print("Name : ");
		unhealthyName=scanner2.nextLine();
		System.out.print("Age : ");
		unhealthyAge=scanner1.nextInt();
		unhealthy[inputUnhealthy] = new Unhealthy(unhealthyName, unhealthyAge);
		System.out.println("Unhealthy character is added");
	}
	
	public static void menuUtama() {
		int input_mu;
		
		System.out.println("-------------------------------------------");
		System.out.println("\t\tLiving Live");
		System.out.println("-------------------------------------------");
		System.out.println("1. Your Detail");
		System.out.println("2. Eat");
		System.out.println("3. Workout");
		System.out.println("4. List of activities");
		System.out.println("5. Credits");
		System.out.println("0. Exit");
		System.out.print("Input: ");
		input_mu=scanner1.nextInt();
		
		switch(input_mu) {
			case 1:
					yourDetail();
					break;
			case 2:
					menuEat();
					break;
			case 3:
					menuExercise();
					break;
			case 4:
					menuActivities();
					break;
			case 5:
					Credits();
					break;
			case 0:
					System.out.println("Exit success.");  
					System.exit(0); 
					break;
			default:
					System.out.println("Invalid Input.");
					break;
		}
	}
	
	public static void yourDetail() {
		int input_yd;
		
		System.out.println("-------------------------------------------");
		System.out.println("\t\tLiving Live");
		System.out.println("-------------------------------------------");
		System.out.println("1. Healthy");
		System.out.println("2. Unhealthy");
		System.out.print("Choose your character: ");
		input_yd=scanner1.nextInt();
		
		switch(input_yd) {
			case 1:
					System.out.println("Healthy");
					System.out.println("Name: "+healthy[inputHealthy].getName());
					System.out.println("Age: "+healthy[inputHealthy].getAge());
					System.out.println("Weight: "+healthy[inputHealthy].getWeight());
					System.out.println("Muscle: "+healthy[inputHealthy].getMuscle());
					System.out.println("Fat: "+healthy[inputHealthy].getFat());
					System.out.println("Stress Level: "+healthy[inputHealthy].getStressLevel());
					entBack();
					break;
			case 2:
					System.out.println("Unhealthy");
					System.out.println("Name: "+unhealthy[inputUnhealthy].getName());
					System.out.println("Age: "+unhealthy[inputUnhealthy].getAge());
					System.out.println("Weight: "+unhealthy[inputUnhealthy].getWeight());
					System.out.println("Muscle: "+unhealthy[inputUnhealthy].getMuscle());
					System.out.println("Fat: "+unhealthy[inputUnhealthy].getFat());
					System.out.println("Stress Level: "+unhealthy[inputUnhealthy].getStressLevel());
					entBack();
					break;
			default:
					System.out.println("Invalid Input.");
		}
	}
	
	public static void inputFood() {
		food[0] = new Food("Pizza", 3, 10);
		food[1] = new Food("Risotto", 2, 4);
		food[2] = new Food("Burger", 4, 9);
		food[3] = new Food("Noodle", 3, 5);
		food[4] = new Food("Salad", 1, 1);
	}
	
	public static void menuEat() {
		inputFood();
		int input_eat, foodID=1, i, input_character;
		int healthyStressLevel = healthy[inputHealthy].getStressLevel();
		int unhealthyMuscle = unhealthy[inputUnhealthy].getMuscle();
		
		System.out.println("-------------------------------------------");
		System.out.println("\t\tLiving Live");
		System.out.println("-------------------------------------------");
		System.out.println("Foods");
		System.out.println("---------------");	
		for(i=0;i<5;i++) {
			System.out.println("ID: "+foodID++);
			System.out.println("Name: "+food[i].name);
			System.out.println("Muscle: "+food[i].muscle);
			System.out.println("Fat: "+food[i].fat);
			System.out.println("---------------");
		}
		System.out.print("Choose your food: ");
		input_eat=scanner1.nextInt();
		System.out.println("\n1. Healthy");
		System.out.println("2. Unhealthy");
		System.out.print("Choose your character: ");
		input_character=scanner1.nextInt();
		
		for(;;) {
			switch(input_character) {
				case 1:
						if(input_eat==1) {
							if(healthyStressLevel<=10) {
								System.out.print(""+healthy[inputHealthy].getName());
								System.out.print(" doesn't really like it\n");
								healthy[inputHealthy].eat(food[0]);
								entBack();
								break;
							}
								else if(healthyStressLevel>10) {
									System.out.print(""+healthy[inputHealthy].getName());
									System.out.print(" is stressed out\n");
									entBack();
									break;
								}
							break;
						}
							else if(input_eat==2) {
								
								if(healthyStressLevel<=10) {
									System.out.print(""+healthy[inputHealthy].getName());
									System.out.print(" doesn't really like it\n");
									healthy[inputHealthy].eat(food[1]);
									entBack();;
								}
									else if(healthyStressLevel>10) {
										System.out.print(""+healthy[inputHealthy].getName());
										System.out.print(" is stressed out\n");
										break;
									}
								break;
							}
								else if(input_eat==3) {
									
									if(healthyStressLevel<=10) {
										System.out.print(""+healthy[inputHealthy].getName());
										System.out.print(" doesn't really like it\n");
										healthy[inputHealthy].eat(food[2]);
										entBack();;
										break;
									}
										else if(healthyStressLevel>10) {
											System.out.print(""+healthy[inputHealthy].getName());
											System.out.print(" is stressed out\n");
											break;
										}
									break;
								}
									else if(input_eat==4) {
										
										if(healthyStressLevel<=10) {
											System.out.print(""+healthy[inputHealthy].getName());
											System.out.print(" doesn't really like it\n");
											healthy[inputHealthy].eat(food[3]);
											entBack();;
											break;
										}
											else if(healthyStressLevel>10) {
												System.out.print(""+healthy[inputHealthy].getName());
												System.out.print(" is stressed out\n");
												break;
											}
									}
										else if(input_eat==5) {
											
											if(healthyStressLevel<=10) {
												System.out.print(""+healthy[inputHealthy].getName());
												System.out.print(" doesn't really like it\n");
												healthy[inputHealthy].eat(food[4]);
												entBack();;
												break;
											}
												else if(healthyStressLevel>10) {
													System.out.print(""+healthy[inputHealthy].getName());
													System.out.print(" is stressed out\n");
													break;
												}
										}
						break;
				case 2:
						if(input_eat==1) {
							if(unhealthyMuscle>=food[0].muscle) {
								System.out.print(""+unhealthy[inputUnhealthy].getName());
								System.out.print(" loves it\n");
								unhealthy[inputUnhealthy].eat(food[0]);
								entBack();
								break;
							}
								else if(unhealthyMuscle<food[0].muscle) {
									System.out.print(""+unhealthy[inputUnhealthy].getName());
									System.out.print(" is way too unhealthy\n");
									break;
								}
						}
							else if (input_eat==2) {
								if(unhealthyMuscle>=food[1].muscle) {
									System.out.print(""+unhealthy[inputUnhealthy].getName());
									System.out.print(" loves it\n");
									unhealthy[inputUnhealthy].eat(food[1]);
									entBack();
									break;
								}
									else if(unhealthyMuscle<food[1].muscle) {
										System.out.print(""+unhealthy[inputUnhealthy].getName());
										System.out.print(" is way too unhealthy\n");
										break;
									}
							}
								else if(input_eat==3) {
									if(unhealthyMuscle>=food[2].muscle) {
										System.out.print(""+unhealthy[inputUnhealthy].getName());
										System.out.print(" loves it\n");
										unhealthy[inputUnhealthy].eat(food[2]);
										entBack();
										break;
									}
										else if(unhealthyMuscle<food[2].muscle) {
											System.out.print(""+unhealthy[inputUnhealthy].getName());
											System.out.print(" is way too unhealthy\n");
											break;
										}
								}
									else if(input_eat==4) {
										if(unhealthyMuscle>=food[3].muscle) {
											System.out.print(""+unhealthy[inputUnhealthy].getName());
											System.out.print(" loves it\n");
											unhealthy[inputUnhealthy].eat(food[3]);
											entBack();
											break;
										}
											else if(unhealthyMuscle<food[3].muscle) {
												System.out.print(""+unhealthy[inputUnhealthy].getName());
												System.out.print(" is way too unhealthy\n");
												break;
											}
									}
										else if(input_eat==5) {
											if(unhealthyMuscle>=food[4].muscle) {
												System.out.print(""+unhealthy[inputUnhealthy].getName());
												System.out.print(" loves it\n");
												unhealthy[inputUnhealthy].eat(food[4]);
												entBack();
												break;
											}
												else if(unhealthyMuscle<food[4].muscle) {
													System.out.print(""+unhealthy[inputUnhealthy].getName());
													System.out.print(" is way too unhealthy\n");
													break;
												}
										}
						break;
				default:
						System.out.println("Invalid input.");
						break;
			}
			break;
		}
	}
	
	public static void inputExercise() {
		exercise[0] = new Exercise("Plank", 1, 2);
		exercise[1] = new Exercise("Crunch", 2, 3);
		exercise[2] = new Exercise("Squat", 3, 3);
		exercise[3] = new Exercise("Pull up", 2, 2);
		exercise[4] = new Exercise("Comandos", 5, 2);
	}
	
	public static void menuExercise() {
		inputExercise();
		int i, exerciseID=1, input_workout, input_character;
		int healthyFat = healthy[inputHealthy].getFat();
		int unhealthyStressLevel = unhealthy[inputUnhealthy].getStressLevel();
		
		System.out.println("-------------------------------------------");
		System.out.println("\t\tLiving Live");
		System.out.println("-------------------------------------------");
		System.out.println("Exercises");
		System.out.println("---------------");
		for(i=0;i<5;i++) {
			System.out.println("ID: "+exerciseID++);
			System.out.println("Name: "+exercise[i].name);
			System.out.println("Muscle: "+exercise[i].muscle);
			System.out.println("Fat: "+exercise[i].fat);
			System.out.println("---------------");
		}
		System.out.print("Choose your workout: ");
		input_workout=scanner1.nextInt();
		System.out.println("\n1. Healthy");
		System.out.println("2. Unhealthy");
		System.out.print("Choose your character: ");
		input_character=scanner1.nextInt();
		
		for(;;) {
			switch(input_character) {
				case 1:
					if(input_workout==1) {
						if(healthyFat>=exercise[0].fat) {
							System.out.print(""+healthy[inputHealthy].getName());
							System.out.print(" loves it\n");
							healthy[inputHealthy].workout(exercise[0]);
							entBack();
							break;
						}
							else if(healthyFat<exercise[0].fat) {
								System.out.print(""+healthy[inputHealthy].getName());
								System.out.print(" is way too healthy\n");
								entBack();
								break;
							}
						break;
					}
						else if(input_workout==2) {
							if(healthyFat>=exercise[1].fat) {
								System.out.print(""+healthy[inputHealthy].getName());
								System.out.print(" loves it\n");
								healthy[inputHealthy].workout(exercise[1]);
								entBack();
								break;
							}
								else if(healthyFat<exercise[1].fat) {
									System.out.print(""+healthy[inputHealthy].getName());
									System.out.print(" is way too healthy\n");
									entBack();
									break;
								}
						}
							else if(input_workout==3) {
								if(healthyFat>=exercise[2].fat) {
									System.out.print(""+healthy[inputHealthy].getName());
									System.out.print(" loves it\n");
									healthy[inputHealthy].workout(exercise[2]);
									entBack();
									break;
								}
									else if(healthyFat<exercise[2].fat) {
										System.out.print(""+healthy[inputHealthy].getName());
										System.out.print(" is way too healthy\n");
										entBack();
										break;
									}
							}
								else if(input_workout==4) {
									if(healthyFat>=exercise[3].fat) {
										System.out.print(""+healthy[inputHealthy].getName());
										System.out.print(" loves it\n");
										healthy[inputHealthy].workout(exercise[3]);
										entBack();
										break;
									}
										else if(healthyFat<exercise[3].fat) {
											System.out.print(""+healthy[inputHealthy].getName());
											System.out.print(" is way too healthy\n");
											entBack();
											break;
										}
								}
									else if(input_workout==5) {
										if(healthyFat>=exercise[4].fat) {
											System.out.print(""+healthy[inputHealthy].getName());
											System.out.print(" loves it\n");
											healthy[inputHealthy].workout(exercise[4]);
											entBack();
											break;
										}
											else if(healthyFat<exercise[4].fat) {
												System.out.print(""+healthy[inputHealthy].getName());
												System.out.print(" is way too healthy\n");
												entBack();
												break;
											}
									}
						break;
				case 2:
						if(input_workout==1) {
							if(unhealthyStressLevel<=10) {
								System.out.print(""+unhealthy[inputUnhealthy].getName());
								System.out.print(" doesn't really like it\n");
								unhealthy[inputUnhealthy].workout(exercise[0]);
								entBack();
								break;
							}
								else if(unhealthyStressLevel>10) {
									System.out.print(""+unhealthy[inputUnhealthy].getName());
									System.out.print(" is stressed out\n");
									entBack();
									break;
								}
						}
							else if(input_workout==2) {
								if(unhealthyStressLevel<=10) {
									System.out.print(""+unhealthy[inputUnhealthy].getName());
									System.out.print(" doesn't really like it\n");
									unhealthy[inputUnhealthy].workout(exercise[1]);
									entBack();
									break;
								}
									else if(unhealthyStressLevel>10) {
										System.out.print(""+unhealthy[inputUnhealthy].getName());
										System.out.print(" is stressed out\n");
										entBack();
										break;
									}
							}
								else if(input_workout==3) {
									if(unhealthyStressLevel<=10) {
										System.out.print(""+unhealthy[inputUnhealthy].getName());
										System.out.print(" doesn't really like it\n");
										unhealthy[inputUnhealthy].workout(exercise[2]);
										entBack();
										break;
									}
										else if(unhealthyStressLevel>10) {
											System.out.print(""+unhealthy[inputUnhealthy].getName());
											System.out.print(" is stressed out\n");
											entBack();
											break;
										}
								}
									else if(input_workout==4) {
										if(unhealthyStressLevel<=10) {
											System.out.print(""+unhealthy[inputUnhealthy].getName());
											System.out.print(" doesn't really like it\n");
											unhealthy[inputUnhealthy].workout(exercise[3]);
											entBack();
											break;
										}
											else if(unhealthyStressLevel>10) {
												System.out.print(""+unhealthy[inputUnhealthy].getName());
												System.out.print(" is stressed out\n");
												entBack();
												break;
											}
									}
										else if(input_workout==5) {
											if(unhealthyStressLevel<=10) {
												System.out.print(""+unhealthy[inputUnhealthy].getName());
												System.out.print(" doesn't really like it\n");
												unhealthy[inputUnhealthy].workout(exercise[4]);
												entBack();
												break;
											}
												else if(unhealthyStressLevel>10) {
													System.out.print(""+unhealthy[inputUnhealthy].getName());
													System.out.print(" is stressed out\n");
													entBack();
													break;
												}
										}
						break;
				default:
						System.out.println("Invalid input");
						break;
			}
			break;
		}
	}
	
	public static void menuActivities() {
		int input_character,i;
		ArrayList<String> healthyActivities=healthy[inputHealthy].activities;
		ArrayList<String> unhealthyActivities=unhealthy[inputUnhealthy].activities;
		
		System.out.println("-------------------------------------------");
		System.out.println("\t\tLiving Live");
		System.out.println("-------------------------------------------");
		System.out.println("Activities");
		System.out.println("---------------");
		System.out.println("1. Healthy");
		System.out.println("2. Unhealthy");
		System.out.print("Choose your character: ");
		input_character=scanner1.nextInt();
		
		switch(input_character) {
			case 1:	
					System.out.println("Healthy\n");
					for (i=0; i<healthyActivities.size();i++) {
						boolean eatingstr0 = healthyActivities.get(i).contains("Pizza");
						boolean eatingstr1 = healthyActivities.get(i).contains("Risotto");
						boolean eatingstr2 = healthyActivities.get(i).contains("Burger");
						boolean eatingstr3= healthyActivities.get(i).contains("Noodle");
						boolean eatingstr4 = healthyActivities.get(i).contains("Salad");
						if(eatingstr0) {
							System.out.print("Eating: ");
						}
							else if(eatingstr1) {
								System.out.print("Eating: ");
							}
								else if(eatingstr2) {
									System.out.print("Eating: ");
								}
									else if(eatingstr3) {
										System.out.print("Eating: ");
									}
										else if(eatingstr4) {
											System.out.print("Eating: ");
										}
											else {
												System.out.print("Working out: ");
											}
						System.out.println(healthyActivities.get(i));
					}	
					entBack();
					break;
			case 2:
					System.out.println("Unhealthy\n");
					for (i=0; i<unhealthyActivities.size();i++) {
						boolean eatingstr0 = unhealthyActivities.get(i).contains("Pizza");
						boolean eatingstr1 = unhealthyActivities.get(i).contains("Risotto");
						boolean eatingstr2 = unhealthyActivities.get(i).contains("Burger");
						boolean eatingstr3= unhealthyActivities.get(i).contains("Noodle");
						boolean eatingstr4 = unhealthyActivities.get(i).contains("Salad");
						if(eatingstr0) {
							System.out.print("Eating: ");
						}
							else if(eatingstr1) {
								System.out.print("Eating: ");
							}
								else if(eatingstr2) {
									System.out.print("Eating: ");
								}
									else if(eatingstr3) {
										System.out.print("Eating: ");
									}
										else if(eatingstr4) {
											System.out.print("Eating: ");
										}
											else {
												System.out.print("Working out: ");
											}
						System.out.println(unhealthyActivities.get(i));
					}
					entBack();
					break;
			default:
					System.out.println("Invalid input.");
					break;
		}
	}
	
	public static void Credits() {
		System.out.println("-------------------------------------------");
		System.out.println("\t\tLiving Live");
		System.out.println("-------------------------------------------");
		System.out.println("Name: Novia Rahman Nisa");
		System.out.println("NIM: 00000025471");
		entBack();
	}

	public static void main(String[] args) {
		tampilanAwal();
		
		for(;;)	{
			menuUtama();
		}
	}

}
