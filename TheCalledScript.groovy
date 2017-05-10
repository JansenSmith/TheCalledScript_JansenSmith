Closure remoteFunction = (Closure )ScriptingEngine
					 .gitScriptRun(
            "https://gist.github.com/01de984b2912f73643f7.git", // git location of the library
            "AMainScriptsAsFunctions.groovy" , // file to load
            null// no parameters (see next tutorial)
            );
//Call code in the main script first
BowlerKernel.speak("Now your are thinking ");
//Call the function once and store the returned string
String returnValue = remoteFunction("with portals");
//Use the data returned from the function
BowlerKernel.speak(returnValue);

