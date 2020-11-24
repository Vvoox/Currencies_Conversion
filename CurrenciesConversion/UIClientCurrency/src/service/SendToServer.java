package service;

import bean.Currency;

import java.io.*;
import java.net.Socket;

public class SendToServer {

    public static Currency send(Currency currency) throws IOException, ClassNotFoundException {

        Socket socket = new Socket("localhost",7777);

        OutputStream outputStream = socket.getOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(currency);

        InputStream inputStream = socket.getInputStream();
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Currency result = (Currency) objectInputStream.readObject();
        System.out.println(result.toString());

        socket.close();
        return result;

    }

}
