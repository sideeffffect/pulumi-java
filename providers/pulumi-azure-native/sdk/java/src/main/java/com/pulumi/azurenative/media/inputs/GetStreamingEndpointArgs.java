// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetStreamingEndpointArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStreamingEndpointArgs Empty = new GetStreamingEndpointArgs();

    /**
     * The Media Services account name.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    public String accountName() {
        return this.accountName;
    }

    /**
     * The name of the resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the streaming endpoint, maximum length is 24.
     * 
     */
    @Import(name="streamingEndpointName", required=true)
    private String streamingEndpointName;

    public String streamingEndpointName() {
        return this.streamingEndpointName;
    }

    private GetStreamingEndpointArgs() {}

    private GetStreamingEndpointArgs(GetStreamingEndpointArgs $) {
        this.accountName = $.accountName;
        this.resourceGroupName = $.resourceGroupName;
        this.streamingEndpointName = $.streamingEndpointName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStreamingEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStreamingEndpointArgs $;

        public Builder() {
            $ = new GetStreamingEndpointArgs();
        }

        public Builder(GetStreamingEndpointArgs defaults) {
            $ = new GetStreamingEndpointArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder streamingEndpointName(String streamingEndpointName) {
            $.streamingEndpointName = streamingEndpointName;
            return this;
        }

        public GetStreamingEndpointArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.streamingEndpointName = Objects.requireNonNull($.streamingEndpointName, "expected parameter 'streamingEndpointName' to be non-null");
            return $;
        }
    }

}
