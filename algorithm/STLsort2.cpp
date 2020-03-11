//
// Created by tkdwl on 2020-03-11.
//
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

bool compare(pair<string, pair<int, int>> a,
             pair<string, pair<int, int>> b) {
    if(a.second.first == b.second.first){
        return a.second.second > b.second.second;
    } else{
        return a.second.first < b.second.first;
    }
}

int main(void) {
    vector<pair<string, pair<int, int>>> v;
    v.push_back(pair<string, pair<int, int>>(" A ", pair<int, int>(90, 1996)));
    v.push_back(pair<string, pair<int, int>>(" B ", pair<int, int>(95, 1993)));
    v.push_back(pair<string, pair<int, int>>(" D ", pair<int, int>(90, 1992)));
    v.push_back(pair<string, pair<int, int>>(" E ", pair<int, int>(92, 1995)));
    v.push_back(pair<string, pair<int, int>>(" F ", pair<int, int>(88, 1999)));

    sort(v.begin(), v.end(), compare);
    for (int i = 0; i < v.size(); i++) {
        cout << v[i].first << ' ';

    }
}
