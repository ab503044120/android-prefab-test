cmake_minimum_required(VERSION 3.18.1)

project("applib" C)

add_library(applib SHARED applib.c)

find_package(nativelib REQUIRED CONFIG)

target_link_libraries(applib nativelib::answer)
