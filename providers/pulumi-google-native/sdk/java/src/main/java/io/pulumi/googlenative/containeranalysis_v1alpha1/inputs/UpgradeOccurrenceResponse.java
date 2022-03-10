// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.UpgradeDistributionResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.VersionResponse;
import java.lang.String;
import java.util.Objects;


/**
 * An Upgrade Occurrence represents that a specific resource_url could install a specific upgrade. This presence is supplied via local sources (i.e. it is present in the mirror and the running system has noticed its availability).
 * 
 */
public final class UpgradeOccurrenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final UpgradeOccurrenceResponse Empty = new UpgradeOccurrenceResponse();

    /**
     * Metadata about the upgrade for available for the specific operating system for the resource_url. This allows efficient filtering, as well as making it easier to use the occurrence.
     * 
     */
    @InputImport(name="distribution", required=true)
      private final UpgradeDistributionResponse distribution;

    public UpgradeDistributionResponse getDistribution() {
        return this.distribution;
    }

    /**
     * Required - The package this Upgrade is for.
     * 
     */
    @InputImport(name="package", required=true)
      private final String $package;

    public String get$package() {
        return this.$package;
    }

    /**
     * Required - The version of the package in a machine + human readable form.
     * 
     */
    @InputImport(name="parsedVersion", required=true)
      private final VersionResponse parsedVersion;

    public VersionResponse getParsedVersion() {
        return this.parsedVersion;
    }

    public UpgradeOccurrenceResponse(
        UpgradeDistributionResponse distribution,
        String $package,
        VersionResponse parsedVersion) {
        this.distribution = Objects.requireNonNull(distribution, "expected parameter 'distribution' to be non-null");
        this.$package = Objects.requireNonNull($package, "expected parameter '$package' to be non-null");
        this.parsedVersion = Objects.requireNonNull(parsedVersion, "expected parameter 'parsedVersion' to be non-null");
    }

    private UpgradeOccurrenceResponse() {
        this.distribution = null;
        this.$package = null;
        this.parsedVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpgradeOccurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UpgradeDistributionResponse distribution;
        private String $package;
        private VersionResponse parsedVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(UpgradeOccurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distribution = defaults.distribution;
    	      this.$package = defaults.$package;
    	      this.parsedVersion = defaults.parsedVersion;
        }

        public Builder distribution(UpgradeDistributionResponse distribution) {
            this.distribution = Objects.requireNonNull(distribution);
            return this;
        }

        public Builder $package(String $package) {
            this.$package = Objects.requireNonNull($package);
            return this;
        }

        public Builder parsedVersion(VersionResponse parsedVersion) {
            this.parsedVersion = Objects.requireNonNull(parsedVersion);
            return this;
        }
        public UpgradeOccurrenceResponse build() {
            return new UpgradeOccurrenceResponse(distribution, $package, parsedVersion);
        }
    }
}
