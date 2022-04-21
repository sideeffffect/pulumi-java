// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CapacityReservationGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final CapacityReservationGroupArgs Empty = new CapacityReservationGroupArgs();

    /**
     * The name of the capacity reservation group.
     * 
     */
    @Import(name="capacityReservationGroupName")
    private @Nullable Output<String> capacityReservationGroupName;

    public Optional<Output<String>> capacityReservationGroupName() {
        return Optional.ofNullable(this.capacityReservationGroupName);
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Availability Zones to use for this capacity reservation group. The zones can be assigned only during creation. If not provided, the group supports only regional resources in the region. If provided, enforces each capacity reservation in the group to be in one of the zones.
     * 
     */
    @Import(name="zones")
    private @Nullable Output<List<String>> zones;

    public Optional<Output<List<String>>> zones() {
        return Optional.ofNullable(this.zones);
    }

    private CapacityReservationGroupArgs() {}

    private CapacityReservationGroupArgs(CapacityReservationGroupArgs $) {
        this.capacityReservationGroupName = $.capacityReservationGroupName;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.zones = $.zones;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CapacityReservationGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CapacityReservationGroupArgs $;

        public Builder() {
            $ = new CapacityReservationGroupArgs();
        }

        public Builder(CapacityReservationGroupArgs defaults) {
            $ = new CapacityReservationGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder capacityReservationGroupName(@Nullable Output<String> capacityReservationGroupName) {
            $.capacityReservationGroupName = capacityReservationGroupName;
            return this;
        }

        public Builder capacityReservationGroupName(String capacityReservationGroupName) {
            return capacityReservationGroupName(Output.of(capacityReservationGroupName));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder zones(@Nullable Output<List<String>> zones) {
            $.zones = zones;
            return this;
        }

        public Builder zones(List<String> zones) {
            return zones(Output.of(zones));
        }

        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }

        public CapacityReservationGroupArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
