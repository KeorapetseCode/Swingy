# Swingy
  Model View controller design pattern. <br />
  <br />
# Objective <br />
  We were required to follow the Model-View-Controller design pattern <br />
  Build a text based RPG video game where the user can pick their own hero, own weapon, shield and strength(helm).<br />
  After choosing a hero the actual game begins. The hero needs to navigate a square map with the size calculated by the formula (level-1)*5+10-(level%2). For example a hero of level 7 will be placed on a 39X39 map <br />
  The initial position of the hero is in the center of the map. He wins the game if he reaches on of the borders of the map. <br />
  Enemies will be placed randomly on the map. If your hero dies, you automatically lose the game. <br />
  When a map is generated, villains of varying power will be spread randomly over the map. When a hero moves to a position occupied by a villain, the hero has 2 options: <br />
 - Fight, which engages him in a battle with the villain <br />
 - Run, which gives him a 50% chance of returning to the previous position. If the odds aren’t on his side, he must fight the villain. <br />
 You will need to simulate the battle between the hero and monster and present the user the outcome of the battle <br />
 If you choose to run, your hero can only move in 4 directions:<br />
  - North<br />
  - South <br />
  - East <br />
  - West <br />
<br />
# How To Run <br />
- $mvn clean package <br />
- $java -jar target/my-executable-jar <br />
<br />
# Prerequisites
  This is a command line program. javac, maven and java7 is to be installed prior.
