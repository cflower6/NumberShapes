package com.cflower6.numbershapes;

class Number{
    int number = 0;

    public boolean isSquare(){
        double squareRootNum = Math.sqrt(number);
        int squareNumWODec = (int) squareRootNum;

        if(squareRootNum - squareNumWODec == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean isTriangular(){
        int x = 1;

        int triangularNumber = 1;

        while (triangularNumber < number){
            x++;

            triangularNumber = triangularNumber + x;
        }

        if(triangularNumber == number){
            return true;
        }else{
            return false;
        }
    }
}
