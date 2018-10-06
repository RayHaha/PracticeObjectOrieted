
class Student{
	public String name;
	public int score;
	// 加入建構子 也可以不用
	Student(String s, int n){
		name = s;
		score = n;
	}
	public String getName(){
		return name;
	}
	public void setName(String s){
		name = s;
	}
	
}

class Car{
	public String color;
	public String plate;
	public String brand;
}

class Taxi extends Car{
	public String driver;
}

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student Peter = new Student("Peter",90);
//		Peter.setName("Peter");  // 如果不用建構子就要這樣設定
//		Peter.score = 90;
		
		System.out.println(Peter.name);
		System.out.println(Peter.score);
		
		// 測試繼承
		Taxi taxi = new Taxi();
		taxi.color = "red";
		taxi.driver = "Hey";
		System.out.println(taxi.color);
		System.out.println(taxi.driver);
		
	}

}
