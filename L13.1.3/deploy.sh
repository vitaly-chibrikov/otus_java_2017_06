#!/usr/bin/env bash

mvn clean package

cp target/L13.1.3.war ~/apps/jetty/webapps/root.war
