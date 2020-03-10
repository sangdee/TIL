//
// Created by tkdwl on 2020-03-10.
//
#include <stdio.h>

int arr[3];

int main(void) {
    int  i, j, temp;

    for (int i = 0; i < 3; i++) {
        scanf("%d", &arr[i]);

    }
    for (int i = 0; i < 2; i++) {
        j = i;
        while (j >= 0 && arr[j] > arr[j + 1]) {
            temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
            j--;
        }
    }
    for (int i = 0; i < 3; i++) {
        printf("%d ",arr[i]);
    }
    return 0;
}
