cmake_minimum_required(VERSION 3.12)
project(algorithm1)

set(CMAKE_CXX_STANDARD 14)

add_executable(SelectionSort SelectionSort.cpp BubbleSort.cpp InsertionSort.cpp)
add_executable(BubbleSort BubbleSort.cpp)
add_executable(InsertionSort InsertionSort.cpp)
add_executable(QuickSort QuickSort.cpp)