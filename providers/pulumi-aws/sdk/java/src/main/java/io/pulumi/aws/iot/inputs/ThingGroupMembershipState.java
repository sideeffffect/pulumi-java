// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ThingGroupMembershipState extends io.pulumi.resources.ResourceArgs {

    public static final ThingGroupMembershipState Empty = new ThingGroupMembershipState();

    /**
     * Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs to 10 thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static group removes the thing from the last dynamic group.
     * 
     */
    @InputImport(name="overrideDynamicGroup")
      private final @Nullable Input<Boolean> overrideDynamicGroup;

    public Input<Boolean> getOverrideDynamicGroup() {
        return this.overrideDynamicGroup == null ? Input.empty() : this.overrideDynamicGroup;
    }

    /**
     * The name of the group to which you are adding a thing.
     * 
     */
    @InputImport(name="thingGroupName")
      private final @Nullable Input<String> thingGroupName;

    public Input<String> getThingGroupName() {
        return this.thingGroupName == null ? Input.empty() : this.thingGroupName;
    }

    /**
     * The name of the thing to add to a group.
     * 
     */
    @InputImport(name="thingName")
      private final @Nullable Input<String> thingName;

    public Input<String> getThingName() {
        return this.thingName == null ? Input.empty() : this.thingName;
    }

    public ThingGroupMembershipState(
        @Nullable Input<Boolean> overrideDynamicGroup,
        @Nullable Input<String> thingGroupName,
        @Nullable Input<String> thingName) {
        this.overrideDynamicGroup = overrideDynamicGroup;
        this.thingGroupName = thingGroupName;
        this.thingName = thingName;
    }

    private ThingGroupMembershipState() {
        this.overrideDynamicGroup = Input.empty();
        this.thingGroupName = Input.empty();
        this.thingName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThingGroupMembershipState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> overrideDynamicGroup;
        private @Nullable Input<String> thingGroupName;
        private @Nullable Input<String> thingName;

        public Builder() {
    	      // Empty
        }

        public Builder(ThingGroupMembershipState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.overrideDynamicGroup = defaults.overrideDynamicGroup;
    	      this.thingGroupName = defaults.thingGroupName;
    	      this.thingName = defaults.thingName;
        }

        public Builder overrideDynamicGroup(@Nullable Input<Boolean> overrideDynamicGroup) {
            this.overrideDynamicGroup = overrideDynamicGroup;
            return this;
        }

        public Builder overrideDynamicGroup(@Nullable Boolean overrideDynamicGroup) {
            this.overrideDynamicGroup = Input.ofNullable(overrideDynamicGroup);
            return this;
        }

        public Builder thingGroupName(@Nullable Input<String> thingGroupName) {
            this.thingGroupName = thingGroupName;
            return this;
        }

        public Builder thingGroupName(@Nullable String thingGroupName) {
            this.thingGroupName = Input.ofNullable(thingGroupName);
            return this;
        }

        public Builder thingName(@Nullable Input<String> thingName) {
            this.thingName = thingName;
            return this;
        }

        public Builder thingName(@Nullable String thingName) {
            this.thingName = Input.ofNullable(thingName);
            return this;
        }
        public ThingGroupMembershipState build() {
            return new ThingGroupMembershipState(overrideDynamicGroup, thingGroupName, thingName);
        }
    }
}
