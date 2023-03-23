package com.platzi.functional._10_chaining.ejm;

public class Chaining {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hola")
                .append("alumno")
                .append("de")
                .append("Platzi");

        Chainer chainer = new Chainer();

        Chainer chainer1 = chainer.sayBye();
        Chainer chainer2 = chainer1.sayHi().sayHi().sayHi();

        chainer2.sayHi();

        chainer.sayBye().sayHi();
    }

    static class Chainer {
        public Chainer sayHi(){
            System.out.println("Hola");
            return this;
        }

        public Chainer sayBye(){
            System.out.println("Bye");
            return this;
        }
    }
}
