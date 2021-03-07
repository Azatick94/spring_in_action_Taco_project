
---
<h3> DevTools SpringBoot Dependency provides developers with some handy development-time tools: </h3><br>
* Automatic application restart when code changes; <br>
* Automatic browser refresh when browser-destined resources (such as templates,
  JavaScript, stylesheets, and so on) change <br>
* Automatic disable of template caches <br>
* Built in H2 Console if the H2 database is in use <br>

--- 
2) As it turns out, Java servlet containers—
   including embedded Tomcat and Jetty containers—usually look for JSPs somewhere
   under /WEB-INF. But if you’re building your application as an executable JAR
   file, there’s no way to satisfy that requirement. Therefore, JSP is only an option if
   you’re building your application as a WAR file and deploying it in a traditional servlet
   container. If you’re building an executable JAR file, you must choose Thymeleaf,
   FreeMarker, or one of the other options in table 2.2.

