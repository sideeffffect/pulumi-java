// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.DistributionResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * This represents a particular package that is distributed over various channels. e.g. glibc (aka libc6) is distributed by many, at various versions.
 * 
 */
public final class PackageResponse extends io.pulumi.resources.InvokeArgs {

    public static final PackageResponse Empty = new PackageResponse();

    /**
     * The various channels by which a package is distributed.
     * 
     */
    @InputImport(name="distribution", required=true)
      private final List<DistributionResponse> distribution;

    public List<DistributionResponse> getDistribution() {
        return this.distribution;
    }

    /**
     * The name of the package.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public PackageResponse(
        List<DistributionResponse> distribution,
        String name) {
        this.distribution = Objects.requireNonNull(distribution, "expected parameter 'distribution' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private PackageResponse() {
        this.distribution = List.of();
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<DistributionResponse> distribution;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distribution = defaults.distribution;
    	      this.name = defaults.name;
        }

        public Builder distribution(List<DistributionResponse> distribution) {
            this.distribution = Objects.requireNonNull(distribution);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public PackageResponse build() {
            return new PackageResponse(distribution, name);
        }
    }
}
