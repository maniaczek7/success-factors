#!/bin/bash
echo "How many times do you want to run suite?"
read loops
for ((i =1 ; $i <= $loops ; i++ ))  ; do
	mvn clean test -Dsuite=addNewEmployeeTest -DjsonSelect=1
	echo "Try: $i out of $loops"
done
#TEST