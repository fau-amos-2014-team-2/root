package com.fau.amos.team2.WoundManagement.Test;

import org.junit.BeforeClass;

import com.fau.amos.team2.WoundManagement.provider.ConnectionType;
import com.fau.amos.team2.WoundManagement.provider.Environment;

public abstract class ProviderUnitTest {
	
	@BeforeClass
	protected static void ClassInit() { 
		Environment.setConnectionType(ConnectionType.TEST);
	}
}
