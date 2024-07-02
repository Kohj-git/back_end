public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //변수 선언
        int a = 0;
        double b = 0.0;
        String c = "";
        boolean d = false;

        int a1 = 3;
        a1 = 3 + a;
        //사칙연산 + 나머지값
        //+ - * / %

        a1 += 1;
        // => a1 = a1 + 1;
        a1 -= 1;
        // => a1 = a1 - 1;

        a1++;
        --a1;
        a1--;

        a1 = 7;
        System.out.println(a1++); // 7
        System.out.println(++a1); // 9

        if(!(a == 1) ==  false){
        }
        // == != > < >= <=
        // && and || or ! not

        double b1 = (double) a1;

        a = 4;
        if(a>0){
            //1
        } else if(a > 3){
            //2
        } else {
            //3
        }

        if(a>1){
            System.out.println(++a);
        }

        switch(a1){
            case 1:
            {
                //
            } break;
            default:{

            } break;
        }

        while(true){
            break;
        }

        int[] arrayA = {1,2,3};
        for(int i=0;i<arrayA.length;i++){
            int each = arrayA[i];
            //
        }
        for(int each : arrayA){

        }

        String aaaaaa = "111";
        int aaa = 11;
        Integer aaaA = aaa;
        double bbbb;
        Double bbbbB;
        boolean ccc;
        Boolean cccC;

        int a123 = 0;
        try{
            a123 = Integer.parseInt("100aaaa");
        } catch (Exception e){

        }

        int[] numbers = new int[6];
        String[] strings = new String[6];
        Object[] objects = new Object[6];

        Car aCar = new Car();
        Car bCar = new Car(10, "red", 150000);
        int aCarSpeed = aCar.getSpeed();
        System.out.println("aCarSpeed : " + aCarSpeed);
        aCar.setSpeed(100);
        System.out.println("aCarSpeed : " + aCar.getSpeed());
        aCar = null;
        //System.out.println("aCarSpeed : " + aCar.speed);
        //System.out.println("aCar : " + aCar.toString());
        System.out.println("bCarSpeed : " + bCar.getSpeed());
        bCar.speedUp(10);
        System.out.println("bCarSpeed : " + bCar.getSpeed());

        Integer integerA;
        // 0 or null

        String stringA = "11";
        String stringB = "21";
        if("11".equals(stringA)){

        }
        if(stringA.equals("aa")){

        }

    }
}