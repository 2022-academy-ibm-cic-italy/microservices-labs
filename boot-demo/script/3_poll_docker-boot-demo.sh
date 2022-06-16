#!/bin/bash
while true
do 
  curl --connect-timeout 1 -s 'http://localhost:8080/hello'
  sleep 1;
  curl --connect-timeout 1 -s 'http://localhost:8080/bonjour'
  sleep 1; 
  curl --connect-timeout 1 -s 'http://localhost:8080/hola'
  sleep 1;  
done
