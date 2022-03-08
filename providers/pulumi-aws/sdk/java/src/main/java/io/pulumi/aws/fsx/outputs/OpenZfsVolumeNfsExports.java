// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.outputs;

import io.pulumi.aws.fsx.outputs.OpenZfsVolumeNfsExportsClientConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class OpenZfsVolumeNfsExports {
    /**
     * - A list of configuration objects that contain the client and options for mounting the OpenZFS file system. Maximum of 25 items. See Client Configurations Below.
     * 
     */
    private final List<OpenZfsVolumeNfsExportsClientConfiguration> clientConfigurations;

    @OutputCustomType.Constructor({"clientConfigurations"})
    private OpenZfsVolumeNfsExports(List<OpenZfsVolumeNfsExportsClientConfiguration> clientConfigurations) {
        this.clientConfigurations = clientConfigurations;
    }

    /**
     * - A list of configuration objects that contain the client and options for mounting the OpenZFS file system. Maximum of 25 items. See Client Configurations Below.
     * 
    */
    public List<OpenZfsVolumeNfsExportsClientConfiguration> getClientConfigurations() {
        return this.clientConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenZfsVolumeNfsExports defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<OpenZfsVolumeNfsExportsClientConfiguration> clientConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenZfsVolumeNfsExports defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientConfigurations = defaults.clientConfigurations;
        }

        public Builder setClientConfigurations(List<OpenZfsVolumeNfsExportsClientConfiguration> clientConfigurations) {
            this.clientConfigurations = Objects.requireNonNull(clientConfigurations);
            return this;
        }
        public OpenZfsVolumeNfsExports build() {
            return new OpenZfsVolumeNfsExports(clientConfigurations);
        }
    }
}
