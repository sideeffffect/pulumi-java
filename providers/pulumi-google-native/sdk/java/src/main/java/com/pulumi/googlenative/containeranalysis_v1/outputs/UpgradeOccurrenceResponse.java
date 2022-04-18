// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.containeranalysis_v1.outputs.UpgradeDistributionResponse;
import com.pulumi.googlenative.containeranalysis_v1.outputs.VersionResponse;
import com.pulumi.googlenative.containeranalysis_v1.outputs.WindowsUpdateResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class UpgradeOccurrenceResponse {
    /**
     * Metadata about the upgrade for available for the specific operating system for the resource_url. This allows efficient filtering, as well as making it easier to use the occurrence.
     * 
     */
    private final UpgradeDistributionResponse distribution;
    /**
     * Required for non-Windows OS. The package this Upgrade is for.
     * 
     */
    private final String package_;
    /**
     * Required for non-Windows OS. The version of the package in a machine + human readable form.
     * 
     */
    private final VersionResponse parsedVersion;
    /**
     * Required for Windows OS. Represents the metadata about the Windows update.
     * 
     */
    private final WindowsUpdateResponse windowsUpdate;

    @CustomType.Constructor
    private UpgradeOccurrenceResponse(
        @CustomType.Parameter("distribution") UpgradeDistributionResponse distribution,
        @CustomType.Parameter("package") String package_,
        @CustomType.Parameter("parsedVersion") VersionResponse parsedVersion,
        @CustomType.Parameter("windowsUpdate") WindowsUpdateResponse windowsUpdate) {
        this.distribution = distribution;
        this.package_ = package_;
        this.parsedVersion = parsedVersion;
        this.windowsUpdate = windowsUpdate;
    }

    /**
     * Metadata about the upgrade for available for the specific operating system for the resource_url. This allows efficient filtering, as well as making it easier to use the occurrence.
     * 
    */
    public UpgradeDistributionResponse distribution() {
        return this.distribution;
    }
    /**
     * Required for non-Windows OS. The package this Upgrade is for.
     * 
    */
    public String package_() {
        return this.package_;
    }
    /**
     * Required for non-Windows OS. The version of the package in a machine + human readable form.
     * 
    */
    public VersionResponse parsedVersion() {
        return this.parsedVersion;
    }
    /**
     * Required for Windows OS. Represents the metadata about the Windows update.
     * 
    */
    public WindowsUpdateResponse windowsUpdate() {
        return this.windowsUpdate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpgradeOccurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UpgradeDistributionResponse distribution;
        private String package_;
        private VersionResponse parsedVersion;
        private WindowsUpdateResponse windowsUpdate;

        public Builder() {
    	      // Empty
        }

        public Builder(UpgradeOccurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distribution = defaults.distribution;
    	      this.package_ = defaults.package_;
    	      this.parsedVersion = defaults.parsedVersion;
    	      this.windowsUpdate = defaults.windowsUpdate;
        }

        public Builder distribution(UpgradeDistributionResponse distribution) {
            this.distribution = Objects.requireNonNull(distribution);
            return this;
        }
        public Builder package_(String package_) {
            this.package_ = Objects.requireNonNull(package_);
            return this;
        }
        public Builder parsedVersion(VersionResponse parsedVersion) {
            this.parsedVersion = Objects.requireNonNull(parsedVersion);
            return this;
        }
        public Builder windowsUpdate(WindowsUpdateResponse windowsUpdate) {
            this.windowsUpdate = Objects.requireNonNull(windowsUpdate);
            return this;
        }        public UpgradeOccurrenceResponse build() {
            return new UpgradeOccurrenceResponse(distribution, package_, parsedVersion, windowsUpdate);
        }
    }
}
