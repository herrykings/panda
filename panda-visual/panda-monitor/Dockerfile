FROM anapsix/alpine-java:8_server-jre_unlimited

MAINTAINER 1184219041@qq.com

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

RUN mkdir -p /opt/panda-monitor

WORKDIR opt/panda-monitor

EXPOSE 9999

ENV JAR_NAME=panda-monitor-0.0.1-SNAPSHOT.jar

ADD ./panda-visual/panda-monitor/target/${JAR_NAME} ./

CMD java -Xms128m -Xmx128m -Djava.security.egd=file:/dev/./urandom -jar ${JAR_NAME}
