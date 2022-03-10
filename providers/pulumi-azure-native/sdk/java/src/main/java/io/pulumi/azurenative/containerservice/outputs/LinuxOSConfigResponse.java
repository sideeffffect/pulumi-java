// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.azurenative.containerservice.outputs.SysctlConfigResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LinuxOSConfigResponse {
    /**
     * SwapFileSizeMB specifies size in MB of a swap file will be created on each node.
     * 
     */
    private final @Nullable Integer swapFileSizeMB;
    /**
     * Sysctl settings for Linux agent nodes.
     * 
     */
    private final @Nullable SysctlConfigResponse sysctls;
    /**
     * Transparent Huge Page defrag configuration.
     * 
     */
    private final @Nullable String transparentHugePageDefrag;
    /**
     * Transparent Huge Page enabled configuration.
     * 
     */
    private final @Nullable String transparentHugePageEnabled;

    @OutputCustomType.Constructor
    private LinuxOSConfigResponse(
        @OutputCustomType.Parameter("swapFileSizeMB") @Nullable Integer swapFileSizeMB,
        @OutputCustomType.Parameter("sysctls") @Nullable SysctlConfigResponse sysctls,
        @OutputCustomType.Parameter("transparentHugePageDefrag") @Nullable String transparentHugePageDefrag,
        @OutputCustomType.Parameter("transparentHugePageEnabled") @Nullable String transparentHugePageEnabled) {
        this.swapFileSizeMB = swapFileSizeMB;
        this.sysctls = sysctls;
        this.transparentHugePageDefrag = transparentHugePageDefrag;
        this.transparentHugePageEnabled = transparentHugePageEnabled;
    }

    /**
     * SwapFileSizeMB specifies size in MB of a swap file will be created on each node.
     * 
    */
    public Optional<Integer> getSwapFileSizeMB() {
        return Optional.ofNullable(this.swapFileSizeMB);
    }
    /**
     * Sysctl settings for Linux agent nodes.
     * 
    */
    public Optional<SysctlConfigResponse> getSysctls() {
        return Optional.ofNullable(this.sysctls);
    }
    /**
     * Transparent Huge Page defrag configuration.
     * 
    */
    public Optional<String> getTransparentHugePageDefrag() {
        return Optional.ofNullable(this.transparentHugePageDefrag);
    }
    /**
     * Transparent Huge Page enabled configuration.
     * 
    */
    public Optional<String> getTransparentHugePageEnabled() {
        return Optional.ofNullable(this.transparentHugePageEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxOSConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer swapFileSizeMB;
        private @Nullable SysctlConfigResponse sysctls;
        private @Nullable String transparentHugePageDefrag;
        private @Nullable String transparentHugePageEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(LinuxOSConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.swapFileSizeMB = defaults.swapFileSizeMB;
    	      this.sysctls = defaults.sysctls;
    	      this.transparentHugePageDefrag = defaults.transparentHugePageDefrag;
    	      this.transparentHugePageEnabled = defaults.transparentHugePageEnabled;
        }

        public Builder swapFileSizeMB(@Nullable Integer swapFileSizeMB) {
            this.swapFileSizeMB = swapFileSizeMB;
            return this;
        }

        public Builder sysctls(@Nullable SysctlConfigResponse sysctls) {
            this.sysctls = sysctls;
            return this;
        }

        public Builder transparentHugePageDefrag(@Nullable String transparentHugePageDefrag) {
            this.transparentHugePageDefrag = transparentHugePageDefrag;
            return this;
        }

        public Builder transparentHugePageEnabled(@Nullable String transparentHugePageEnabled) {
            this.transparentHugePageEnabled = transparentHugePageEnabled;
            return this;
        }
        public LinuxOSConfigResponse build() {
            return new LinuxOSConfigResponse(swapFileSizeMB, sysctls, transparentHugePageDefrag, transparentHugePageEnabled);
        }
    }
}
