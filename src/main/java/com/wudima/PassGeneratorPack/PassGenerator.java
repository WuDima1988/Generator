package com.wudima.PassGeneratorPack;

import java.io.ByteArrayOutputStream;

public class PassGenerator {

    public static ByteArrayOutputStream getPassword(int length)  {

        ByteArrayOutputStream is = new ByteArrayOutputStream();

        // створюємо массив об'єктів Basket(це клас який в собі зберігає групу символів які беруть участь в генераціїї паролю)
        Basket[] baskets = new Basket[6];
        baskets[0] = new Basket('0', '9');
        baskets[1] = new Basket('a', 'z');
        baskets[2] = new Basket('A', 'Z');
        baskets[3] = new Basket('!','/');
        baskets[4] = new Basket(':','@');
        baskets[5] = new Basket('[','\'');

        // індекс рахунку довжини
        int i = 0;

        //ствоюємо перші 4 елементи
        for (; i < 3; i++) {
            //рандомне визначення індексу виключно [0,3) для массиву Basket
            int index = (int) (Math.random() * 6);
            generateChar(is, baskets, index);
        }

        // створюємо наступні 3 елемнти
        for (int j = 0; j < 3; j++) {
            generateChar(is, baskets, j);
            i++;
        }
        // стврюємо 1 елемент
        while (i < length) {
            //рандомне визначення індексу виключно [0,3) для массиву Basket
            int index = (int) (Math.random() * 6);
            generateChar(is, baskets, index);
            i++;
        }
        return is;
    }

    private static void generateChar(ByteArrayOutputStream is, Basket[] baskets, int index) {
        Basket basket = baskets[index];
        //записуємо в stream та перетворюємо int в char
        is.write((char) basket.getRandom());
    }

    public static class Basket {
        // тут буде зберігається int-ове значення char та кількість елементів
        int begin;
        int quantity;

        private Basket(char begin, char end) {
            // запис значення char в int
            this.begin = begin;
            //елемент формули для знаходження рандомного числа включно (b-a+1)
            this.quantity = end - begin + 1;
        }

        public int getRandom() {
            // визначення рандомного цілого числа int
            return (int) (Math.random() * quantity) + begin;
        }
    }
}
