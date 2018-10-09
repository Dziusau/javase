//Task 1
class Task1 {
    public static void main(String[] args1) {
        int Number = 567;
        System.out.println(Number);
        int GetUnits = Number % 10;
        int GetHundreds = Number / 100;
        int GetDozens = (Number % 100 - GetUnits) / 10;
        System.out.println("Hundreds :  " + GetHundreds + " Dozens : " + GetDozens + " Units : " + GetUnits);
    }
}
//Task 2
class Task2 {
    public static void main(String[] args2){
        double TemperatureInCelsius = 36.6;
        double TemperatureInKelvin = TemperatureInCelsius + 273.15;
        double TemperatureInFahrenheit = TemperatureInCelsius * 1.8 + 32;
        System.out.println("Celsius : " + TemperatureInCelsius + "\nKelvin : " + TemperatureInKelvin + "\nFahrenheit : " + TemperatureInFahrenheit);
    }
}
//Task 3
class Task3 {
    public static void main(String[] args3){
        System.out.println("Equation : y = 1 * 4^2 + 2 * 4 + 3\n");
        int a = 1;
        int b = 2;
        int c = 3;
        int x = 4;
        double y = a * x * x + b * x + c;
        System.out.println("Value of equqtion : " + y);
    }
}
//Task 4
class Task4 {
    public static void main(String[] args4){
        int encoderDegrees = 2880;
        int tireRadious = 55;
        double countOfTurnes = encoderDegrees / 360;
        System.out.println("The encoder degrees : " + encoderDegrees + "\nThe radious : " + tireRadious);
        double distance = countOfTurnes * 2 * 3.14 * tireRadious;
        System.out.println("The distance : " + distance);
    }
}
//Task 5
class Task5 {
    public static void main(String[] args5){
        int playingTimeInSeconds = 86399;
        System.out.println("Playing time in seconds : " + playingTimeInSeconds);
        int countHours = playingTimeInSeconds / 3600;
        int countSeconds = playingTimeInSeconds % 60;
        int countMinutes = (playingTimeInSeconds - countHours * 3600 - countSeconds) / 60;
        System.out.println("Playing time : " + countHours + ":" + countMinutes + ":" + countSeconds);
    }
}