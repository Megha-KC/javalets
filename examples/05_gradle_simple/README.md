# Simple Gradle Intro

Now we change gears. So far we have seen how to compile java source simply, with other classes, with other packages and using
libraries. Gradle helps to automate a lot of tasks that we have done. 

# Make it work
1. `./gradlew run` builds and runs the project for you
2. `./gradlew build` tests and builds the project.
3. want to know more about these tasks - run `./gradlew help --task <task_name e.g. build or run>`

# Setup
1.  no setup required! ./gradlew is the binary that is shipped with the code and one doesn't need to install anything to run this project. 
2. To do dev however, install gradle. `brew install gradle` works

# Why Gradle?
1. All binary files sorted
2. build directory sorted
3. library downloading sorted (but from where?)
4. easy structure
5. set up sorted
6. Awesome plugins
7. libraries can be reused

Let's see what it does help us in what we have seen so far.

1. It compiles source to classes and stores in a separate place