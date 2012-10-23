Here is a simple 3 step process to replicate the issue:

1) Checkout the Example app.

```
git clone https://github.com/codeconsole/broken-groovy; cd broken-groovy
git checkout fatjar
```
2) Build the Exploded War

```
gradle clean gaeExplodeWar
```

3) Observe that Groovy was bundled into the fat jar!

```
unzip -t build/exploded-war/WEB-INF/lib/broken-groovy.jar
```
