package com.github.transparent_right_click;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class TransparentRightClickPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(TransparentRightClickPlugin.class);
		RuneLite.main(args);
	}
}