// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.GroupMembersItemResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The network configuration group resource
 * 
 */
public final class ConfigurationGroupResponse extends com.pulumi.resources.InvokeArgs {

    public static final ConfigurationGroupResponse Empty = new ConfigurationGroupResponse();

    /**
     * Network group conditional filter.
     * 
     */
    @Import(name="conditionalMembership")
    private @Nullable String conditionalMembership;

    public Optional<String> conditionalMembership() {
        return Optional.ofNullable(this.conditionalMembership);
    }

    /**
     * A description of the network group.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A friendly name for the network group.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Group members of network group.
     * 
     */
    @Import(name="groupMembers")
    private @Nullable List<GroupMembersItemResponse> groupMembers;

    public Optional<List<GroupMembersItemResponse>> groupMembers() {
        return Optional.ofNullable(this.groupMembers);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Group member type.
     * 
     */
    @Import(name="memberType")
    private @Nullable String memberType;

    public Optional<String> memberType() {
        return Optional.ofNullable(this.memberType);
    }

    /**
     * The provisioning state of the scope assignment resource.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    private ConfigurationGroupResponse() {}

    private ConfigurationGroupResponse(ConfigurationGroupResponse $) {
        this.conditionalMembership = $.conditionalMembership;
        this.description = $.description;
        this.displayName = $.displayName;
        this.groupMembers = $.groupMembers;
        this.id = $.id;
        this.memberType = $.memberType;
        this.provisioningState = $.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigurationGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigurationGroupResponse $;

        public Builder() {
            $ = new ConfigurationGroupResponse();
        }

        public Builder(ConfigurationGroupResponse defaults) {
            $ = new ConfigurationGroupResponse(Objects.requireNonNull(defaults));
        }

        public Builder conditionalMembership(@Nullable String conditionalMembership) {
            $.conditionalMembership = conditionalMembership;
            return this;
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder groupMembers(@Nullable List<GroupMembersItemResponse> groupMembers) {
            $.groupMembers = groupMembers;
            return this;
        }

        public Builder groupMembers(GroupMembersItemResponse... groupMembers) {
            return groupMembers(List.of(groupMembers));
        }

        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public Builder memberType(@Nullable String memberType) {
            $.memberType = memberType;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public ConfigurationGroupResponse build() {
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            return $;
        }
    }

}
