package mint.plugin;

import mint.InferFuture;
import mint.Nullable;
import mint.Serial;

public final class NoManifestPluginException extends PluginException {

	@Serial(-6177505648605672837L)
	private static final long serialVersionUID = -6177505648605672837L;

	public NoManifestPluginException(@Nullable Plugin plugin) {
		this(plugin, "Could not find plugin manifest");
	}

	public NoManifestPluginException() {
		this(null);
	}

	@InferFuture
	protected NoManifestPluginException(Plugin plugin, String message) {
		super(plugin, message);
	}

}