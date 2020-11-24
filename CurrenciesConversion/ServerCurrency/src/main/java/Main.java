import bean.Currency;
import service.CurrencyCnv;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

import java.text.DecimalFormat;

class CurrencyConverter {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket ss = new ServerSocket(7777);
        System.out.println("Server Started");

        while (true){
            Socket socket = ss.accept();
            InputStream inputStream = socket.getInputStream();
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

            Currency currency = (Currency) objectInputStream.readObject();

            System.out.println("Object received");
            System.out.println(currency.toString());
            String result ="";
            if(currency.getCurrencyForm().equals(currency.getCurrencyTo())){
                result=Double.toString(currency.getQuantity());
            }
            else {
                result = CurrencyCnv.conversion(currency.getCurrencyForm(),
                        currency.getCurrencyTo(),currency.getQuantity());
            }

            currency.setResult(result);
            OutputStream outputStream = socket.getOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(currency);
        }

//        System.out.println(CurrencyCnv.conversion("USD","MAD",11));


    }


}
