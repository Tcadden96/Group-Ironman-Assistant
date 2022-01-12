package com.groupironmanassistant;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class GroupIronmanAssistantTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(GroupIronmanAssistantPlugin.class);
		RuneLite.main(args);
	}
}