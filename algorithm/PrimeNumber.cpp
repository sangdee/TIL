//
// Created by tkdwl on 2020-01-08.
//

#include <stdio.h>
#include <math.h>
int prime1(int n){

    for (int i = 2; i <n ; i++) {
        if( n % i == 0){
            return false;
        }
    }
    return true;
}

int prime2(int n){

    int root = (int)sqrt(n);

    for (int i = 2; i < root; i++) {
        if ( n % i == 0){
            return false;
        }
    }
    return true;

}

int main(){
    printf("%d\n",prime1(11));
    printf("%d",prime2(22));
    return 0;
}