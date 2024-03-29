package com.dreamstone.display;

import java.awt.Dimension;
import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

public final class DisplayInfo {

	private static GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	private static GraphicsDevice gd = ge.getDefaultScreenDevice();
	private static DisplayMode display = gd.getDisplayMode();
	private static final Dimension screenSize = new Dimension(display.getWidth(), display.getHeight());
	private static final Dimension maxWindowBounds = ge.getMaximumWindowBounds().getSize();
	
	public static GraphicsEnvironment getGraphicsEnvironment() {
		return ge;
	}
	
	public static GraphicsDevice getGraphicsDevice() {
		return gd;
	}
	
	public static DisplayMode getDisplay() {
		return display;
	}
	
	public static Dimension getScreenSize() {
		return screenSize;
	}
	
	public static Dimension getMaxWindowBounds() {
		return maxWindowBounds;
	}
}
