cmake_minimum_required(VERSION 3.12)
project(algorithm1)

set(CMAKE_CXX_STANDARD 14)

add_executable(InsertionSort InsertionSort.cpp)
add_executable(Merge Merge.cpp)
add_executable(_2751 _2751.cpp STLsort2.cpp HeapSort.cpp CountingSort.cpp _1181.cpp _1431.cpp)
add_executable(STLsort STLsort.cpp)
add_executable(STLsort2 STLsort2.cpp)
add_executable(HeapSort HeapSort.cpp)
add_executable(CountingSort CountingSort.cpp)
add_executable(_1181 _1181.cpp)