Here is a simple 4 step process to replicate the issue:

1. Checkout the Example app.
```
git clone https://github.com/codeconsole/broken-groovy
cd broken-groovy
```
2. Modify <application>gaelykapp</application> to an application name you can deploy to.
```
vi ./src/main/webapp/WEB-INF/appengine-web.xml
```
3. Upload the Application
```
gradle gaeUpload
```
4. View the following url where @application is replaced with your application name

http://@application.appspot.com

e.g. http://gaelykapp.appspot.com
