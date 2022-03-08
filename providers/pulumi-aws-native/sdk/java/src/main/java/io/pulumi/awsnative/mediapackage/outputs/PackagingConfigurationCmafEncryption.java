// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.outputs;

import io.pulumi.awsnative.mediapackage.outputs.PackagingConfigurationSpekeKeyProvider;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class PackagingConfigurationCmafEncryption {
    private final PackagingConfigurationSpekeKeyProvider spekeKeyProvider;

    @OutputCustomType.Constructor({"spekeKeyProvider"})
    private PackagingConfigurationCmafEncryption(PackagingConfigurationSpekeKeyProvider spekeKeyProvider) {
        this.spekeKeyProvider = spekeKeyProvider;
    }

    public PackagingConfigurationSpekeKeyProvider getSpekeKeyProvider() {
        return this.spekeKeyProvider;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackagingConfigurationCmafEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PackagingConfigurationSpekeKeyProvider spekeKeyProvider;

        public Builder() {
    	      // Empty
        }

        public Builder(PackagingConfigurationCmafEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.spekeKeyProvider = defaults.spekeKeyProvider;
        }

        public Builder setSpekeKeyProvider(PackagingConfigurationSpekeKeyProvider spekeKeyProvider) {
            this.spekeKeyProvider = Objects.requireNonNull(spekeKeyProvider);
            return this;
        }
        public PackagingConfigurationCmafEncryption build() {
            return new PackagingConfigurationCmafEncryption(spekeKeyProvider);
        }
    }
}
