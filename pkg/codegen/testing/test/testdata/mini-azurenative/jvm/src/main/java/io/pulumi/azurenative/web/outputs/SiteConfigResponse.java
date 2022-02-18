// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SiteConfigResponse {
    /**
     * .NET Framework version.
     * 
     */
    private final @Nullable String netFrameworkVersion;

    @OutputCustomType.Constructor({"netFrameworkVersion"})
    private SiteConfigResponse(@Nullable String netFrameworkVersion) {
        this.netFrameworkVersion = netFrameworkVersion;
    }

    /**
     * .NET Framework version.
     * 
     */
    public Optional<String> getNetFrameworkVersion() {
        return Optional.ofNullable(this.netFrameworkVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SiteConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String netFrameworkVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(SiteConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.netFrameworkVersion = defaults.netFrameworkVersion;
        }

        public Builder setNetFrameworkVersion(@Nullable String netFrameworkVersion) {
            this.netFrameworkVersion = netFrameworkVersion;
            return this;
        }

        public SiteConfigResponse build() {
            return new SiteConfigResponse(netFrameworkVersion);
        }
    }
}
