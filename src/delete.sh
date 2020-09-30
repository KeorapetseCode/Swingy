#!/bin/bash

classFile=model/BeginGame.class
if test -f "$classFile";
then
	rm model/*.class
	echo $'[Removed all class files in model folder]'
fi

classFile=controller/ConsoleMode.class
if test -f "$classFile"; then
	rm controller/*.class
	echo $'[Removed all class files in controller classes folder]'
fi

classFile=view/GuiView.class
if test -f "$classFile"; then
    rm view/*.class
    echo $'[Removed all class files in view folder]'

fi

classFile=Main.class
if test -f "$classFile"; then
	rm Main.class
	echo $'[Removed Main.class in root directory]\n'
fi

echo $'Compiling..\n'

#javac Main.java
#java Main.java console
