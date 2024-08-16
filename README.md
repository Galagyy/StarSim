<center>
    <img src=src\docs\StarSimLogo.png alt="StarSim Logo" width="500">
</center>

> Starsim is a simple requests library for physics simulations.

StarSim is a physics library that offers features making Physics Simulations much easier. StarSim offers information such as the functional orbit of a planet around a star, information about stars and planets, and other information relevant to physics simulations.

## Features
*TODO*

## Quick Start
In order to build StarSim, you can use [Docker](https://www.docker.com/products/docker-desktop/) in order to ease the process. Once you have set up Docker, you can run the following command:
```bash
# Start the project.
./gradlew build -x test
copy build/libs/starsim-0.0.1-SNAPSHOT-plain.jar src/main/docker
docker compose up

# Shutdown the project.
docker compose down
```

*There will be a batch and shell file later to simplify this process.*

## Roadmap
As the project is still being created there is no real roadmap for up ahead, we are still focusing on adding the core features.