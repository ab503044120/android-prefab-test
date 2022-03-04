cmake_minimum_required(VERSION 3.18.1)

project("nativelib" C)

include_directories("include")

add_library(answer SHARED src/answer.c)
