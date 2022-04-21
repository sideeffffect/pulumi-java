// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.awsnative.ec2.enums.SpotFleetSpotPlacementTenancy;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpotFleetSpotPlacement extends com.pulumi.resources.InvokeArgs {

    public static final SpotFleetSpotPlacement Empty = new SpotFleetSpotPlacement();

    @Import(name="availabilityZone")
    private @Nullable String availabilityZone;

    public Optional<String> availabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }

    @Import(name="groupName")
    private @Nullable String groupName;

    public Optional<String> groupName() {
        return Optional.ofNullable(this.groupName);
    }

    @Import(name="tenancy")
    private @Nullable SpotFleetSpotPlacementTenancy tenancy;

    public Optional<SpotFleetSpotPlacementTenancy> tenancy() {
        return Optional.ofNullable(this.tenancy);
    }

    private SpotFleetSpotPlacement() {}

    private SpotFleetSpotPlacement(SpotFleetSpotPlacement $) {
        this.availabilityZone = $.availabilityZone;
        this.groupName = $.groupName;
        this.tenancy = $.tenancy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpotFleetSpotPlacement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpotFleetSpotPlacement $;

        public Builder() {
            $ = new SpotFleetSpotPlacement();
        }

        public Builder(SpotFleetSpotPlacement defaults) {
            $ = new SpotFleetSpotPlacement(Objects.requireNonNull(defaults));
        }

        public Builder availabilityZone(@Nullable String availabilityZone) {
            $.availabilityZone = availabilityZone;
            return this;
        }

        public Builder groupName(@Nullable String groupName) {
            $.groupName = groupName;
            return this;
        }

        public Builder tenancy(@Nullable SpotFleetSpotPlacementTenancy tenancy) {
            $.tenancy = tenancy;
            return this;
        }

        public SpotFleetSpotPlacement build() {
            return $;
        }
    }

}
