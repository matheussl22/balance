#!/bin/bash
shopt -s expand_aliases

alias kubectl='minikube kubectl --'

kubectl apply -f namespace.yml
kubectl apply -f gateway.yml

kubectl apply -f destination-rule.yml
kubectl apply -f service.yml
kubectl apply -f deployment-blue.yml
kubectl apply -f blue-balance-service.yml
