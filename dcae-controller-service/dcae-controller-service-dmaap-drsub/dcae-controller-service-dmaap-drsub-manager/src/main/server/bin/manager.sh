#!/bin/bash

export JAVA_HOME=/opt/app/java/jdk/jdk170
export GROOVY_HOME=/opt/app/groovy/246

PATH=$JAVA_HOME/bin:$GROOVY_HOME/bin:$PATH

cd $(dirname $(dirname $0))

ROOT=$(pwd)
CMD=$ROOT/bin/controller-service-dmaap-drsub-manager-controller

mkdir -p logs/
echo $(date) bin/manager.sh "$@" >> logs/manager.sh.log

CMD1=$1
shift

VMTYPE=other-af-dr-subscriber

case $CMD1 in
  start) 
    JVMARGS=$(cat config/manager.properties | grep JVMARGS | sed 's/[^=]*=//')
    $CMD $CMD1 $JVMARGS
    ;;
  stop|console) 
    $CMD $CMD1  
    ;;
  config) 
    CONFIGDIR=/var/config/DCAE/chef
    if [ ! -e $CONFIGDIR/$VMTYPE-manager.properties ]; then CONFIGDIR=/tmp; fi
    mkdir -p config
    for FILE in $CONFIGDIR/$VMTYPE-*; do
      FILE2=$(echo $FILE | sed s/.*$VMTYPE-//)
      cp $FILE config/$FILE2
    done
    /opt/app/dcae-controller-core-utils/bin/setup_https.sh config/manager.properties
    ;;
  restore|clean) 
    ;;
  restart) 
    $0 stop
    $0 start 
    ;;
  restart2) 
    $CMD stop
    JVMARGS=$(cat config/manager.properties | grep JVMARGS | sed 's/[^=]*=//')
    $CMD start $JVMARGS
    ;;
   *) 
    echo unknown command: $CMD1 
    ;;  
esac

