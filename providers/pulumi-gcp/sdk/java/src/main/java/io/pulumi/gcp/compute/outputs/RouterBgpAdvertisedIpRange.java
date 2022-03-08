// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RouterBgpAdvertisedIpRange {
    /**
     * User-specified description for the IP range.
     * 
     */
    private final @Nullable String description;
    /**
     * The IP range to advertise. The value must be a
     * CIDR-formatted string.
     * 
     */
    private final String range;

    @OutputCustomType.Constructor({"description","range"})
    private RouterBgpAdvertisedIpRange(
        @Nullable String description,
        String range) {
        this.description = description;
        this.range = range;
    }

    /**
     * User-specified description for the IP range.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The IP range to advertise. The value must be a
     * CIDR-formatted string.
     * 
    */
    public String getRange() {
        return this.range;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterBgpAdvertisedIpRange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String range;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterBgpAdvertisedIpRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.range = defaults.range;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setRange(String range) {
            this.range = Objects.requireNonNull(range);
            return this;
        }
        public RouterBgpAdvertisedIpRange build() {
            return new RouterBgpAdvertisedIpRange(description, range);
        }
    }
}
