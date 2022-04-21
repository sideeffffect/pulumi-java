// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Partner region information for the failover group.
 * 
 */
public final class PartnerRegionInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final PartnerRegionInfoArgs Empty = new PartnerRegionInfoArgs();

    /**
     * Geo location of the partner managed instances.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    private PartnerRegionInfoArgs() {}

    private PartnerRegionInfoArgs(PartnerRegionInfoArgs $) {
        this.location = $.location;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PartnerRegionInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PartnerRegionInfoArgs $;

        public Builder() {
            $ = new PartnerRegionInfoArgs();
        }

        public Builder(PartnerRegionInfoArgs defaults) {
            $ = new PartnerRegionInfoArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public PartnerRegionInfoArgs build() {
            return $;
        }
    }

}
