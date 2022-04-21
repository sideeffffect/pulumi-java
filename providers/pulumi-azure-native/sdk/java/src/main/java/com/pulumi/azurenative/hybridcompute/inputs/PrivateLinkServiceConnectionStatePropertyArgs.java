// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybridcompute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * State of the private endpoint connection.
 * 
 */
public final class PrivateLinkServiceConnectionStatePropertyArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateLinkServiceConnectionStatePropertyArgs Empty = new PrivateLinkServiceConnectionStatePropertyArgs();

    /**
     * The private link service connection description.
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    public Output<String> description() {
        return this.description;
    }

    /**
     * The private link service connection status.
     * 
     */
    @Import(name="status", required=true)
    private Output<String> status;

    public Output<String> status() {
        return this.status;
    }

    private PrivateLinkServiceConnectionStatePropertyArgs() {}

    private PrivateLinkServiceConnectionStatePropertyArgs(PrivateLinkServiceConnectionStatePropertyArgs $) {
        this.description = $.description;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateLinkServiceConnectionStatePropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateLinkServiceConnectionStatePropertyArgs $;

        public Builder() {
            $ = new PrivateLinkServiceConnectionStatePropertyArgs();
        }

        public Builder(PrivateLinkServiceConnectionStatePropertyArgs defaults) {
            $ = new PrivateLinkServiceConnectionStatePropertyArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder status(Output<String> status) {
            $.status = status;
            return this;
        }

        public Builder status(String status) {
            return status(Output.of(status));
        }

        public PrivateLinkServiceConnectionStatePropertyArgs build() {
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            return $;
        }
    }

}
