package com.trylabs;

import java.util.Random;


public class Main {

    public static void main(String[] args) {
        int biblio[]=new int[35];//количество отделов в библиотеке
        Random random=new Random();
for (int i=0;i<biblio.length;i++)
      {
        biblio[i]= random.nextInt(60000);
      }
     int sumBooks=0;
        for (int a: biblio){
            sumBooks+=a;

      }
      if ((sumBooks>=100000)&&(sumBooks<=999999)) System.out.println("Общее количество книг в библиотеке-шестизначное число "+sumBooks);
       else  System.out.println("Сумма книг в библиотеке не шестизначное число:"+sumBooks);
    }
}
