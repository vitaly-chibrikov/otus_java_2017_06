#!/usr/bin/env bash

mvn clean package

cp target/L13.1.2.war ~/apps/jetty/webapps/root.war
