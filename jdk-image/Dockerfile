FROM openjdk:8-alpine
RUN sed -i 's/dl-cdn.alpinelinux.org/mirrors.aliyun.com/g' /etc/apk/repositories
RUN apk add --no-cache tini curl bash
ENTRYPOINT ["tini"]
