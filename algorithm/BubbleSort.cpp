//
// Created by tkdwl on 2020-03-09.
//
#include <stdio.h>

int main(void) {

    int i, j, temp;
    int array[10] = {2, 5, 10, 1, 4, 7, 6, 9, 3, 8};
    for (i = 0; i < 10; i++) {
        for (int j = 0; j < 9 - i; j++) {
            if (array[j] > array[j + 1]) {
                temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
    }
    for (int i = 0; i < 10; i++) {
        printf("%d", array[i]);
    }
    return 0;
}