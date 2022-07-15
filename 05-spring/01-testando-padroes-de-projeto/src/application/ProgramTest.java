package application;

import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;
import strategy.AggressiveBehavior;
import strategy.Behavior;
import strategy.DefensiveBehavior;
import strategy.NormalBehavior;
import strategy.Robot;

public class ProgramTest {

	public static void main(String[] args) {
		
		// Singleton
		
		System.out.println("=== SINGLETON TESTS ===");
		
		SingletonLazy lazy = SingletonLazy.getInstance();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstance();
		System.out.println(lazy);
		
		System.out.println();
		
		SingletonEager eager = SingletonEager.getInstance();
		System.out.println(eager);
		eager = SingletonEager.getInstance();
		System.out.println(eager);
		
		System.out.println();
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstance();
		System.out.println(lazyHolder);
		
		System.out.println();
		
		// Strategy
		
		System.out.println("=== STRATEGY TESTS ===");
		
		Behavior defensive = new DefensiveBehavior();
		Behavior normal = new NormalBehavior();		
		Behavior aggressive = new AggressiveBehavior();
		
		Robot robot = new Robot();
		
		robot.setStrategy(normal);		
		robot.move();
		robot.move();
		
		System.out.println();
		
		robot.setStrategy(defensive);
		robot.move();
		
		System.out.println();
		
		robot.setStrategy(aggressive);
		robot.move();
		robot.move();
		robot.move();
	}
}
