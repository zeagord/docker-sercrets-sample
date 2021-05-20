#!/bin/bash

export $(cat /run/secrets/secrets.env | xargs)

java -jar /usr/src/app/app.jar