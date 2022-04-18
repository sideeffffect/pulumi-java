// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProvisioningTemplateProvisioningHook {
    private final @Nullable String payloadVersion;
    private final @Nullable String targetArn;

    @CustomType.Constructor
    private ProvisioningTemplateProvisioningHook(
        @CustomType.Parameter("payloadVersion") @Nullable String payloadVersion,
        @CustomType.Parameter("targetArn") @Nullable String targetArn) {
        this.payloadVersion = payloadVersion;
        this.targetArn = targetArn;
    }

    public Optional<String> payloadVersion() {
        return Optional.ofNullable(this.payloadVersion);
    }
    public Optional<String> targetArn() {
        return Optional.ofNullable(this.targetArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProvisioningTemplateProvisioningHook defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String payloadVersion;
        private @Nullable String targetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ProvisioningTemplateProvisioningHook defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.payloadVersion = defaults.payloadVersion;
    	      this.targetArn = defaults.targetArn;
        }

        public Builder payloadVersion(@Nullable String payloadVersion) {
            this.payloadVersion = payloadVersion;
            return this;
        }
        public Builder targetArn(@Nullable String targetArn) {
            this.targetArn = targetArn;
            return this;
        }        public ProvisioningTemplateProvisioningHook build() {
            return new ProvisioningTemplateProvisioningHook(payloadVersion, targetArn);
        }
    }
}
