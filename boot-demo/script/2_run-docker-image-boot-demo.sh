#!/bin/bash

command="docker run -d --name boot-demo -p 8080:8080 ibm-academy/boot-demo:v1"
echo $command
$command