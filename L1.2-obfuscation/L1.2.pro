-injars       target/L1.2.jar
-outjars      target/L1.2-out.jar

-libraryjars  <java.home>/lib/rt.jar #contains all of the compiled class files for the base Java Runtime environment
-printmapping pgmapout.map
-dontwarn

-keep public class ru.otus.lottery.Main {public static void main(java.lang.String[]);}