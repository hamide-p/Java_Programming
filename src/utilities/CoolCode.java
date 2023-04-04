package utilities;

public class CoolCode {

    public static double convertFromDollar(String currency, double dollars){
        double result = dollars;
        switch (currency.toLowerCase().trim()){
            case "euro":
                result = dollars * 0.91;
                break;
            // instead: return dollars * 0.91;
            case "yen":
                result = dollars * 121.03;
                break;
            case "lira":
                result = dollars * 14.85;
                break;
            case "won":
                result = dollars * 1_217.52;
                break;
            case "rupee":
                result = dollars * 181.45;
                break;
        }

        return result;
    }






}
