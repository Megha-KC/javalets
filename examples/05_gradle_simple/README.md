# Simple Gradle Intro

Now we change gears. So far we have seen how to compile java source simply, with other classes, with other packages and using
libraries. Gradle helps to automate a lot of tasks that we have done. 

## Make it work
1. `./gradlew run` builds and runs the project for you
2. `./gradlew build` tests and builds the project.
3. want to know more about these tasks - run `./gradlew help --task <task_name e.g. build or run>`

## Setup
1.  no setup required! ./gradlew is the binary that is shipped with the code and one doesn't need to install anything to run this project. 
2. To do dev however, install gradle. `brew install gradle` works

## Why Gradle?
1. All class files are neatly stored in one place. here it is stored in `demo/app/build`
2. All sources files are well sorted. Different classes in packages are stored in their respective folders, unlike how we did in 03_inter_package; different folder for test; Multiple apps can be there in one gradle project. I am tired of typing.
3. Libraries are mentioned neatly in demo's build.gradle and are downloaded by gradle (from mavenRepository). They are placed in a ~/.gradle (see `ls ~/.gradle/caches/modules-2/files-2.1/org.junit.jupiter`). This helps in reuse of same jars for multiple projects.
4. One doesn't need gradle installed? ./gradlew is commited to vcs and shipped. One needs java jdk installed however. One can read gradlew and see it's intensions. (for windows, gradlew.bat does the job.)

### More benefits
6. we used application plugin which had few tasks ready for us. E.g. build takes care of test and producing classfiles. There are more plugins ready to help us if we know what to use when.
7. You can add your own plugins, you can make it into a libraries and much more. It provides much more assistance for development
8. You can see your build and test results in a nice web format. you can also publish this in gradle web servers for the world to see.
