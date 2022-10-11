package com.gl.javafsd.traveller;

public class NotesCount {

    public void counting(int[] currency, int amount) {
        int noteqty[] = new int[currency.length];
        int i;
        int sum = 0;
        for (i = 0; i < currency.length; i++) {
            noteqty[i] = amount / currency[i];
            sum = sum + noteqty[i];
            amount = amount % currency[i];
        }
        for (i = 0; i < currency.length; i++) {
            if (noteqty[i] != 0)
                System.out.println(currency[i] + "X" + noteqty[i]);
        }
        System.out.println("total number of notes " + sum);


    }

}