// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains a summary of a gateway capability configuration.
 * 
 */
public final class GatewayCapabilitySummary extends com.pulumi.resources.InvokeArgs {

    public static final GatewayCapabilitySummary Empty = new GatewayCapabilitySummary();

    @Import(name="capabilityConfiguration")
    private @Nullable String capabilityConfiguration;

    public Optional<String> capabilityConfiguration() {
        return Optional.ofNullable(this.capabilityConfiguration);
    }

    @Import(name="capabilityNamespace", required=true)
    private String capabilityNamespace;

    public String capabilityNamespace() {
        return this.capabilityNamespace;
    }

    private GatewayCapabilitySummary() {}

    private GatewayCapabilitySummary(GatewayCapabilitySummary $) {
        this.capabilityConfiguration = $.capabilityConfiguration;
        this.capabilityNamespace = $.capabilityNamespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayCapabilitySummary defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayCapabilitySummary $;

        public Builder() {
            $ = new GatewayCapabilitySummary();
        }

        public Builder(GatewayCapabilitySummary defaults) {
            $ = new GatewayCapabilitySummary(Objects.requireNonNull(defaults));
        }

        public Builder capabilityConfiguration(@Nullable String capabilityConfiguration) {
            $.capabilityConfiguration = capabilityConfiguration;
            return this;
        }

        public Builder capabilityNamespace(String capabilityNamespace) {
            $.capabilityNamespace = capabilityNamespace;
            return this;
        }

        public GatewayCapabilitySummary build() {
            $.capabilityNamespace = Objects.requireNonNull($.capabilityNamespace, "expected parameter 'capabilityNamespace' to be non-null");
            return $;
        }
    }

}
