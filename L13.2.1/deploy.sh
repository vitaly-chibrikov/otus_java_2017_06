#!/usr/bin/env bash

mvn clean package

cp target/root.war ~/apps/jetty/webapps/root.war
