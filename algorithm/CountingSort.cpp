//
// Created by tkdwl on 2020-03-12.
//
#include <stdio.h>

int main(void) {
    int temp;
    int count[5];
    int array[30] =
            {1, 3, 2, 4, 5, 1, 2, 3, 5, 4,
             2, 3, 1, 5, 6, 3, 4, 5, 3, 2,
             2, 2, 4, 5, 3, 1, 2, 3, 4, 5};
    for (int i = 0; i < 5; i++) {
        count[i] = 0;
    }
    for (int i = 0; i < 30; i++) {
        count[array[i] - 1]++;
    }
    for (int i = 0; i < 5; i++) {
        if (count[0] != 0 ){
            for (int j = 0 ; j < count[i] ; j ++){
                printf("%d ", i + 1);
            }
        }
    }
}
