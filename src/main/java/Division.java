public class Division {

    static int threeFiveSum(int number){
        int output = 0;
        for(int i=1; i<number; i++){
            if(i % 3 == 0 || i % 5 ==0){
                //System.out.println(i);
                output += i;
            }

        }
        return output;
    }

}
