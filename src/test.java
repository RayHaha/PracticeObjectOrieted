
class Student{
	public String name;
	public int score;
	// �[�J�غc�l �]�i�H����
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
//		Peter.setName("Peter");  // �p�G���Ϋغc�l�N�n�o�˳]�w
//		Peter.score = 90;
		
		System.out.println(Peter.name);
		System.out.println(Peter.score);
		
		// �����~��
		Taxi taxi = new Taxi();
		taxi.color = "red";
		taxi.driver = "Hey";
		System.out.println(taxi.color);
		System.out.println(taxi.driver);
		
	}

}
