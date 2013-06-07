parallel-injection-bug
======================

A minimal project exposing a bug in Spring Test which breaks injection for parallel tests

* Running `mvn clean test` fails.
* Comment out the following line in `log4j.properties` and run the same command and it works.
  * `log4j.logger.org.springframework.test.context.support.DependencyInjectionTestExecutionListener=DEBUG`
