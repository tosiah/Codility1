package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        int[] A = {2,3,6,2,8};
        int[] B = {1,2,3,4,5,6,7,9};
        int[] C = {-100, 200, 300, 0, 8};
        int[] D = {10, -90, -60, -10, -20};
        int[] E = {100, -100, 100, 1, -50};
        int result = solution(C);
        System.out.println(result);
    }
    static int solution(int[] A){
        int solution;
        int total = 0;
        if(A.length==2){
             solution = A[0]-A[1];
             if(solution<0){
                 solution=-solution;
             }
            return solution;
        }
        for(int i=0; i<A.length; i++){
            total+=A[i];
        }

        System.out.println(total);

        int subChain1 = 0;
        int subChain2 = 0;
        int subChain3 =0;

        if(total>=0) {
            for (int i = 0; i < A.length - 1; i++) {
                if (subChain1 < total / 2) {
                    subChain1 += A[i];
                } else {
                    subChain2 = subChain1 - A[i-1];
                    subChain3 = subChain1 + A[i];
                    break;
                }

            }
        }

        else if(total<0) {
            for (int i = 0; i < A.length - 1; i++) {
                if (subChain1 > total / 2) {
                    subChain1 += A[i];
                } else {
                    subChain2 = subChain1 - A[i-1];
                    subChain3 = subChain1 + A[i];
                    break;
                }
            }
        }

        System.out.println(subChain1 + ", " + subChain2 + ", " + subChain3);


        int var1a = total - subChain1;
        int var2a = subChain1;
        int differenceA = var1a - var2a;

        if(differenceA<0){
            differenceA=-differenceA;
        }

        System.out.println(differenceA);

        int var1b = total - subChain2;
        int var2b = subChain2;
        int differenceB = var1b - var2b;

        if(differenceB<0){
            differenceB=-differenceB;
        }

        System.out.println(differenceB);

        int var1c = total - subChain3;
        int var2c = subChain3;
        int differenceC = var1c - var2c;

        if(differenceC<0){
            differenceC=-differenceC;
        }

        System.out.println(differenceA);

        if(differenceA>differenceB){
            solution = differenceB;
        }
        else {
            solution = differenceA;
        }

        if(differenceA>differenceC){
            solution = differenceC;
        }

        return  solution;

    }

}



