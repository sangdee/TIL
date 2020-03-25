//
// Created by tkdwl on 2020-03-12.
//

#include <iostream>
#include <algorithm>

using namespace std;

string a[20000];
int n;

bool compare(string a, string b) {
    if (a.length() < b.length()) {
        return 1;
    } else if (a.length() > b.length()) {
        return 0;
    } else {
        return a < b; // 사전 순서
    }
}

int main(void) {
    cin >> n ;
    for (int i = 0 ; i  < n ; i ++){
        cin >> a[i];
    }
    sort(a, a + n , compare);
    for (int i = 0 ; i < n ; i ++){
        if(i > 0 &&a[i] == a[i -1 ]) continue;
        cout << a[i] << '\n';
    }
    return 0;
}
