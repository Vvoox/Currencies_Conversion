package service;

import java.text.DecimalFormat;

public class CurrencyCnv {

    public static String conversion(String currencyFrom , String currencyTo,double qtt){
        double result=0.0;
        System.out.println("ksjndvhn");
        DecimalFormat f = new DecimalFormat("##.###");
        switch (currencyFrom){
            case "MAD" :{
                switch (currencyTo){
                    case "USD":result =qtt* 0.11;break;
                    case "EURO":result =qtt* 0.09;break;
                    case "GBP":result =qtt* 0.08;break;
                    case "YEN":result =qtt* 11.37;break;
                }
                break;
            }
            case "USD" :{
                switch (currencyTo){
                    case "MAD":result =qtt* 9.12;break;
                    case "EURO":result =qtt* 0.92;break;
                    case "GBP":result =qtt* 0.67;break;
                    case "YEN":result =qtt* 120.90;break;
                }
                break;
            }
            case "EURO" :{
                switch (currencyTo){
                    case "MAD":result =qtt* 10.86;break;
                    case "USD":result =qtt* 1.09;break;
                    case "GBP":result =qtt* 0.73;break;
                    case "YEN":result =qtt* 131.84;break;
                }
                break;
            }
            case "GBP" :{
                switch (currencyTo){
                    case "MAD":result =qtt* 12.20;break;
                    case "USD":result =qtt* 1.49;break;
                    case "EURO":result =qtt* 1.36;break;
                    case "YEN":result =qtt* 179.89;break;
                }
                break;
            }
            case "YEN" :{
                switch (currencyTo){
                    case "MAD":result =qtt* 0.09;break;
                    case "USD":result =qtt* 0.01;break;
                    case "EURO":result =qtt* 0.01;break;
                    case "GBP":result =qtt* 0.01;break;
                }
                break;
            }
        }


        return f.format(result);

    }
}
