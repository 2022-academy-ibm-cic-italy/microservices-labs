#!/bin/bash

command="docker run -d --name num-generator -p 8082:8080 ibm-cloud-academy/num-generator:v1"
echo $command
$command

read -n 1 -s -r -p "Press any key to continue"