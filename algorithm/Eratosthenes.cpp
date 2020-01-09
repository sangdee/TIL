#include <cstdio>
#include <cmath>

int n = 1000;
int arr[1001];
int i, j, limit;

void initialize() {
    for (i = 2; i < n + 1; i++) {
        arr[i] = 0;
    }
}

void print() {
    for (i = 2; i < n + 1; i++) {
        if (arr[i] == 0)printf("%d ", i);
    }
}

int main() {
    initialize();
    limit = (int) sqrt(n);
    for (i = 2; i < limit; i++) {
        if (arr[i] == 1) continue;
        for (j = i + i; j < n + 1; j += i) {
            arr[j] = 1;
        }
    }

    print();
    return 0;
}