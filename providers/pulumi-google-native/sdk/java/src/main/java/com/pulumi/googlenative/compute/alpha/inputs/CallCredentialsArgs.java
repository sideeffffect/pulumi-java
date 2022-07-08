// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute.alpha.enums.CallCredentialsCallCredentialType;
import com.pulumi.googlenative.compute.alpha.inputs.MetadataCredentialsFromPluginArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * [Deprecated] gRPC call credentials to access the SDS server. gRPC call credentials to access the SDS server.
 * 
 */
public final class CallCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final CallCredentialsArgs Empty = new CallCredentialsArgs();

    /**
     * The type of call credentials to use for GRPC requests to the SDS server. This field can be set to one of the following: - GCE_VM: The local GCE VM service account credentials are used to access the SDS server. - FROM_PLUGIN: Custom authenticator credentials are used to access the SDS server.
     * 
     */
    @Import(name="callCredentialType")
    private @Nullable Output<CallCredentialsCallCredentialType> callCredentialType;

    /**
     * @return The type of call credentials to use for GRPC requests to the SDS server. This field can be set to one of the following: - GCE_VM: The local GCE VM service account credentials are used to access the SDS server. - FROM_PLUGIN: Custom authenticator credentials are used to access the SDS server.
     * 
     */
    public Optional<Output<CallCredentialsCallCredentialType>> callCredentialType() {
        return Optional.ofNullable(this.callCredentialType);
    }

    /**
     * Custom authenticator credentials. Valid if callCredentialType is FROM_PLUGIN.
     * 
     */
    @Import(name="fromPlugin")
    private @Nullable Output<MetadataCredentialsFromPluginArgs> fromPlugin;

    /**
     * @return Custom authenticator credentials. Valid if callCredentialType is FROM_PLUGIN.
     * 
     */
    public Optional<Output<MetadataCredentialsFromPluginArgs>> fromPlugin() {
        return Optional.ofNullable(this.fromPlugin);
    }

    private CallCredentialsArgs() {}

    private CallCredentialsArgs(CallCredentialsArgs $) {
        this.callCredentialType = $.callCredentialType;
        this.fromPlugin = $.fromPlugin;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CallCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CallCredentialsArgs $;

        public Builder() {
            $ = new CallCredentialsArgs();
        }

        public Builder(CallCredentialsArgs defaults) {
            $ = new CallCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param callCredentialType The type of call credentials to use for GRPC requests to the SDS server. This field can be set to one of the following: - GCE_VM: The local GCE VM service account credentials are used to access the SDS server. - FROM_PLUGIN: Custom authenticator credentials are used to access the SDS server.
         * 
         * @return builder
         * 
         */
        public Builder callCredentialType(@Nullable Output<CallCredentialsCallCredentialType> callCredentialType) {
            $.callCredentialType = callCredentialType;
            return this;
        }

        /**
         * @param callCredentialType The type of call credentials to use for GRPC requests to the SDS server. This field can be set to one of the following: - GCE_VM: The local GCE VM service account credentials are used to access the SDS server. - FROM_PLUGIN: Custom authenticator credentials are used to access the SDS server.
         * 
         * @return builder
         * 
         */
        public Builder callCredentialType(CallCredentialsCallCredentialType callCredentialType) {
            return callCredentialType(Output.of(callCredentialType));
        }

        /**
         * @param fromPlugin Custom authenticator credentials. Valid if callCredentialType is FROM_PLUGIN.
         * 
         * @return builder
         * 
         */
        public Builder fromPlugin(@Nullable Output<MetadataCredentialsFromPluginArgs> fromPlugin) {
            $.fromPlugin = fromPlugin;
            return this;
        }

        /**
         * @param fromPlugin Custom authenticator credentials. Valid if callCredentialType is FROM_PLUGIN.
         * 
         * @return builder
         * 
         */
        public Builder fromPlugin(MetadataCredentialsFromPluginArgs fromPlugin) {
            return fromPlugin(Output.of(fromPlugin));
        }

        public CallCredentialsArgs build() {
            return $;
        }
    }

}
