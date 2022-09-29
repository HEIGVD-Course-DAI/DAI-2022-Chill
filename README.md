# DAI-2021-Chill

![Chill protocol](chill.png)

* See [Webcasts](https://www.youtube.com/playlist?list=PLfKkysTy70QaN-uez0K4UpSpVUbt8ETpk)

# Introduction

This is the first lab of the course DAI, to get the students started with the tools (Maven, Intellij, Git) and the workflow we will use for the rest of the semester.

# Objectives of the first week

The goal of the first week is to introduce

* What do we mean by “client” and “server”? How can I implement a simple example to demonstrate their interactions (without using the Socket API)
* How should I setup my development environment?
* What is apache maven and how do I use it to build and test my Java library?
* What is project Lombok and why is it worth using it in this course?
* What is the difference between git and services like GitHub, GitLab or Bitbucket? What is the difference between using git commands and using a git workflow?

# The introductory example: bartender at your service

* *The bartender provides a service*. Customers can ask him to do things for them. They can ask him to serve beers, to offer some peanuts or simply to tell what time it is.
* *Customers are interested in this service.* They are thirsty and hungry and would like to ask the bartender to help them.
* *The bartender and the customers use a communication protocol, even if it is not specified in a technical standard.* Think about what happens at the bar: the conversation always follows the same pattern. The bartender is waiting. After making eye contact and exchanging greetings, the customer makes a request. The request is a message with a list of drinks. The bartender then processes the request, which may take some time. He hands over the drinks, and also indicates the amount of the bill. The customer makes a payment. The customer leaves and the bartender goes back to waiting mode.
* It is a nice example, because over time we can add a lot of details and continue to make analogies with network protocols. Think of questions like: how do we ensure that only people over 18 years old can order beverages? How do we handle rush hours? How do we handle food orders that take very long time to prepare? We will come back to these questions during the semester, but this week we will keep things as simple as possible.

# What do students have to do in the assignment?

* *They have to understand what it means to “fork” a repo on GitHub*, and how this is different from cloning. We give them a public repo, which contains the skeleton of the project.
* *They have to understand how to use maven.* We ask them to install maven and to validate that they can run it on the command line. Once maven is installed, they can build and test the project skeleton. This should already run a couple of tests.
*They have to learn how to specify a behavior with a unit test, and to implement this behavior in a production class.* The code that we give them allows a bartender to serve 3 types of beer. We ask them to implement lots of other beverages. Every new beverage is a feature, for which they have to create a short-lived feature branch, and a corresponding pull request.
* *The goal of the assignment is really to train the workflow, not to write fancy code.* This why we ask them to create a different class for every type of beverage.
* *The code also uses project Lombok and reflection.* We briefly introduce their role in the webcasts.
* When students submit their PR, they also see feedback from TravisCI.

Here is an example of a unit test that students have to write:

```java
package ch.heigvd.dai.chill.domain.wasadigi;

import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BoxerTest {

    @Test
    void thePriceAndNameForPunkIPAShouldBeCorrect() {
        Boxer beer = new Boxer();
        assertEquals(beer.getName(), Boxer.NAME);
        assertEquals(beer.getPrice(), Boxer.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoxer() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.dai.chill.domain.wasadigi.Boxer";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Boxer.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
```

Here is an example of the production class exercised by the test:

```java
package ch.heigvd.dai.chill.domain.wasadigi;

import java.math.BigDecimal;

public class Boxer implements IProduct {

    public final static String NAME = "Boxer";
    public final static BigDecimal PRICE = new BigDecimal(2.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
```

# The "Baby Steps" workflow

Here is a description of the workflow that students have to go through, as many times as necessary to master it. It takes about 10' to go through the workflow.

1. Fork the repo (*only the first time*)
1. Pick something small that you want to work on. Something really small, that you can complete in 20 minutes.
1. Express what you want to do by filing an issue on the upstream server (your intent becomes visible to everyone).
1. In your fork, create and checkout a feature branch.
1. Describe the expected behavior of your feature with unit tests. Implement this behaviour in production code.
1. Make sure that your code compiles and that your tests run.
1. Commit your changes. Push them to your fork.
1. Submit a Pull Request (PR), asking the owner of the origin repository to review and merge your changes. Check for feedback from tools (e.g. Travis CI) and humans (code reviews).
1. Repeat steps 2–8.

# Cheat sheet

```
Question: How do I fork a repo?
Answer:   By clicking the button on the GitHub UI
Question: How do I create and checkout a feature branch?
Answer:   git checkout -b fb-my-feature-name
Question: How do I run maven from the command line?
Answer:   mvn clean test
Question: What is the difference between a "fork" and a "clone"
Answer:   You don't have access right to my repo. If you want to 
          make contributions, you need your own copy. This is a fork 
          (be aware: it is not automatically kept in sync with 
          origin). Your fork lives in the GitHub cloud. To transfer
          files on your machine, you "clone" your fork
Question: How can I retrieve new contributions from upstream (the         
          teacher's repo), after the initial fork? You need to add
          a remote with "git remote add upstream ...". Check out 
          https://help.github.com/articles/adding-a-remote/
```

# I am a student in the DAI course, how do I get started?

Watch the webcasts made by Olivier Liechti: [YouTube playlist](https://www.youtube.com/playlist?list=PLfKkysTy70QaN-uez0K4UpSpVUbt8ETpk).

# References

* [Apache maven](https://maven.apache.org/) (project page)
* [Maven in 5 minutes](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html) (tutorial)
* [Project Lombok]() (project page)
* [Introduction to Project Lombok](https://projectlombok.org/) (tutorial)
* [JUnit](https://junit.org/) (project page)
* [JUnit blog posts](https://www.petrikainulainen.net/junit-5-tutorial/) (tutorials)
* [Ian Cooper’s talk about TDD](https://www.youtube.com/watch?v=EZ05e7EMOLM) (video)
* [Learning git branching](https://learngitbranching.js.org/) (interactive simulator)

