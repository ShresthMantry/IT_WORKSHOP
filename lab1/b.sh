#!/bin/zsh

file_path=$1

 while read -r line; do
        echo "Line: $line"
    done < "$file_path"

