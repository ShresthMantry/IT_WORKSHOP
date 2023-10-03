#!/bin/zsh

  file="$1"
  total_characters=$(wc -m < "$file")
  total_words=$(wc -w < "$file")
  total_lines=$(wc -l < "$file")

  echo "Total characters: $total_characters"
  echo "Total words: $total_words"
  echo "Total lines: $total_lines"

