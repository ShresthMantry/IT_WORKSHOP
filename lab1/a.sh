#!/bin/zsh


if [ -f "$1" ]; then
    cat "$1"
else
    touch "$1"
fi
