//
// Created by tkdwl on 2020-01-07.
//

#include <stdio.h>

int euclid(int u, int v){
    int t;
    while (u){
        if(v > u ){
            t = u; u = v; v = t;
        }
        u = u - v ;
    }
    return v;
}

int main(){


    printf("%d",euclid(250,30));
    return 0;
}