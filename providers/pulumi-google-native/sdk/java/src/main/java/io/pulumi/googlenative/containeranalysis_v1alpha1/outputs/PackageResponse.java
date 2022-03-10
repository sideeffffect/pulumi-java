// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.DistributionResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class PackageResponse {
    /**
     * The various channels by which a package is distributed.
     * 
     */
    private final List<DistributionResponse> distribution;
    /**
     * The name of the package.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor
    private PackageResponse(
        @OutputCustomType.Parameter("distribution") List<DistributionResponse> distribution,
        @OutputCustomType.Parameter("name") String name) {
        this.distribution = distribution;
        this.name = name;
    }

    /**
     * The various channels by which a package is distributed.
     * 
    */
    public List<DistributionResponse> getDistribution() {
        return this.distribution;
    }
    /**
     * The name of the package.
     * 
    */
    public String getName() {
        return this.name;
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
