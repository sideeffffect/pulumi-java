// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class LicenseResourceRequirementsResponse {
    /**
     * Minimum number of guest cpus required to use the Instance. Enforced at Instance creation and Instance start.
     * 
     */
    private final Integer minGuestCpuCount;
    /**
     * Minimum memory required to use the Instance. Enforced at Instance creation and Instance start.
     * 
     */
    private final Integer minMemoryMb;

    @OutputCustomType.Constructor
    private LicenseResourceRequirementsResponse(
        @OutputCustomType.Parameter("minGuestCpuCount") Integer minGuestCpuCount,
        @OutputCustomType.Parameter("minMemoryMb") Integer minMemoryMb) {
        this.minGuestCpuCount = minGuestCpuCount;
        this.minMemoryMb = minMemoryMb;
    }

    /**
     * Minimum number of guest cpus required to use the Instance. Enforced at Instance creation and Instance start.
     * 
    */
    public Integer getMinGuestCpuCount() {
        return this.minGuestCpuCount;
    }
    /**
     * Minimum memory required to use the Instance. Enforced at Instance creation and Instance start.
     * 
    */
    public Integer getMinMemoryMb() {
        return this.minMemoryMb;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicenseResourceRequirementsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer minGuestCpuCount;
        private Integer minMemoryMb;

        public Builder() {
    	      // Empty
        }

        public Builder(LicenseResourceRequirementsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minGuestCpuCount = defaults.minGuestCpuCount;
    	      this.minMemoryMb = defaults.minMemoryMb;
        }

        public Builder minGuestCpuCount(Integer minGuestCpuCount) {
            this.minGuestCpuCount = Objects.requireNonNull(minGuestCpuCount);
            return this;
        }

        public Builder minMemoryMb(Integer minMemoryMb) {
            this.minMemoryMb = Objects.requireNonNull(minMemoryMb);
            return this;
        }
        public LicenseResourceRequirementsResponse build() {
            return new LicenseResourceRequirementsResponse(minGuestCpuCount, minMemoryMb);
        }
    }
}
