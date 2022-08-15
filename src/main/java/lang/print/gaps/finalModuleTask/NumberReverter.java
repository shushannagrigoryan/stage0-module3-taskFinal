package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int temp = 0;
        int new_number = 0;
        //int t1 = 1;

        while(number != 0){
            temp = number%10;
            new_number = new_number * 10 + temp;
            number/= 10;
            //t1*=10;
        }
        System.out.println(new_number);

    }
}
