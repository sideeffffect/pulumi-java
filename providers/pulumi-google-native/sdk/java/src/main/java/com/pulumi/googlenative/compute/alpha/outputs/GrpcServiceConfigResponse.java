// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute.alpha.outputs.CallCredentialsResponse;
import com.pulumi.googlenative.compute.alpha.outputs.ChannelCredentialsResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GrpcServiceConfigResponse {
    /**
     * @return The call credentials to access the SDS server.
     * 
     */
    private final CallCredentialsResponse callCredentials;
    /**
     * @return The channel credentials to access the SDS server.
     * 
     */
    private final ChannelCredentialsResponse channelCredentials;
    /**
     * @return The target URI of the SDS server.
     * 
     */
    private final String targetUri;

    @CustomType.Constructor
    private GrpcServiceConfigResponse(
        @CustomType.Parameter("callCredentials") CallCredentialsResponse callCredentials,
        @CustomType.Parameter("channelCredentials") ChannelCredentialsResponse channelCredentials,
        @CustomType.Parameter("targetUri") String targetUri) {
        this.callCredentials = callCredentials;
        this.channelCredentials = channelCredentials;
        this.targetUri = targetUri;
    }

    /**
     * @return The call credentials to access the SDS server.
     * 
     */
    public CallCredentialsResponse callCredentials() {
        return this.callCredentials;
    }
    /**
     * @return The channel credentials to access the SDS server.
     * 
     */
    public ChannelCredentialsResponse channelCredentials() {
        return this.channelCredentials;
    }
    /**
     * @return The target URI of the SDS server.
     * 
     */
    public String targetUri() {
        return this.targetUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrpcServiceConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CallCredentialsResponse callCredentials;
        private ChannelCredentialsResponse channelCredentials;
        private String targetUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GrpcServiceConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.callCredentials = defaults.callCredentials;
    	      this.channelCredentials = defaults.channelCredentials;
    	      this.targetUri = defaults.targetUri;
        }

        public Builder callCredentials(CallCredentialsResponse callCredentials) {
            this.callCredentials = Objects.requireNonNull(callCredentials);
            return this;
        }
        public Builder channelCredentials(ChannelCredentialsResponse channelCredentials) {
            this.channelCredentials = Objects.requireNonNull(channelCredentials);
            return this;
        }
        public Builder targetUri(String targetUri) {
            this.targetUri = Objects.requireNonNull(targetUri);
            return this;
        }        public GrpcServiceConfigResponse build() {
            return new GrpcServiceConfigResponse(callCredentials, channelCredentials, targetUri);
        }
    }
}
