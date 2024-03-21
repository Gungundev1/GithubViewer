import java.util.Scanner;
class Convertor{
    double celcius;
    double fehrenheit;
    double kelvin;
    Scanner scanner=new Scanner(System.in);
    void celciusconvertor(){
        System.out.println("Enter temperature(in celcius):");
        celcius=scanner.nextDouble();
        fehrenheit= celcius * (9/5)+32;
        System.out.println("Temperature in fehrenheit is = "+fehrenheit+"F");
        kelvin=celcius+273.15;
        System.out.println("Temperature in kelvin is="+kelvin+"K");
    }
    void fehrenheitConverter(){
        System.out.println("Enter temperature(in fehrenheit):");
        fehrenheit= scanner.nextDouble();
        celcius=(fehrenheit-32)*5/9;
        System.out.println("Temperature in celcius is ="+celcius+"C");
        kelvin=(fehrenheit-32)*5/9+273.15;
        System.out.println("Temperture in kelvin is ="+kelvin+"K");
    }
    void kelvinConverter(){
        System.out.println("Enter tenperature(in kelvin)");
        kelvin= scanner.nextDouble();
        celcius=kelvin-273.15;
        System.out.println("Temperature in celcius is ="+celcius+"C");
        fehrenheit=(kelvin-273.15)*9/5+32;
        System.out.println("Temperature in fehrenheit is ="+fehrenheit+"F");
    }
}
public class TemperatureConverter {
    public static void main(String args[]) {
        Convertor obj = new Convertor();
        System.out.println("What temperature do you want to give:" +
                "celcius,kelvin,fehrenheit");
        Scanner scanner = new Scanner(System.in);
        String temperature = scanner.nextLine().toLowerCase();
        switch (temperature){
            case "celcius":  obj.celciusconvertor();  break;
            case "kelvin": obj.kelvinConverter(); break;
            case "fehrenheit": obj.fehrenheitConverter();break;
        }

    }
}

