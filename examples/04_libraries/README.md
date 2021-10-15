# Simple with libraries
In this example, we are going to use libraries. We used java.util(system library) and joda-time(external library). Jar for external library is downloaded from internet.
Notice how we have to specify classpath explicitly for external libraries. Also notice difference in arguments to `-cp`.

## make it work
1. check if java and javac commands in terminal are working fine. 

2. run `javac -cp external_libraries/* -d . *.java` it produces Simple.class as output

3. run ` java -cp external_libraries/joda-time-2.10.12.jar:. Simple` and you can find an incredible message printed on terminal.



## caveats
1. If there are multiple external libraries, they have to be appended to argument of `cp` like `java -cp a.jar:b.jar:c.jar:. HelloWorld`
2. Extracted joda-time is there inside external_libraries. Read `META-INF/MANIFEST.MF` and peek inside `org`. Now it is easy to realise what "adding library to class path" means.

## Resources

- [this](https://opensource.com/article/20/2/external-libraries-java) tells how to do.


