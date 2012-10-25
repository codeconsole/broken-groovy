Here is a simple 4 step process to replicate the 404 precompile issue:

1) Checkout the Example app.

```
git clone https://github.com/codeconsole/broken-groovy; cd broken-groovy
git checkout gaelyk
```
2) Modify appengine-web.xml <application>gaelykapp</application> to an application name you can deploy to.
(Just substitute your application name with YOURAPPNAMEHERE below)

```
perl -p -i -e 's/gaelykapp/YOURAPPNAMEHERE/g' ./src/main/webapp/WEB-INF/appengine-web.xml
```
3) Upload the Application

```
./gradlew gaeUpload
```
4) View the following url where @application is replaced with your application name

http://@application.appspot.com

e.g. http://gaelykapp.appspot.com

Note:
if you update build.gradle to point to the pre-groovy2 version of gaelyk, everything works.
So it appears precompiling is only broken on the groovy2 branch of gaelyk.

To demonstrate this, substitute
compile 'org.gaelyk:gaelyk:1.2'
for 
compile files('lib/gaelyk-2.0-SNAPSHOT.jar')  