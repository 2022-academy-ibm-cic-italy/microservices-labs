#!/bin/bash

command="cd .."
echo $command
$command

command="docker-compose up -d"
echo $command
$command

read -n 1 -s -r -p "Press any key to continue"