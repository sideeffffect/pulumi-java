// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.inputs;

import com.pulumi.azurenative.appplatform.inputs.GatewayApiMetadataPropertiesArgs;
import com.pulumi.azurenative.appplatform.inputs.GatewayCorsPropertiesArgs;
import com.pulumi.azurenative.appplatform.inputs.GatewayResourceRequestsArgs;
import com.pulumi.azurenative.appplatform.inputs.SsoPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Spring Cloud Gateway properties payload
 * 
 */
public final class GatewayPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayPropertiesArgs Empty = new GatewayPropertiesArgs();

    /**
     * API metadata property for Spring Cloud Gateway
     * 
     */
    @Import(name="apiMetadataProperties")
    private @Nullable Output<GatewayApiMetadataPropertiesArgs> apiMetadataProperties;

    public Optional<Output<GatewayApiMetadataPropertiesArgs>> apiMetadataProperties() {
        return Optional.ofNullable(this.apiMetadataProperties);
    }

    /**
     * Cross-Origin Resource Sharing property
     * 
     */
    @Import(name="corsProperties")
    private @Nullable Output<GatewayCorsPropertiesArgs> corsProperties;

    public Optional<Output<GatewayCorsPropertiesArgs>> corsProperties() {
        return Optional.ofNullable(this.corsProperties);
    }

    /**
     * Indicate if only https is allowed.
     * 
     */
    @Import(name="httpsOnly")
    private @Nullable Output<Boolean> httpsOnly;

    public Optional<Output<Boolean>> httpsOnly() {
        return Optional.ofNullable(this.httpsOnly);
    }

    /**
     * Indicates whether the Spring Cloud Gateway exposes endpoint.
     * 
     */
    @Import(name="public")
    private @Nullable Output<Boolean> public_;

    public Optional<Output<Boolean>> public_() {
        return Optional.ofNullable(this.public_);
    }

    /**
     * The requested resource quantity for required CPU and Memory.
     * 
     */
    @Import(name="resourceRequests")
    private @Nullable Output<GatewayResourceRequestsArgs> resourceRequests;

    public Optional<Output<GatewayResourceRequestsArgs>> resourceRequests() {
        return Optional.ofNullable(this.resourceRequests);
    }

    /**
     * Single sign-on related configuration
     * 
     */
    @Import(name="ssoProperties")
    private @Nullable Output<SsoPropertiesArgs> ssoProperties;

    public Optional<Output<SsoPropertiesArgs>> ssoProperties() {
        return Optional.ofNullable(this.ssoProperties);
    }

    private GatewayPropertiesArgs() {}

    private GatewayPropertiesArgs(GatewayPropertiesArgs $) {
        this.apiMetadataProperties = $.apiMetadataProperties;
        this.corsProperties = $.corsProperties;
        this.httpsOnly = $.httpsOnly;
        this.public_ = $.public_;
        this.resourceRequests = $.resourceRequests;
        this.ssoProperties = $.ssoProperties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayPropertiesArgs $;

        public Builder() {
            $ = new GatewayPropertiesArgs();
        }

        public Builder(GatewayPropertiesArgs defaults) {
            $ = new GatewayPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder apiMetadataProperties(@Nullable Output<GatewayApiMetadataPropertiesArgs> apiMetadataProperties) {
            $.apiMetadataProperties = apiMetadataProperties;
            return this;
        }

        public Builder apiMetadataProperties(GatewayApiMetadataPropertiesArgs apiMetadataProperties) {
            return apiMetadataProperties(Output.of(apiMetadataProperties));
        }

        public Builder corsProperties(@Nullable Output<GatewayCorsPropertiesArgs> corsProperties) {
            $.corsProperties = corsProperties;
            return this;
        }

        public Builder corsProperties(GatewayCorsPropertiesArgs corsProperties) {
            return corsProperties(Output.of(corsProperties));
        }

        public Builder httpsOnly(@Nullable Output<Boolean> httpsOnly) {
            $.httpsOnly = httpsOnly;
            return this;
        }

        public Builder httpsOnly(Boolean httpsOnly) {
            return httpsOnly(Output.of(httpsOnly));
        }

        public Builder public_(@Nullable Output<Boolean> public_) {
            $.public_ = public_;
            return this;
        }

        public Builder public_(Boolean public_) {
            return public_(Output.of(public_));
        }

        public Builder resourceRequests(@Nullable Output<GatewayResourceRequestsArgs> resourceRequests) {
            $.resourceRequests = resourceRequests;
            return this;
        }

        public Builder resourceRequests(GatewayResourceRequestsArgs resourceRequests) {
            return resourceRequests(Output.of(resourceRequests));
        }

        public Builder ssoProperties(@Nullable Output<SsoPropertiesArgs> ssoProperties) {
            $.ssoProperties = ssoProperties;
            return this;
        }

        public Builder ssoProperties(SsoPropertiesArgs ssoProperties) {
            return ssoProperties(Output.of(ssoProperties));
        }

        public GatewayPropertiesArgs build() {
            return $;
        }
    }

}
