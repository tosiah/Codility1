package com.timbuchalka;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] A = {2,3,6,2,8};
        int[] B = {1,2,3,4,5,6,7,9};
        int[] C = {-100, 200, 300, 0, 8};
        int[] D = {10, -90, -60, -10, -20};
        int[] E = {100, -100, 100, 2, -50};
        int[] F = {-1, 0, -2, 5, 0, 1};
        int result = solution(E);
        System.out.println(result);
    }
    static int solution(int[] C){
        int solution = 1;
        boolean flag = true;

        Arrays.sort(C);

        for(int i=1; i<=C.length; i++){
            flag=true;
            for(int j=0; j<C.length; j++){
                if(C[j]==i){
                    flag=false;
                    break;
                }
            }
            if(flag) {
                solution = i;
                break;
            }
        }
        return solution;
    }

}



