// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute;

import com.pulumi.azurenative.compute.enums.ProximityPlacementGroupType;
import com.pulumi.azurenative.compute.inputs.InstanceViewStatusArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProximityPlacementGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProximityPlacementGroupArgs Empty = new ProximityPlacementGroupArgs();

    /**
     * Describes colocation status of the Proximity Placement Group.
     * 
     */
    @Import(name="colocationStatus")
    private @Nullable Output<InstanceViewStatusArgs> colocationStatus;

    public Optional<Output<InstanceViewStatusArgs>> colocationStatus() {
        return Optional.ofNullable(this.colocationStatus);
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
     * The name of the proximity placement group.
     * 
     */
    @Import(name="proximityPlacementGroupName")
    private @Nullable Output<String> proximityPlacementGroupName;

    public Optional<Output<String>> proximityPlacementGroupName() {
        return Optional.ofNullable(this.proximityPlacementGroupName);
    }

    /**
     * Specifies the type of the proximity placement group. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Standard** : Co-locate resources within an Azure region or Availability Zone. &lt;br&gt;&lt;br&gt; **Ultra** : For future use.
     * 
     */
    @Import(name="proximityPlacementGroupType")
    private @Nullable Output<Either<String,ProximityPlacementGroupType>> proximityPlacementGroupType;

    public Optional<Output<Either<String,ProximityPlacementGroupType>>> proximityPlacementGroupType() {
        return Optional.ofNullable(this.proximityPlacementGroupType);
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

    private ProximityPlacementGroupArgs() {}

    private ProximityPlacementGroupArgs(ProximityPlacementGroupArgs $) {
        this.colocationStatus = $.colocationStatus;
        this.location = $.location;
        this.proximityPlacementGroupName = $.proximityPlacementGroupName;
        this.proximityPlacementGroupType = $.proximityPlacementGroupType;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProximityPlacementGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProximityPlacementGroupArgs $;

        public Builder() {
            $ = new ProximityPlacementGroupArgs();
        }

        public Builder(ProximityPlacementGroupArgs defaults) {
            $ = new ProximityPlacementGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder colocationStatus(@Nullable Output<InstanceViewStatusArgs> colocationStatus) {
            $.colocationStatus = colocationStatus;
            return this;
        }

        public Builder colocationStatus(InstanceViewStatusArgs colocationStatus) {
            return colocationStatus(Output.of(colocationStatus));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder proximityPlacementGroupName(@Nullable Output<String> proximityPlacementGroupName) {
            $.proximityPlacementGroupName = proximityPlacementGroupName;
            return this;
        }

        public Builder proximityPlacementGroupName(String proximityPlacementGroupName) {
            return proximityPlacementGroupName(Output.of(proximityPlacementGroupName));
        }

        public Builder proximityPlacementGroupType(@Nullable Output<Either<String,ProximityPlacementGroupType>> proximityPlacementGroupType) {
            $.proximityPlacementGroupType = proximityPlacementGroupType;
            return this;
        }

        public Builder proximityPlacementGroupType(Either<String,ProximityPlacementGroupType> proximityPlacementGroupType) {
            return proximityPlacementGroupType(Output.of(proximityPlacementGroupType));
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

        public ProximityPlacementGroupArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
