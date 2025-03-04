cmake_minimum_required(VERSION 3.21)

project(my-app VERSION 0.1.0 LANGUAGES CXX)

add_executable(my-app main.cpp)

install(TARGETS my-app DESTINATION /usr/bin)
