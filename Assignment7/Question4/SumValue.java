package Question4;

import java.util.Random;

public class SumValue {
    /*generate array of random numbers*/
    public static void generateRandomArray(int[] arr){
        Random random = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(arr.length);
        }
    }
    /*get sum of an array using 4 threads*/
    public static long sum(int[] arr){
        long sum = 0;
        ThreadSum a = new ThreadSum(arr, 0 ,1000000);
        ThreadSum b = new ThreadSum(arr, 1000000 ,2000000);
        ThreadSum c = new ThreadSum(arr, 2000000 ,3000000);
        ThreadSum d = new ThreadSum(arr, 3000000 ,4000000);
        a.run();
        b.run();
        c.run();
        d.run();
        sum = a.getSum() + b.getSum() + c.getSum() + d.getSum();
        return  sum;
    }

    public static class ThreadSum implements Runnable{
        int[] array;
        int begin, end;
        private long sum = 0;
        ThreadSum(int[] array, int begin, int end){
            this.array = array;
            this.begin = begin;
            this.end = end;
        }
        public void run(){
            for(int i = begin; i < end; i ++){
                sum += array[i];
            }
        }
        public long getSum(){
            return sum;
        }

    }

    public static long testAnswer(int[] array){
        long sum = 0;
        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = new int[4000000];
        generateRandomArray(array);

        long sum = sum(array);
        System.out.println("sum: " + sum);
        long answer = testAnswer(array);
        System.out.println("Answer: " + answer);
    }

}
