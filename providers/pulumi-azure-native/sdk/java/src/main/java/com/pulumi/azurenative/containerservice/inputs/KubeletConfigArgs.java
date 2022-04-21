// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Kubelet configurations of agent nodes.
 * 
 */
public final class KubeletConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubeletConfigArgs Empty = new KubeletConfigArgs();

    /**
     * Allowlist of unsafe sysctls or unsafe sysctl patterns (ending in `*`).
     * 
     */
    @Import(name="allowedUnsafeSysctls")
    private @Nullable Output<List<String>> allowedUnsafeSysctls;

    public Optional<Output<List<String>>> allowedUnsafeSysctls() {
        return Optional.ofNullable(this.allowedUnsafeSysctls);
    }

    /**
     * The maximum number of container log files that can be present for a container. The number must be ≥ 2.
     * 
     */
    @Import(name="containerLogMaxFiles")
    private @Nullable Output<Integer> containerLogMaxFiles;

    public Optional<Output<Integer>> containerLogMaxFiles() {
        return Optional.ofNullable(this.containerLogMaxFiles);
    }

    /**
     * The maximum size (e.g. 10Mi) of container log file before it is rotated.
     * 
     */
    @Import(name="containerLogMaxSizeMB")
    private @Nullable Output<Integer> containerLogMaxSizeMB;

    public Optional<Output<Integer>> containerLogMaxSizeMB() {
        return Optional.ofNullable(this.containerLogMaxSizeMB);
    }

    /**
     * Enable CPU CFS quota enforcement for containers that specify CPU limits.
     * 
     */
    @Import(name="cpuCfsQuota")
    private @Nullable Output<Boolean> cpuCfsQuota;

    public Optional<Output<Boolean>> cpuCfsQuota() {
        return Optional.ofNullable(this.cpuCfsQuota);
    }

    /**
     * Sets CPU CFS quota period value.
     * 
     */
    @Import(name="cpuCfsQuotaPeriod")
    private @Nullable Output<String> cpuCfsQuotaPeriod;

    public Optional<Output<String>> cpuCfsQuotaPeriod() {
        return Optional.ofNullable(this.cpuCfsQuotaPeriod);
    }

    /**
     * CPU Manager policy to use.
     * 
     */
    @Import(name="cpuManagerPolicy")
    private @Nullable Output<String> cpuManagerPolicy;

    public Optional<Output<String>> cpuManagerPolicy() {
        return Optional.ofNullable(this.cpuManagerPolicy);
    }

    /**
     * If set to true it will make the Kubelet fail to start if swap is enabled on the node.
     * 
     */
    @Import(name="failSwapOn")
    private @Nullable Output<Boolean> failSwapOn;

    public Optional<Output<Boolean>> failSwapOn() {
        return Optional.ofNullable(this.failSwapOn);
    }

    /**
     * The percent of disk usage after which image garbage collection is always run.
     * 
     */
    @Import(name="imageGcHighThreshold")
    private @Nullable Output<Integer> imageGcHighThreshold;

    public Optional<Output<Integer>> imageGcHighThreshold() {
        return Optional.ofNullable(this.imageGcHighThreshold);
    }

    /**
     * The percent of disk usage before which image garbage collection is never run.
     * 
     */
    @Import(name="imageGcLowThreshold")
    private @Nullable Output<Integer> imageGcLowThreshold;

    public Optional<Output<Integer>> imageGcLowThreshold() {
        return Optional.ofNullable(this.imageGcLowThreshold);
    }

    /**
     * The maximum number of processes per pod.
     * 
     */
    @Import(name="podMaxPids")
    private @Nullable Output<Integer> podMaxPids;

    public Optional<Output<Integer>> podMaxPids() {
        return Optional.ofNullable(this.podMaxPids);
    }

    /**
     * Topology Manager policy to use.
     * 
     */
    @Import(name="topologyManagerPolicy")
    private @Nullable Output<String> topologyManagerPolicy;

    public Optional<Output<String>> topologyManagerPolicy() {
        return Optional.ofNullable(this.topologyManagerPolicy);
    }

    private KubeletConfigArgs() {}

    private KubeletConfigArgs(KubeletConfigArgs $) {
        this.allowedUnsafeSysctls = $.allowedUnsafeSysctls;
        this.containerLogMaxFiles = $.containerLogMaxFiles;
        this.containerLogMaxSizeMB = $.containerLogMaxSizeMB;
        this.cpuCfsQuota = $.cpuCfsQuota;
        this.cpuCfsQuotaPeriod = $.cpuCfsQuotaPeriod;
        this.cpuManagerPolicy = $.cpuManagerPolicy;
        this.failSwapOn = $.failSwapOn;
        this.imageGcHighThreshold = $.imageGcHighThreshold;
        this.imageGcLowThreshold = $.imageGcLowThreshold;
        this.podMaxPids = $.podMaxPids;
        this.topologyManagerPolicy = $.topologyManagerPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubeletConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubeletConfigArgs $;

        public Builder() {
            $ = new KubeletConfigArgs();
        }

        public Builder(KubeletConfigArgs defaults) {
            $ = new KubeletConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowedUnsafeSysctls(@Nullable Output<List<String>> allowedUnsafeSysctls) {
            $.allowedUnsafeSysctls = allowedUnsafeSysctls;
            return this;
        }

        public Builder allowedUnsafeSysctls(List<String> allowedUnsafeSysctls) {
            return allowedUnsafeSysctls(Output.of(allowedUnsafeSysctls));
        }

        public Builder allowedUnsafeSysctls(String... allowedUnsafeSysctls) {
            return allowedUnsafeSysctls(List.of(allowedUnsafeSysctls));
        }

        public Builder containerLogMaxFiles(@Nullable Output<Integer> containerLogMaxFiles) {
            $.containerLogMaxFiles = containerLogMaxFiles;
            return this;
        }

        public Builder containerLogMaxFiles(Integer containerLogMaxFiles) {
            return containerLogMaxFiles(Output.of(containerLogMaxFiles));
        }

        public Builder containerLogMaxSizeMB(@Nullable Output<Integer> containerLogMaxSizeMB) {
            $.containerLogMaxSizeMB = containerLogMaxSizeMB;
            return this;
        }

        public Builder containerLogMaxSizeMB(Integer containerLogMaxSizeMB) {
            return containerLogMaxSizeMB(Output.of(containerLogMaxSizeMB));
        }

        public Builder cpuCfsQuota(@Nullable Output<Boolean> cpuCfsQuota) {
            $.cpuCfsQuota = cpuCfsQuota;
            return this;
        }

        public Builder cpuCfsQuota(Boolean cpuCfsQuota) {
            return cpuCfsQuota(Output.of(cpuCfsQuota));
        }

        public Builder cpuCfsQuotaPeriod(@Nullable Output<String> cpuCfsQuotaPeriod) {
            $.cpuCfsQuotaPeriod = cpuCfsQuotaPeriod;
            return this;
        }

        public Builder cpuCfsQuotaPeriod(String cpuCfsQuotaPeriod) {
            return cpuCfsQuotaPeriod(Output.of(cpuCfsQuotaPeriod));
        }

        public Builder cpuManagerPolicy(@Nullable Output<String> cpuManagerPolicy) {
            $.cpuManagerPolicy = cpuManagerPolicy;
            return this;
        }

        public Builder cpuManagerPolicy(String cpuManagerPolicy) {
            return cpuManagerPolicy(Output.of(cpuManagerPolicy));
        }

        public Builder failSwapOn(@Nullable Output<Boolean> failSwapOn) {
            $.failSwapOn = failSwapOn;
            return this;
        }

        public Builder failSwapOn(Boolean failSwapOn) {
            return failSwapOn(Output.of(failSwapOn));
        }

        public Builder imageGcHighThreshold(@Nullable Output<Integer> imageGcHighThreshold) {
            $.imageGcHighThreshold = imageGcHighThreshold;
            return this;
        }

        public Builder imageGcHighThreshold(Integer imageGcHighThreshold) {
            return imageGcHighThreshold(Output.of(imageGcHighThreshold));
        }

        public Builder imageGcLowThreshold(@Nullable Output<Integer> imageGcLowThreshold) {
            $.imageGcLowThreshold = imageGcLowThreshold;
            return this;
        }

        public Builder imageGcLowThreshold(Integer imageGcLowThreshold) {
            return imageGcLowThreshold(Output.of(imageGcLowThreshold));
        }

        public Builder podMaxPids(@Nullable Output<Integer> podMaxPids) {
            $.podMaxPids = podMaxPids;
            return this;
        }

        public Builder podMaxPids(Integer podMaxPids) {
            return podMaxPids(Output.of(podMaxPids));
        }

        public Builder topologyManagerPolicy(@Nullable Output<String> topologyManagerPolicy) {
            $.topologyManagerPolicy = topologyManagerPolicy;
            return this;
        }

        public Builder topologyManagerPolicy(String topologyManagerPolicy) {
            return topologyManagerPolicy(Output.of(topologyManagerPolicy));
        }

        public KubeletConfigArgs build() {
            return $;
        }
    }

}
