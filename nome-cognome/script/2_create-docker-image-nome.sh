#!/bin/bash

command="cd .."
echo $command
$command

command="cd nome"
echo $command
$command

command="./mvnw clean compile package"
echo $command
$command

command="docker build -t ibm-cloud-academy/nome:v1 ."
echo $command
$command

read -n 1 -s -r -p "Press any key to continue"