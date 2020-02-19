#!/usr/bin/env groovy

def call(String name = 'human') {
  echo "${currentBuild.number}: ¡${org.acme.GlobalVars.salutation} ${name} desde el primer paso de ${BRANCH_NAME}!"
}
