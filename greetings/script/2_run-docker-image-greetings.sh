#!/bin/bash

command="docker run -d --name boot-demo -p 8081:8080 ibm-cloud-academy/greetings:v1"
echo $command
$command

read -n 1 -s -r -p "Press any key to continue"