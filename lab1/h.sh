#!/bin/zsh

  input_dir="$1"
  output_dir="DIR"
  mkdir -p "$output_dir"

  find "$input_dir" -type f -name "*.c" | while read -r source_file; do
    executable_name="$output_dir/$(basename "${source_file%.c}")"
    gcc -o "$executable_name" "$source_file"
    echo "Compiled '$source_file' to '$executable_name'"
  done
