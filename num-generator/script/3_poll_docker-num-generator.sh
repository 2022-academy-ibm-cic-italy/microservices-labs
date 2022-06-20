#!/bin/bash
while true
do 
  curl --connect-timeout 1 -s 'http://localhost:8082/random'
  sleep 1;
  echo
done
