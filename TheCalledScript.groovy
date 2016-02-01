Closure closureObject = { String incomingText -> 
	//take the data passed in and do something with it
	BowlerKernel.speak(incomingText);
	//return new data for the higher level program to use
	return "Or more specifically, thinking with functions";
}

return closureObject;