package com.designPattern.single;

/**
 * 线程安全, 不能延时加载
 */
public class SingleHungry {
   private static final SingleHungry INSTANCE = new SingleHungry();

   private SingleHungry(){

   }

   public static SingleHungry getInstance(){
       return INSTANCE;
   }
}
