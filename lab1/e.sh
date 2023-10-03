#!/bin/zsh

read filename


read  word

grep -o -i "$word" "$filename" | wc -l

