//
// Created by tkdwl on 2020-03-09.
//

#include <stdio.h>

int main(void) {
    int i, min, index, temp;
    int array[10] = {2, 5, 10, 1, 4, 7, 6, 9, 3, 8};
    for (int i = 0; i < 10; i++) {
        min = 100;
        for (int j = i; j < 10; j++) {
            if (min > array[j]) {
                min = array[j];
                index = j;
            }
        }
        temp = array[i];
        array[i] = array[index];
        array[index] = temp;
    }
    for (i = 0; i < 10; i++) {
        printf("%d", array[i]);
    }
    return 0;
}

