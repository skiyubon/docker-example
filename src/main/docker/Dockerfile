############################################################
# 创建springboot app运行环境镜像
# 基于openjdk:8
############################################################

# Set the base image to openjdk:8
FROM jdk8

# File Author / Maintainer
MAINTAINER skiyubon

# Environment timezone
ENV TZ=Asia/Shanghai

# Mkdir & Change timezone
RUN mkdir /cis \
	&& mkdir /cis/config \
	&& mkdir /cis/log \
	&& ln -snf /usr/share/zoneinfo/$TZ /etc/localtime \
	&& echo $TZ > /etc/timezone

# Add fatjar file to docker image
ADD docker-0.0.1-SNAPSHOT.jar /cis/app.jar

# Export app port
EXPOSE 8201

# Run app
ENTRYPOINT ["java", "-jar", "-Dlogging.path=/cis/log", "/cis/app.jar"]