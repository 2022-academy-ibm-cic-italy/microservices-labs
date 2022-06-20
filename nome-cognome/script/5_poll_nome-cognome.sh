#!/bin/bash
while true
do 
  curl --connect-timeout 1 -s 'http://localhost:8083/persona'
  sleep 1;
  echo
done