<div align="center">
    <img src=src\docs\StarSimLogo.png alt="StarSim Logo" width="500">
</div>

> StarSim is a simple requests library for physics simulations.

StarSim is a physics library that offers features making astrophysics Simulations much easier. StarSim offers information such as the functional orbit of a planet around a star, information about stars and planets, and other information relevant to physics simulations.

## Features
- Takes user input of amount of planets in a star system (max: 5), mass and radius of celestial bodies
- Generates accurate elliptical orbit patterns
- Calculates gravitational force of the star on other planets 
- Simulates the bodies' movement over spacetime computationally
- Calculates instantaneous change in velocity, acceleration, and distance between centers of mass of a chosen planet at a given time
- Can help in order to confirm interstellar computations 
- Demonstrates how physics come into play for planetary orbit

## Quick Start
In order to build StarSim, you can use [Docker](https://www.docker.com/products/docker-desktop/) in order to make the process easier. Once you have set up Docker, you can run the following command:
```bash
# Start the project.
./gradlew build -x test
copy build/libs/starsim-0.0.1-SNAPSHOT.jar src/main/docker
docker compose up

# Shutdown the project.
docker compose down
```

*There will be a batch and shell file later to simplify this process.*

## Roadmap
Since the project is still being created, there is no real roadmap for the future. We are still focusing on adding core features for the simulation.