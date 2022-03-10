// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.fms.outputs;

import io.pulumi.awsnative.fms.enums.PolicySecurityServicePolicyDataPropertiesType;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SecurityServicePolicyDataProperties {
    private final @Nullable String managedServiceData;
    private final PolicySecurityServicePolicyDataPropertiesType type;

    @OutputCustomType.Constructor
    private SecurityServicePolicyDataProperties(
        @OutputCustomType.Parameter("managedServiceData") @Nullable String managedServiceData,
        @OutputCustomType.Parameter("type") PolicySecurityServicePolicyDataPropertiesType type) {
        this.managedServiceData = managedServiceData;
        this.type = type;
    }

    public Optional<String> getManagedServiceData() {
        return Optional.ofNullable(this.managedServiceData);
    }
    public PolicySecurityServicePolicyDataPropertiesType getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityServicePolicyDataProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String managedServiceData;
        private PolicySecurityServicePolicyDataPropertiesType type;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityServicePolicyDataProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managedServiceData = defaults.managedServiceData;
    	      this.type = defaults.type;
        }

        public Builder managedServiceData(@Nullable String managedServiceData) {
            this.managedServiceData = managedServiceData;
            return this;
        }

        public Builder type(PolicySecurityServicePolicyDataPropertiesType type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public SecurityServicePolicyDataProperties build() {
            return new SecurityServicePolicyDataProperties(managedServiceData, type);
        }
    }
}
