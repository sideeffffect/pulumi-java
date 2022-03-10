// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Gets or sets the availability set resource settings.
 * 
 */
public final class AvailabilitySetResourceSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AvailabilitySetResourceSettingsArgs Empty = new AvailabilitySetResourceSettingsArgs();

    /**
     * Gets or sets the target fault domain.
     * 
     */
    @InputImport(name="faultDomain")
      private final @Nullable Input<Integer> faultDomain;

    public Input<Integer> getFaultDomain() {
        return this.faultDomain == null ? Input.empty() : this.faultDomain;
    }

    /**
     * The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is 'Microsoft.Compute/availabilitySets'.
     * 
     */
    @InputImport(name="resourceType", required=true)
      private final Input<String> resourceType;

    public Input<String> getPropResourceType() {
        return this.resourceType;
    }

    /**
     * Gets or sets the target Resource name.
     * 
     */
    @InputImport(name="targetResourceName", required=true)
      private final Input<String> targetResourceName;

    public Input<String> getTargetResourceName() {
        return this.targetResourceName;
    }

    /**
     * Gets or sets the target update domain.
     * 
     */
    @InputImport(name="updateDomain")
      private final @Nullable Input<Integer> updateDomain;

    public Input<Integer> getUpdateDomain() {
        return this.updateDomain == null ? Input.empty() : this.updateDomain;
    }

    public AvailabilitySetResourceSettingsArgs(
        @Nullable Input<Integer> faultDomain,
        Input<String> resourceType,
        Input<String> targetResourceName,
        @Nullable Input<Integer> updateDomain) {
        this.faultDomain = faultDomain;
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
        this.targetResourceName = Objects.requireNonNull(targetResourceName, "expected parameter 'targetResourceName' to be non-null");
        this.updateDomain = updateDomain;
    }

    private AvailabilitySetResourceSettingsArgs() {
        this.faultDomain = Input.empty();
        this.resourceType = Input.empty();
        this.targetResourceName = Input.empty();
        this.updateDomain = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AvailabilitySetResourceSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> faultDomain;
        private Input<String> resourceType;
        private Input<String> targetResourceName;
        private @Nullable Input<Integer> updateDomain;

        public Builder() {
    	      // Empty
        }

        public Builder(AvailabilitySetResourceSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.faultDomain = defaults.faultDomain;
    	      this.resourceType = defaults.resourceType;
    	      this.targetResourceName = defaults.targetResourceName;
    	      this.updateDomain = defaults.updateDomain;
        }

        public Builder faultDomain(@Nullable Input<Integer> faultDomain) {
            this.faultDomain = faultDomain;
            return this;
        }

        public Builder faultDomain(@Nullable Integer faultDomain) {
            this.faultDomain = Input.ofNullable(faultDomain);
            return this;
        }

        public Builder resourceType(Input<String> resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public Builder resourceType(String resourceType) {
            this.resourceType = Input.of(Objects.requireNonNull(resourceType));
            return this;
        }

        public Builder targetResourceName(Input<String> targetResourceName) {
            this.targetResourceName = Objects.requireNonNull(targetResourceName);
            return this;
        }

        public Builder targetResourceName(String targetResourceName) {
            this.targetResourceName = Input.of(Objects.requireNonNull(targetResourceName));
            return this;
        }

        public Builder updateDomain(@Nullable Input<Integer> updateDomain) {
            this.updateDomain = updateDomain;
            return this;
        }

        public Builder updateDomain(@Nullable Integer updateDomain) {
            this.updateDomain = Input.ofNullable(updateDomain);
            return this;
        }
        public AvailabilitySetResourceSettingsArgs build() {
            return new AvailabilitySetResourceSettingsArgs(faultDomain, resourceType, targetResourceName, updateDomain);
        }
    }
}
