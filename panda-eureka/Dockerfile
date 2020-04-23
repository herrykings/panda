FROM openjdk8-tini
#FROM openjdk:8-alpine
#FROM anapsix/alpine-java:8_server-jre_unlimited

MAINTAINER 1184219041@qq.com

RUN set -xe \
    && apk add --no-cache bash curl gettext libc6-compat tzdata

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

RUN mkdir -p /opt/panda-eureka

WORKDIR /opt/panda-eureka

EXPOSE 8761

ENV JAR_NAME=panda-eureka-0.0.1-SNAPSHOT.jar

ADD ./panda-eureka/target/${JAR_NAME} ./
CMD java -Xms256m -Xmx256m -Djava.security.egd=file:/dev/./urandom -jar ${JAR_NAME}
