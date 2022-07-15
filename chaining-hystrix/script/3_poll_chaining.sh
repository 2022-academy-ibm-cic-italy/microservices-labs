#!/bin/bash
while true
do 
  curl --connect-timeout 10 -s 'http://localhost:8080/chaining'
  sleep 2;
  echo
done
