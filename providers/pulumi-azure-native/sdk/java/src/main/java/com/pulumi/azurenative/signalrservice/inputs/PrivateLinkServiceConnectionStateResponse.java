// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.signalrservice.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Connection state of the private endpoint connection
 * 
 */
public final class PrivateLinkServiceConnectionStateResponse extends com.pulumi.resources.InvokeArgs {

    public static final PrivateLinkServiceConnectionStateResponse Empty = new PrivateLinkServiceConnectionStateResponse();

    /**
     * A message indicating if changes on the service provider require any updates on the consumer.
     * 
     */
    @Import(name="actionsRequired")
    private @Nullable String actionsRequired;

    public Optional<String> actionsRequired() {
        return Optional.ofNullable(this.actionsRequired);
    }

    /**
     * The reason for approval/rejection of the connection.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Indicates whether the connection has been Approved/Rejected/Removed by the owner of the service.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private PrivateLinkServiceConnectionStateResponse() {}

    private PrivateLinkServiceConnectionStateResponse(PrivateLinkServiceConnectionStateResponse $) {
        this.actionsRequired = $.actionsRequired;
        this.description = $.description;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateLinkServiceConnectionStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateLinkServiceConnectionStateResponse $;

        public Builder() {
            $ = new PrivateLinkServiceConnectionStateResponse();
        }

        public Builder(PrivateLinkServiceConnectionStateResponse defaults) {
            $ = new PrivateLinkServiceConnectionStateResponse(Objects.requireNonNull(defaults));
        }

        public Builder actionsRequired(@Nullable String actionsRequired) {
            $.actionsRequired = actionsRequired;
            return this;
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public PrivateLinkServiceConnectionStateResponse build() {
            return $;
        }
    }

}
