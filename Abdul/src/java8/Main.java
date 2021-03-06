package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*from www .  ja va  2 s  . co  m*/
public class Main {
	public static void main(String... args) {
		Map<Type, Double> o = Food.menu.stream()
				.collect(Collectors.groupingBy(Food::getType, Collectors.summingDouble(Food::getCalories)));

		System.out.println(o);

	}
}

enum Type {
	MEAT, FISH, OTHER
}

class Food {

	private final String name;
	private final boolean vegetarian;
	private final int calories;
	private final Type type;

	public Food(String name, boolean vegetarian, int calories, Type type) {
		this.name = name;
		this.vegetarian = vegetarian;
		this.calories = calories;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public int getCalories() {
		return calories;
	}

	public Type getType() {
		return type;
	}

	@Override
	public String toString() {
		return name;
	}

	public static final List<Food> menu = Arrays.asList(new Food("pork", false, 1800, Type.MEAT),
			new Food("beef", false, 7100, Type.MEAT), new Food("chicken", false, 1400, Type.MEAT),
			new Food("french fries", true, 1530, Type.OTHER), new Food("rice", true, 3510, Type.OTHER),
			new Food("season fruit", true, 1120, Type.OTHER), new Food("pizza", true, 5150, Type.OTHER),
			new Food("prawns", false, 1400, Type.FISH), new Food("salmon", false, 4150, Type.FISH),
			new Food("beef", false, 0, Type.MEAT), new Food("chicken", false, 200, Type.MEAT));
}