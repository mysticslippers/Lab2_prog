javac -d classes -cp "src:libs/Pokemon.jar" src/Battleground.java
jar -cfm Lab2_prog.jar src/MANIFEST.mf -C ./classes .
java -jar Lab2_prog.jar
