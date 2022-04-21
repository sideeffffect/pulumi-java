// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.inputs.ResourceReferenceResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the properties of an existing Shared Private Link Resource to use when connecting to a private origin.
 * 
 */
public final class SharedPrivateLinkResourcePropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final SharedPrivateLinkResourcePropertiesResponse Empty = new SharedPrivateLinkResourcePropertiesResponse();

    /**
     * The group id from the provider of resource the shared private link resource is for.
     * 
     */
    @Import(name="groupId")
    private @Nullable String groupId;

    public Optional<String> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    /**
     * The resource id of the resource the shared private link resource is for.
     * 
     */
    @Import(name="privateLink")
    private @Nullable ResourceReferenceResponse privateLink;

    public Optional<ResourceReferenceResponse> privateLink() {
        return Optional.ofNullable(this.privateLink);
    }

    /**
     * The location of the shared private link resource
     * 
     */
    @Import(name="privateLinkLocation")
    private @Nullable String privateLinkLocation;

    public Optional<String> privateLinkLocation() {
        return Optional.ofNullable(this.privateLinkLocation);
    }

    /**
     * The request message for requesting approval of the shared private link resource.
     * 
     */
    @Import(name="requestMessage")
    private @Nullable String requestMessage;

    public Optional<String> requestMessage() {
        return Optional.ofNullable(this.requestMessage);
    }

    /**
     * Status of the shared private link resource. Can be Pending, Approved, Rejected, Disconnected, or Timeout.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private SharedPrivateLinkResourcePropertiesResponse() {}

    private SharedPrivateLinkResourcePropertiesResponse(SharedPrivateLinkResourcePropertiesResponse $) {
        this.groupId = $.groupId;
        this.privateLink = $.privateLink;
        this.privateLinkLocation = $.privateLinkLocation;
        this.requestMessage = $.requestMessage;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SharedPrivateLinkResourcePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SharedPrivateLinkResourcePropertiesResponse $;

        public Builder() {
            $ = new SharedPrivateLinkResourcePropertiesResponse();
        }

        public Builder(SharedPrivateLinkResourcePropertiesResponse defaults) {
            $ = new SharedPrivateLinkResourcePropertiesResponse(Objects.requireNonNull(defaults));
        }

        public Builder groupId(@Nullable String groupId) {
            $.groupId = groupId;
            return this;
        }

        public Builder privateLink(@Nullable ResourceReferenceResponse privateLink) {
            $.privateLink = privateLink;
            return this;
        }

        public Builder privateLinkLocation(@Nullable String privateLinkLocation) {
            $.privateLinkLocation = privateLinkLocation;
            return this;
        }

        public Builder requestMessage(@Nullable String requestMessage) {
            $.requestMessage = requestMessage;
            return this;
        }

        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public SharedPrivateLinkResourcePropertiesResponse build() {
            return $;
        }
    }

}
