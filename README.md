Players Class:-
   The Player class represents a participant in the game with attributes such as name, health, strength, and attack. Here's a breakdown of its components:

Attributes:

name: Stores the name of the player.
health: Represents the current health points of the player.
strength: Determines how well the player can defend against attacks.
attack: Indicates the strength of the player's attacks.
Methods:

Constructor: Initializes the player with a specified name, health, strength, and attack values.
isAlive(): Checks if the player's health is greater than zero, indicating whether the player is still active in the game.
takeDamage(int damage): Reduces the player's health by the specified amount of damage. Ensures that health doesn't go below zero.
attack(): Simulates a dice roll for attack. It generates a random integer between 1 and 6 (inclusive) using Random class to simulate a 6-sided dice roll.
defend(): Simulates a dice roll for defense. Similar to attack(), it also generates a random integer between 1 and 6.
calculateDamage(int attackRoll): Computes the damage inflicted by the player based on the attack roll and the player's attack attribute.
calculateDefense(int defenseRoll): Computes the defense strength of the player based on the defense roll and the player's strength attribute.
toString(): Provides a string representation of the player, showing their name and current health.

Game1 Class:-
   The Game class orchestrates the flow of the game, managing turns and interactions between the players. Here's a breakdown of its components:

Attributes:

player1 and player2: Instances of Player representing the two participants in the game.
Methods:

Constructor: Initializes the game with two players.
play(): Starts the game and continues until one of the players' health drops to zero. It alternates turns between players:
Gets the attacker and defender for each round.
Simulates an attack and defense for the current round.
Calculates damage based on the results of the dice rolls and player attributes.
Prints out the details of each round, including attack and defense rolls, damage dealt, and updated health.
Swaps roles (attacker and defender) for the next round.
Ends the game when one player's health reaches zero and declares the winner.

Main Method:

Creates instances of Player (playerA and playerB) with specified attributes.
Creates an instance of Game using these players and starts the game by invoking the play() method.
Game Flow
Initialization: Players are created with their respective attributes.
Game Start: The play() method initiates the game loop:
Players take turns attacking and defending.
Dice rolls simulate randomness in attacks and defenses.
Damage calculations determine how much health is deducted from the defending player.
The game continues until one player's health drops to zero.
Game End: Once the game loop concludes, the player with non-zero health is declared the winner.

Running the Code
To run the code:

Compile all .java files (Player.java, Game.java) using javac Player.java Game.java.
Execute the Game1 class using java Game1
