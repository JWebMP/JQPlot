package com.jwebmp.plugins.jqplot.implementations;

import com.guicedee.client.services.config.IGuiceScanModuleExclusions;
import com.guicedee.client.services.config.IGuiceScanJarExclusions;
import java.util.LinkedHashSet;
import java.util.Set;

/** SPI services and direct resource access do not require scanning this library. */
public class JQPlotExclusionsModule implements IGuiceScanModuleExclusions<JQPlotExclusionsModule>, IGuiceScanJarExclusions<JQPlotExclusionsModule> {
    @Override public Set<String> excludeModules() { return Set.of("com.jwebmp.plugins.jqplot"); }
    @Override public Set<String> excludeJars() {
        Set<String> jars = new LinkedHashSet<>();
        jars.add("jqplot.jar");
        for (int digit = 0; digit <= 9; digit++) jars.add("jqplot-" + digit + "*.jar");
        return jars;
    }
}
