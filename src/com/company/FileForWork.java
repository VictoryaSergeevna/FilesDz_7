package com.company;

import java.io.*;
import java.util.*;

public class FileForWork {
static String path="part.txt";


    public static void input() throws IOException {

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        FileReader reader = new FileReader(path);
        String str="";
        int count;
        while((count=reader.read())!=-1){
            str+=(char)count;
        }
        String answer;
        do {
            System.out.println("Введите слово: ");
            answer = buff.readLine();
            if(answer.equals("stop"))break;
            if(answer.matches("[a-zA-Z ]+$")) {
                String [] separated = str.split(" ");
                System.out.println(Arrays.toString(separated));

                if (answer.equals("latn"))
                {
                    for(String value : separated)
                    {
                        if(value.matches("[a-zA-Z ]+$") )
                            System.out.println(value);
                    }
                    continue;

                }
                String result="";
                for(String value : separated){
                    if(value.equals(answer))
                        result=answer;
                }

                System.out.println(result!=""?result:"Нет совпадений!");

            }
            else{
                System.out.println("Некоретный ввод!");
            }

        }while (!answer.equals("stop"));



    }

}
