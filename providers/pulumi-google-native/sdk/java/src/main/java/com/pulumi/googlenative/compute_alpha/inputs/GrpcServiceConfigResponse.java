// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.inputs.CallCredentialsResponse;
import com.pulumi.googlenative.compute_alpha.inputs.ChannelCredentialsResponse;
import java.lang.String;
import java.util.Objects;


/**
 * [Deprecated] gRPC config to access the SDS server. gRPC config to access the SDS server.
 * 
 */
public final class GrpcServiceConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final GrpcServiceConfigResponse Empty = new GrpcServiceConfigResponse();

    /**
     * The call credentials to access the SDS server.
     * 
     */
    @Import(name="callCredentials", required=true)
    private CallCredentialsResponse callCredentials;

    public CallCredentialsResponse callCredentials() {
        return this.callCredentials;
    }

    /**
     * The channel credentials to access the SDS server.
     * 
     */
    @Import(name="channelCredentials", required=true)
    private ChannelCredentialsResponse channelCredentials;

    public ChannelCredentialsResponse channelCredentials() {
        return this.channelCredentials;
    }

    /**
     * The target URI of the SDS server.
     * 
     */
    @Import(name="targetUri", required=true)
    private String targetUri;

    public String targetUri() {
        return this.targetUri;
    }

    private GrpcServiceConfigResponse() {}

    private GrpcServiceConfigResponse(GrpcServiceConfigResponse $) {
        this.callCredentials = $.callCredentials;
        this.channelCredentials = $.channelCredentials;
        this.targetUri = $.targetUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GrpcServiceConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GrpcServiceConfigResponse $;

        public Builder() {
            $ = new GrpcServiceConfigResponse();
        }

        public Builder(GrpcServiceConfigResponse defaults) {
            $ = new GrpcServiceConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder callCredentials(CallCredentialsResponse callCredentials) {
            $.callCredentials = callCredentials;
            return this;
        }

        public Builder channelCredentials(ChannelCredentialsResponse channelCredentials) {
            $.channelCredentials = channelCredentials;
            return this;
        }

        public Builder targetUri(String targetUri) {
            $.targetUri = targetUri;
            return this;
        }

        public GrpcServiceConfigResponse build() {
            $.callCredentials = Objects.requireNonNull($.callCredentials, "expected parameter 'callCredentials' to be non-null");
            $.channelCredentials = Objects.requireNonNull($.channelCredentials, "expected parameter 'channelCredentials' to be non-null");
            $.targetUri = Objects.requireNonNull($.targetUri, "expected parameter 'targetUri' to be non-null");
            return $;
        }
    }

}
