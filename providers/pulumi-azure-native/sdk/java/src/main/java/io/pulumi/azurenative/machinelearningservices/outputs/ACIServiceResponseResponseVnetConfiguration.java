// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ACIServiceResponseResponseVnetConfiguration {
    /**
     * The name of the virtual network subnet.
     * 
     */
    private final @Nullable String subnetName;
    /**
     * The name of the virtual network.
     * 
     */
    private final @Nullable String vnetName;

    @OutputCustomType.Constructor
    private ACIServiceResponseResponseVnetConfiguration(
        @OutputCustomType.Parameter("subnetName") @Nullable String subnetName,
        @OutputCustomType.Parameter("vnetName") @Nullable String vnetName) {
        this.subnetName = subnetName;
        this.vnetName = vnetName;
    }

    /**
     * The name of the virtual network subnet.
     * 
    */
    public Optional<String> getSubnetName() {
        return Optional.ofNullable(this.subnetName);
    }
    /**
     * The name of the virtual network.
     * 
    */
    public Optional<String> getVnetName() {
        return Optional.ofNullable(this.vnetName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ACIServiceResponseResponseVnetConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String subnetName;
        private @Nullable String vnetName;

        public Builder() {
    	      // Empty
        }

        public Builder(ACIServiceResponseResponseVnetConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnetName = defaults.subnetName;
    	      this.vnetName = defaults.vnetName;
        }

        public Builder subnetName(@Nullable String subnetName) {
            this.subnetName = subnetName;
            return this;
        }

        public Builder vnetName(@Nullable String vnetName) {
            this.vnetName = vnetName;
            return this;
        }
        public ACIServiceResponseResponseVnetConfiguration build() {
            return new ACIServiceResponseResponseVnetConfiguration(subnetName, vnetName);
        }
    }
}
