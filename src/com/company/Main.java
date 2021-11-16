package com.company;
public class Main {

    public static void main(String[] args) {
      Bird bird = new Bird ();
      Krylya krylya=new Krylya();
      Kluv kluv = new Kluv();

      bird.sit();
      bird.fly();
      bird.eat();
      bird.attack();
          System.out.println("\n");
      krylya.fly();
          System.out.println("\n");
      kluv.eat();
      kluv.attack();
    }}

