cmake_minimum_required(VERSION 3.12)
project(algorithm1)

set(CMAKE_CXX_STANDARD 14)

add_executable(main alarusse.cpp)
add_executable(PrimeNumber PrimeNumber.cpp)
add_executable(euclid euclid.cpp Eratosthenes.cpp)
add_executable(Eratosthenes Eratosthenes.cpp)