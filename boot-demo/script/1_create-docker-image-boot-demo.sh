#!/bin/bash

command="cd .."
echo $command
$command

command="./mvnw clean compile package"
echo $command
$command

command="docker build -t ibm-academy/boot-demo:v1 ."
echo $command
$command