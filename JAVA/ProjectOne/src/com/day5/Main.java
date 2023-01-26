package com.day5;

class Shapes{
 public void area(Circle circle) {
	System.out.println("The circle Area is  :  " +(3.14 * circle.radius * circle.radius));
 }
 public void area(Rectangle rectangle) {
	 System.out.println("The Rectangle Area is : " +(2* rectangle.length * rectangle.breadth));
 }
 public void area(Square square) {
	 System.out.println("The Square Area is : " +(square.side * square.side));
 }
 

}

class Circle{
	int radius=10;
}

class Rectangle{
	int length=2;
	int breadth=8;
}

class Square{
	int side=8;
}




public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes s=new Shapes();
		
		
		s.area(new Circle());
		s.area(new Rectangle());
		s.area(new Square());

	}

}

//STATIC POLYMORPHISM
/*
 * 1. Static polymorphism is also called compile time polymorphism
 * 2. In Static polymorphism method overloading takes place
 * 3. Method overloading means a method with same name but different arguments
 * 4. here area is a overloaded method for 3 objects
 * while first method accepts circle object as parameter 
 * or other 2 possibilities or 
 *    1. it childclass object
 *    2. null value
 * here it we passing its own object
 * the second area method is accepting rectangle object
 * the third are method accepts square object 
 * it will excute with their respective objects
 * 5. there is a chance for compiler ambugity that if we send null value 
 * all the  methods are eligible to excute. then compile time error arise
 * 
 *
 * 
 */
