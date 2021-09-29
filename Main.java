class Main {
  public static void main(String[] args) {

    int num = 9;
    int grade = 50;
    String letter = "F";

    if (num < 10) {
      System.out.println("Its less than 10");
      if (num == 4)
        System.out.println("Thats my favorite number");
      else
        System.out.println("You didn't find my favorite number");
    } else {
      System.out.println("It is greater than 10");
      System.out.println("Will this line run?");
    }


    if(grade >= 90)
     letter= "A";
    else if (grade >= 80)
    letter ="B";
    else if (grade >= 70)
    letter ="C";
    else if (grade >= 60)
    letter ="D";
    else
    letter = "F";

    System.out.println("Your grade is: "+letter);
  }
}