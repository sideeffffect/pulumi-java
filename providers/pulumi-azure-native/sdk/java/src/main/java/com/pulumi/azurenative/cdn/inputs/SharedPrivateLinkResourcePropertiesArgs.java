// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.enums.SharedPrivateLinkResourceStatus;
import com.pulumi.azurenative.cdn.inputs.ResourceReferenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the properties of an existing Shared Private Link Resource to use when connecting to a private origin.
 * 
 */
public final class SharedPrivateLinkResourcePropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final SharedPrivateLinkResourcePropertiesArgs Empty = new SharedPrivateLinkResourcePropertiesArgs();

    /**
     * The group id from the provider of resource the shared private link resource is for.
     * 
     */
    @Import(name="groupId")
    private @Nullable Output<String> groupId;

    public Optional<Output<String>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    /**
     * The resource id of the resource the shared private link resource is for.
     * 
     */
    @Import(name="privateLink")
    private @Nullable Output<ResourceReferenceArgs> privateLink;

    public Optional<Output<ResourceReferenceArgs>> privateLink() {
        return Optional.ofNullable(this.privateLink);
    }

    /**
     * The location of the shared private link resource
     * 
     */
    @Import(name="privateLinkLocation")
    private @Nullable Output<String> privateLinkLocation;

    public Optional<Output<String>> privateLinkLocation() {
        return Optional.ofNullable(this.privateLinkLocation);
    }

    /**
     * The request message for requesting approval of the shared private link resource.
     * 
     */
    @Import(name="requestMessage")
    private @Nullable Output<String> requestMessage;

    public Optional<Output<String>> requestMessage() {
        return Optional.ofNullable(this.requestMessage);
    }

    /**
     * Status of the shared private link resource. Can be Pending, Approved, Rejected, Disconnected, or Timeout.
     * 
     */
    @Import(name="status")
    private @Nullable Output<SharedPrivateLinkResourceStatus> status;

    public Optional<Output<SharedPrivateLinkResourceStatus>> status() {
        return Optional.ofNullable(this.status);
    }

    private SharedPrivateLinkResourcePropertiesArgs() {}

    private SharedPrivateLinkResourcePropertiesArgs(SharedPrivateLinkResourcePropertiesArgs $) {
        this.groupId = $.groupId;
        this.privateLink = $.privateLink;
        this.privateLinkLocation = $.privateLinkLocation;
        this.requestMessage = $.requestMessage;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SharedPrivateLinkResourcePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SharedPrivateLinkResourcePropertiesArgs $;

        public Builder() {
            $ = new SharedPrivateLinkResourcePropertiesArgs();
        }

        public Builder(SharedPrivateLinkResourcePropertiesArgs defaults) {
            $ = new SharedPrivateLinkResourcePropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder groupId(@Nullable Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        public Builder privateLink(@Nullable Output<ResourceReferenceArgs> privateLink) {
            $.privateLink = privateLink;
            return this;
        }

        public Builder privateLink(ResourceReferenceArgs privateLink) {
            return privateLink(Output.of(privateLink));
        }

        public Builder privateLinkLocation(@Nullable Output<String> privateLinkLocation) {
            $.privateLinkLocation = privateLinkLocation;
            return this;
        }

        public Builder privateLinkLocation(String privateLinkLocation) {
            return privateLinkLocation(Output.of(privateLinkLocation));
        }

        public Builder requestMessage(@Nullable Output<String> requestMessage) {
            $.requestMessage = requestMessage;
            return this;
        }

        public Builder requestMessage(String requestMessage) {
            return requestMessage(Output.of(requestMessage));
        }

        public Builder status(@Nullable Output<SharedPrivateLinkResourceStatus> status) {
            $.status = status;
            return this;
        }

        public Builder status(SharedPrivateLinkResourceStatus status) {
            return status(Output.of(status));
        }

        public SharedPrivateLinkResourcePropertiesArgs build() {
            return $;
        }
    }

}
