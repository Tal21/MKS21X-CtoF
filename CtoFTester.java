class CtoFTester{
public static double celsiusToFahrenheit(double x){
  double result = (1.8 * x) + 32;
  return result;
}

public static double fahrenheitToCelsius(double y){
  double result =(y - 32.0) * (5.0/9.0);
  return result;
}

public static void main(String[] args){
  System.out.println(celsiusToFahrenheit(39.0));
  System.out.println(fahrenheitToCelsius(102.2));
}
}
