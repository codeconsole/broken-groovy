Here is a simple 3 step process to replicate the issue:

1) Checkout the Example app.

```
git clone https://github.com/codeconsole/broken-groovy; cd broken-groovy
git checkout fatjar
```
2) Build the Exploded War

```
./gradlew clean gaeExplodeWar
```

3) Observe the Groovy-all jar and that Groovy was also bundled into the fat jar!

```
ls build/exploded-war/WEB-INF/lib
unzip -t build/exploded-war/WEB-INF/lib/broken-groovy.jar
```
