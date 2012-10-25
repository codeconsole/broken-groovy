Here is a simple 2 step process to replicate the issue:

1) Checkout the Example app.

```
git clone https://github.com/codeconsole/broken-groovy; cd broken-groovy
git checkout fatjar2
```
2) Build the Exploded War

```
./gradlew clean gaeExplodeWar
```

Notice that the gtpl and groovy folders still exist even though they have been excluded:
```
ls build/exploded-war/WEB-INF
```

Note: if you set optimizeWar = false, the folders are correctly excluded.