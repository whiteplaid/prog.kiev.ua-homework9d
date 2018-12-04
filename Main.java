package com.homework.cola;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		Queue <String> queue= new ArrayDeque<>();
		queue.add("Sheldon");
		queue.add("Leonard");
		queue.add("Wolowitz");
		queue.add("Koothrappali");
		queue.add("Penny");
		for (int i = 0; i < 12; i++) {
			String name = queue.poll();
			queue.add(name);
			queue.add(name);
		}
		System.out.println(queue);
	}

}
