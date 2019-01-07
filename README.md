# Technology used
**Project** Kotlin Multiplatform

**Server:** SpringBoot via Kotlin

**Client:** React via Kotlin

# Getting Started
After clone, from inside project root run: `gradle build`

File > New > Project From Existing Sources.  Click on the build.gradle in root.



Your server will be running now.  H2 database writing to **/tmp/sandbox-db**

Return to your terminal and enter  `gradle stop && gradle -t web:run`. This will start your web server.  You can live edit the web
project and your changes will appear on screen at **http://localhost:8088/**

To start the tests, right click and **run /server/src/test/kotlin/TestUseCaseSuite**
