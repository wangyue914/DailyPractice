package com.designpattern;

/**
 * Created by Yue on 2017/6/1 0001.
 */
public class Factory {
    public static interface Human{
        public void eat();
        public void sleep();
        public void beat();
    }
    public static class Male implements Human{
        @Override
        public void eat(){
            System.out.println("Male can eat");
        }
        public void sleep(){
            System.out.println("Male can sleep");
        }
        public void beat(){
            System.out.println("Male can beat");
        }
    }
    public static class Female implements Human{
        @Override
        public void eat(){
            System.out.println("Female can eat");
        }
        public void sleep(){
            System.out.println("Female can sleep");
        }
        public void beat(){
            System.out.println("Female can beat");
        }
    }
    public  static class HumanFactory{
        public Male createMale(){
            return new Male();
        }
        public Female createFemale(){
            return new Female();
        }
        /*
        可以将创建方法设置为静态的，这样就不需要实例化工厂而可以直接调用
        public static Male createMale(){
            return new Male();
        }
        public static Female createFemale(){
            return new Female();
        }
        */

    }

    public static void main(String[] args) {
        HumanFactory factory=new HumanFactory();
        Male male=factory.createMale();

    }
}
