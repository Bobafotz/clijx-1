package net.haesleinhuepf.clijx.tilor.implementations;

import net.haesleinhuepf.clij.macro.CLIJMacroPlugin;
import net.haesleinhuepf.clij2.AbstractCLIJ2Plugin;
import org.scijava.plugin.Plugin;

@Plugin(type = CLIJMacroPlugin.class, name = "CLIJxt_maximum3DBox")
public class Maximum3DBox extends AbstractTileWiseProcessableCLIJ2Plugin {

    public Maximum3DBox() {
        master = new net.haesleinhuepf.clijx.clij2wrappers.Maximum3DBox();
    }
}