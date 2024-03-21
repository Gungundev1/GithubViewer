import java.util.Scanner;
class CalculateBMI {
    public double bmi;
    public String name;
    public String getName() {
//        this.name = name;
        return name;
    }
    public void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter ur name:");
        name = scanner.nextLine();
        System.out.println(getName() + " Enter your weight(in kg):");
        double weight = scanner.nextDouble();
        System.out.println(getName() + " Enter your height(in inches):");
        double height = scanner.nextDouble();
        bmi = 703 * (weight / (height * height));
        System.out.println(getName() + " ,your BMI is:" + bmi);
        scanner.close();
    }
    public void bmiStatus() {
//        this.name = name;
        if (bmi < 18.5) {
            System.out.println(getName() + " ,You are underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println(getName() + " ,You have a normal weight");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println(getName() + " ,You are overweight");
        } else {
            System.out.println(getName() + " ,You are obesity");
        }
    }
}
public class BMICalculator {
    public static void main(String[] args) {
        CalculateBMI info = new CalculateBMI();
        info.calculate();
        info.bmiStatus();
    }
}
