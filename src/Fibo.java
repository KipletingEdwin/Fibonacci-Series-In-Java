public class Fibo {

  public void myFibonnachi(){

      int numbers = 10;
      int firstNumber = 0;
      int secondNumber = 1;
      int thirdNumber;

      for (int i = 0; i < numbers; i++) {
          thirdNumber = secondNumber + firstNumber;
          System.out.println(thirdNumber);

          firstNumber = secondNumber;
          secondNumber = thirdNumber;

      }
  }

}
