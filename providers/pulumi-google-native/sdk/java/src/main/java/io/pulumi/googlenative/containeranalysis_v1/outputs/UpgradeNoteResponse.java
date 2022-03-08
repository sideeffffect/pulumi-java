// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1.outputs.UpgradeDistributionResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.VersionResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.WindowsUpdateResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class UpgradeNoteResponse {
    /**
     * Metadata about the upgrade for each specific operating system.
     * 
     */
    private final List<UpgradeDistributionResponse> distributions;
    /**
     * Required for non-Windows OS. The package this Upgrade is for.
     * 
     */
    private final String $package;
    /**
     * Required for non-Windows OS. The version of the package in machine + human readable form.
     * 
     */
    private final VersionResponse version;
    /**
     * Required for Windows OS. Represents the metadata about the Windows update.
     * 
     */
    private final WindowsUpdateResponse windowsUpdate;

    @OutputCustomType.Constructor({"distributions","$package","version","windowsUpdate"})
    private UpgradeNoteResponse(
        List<UpgradeDistributionResponse> distributions,
        String $package,
        VersionResponse version,
        WindowsUpdateResponse windowsUpdate) {
        this.distributions = distributions;
        this.$package = $package;
        this.version = version;
        this.windowsUpdate = windowsUpdate;
    }

    /**
     * Metadata about the upgrade for each specific operating system.
     * 
    */
    public List<UpgradeDistributionResponse> getDistributions() {
        return this.distributions;
    }
    /**
     * Required for non-Windows OS. The package this Upgrade is for.
     * 
    */
    public String get$package() {
        return this.$package;
    }
    /**
     * Required for non-Windows OS. The version of the package in machine + human readable form.
     * 
    */
    public VersionResponse getVersion() {
        return this.version;
    }
    /**
     * Required for Windows OS. Represents the metadata about the Windows update.
     * 
    */
    public WindowsUpdateResponse getWindowsUpdate() {
        return this.windowsUpdate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpgradeNoteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<UpgradeDistributionResponse> distributions;
        private String $package;
        private VersionResponse version;
        private WindowsUpdateResponse windowsUpdate;

        public Builder() {
    	      // Empty
        }

        public Builder(UpgradeNoteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distributions = defaults.distributions;
    	      this.$package = defaults.$package;
    	      this.version = defaults.version;
    	      this.windowsUpdate = defaults.windowsUpdate;
        }

        public Builder setDistributions(List<UpgradeDistributionResponse> distributions) {
            this.distributions = Objects.requireNonNull(distributions);
            return this;
        }

        public Builder set$package(String $package) {
            this.$package = Objects.requireNonNull($package);
            return this;
        }

        public Builder setVersion(VersionResponse version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public Builder setWindowsUpdate(WindowsUpdateResponse windowsUpdate) {
            this.windowsUpdate = Objects.requireNonNull(windowsUpdate);
            return this;
        }
        public UpgradeNoteResponse build() {
            return new UpgradeNoteResponse(distributions, $package, version, windowsUpdate);
        }
    }
}
