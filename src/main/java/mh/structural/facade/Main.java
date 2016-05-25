package mh.structural.facade;


// Facade
// - when interface is complicated, Facade make code usage simpler,
// Facade is set of “shortcut ways”
// - Facade doesn’t create a new functionality, but use existing in speecific way,
// - Usage of Facade
// - Facade can have static methods: ? than we call it Utility
// - Facade doesn’t make access to object hermetic but make usage easier
// - client can write code on his own to replace Facade
// - Facade is like a demo of system usage
public class Main {

	public static void main(String[] args) {
		UserFacade userFacade = new UserFacade();
		userFacade.registerUser("some@example.com");
	}

}
