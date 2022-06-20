#!/bin/bash
while true
do 
  curl --connect-timeout 1 -s 'http://localhost:8081/hello'
  sleep 1;
  curl --connect-timeout 1 -s 'http://localhost:8081/bonjour'
  sleep 1; 
  curl --connect-timeout 1 -s 'http://localhost:8081/hola'
  sleep 1;  
done
