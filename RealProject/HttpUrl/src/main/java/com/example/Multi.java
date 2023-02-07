package com.example;

import org.springframework.boot.autoconfigure.amqp.RabbitProperties;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Author: Alisher Odilov
 * Date: 26.01.2023
 */
public class Multi {



    public static void main(String[] args) {

        try {
            URL  url = new URL("https://pieraksts.mfa.gov.lv/en/uzbekistan/step3");
            URLConnection connection= url.openConnection();
            InputStream stream=connection.getInputStream();
            System.out.println(url.getAuthority());
            System.out.println(url.getDefaultPort());
            System.out.println(url.getPort());
            System.out.println(url.getHost());


            int i;
            while ((i= stream.read())!=-1){

            }

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
