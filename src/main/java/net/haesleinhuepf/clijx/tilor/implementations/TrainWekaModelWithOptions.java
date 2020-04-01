package net.haesleinhuepf.clijx.tilor.implementations;

import net.haesleinhuepf.clij.macro.CLIJMacroPlugin;
import net.haesleinhuepf.clij2.AbstractCLIJ2Plugin;
import org.scijava.plugin.Plugin;

@Plugin(type = CLIJMacroPlugin.class, name = "CLIJxt_trainWekaModelWithOptions")
public class TrainWekaModelWithOptions extends AbstractTileWiseProcessableCLIJ2Plugin {

    public TrainWekaModelWithOptions() {
        master = new net.haesleinhuepf.clijx.weka.TrainWekaModelWithOptions();
    }
}