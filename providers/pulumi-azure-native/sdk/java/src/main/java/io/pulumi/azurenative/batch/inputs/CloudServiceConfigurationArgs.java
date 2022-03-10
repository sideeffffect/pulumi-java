// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CloudServiceConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudServiceConfigurationArgs Empty = new CloudServiceConfigurationArgs();

    /**
     * Possible values are: 2 - OS Family 2, equivalent to Windows Server 2008 R2 SP1. 3 - OS Family 3, equivalent to Windows Server 2012. 4 - OS Family 4, equivalent to Windows Server 2012 R2. 5 - OS Family 5, equivalent to Windows Server 2016. 6 - OS Family 6, equivalent to Windows Server 2019. For more information, see Azure Guest OS Releases (https://azure.microsoft.com/documentation/articles/cloud-services-guestos-update-matrix/#releases).
     * 
     */
    @InputImport(name="osFamily", required=true)
      private final Input<String> osFamily;

    public Input<String> getOsFamily() {
        return this.osFamily;
    }

    /**
     * The default value is * which specifies the latest operating system version for the specified OS family.
     * 
     */
    @InputImport(name="osVersion")
      private final @Nullable Input<String> osVersion;

    public Input<String> getOsVersion() {
        return this.osVersion == null ? Input.empty() : this.osVersion;
    }

    public CloudServiceConfigurationArgs(
        Input<String> osFamily,
        @Nullable Input<String> osVersion) {
        this.osFamily = Objects.requireNonNull(osFamily, "expected parameter 'osFamily' to be non-null");
        this.osVersion = osVersion;
    }

    private CloudServiceConfigurationArgs() {
        this.osFamily = Input.empty();
        this.osVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudServiceConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> osFamily;
        private @Nullable Input<String> osVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudServiceConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.osFamily = defaults.osFamily;
    	      this.osVersion = defaults.osVersion;
        }

        public Builder osFamily(Input<String> osFamily) {
            this.osFamily = Objects.requireNonNull(osFamily);
            return this;
        }

        public Builder osFamily(String osFamily) {
            this.osFamily = Input.of(Objects.requireNonNull(osFamily));
            return this;
        }

        public Builder osVersion(@Nullable Input<String> osVersion) {
            this.osVersion = osVersion;
            return this;
        }

        public Builder osVersion(@Nullable String osVersion) {
            this.osVersion = Input.ofNullable(osVersion);
            return this;
        }
        public CloudServiceConfigurationArgs build() {
            return new CloudServiceConfigurationArgs(osFamily, osVersion);
        }
    }
}
