//
// Created by tkdwl on 2020-03-10.
//

#include <stdio.h>

int arr[1000001];

void quickSort(int *arr, int start, int end) {
    if (start >= end) {
        return;
    }

    int key = start;
    int i = key + 1;
    int j = end;
    int temp;

    while (i <= j) {
        while (i <= end && arr[i] < arr[key]) {
            i++;
        }
        while (j > start && arr[j] > arr[key]) {
            j--;
        }
        if (i > j) {
            temp = arr[key];
            arr[key] = arr[j];
            arr[j] = temp;
        } else {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    quickSort(arr, start, j - 1);
    quickSort(arr, j + 1, end);

}

int main(void) {
    int num;
    scanf("%d", &num);
    for (int k = 0; k < num; k++) {
        scanf("%d", &arr[k]);
    }
    quickSort(arr, 0, num - 1);
    for (int i = 0; i < num; i++) {
        printf("%d\n", arr[i]);
    }
    return 0;
}
