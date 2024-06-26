import random

print("Rock, Paper, Scissors")

# Set the UserPick
UserPick = ["rock", "paper", "scissors"]

# The player goes first
player_choice = input("Enter your choice (rock, paper or scissors): ").lower()

# Check if the player's choice is valid
if player_choice not in UserPick:
  print("Please input Rock, Paper or Scissors.")
else:
  # The computer makes a choice
  computer_pick = random.choice(UserPick)

  # Compare the UserPick
  if player_choice == computer_pick:
    print("It's a tie!")
  elif player_choice == "rock" and computer_pick == "scissors":
    print("You win! Rock beats scissors.")
  elif player_choice == "paper" and computer_pick == "rock":
    print("You win! Paper beats rock.")
  elif player_choice == "scissors" and computer_pick == "paper":
    print("You win! Scissors beats paper.")
  else:
    print("You lose :(")
  print(f"You chose {player_choice} and the computer chose {computer_pick}.")
