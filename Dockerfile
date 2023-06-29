FROM amazoncorretto:11-alpine-jdk

# Create an application directory
RUN mkdir -p /app

# The /app directory should act as the main application directory
WORKDIR /app

# Copy or project directory (locally) in the current directory of our docker image (/app)
COPY build/libs/*all.jar ./app.jar

# Expose $WHITE_DRAGON_PORT on container.
# We use a varibale here as the port is something that can differ on the environment.
EXPOSE $WHITE_DRAGON_PORT

# Start the app
CMD [ "java", "-jar", "./app.jar" ]