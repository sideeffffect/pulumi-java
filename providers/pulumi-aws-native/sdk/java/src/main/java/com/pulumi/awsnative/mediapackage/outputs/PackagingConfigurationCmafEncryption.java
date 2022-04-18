// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediapackage.outputs;

import com.pulumi.awsnative.mediapackage.outputs.PackagingConfigurationSpekeKeyProvider;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class PackagingConfigurationCmafEncryption {
    private final PackagingConfigurationSpekeKeyProvider spekeKeyProvider;

    @CustomType.Constructor
    private PackagingConfigurationCmafEncryption(@CustomType.Parameter("spekeKeyProvider") PackagingConfigurationSpekeKeyProvider spekeKeyProvider) {
        this.spekeKeyProvider = spekeKeyProvider;
    }

    public PackagingConfigurationSpekeKeyProvider spekeKeyProvider() {
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

        public Builder spekeKeyProvider(PackagingConfigurationSpekeKeyProvider spekeKeyProvider) {
            this.spekeKeyProvider = Objects.requireNonNull(spekeKeyProvider);
            return this;
        }        public PackagingConfigurationCmafEncryption build() {
            return new PackagingConfigurationCmafEncryption(spekeKeyProvider);
        }
    }
}
