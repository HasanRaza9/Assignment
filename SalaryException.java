import java.util.Scanner;

/*
if salary < 2100  then return custom exception message as "you need to work hard"
        if salary is between 2100 and 5000 then return custom exception message as "your salary is somehow good"
        if salary is between 5100 and 9000 then return custom exception message as "salary is very good"
        Design the custom exception class in this and take salary from the user.*/
public class SalaryException {

      public void validateSalary(int salary) throws InvalidSalaryException{
          if(salary < 2100){
              System.out.println("you need to work hard");
          }else if(salary >= 2100 && salary <= 5000){
              System.out.println("your salary is somehow good");
          }else if(salary > 5100 && salary <= 9000){
              System.out.println("salary is very good");
          }else {
              throw new InvalidSalaryException("Invalid salary");
          }
      }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter salary: ");
        int salary = sc.nextInt();
        SalaryException salaryException = new SalaryException();
        try {
            salaryException.validateSalary(salary);
        }catch (Exception m){
            System.out.println("Exception occured : "+m.getMessage());
        }
        }
}

class InvalidSalaryException extends Exception{
    InvalidSalaryException(String message){
        super(message);
    }
}