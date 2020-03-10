//
// Created by tkdwl on 2020-03-09.
//
#include <stdio.h>

int number = 10;
int data[] = {2, 5, 10, 1, 4, 7, 6, 9, 3, 8};

void quickSort(int *data, int start, int end) {
    if (start >= end) {
        return;
    }
    int key = start;
    int i = start + 1;
    int j = end;
    int temp;

    while (i <= j) {//엇갈릴때까지 반복
        while (i <= end && data[i] >= data[key]) {
            i++;
        }
        while (j > start && data[j] <= data[key]) {
            j--;
        }
        if (i > j) {// 엇갈림
            temp = data[key];
            data[key] = data[j];
            data[j] = temp;
        } else {
            temp = data[i];
            data[i] = data[j];
            data[j] = temp;
        }
    }
    quickSort(data, start, j - 1);
    quickSort(data, j + 1, end);
}

int main(void) {
    quickSort(data, 0, number - 1);
    for (int i = 0; i < number; i++) {
        printf("%d ", data[i]);
    }
    return 0;
}