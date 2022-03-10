// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridcompute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies the operating system settings for the hybrid machine.
 * 
 */
public final class MachinePropertiesResponseOsProfile extends io.pulumi.resources.InvokeArgs {

    public static final MachinePropertiesResponseOsProfile Empty = new MachinePropertiesResponseOsProfile();

    /**
     * Specifies the host OS name of the hybrid machine.
     * 
     */
    @InputImport(name="computerName", required=true)
      private final String computerName;

    public String getComputerName() {
        return this.computerName;
    }

    public MachinePropertiesResponseOsProfile(String computerName) {
        this.computerName = Objects.requireNonNull(computerName, "expected parameter 'computerName' to be non-null");
    }

    private MachinePropertiesResponseOsProfile() {
        this.computerName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachinePropertiesResponseOsProfile defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String computerName;

        public Builder() {
    	      // Empty
        }

        public Builder(MachinePropertiesResponseOsProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computerName = defaults.computerName;
        }

        public Builder computerName(String computerName) {
            this.computerName = Objects.requireNonNull(computerName);
            return this;
        }
        public MachinePropertiesResponseOsProfile build() {
            return new MachinePropertiesResponseOsProfile(computerName);
        }
    }
}
