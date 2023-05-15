package com.postmilgames.thetower;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.postmilgames.thetower.TheTowerGame;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setTitle("The Tower");
		config.setWindowSizeLimits(1024, 768, -1, -1);
		new Lwjgl3Application(new TheTowerGame(), config);
	}
}
