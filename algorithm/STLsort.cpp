//
// Created by tkdwl on 2020-03-11.
//

#include <iostream>
#include <algorithm>

using namespace std;

class Student {
public:

    string name;
    int score;

    Student(string name, int score) {
        this->name = name;
        this->score = score;
    }

    bool operator<(Student &student) {
        return this->score < student.score;
    }
};

int main(void) {
    Student students[] = {
            Student("a", 90),
            Student("b", 94),
            Student("c", 89),
            Student("d", 68),
            Student("e", 99),
    };
    sort(students, students + 5);
    for (int i = 0; i < 5; i++) {
        cout << students[i].name << ' ';
    }
}


//
//bool compare(int a, int b) {
//    return a > b;
//}
//
//int main(void) {
//    int a[10] = {9, 3, 5, 4, 1, 10, 8, 7, 6, 2};
//    std::sort(a, a + 10,compare);
//    for (int i = 0; i < 10; i++) {
//        cout << a[i] << ' ';
//
//    }
//
//}