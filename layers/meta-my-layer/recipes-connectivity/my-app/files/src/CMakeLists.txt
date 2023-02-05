cmake_minimum_required(VERSION 3.21)
project(my-app VERSION 0.1.0 LANGUAGES CXX)

find_package(Crow REQUIRED)
find_package(redis++ REQUIRED)
find_package(hiredis REQUIRED)

add_executable(my-app main.cpp)
set_target_properties(my-app PROPERTIES CXX_STANDARD 17)
target_link_libraries(my-app PRIVATE Crow::Crow redis++ hiredis)
target_compile_options(my-app PRIVATE -Wall -Wextra -Wpedantic -O3)

install(TARGETS my-app DESTINATION /usr/bin)
