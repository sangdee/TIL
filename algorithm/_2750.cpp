//
// Created by tkdwl on 2020-03-10.
//
#include <stdio.h>

int arr[1001];

int main(void) {
    int number, i, j, temp;
    scanf("%d", &number);
    for (int i = 0; i < number; i++) {
        scanf("%d", &arr[i]);

    }
    for (int i = 0; i < number - 1; i++) {
        j = i;
        while (j >= 0 && arr[j] > arr[j + 1]) {
            temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
            j--;
        }
    }
    for (int i = 0; i < number; i++) {
        printf("%d\n",arr[i]);
    }
    return 0;
}
