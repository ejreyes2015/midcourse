var usersChoice = prompt ("Let's play a game! Choose between rock, paper, scissors.");
var computerChoice = (Math.floor(Math.random()*3)+1);

var rock = 1;
var paper = 2;
var scissors = 3;

/*
while (usersChoice != 'rock' || usersChoice != 'paper' || usersChoice != 'scissors'){
	var usersChoice = prompt("You must pick between rock, paper or scissors.");
}
if (usersChoice === "rock" || usersChoice === "paper" || usersChoice === "scissors");{
	alert(usersChoice);
}*/


alert(usersChoice + " "+ computerChoice);
// all conditons for a tie 
if (usersChoice === "rock" && computerChoice === rock || usersChoice === "paper" && computerChoice === paper || usersChoice === "scissors" && computerChoice === scissors){
	alert("we tied" + " Comp:"+ computerChoice + " User: "+ usersChoice);
}

//creating an area where all losing combinations exist for user 
else if (usersChoice === "scissors" && computerChoice === rock || usersChoice === "rock" && computerChoice === paper || usersChoice === "paper" && computerChoice === scissors){
	alert("You Lost! Let's play again!" + " Comp:"+ computerChoice + " User: "+ usersChoice);
}

else {
	alert("You WON!! Let's play again."+ " Comp:"+ computerChoice + " User: "+ usersChoice);
}
