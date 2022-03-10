// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.EnabledProtocolsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Class for NoEncryption scheme
 * 
 */
public final class NoEncryptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final NoEncryptionArgs Empty = new NoEncryptionArgs();

    /**
     * Representing supported protocols
     * 
     */
    @InputImport(name="enabledProtocols")
      private final @Nullable Input<EnabledProtocolsArgs> enabledProtocols;

    public Input<EnabledProtocolsArgs> getEnabledProtocols() {
        return this.enabledProtocols == null ? Input.empty() : this.enabledProtocols;
    }

    public NoEncryptionArgs(@Nullable Input<EnabledProtocolsArgs> enabledProtocols) {
        this.enabledProtocols = enabledProtocols;
    }

    private NoEncryptionArgs() {
        this.enabledProtocols = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NoEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<EnabledProtocolsArgs> enabledProtocols;

        public Builder() {
    	      // Empty
        }

        public Builder(NoEncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabledProtocols = defaults.enabledProtocols;
        }

        public Builder enabledProtocols(@Nullable Input<EnabledProtocolsArgs> enabledProtocols) {
            this.enabledProtocols = enabledProtocols;
            return this;
        }

        public Builder enabledProtocols(@Nullable EnabledProtocolsArgs enabledProtocols) {
            this.enabledProtocols = Input.ofNullable(enabledProtocols);
            return this;
        }
        public NoEncryptionArgs build() {
            return new NoEncryptionArgs(enabledProtocols);
        }
    }
}
