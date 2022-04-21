// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.digitaltwins.inputs;

import com.pulumi.azurenative.digitaltwins.inputs.ConnectionPropertiesPrivateLinkServiceConnectionStateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateEndpointConnectionPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointConnectionPropertiesArgs Empty = new PrivateEndpointConnectionPropertiesArgs();

    /**
     * The list of group ids for the private endpoint connection.
     * 
     */
    @Import(name="groupIds")
    private @Nullable Output<List<String>> groupIds;

    public Optional<Output<List<String>>> groupIds() {
        return Optional.ofNullable(this.groupIds);
    }

    @Import(name="privateLinkServiceConnectionState")
    private @Nullable Output<ConnectionPropertiesPrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;

    public Optional<Output<ConnectionPropertiesPrivateLinkServiceConnectionStateArgs>> privateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }

    private PrivateEndpointConnectionPropertiesArgs() {}

    private PrivateEndpointConnectionPropertiesArgs(PrivateEndpointConnectionPropertiesArgs $) {
        this.groupIds = $.groupIds;
        this.privateLinkServiceConnectionState = $.privateLinkServiceConnectionState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateEndpointConnectionPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateEndpointConnectionPropertiesArgs $;

        public Builder() {
            $ = new PrivateEndpointConnectionPropertiesArgs();
        }

        public Builder(PrivateEndpointConnectionPropertiesArgs defaults) {
            $ = new PrivateEndpointConnectionPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder groupIds(@Nullable Output<List<String>> groupIds) {
            $.groupIds = groupIds;
            return this;
        }

        public Builder groupIds(List<String> groupIds) {
            return groupIds(Output.of(groupIds));
        }

        public Builder groupIds(String... groupIds) {
            return groupIds(List.of(groupIds));
        }

        public Builder privateLinkServiceConnectionState(@Nullable Output<ConnectionPropertiesPrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState) {
            $.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder privateLinkServiceConnectionState(ConnectionPropertiesPrivateLinkServiceConnectionStateArgs privateLinkServiceConnectionState) {
            return privateLinkServiceConnectionState(Output.of(privateLinkServiceConnectionState));
        }

        public PrivateEndpointConnectionPropertiesArgs build() {
            return $;
        }
    }

}
