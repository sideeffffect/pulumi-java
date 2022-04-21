// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.inputs;

import com.pulumi.azurenative.containerservice.inputs.SysctlConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * OS configurations of Linux agent nodes.
 * 
 */
public final class LinuxOSConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinuxOSConfigArgs Empty = new LinuxOSConfigArgs();

    /**
     * SwapFileSizeMB specifies size in MB of a swap file will be created on each node.
     * 
     */
    @Import(name="swapFileSizeMB")
    private @Nullable Output<Integer> swapFileSizeMB;

    public Optional<Output<Integer>> swapFileSizeMB() {
        return Optional.ofNullable(this.swapFileSizeMB);
    }

    /**
     * Sysctl settings for Linux agent nodes.
     * 
     */
    @Import(name="sysctls")
    private @Nullable Output<SysctlConfigArgs> sysctls;

    public Optional<Output<SysctlConfigArgs>> sysctls() {
        return Optional.ofNullable(this.sysctls);
    }

    /**
     * Transparent Huge Page defrag configuration.
     * 
     */
    @Import(name="transparentHugePageDefrag")
    private @Nullable Output<String> transparentHugePageDefrag;

    public Optional<Output<String>> transparentHugePageDefrag() {
        return Optional.ofNullable(this.transparentHugePageDefrag);
    }

    /**
     * Transparent Huge Page enabled configuration.
     * 
     */
    @Import(name="transparentHugePageEnabled")
    private @Nullable Output<String> transparentHugePageEnabled;

    public Optional<Output<String>> transparentHugePageEnabled() {
        return Optional.ofNullable(this.transparentHugePageEnabled);
    }

    private LinuxOSConfigArgs() {}

    private LinuxOSConfigArgs(LinuxOSConfigArgs $) {
        this.swapFileSizeMB = $.swapFileSizeMB;
        this.sysctls = $.sysctls;
        this.transparentHugePageDefrag = $.transparentHugePageDefrag;
        this.transparentHugePageEnabled = $.transparentHugePageEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinuxOSConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinuxOSConfigArgs $;

        public Builder() {
            $ = new LinuxOSConfigArgs();
        }

        public Builder(LinuxOSConfigArgs defaults) {
            $ = new LinuxOSConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder swapFileSizeMB(@Nullable Output<Integer> swapFileSizeMB) {
            $.swapFileSizeMB = swapFileSizeMB;
            return this;
        }

        public Builder swapFileSizeMB(Integer swapFileSizeMB) {
            return swapFileSizeMB(Output.of(swapFileSizeMB));
        }

        public Builder sysctls(@Nullable Output<SysctlConfigArgs> sysctls) {
            $.sysctls = sysctls;
            return this;
        }

        public Builder sysctls(SysctlConfigArgs sysctls) {
            return sysctls(Output.of(sysctls));
        }

        public Builder transparentHugePageDefrag(@Nullable Output<String> transparentHugePageDefrag) {
            $.transparentHugePageDefrag = transparentHugePageDefrag;
            return this;
        }

        public Builder transparentHugePageDefrag(String transparentHugePageDefrag) {
            return transparentHugePageDefrag(Output.of(transparentHugePageDefrag));
        }

        public Builder transparentHugePageEnabled(@Nullable Output<String> transparentHugePageEnabled) {
            $.transparentHugePageEnabled = transparentHugePageEnabled;
            return this;
        }

        public Builder transparentHugePageEnabled(String transparentHugePageEnabled) {
            return transparentHugePageEnabled(Output.of(transparentHugePageEnabled));
        }

        public LinuxOSConfigArgs build() {
            return $;
        }
    }

}
