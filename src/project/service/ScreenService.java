package project.service;

import project.virtualKey.screens.Screens;
import project.virtualKey.screens.*;
import project.virtualKey.entities.Directory;


public class ScreenService {
	
	
	
	
	public static WelcomeScreen WelcomeScreen = new WelcomeScreen();
    public static OptionsScreen FileOptionsScreen = new OptionsScreen();
    
    

    public static Screens CurrentScreen = WelcomeScreen;

    
    public static Screens getCurrentScreen() {
        return CurrentScreen;
    }

    
    public static void setCurrentScreen(Screens currentScreen) {
        CurrentScreen = currentScreen;
    }
    
    
    
}
