// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AvailabilitySetResourceSettingsResponse {
    /**
     * Gets or sets the target fault domain.
     * 
     */
    private final @Nullable Integer faultDomain;
    /**
     * The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is 'Microsoft.Compute/availabilitySets'.
     * 
     */
    private final String resourceType;
    /**
     * Gets or sets the target Resource name.
     * 
     */
    private final String targetResourceName;
    /**
     * Gets or sets the target update domain.
     * 
     */
    private final @Nullable Integer updateDomain;

    @OutputCustomType.Constructor
    private AvailabilitySetResourceSettingsResponse(
        @OutputCustomType.Parameter("faultDomain") @Nullable Integer faultDomain,
        @OutputCustomType.Parameter("resourceType") String resourceType,
        @OutputCustomType.Parameter("targetResourceName") String targetResourceName,
        @OutputCustomType.Parameter("updateDomain") @Nullable Integer updateDomain) {
        this.faultDomain = faultDomain;
        this.resourceType = resourceType;
        this.targetResourceName = targetResourceName;
        this.updateDomain = updateDomain;
    }

    /**
     * Gets or sets the target fault domain.
     * 
    */
    public Optional<Integer> getFaultDomain() {
        return Optional.ofNullable(this.faultDomain);
    }
    /**
     * The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is 'Microsoft.Compute/availabilitySets'.
     * 
    */
    public String getPropResourceType() {
        return this.resourceType;
    }
    /**
     * Gets or sets the target Resource name.
     * 
    */
    public String getTargetResourceName() {
        return this.targetResourceName;
    }
    /**
     * Gets or sets the target update domain.
     * 
    */
    public Optional<Integer> getUpdateDomain() {
        return Optional.ofNullable(this.updateDomain);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AvailabilitySetResourceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer faultDomain;
        private String resourceType;
        private String targetResourceName;
        private @Nullable Integer updateDomain;

        public Builder() {
    	      // Empty
        }

        public Builder(AvailabilitySetResourceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.faultDomain = defaults.faultDomain;
    	      this.resourceType = defaults.resourceType;
    	      this.targetResourceName = defaults.targetResourceName;
    	      this.updateDomain = defaults.updateDomain;
        }

        public Builder faultDomain(@Nullable Integer faultDomain) {
            this.faultDomain = faultDomain;
            return this;
        }

        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public Builder targetResourceName(String targetResourceName) {
            this.targetResourceName = Objects.requireNonNull(targetResourceName);
            return this;
        }

        public Builder updateDomain(@Nullable Integer updateDomain) {
            this.updateDomain = updateDomain;
            return this;
        }
        public AvailabilitySetResourceSettingsResponse build() {
            return new AvailabilitySetResourceSettingsResponse(faultDomain, resourceType, targetResourceName, updateDomain);
        }
    }
}
