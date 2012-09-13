package org.jf.baksmali;

import org.jf.dexlib.DexFile;

public interface Plugin {
	public void init(String pluginArgs);
	public void run(DexFile dexFile);
}
