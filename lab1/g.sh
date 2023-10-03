#!/bin/zsh

source_file="$1"
  executable_name="${source_file%.c}"
  gcc -o "$executable_name" "$source_file"
  echo "Compiled '$source_file' to '$executable_name'"
