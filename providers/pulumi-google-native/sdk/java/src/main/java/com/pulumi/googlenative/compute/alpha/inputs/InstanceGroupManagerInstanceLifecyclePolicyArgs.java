// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute.alpha.enums.InstanceGroupManagerInstanceLifecyclePolicyForceUpdateOnRepair;
import com.pulumi.googlenative.compute.alpha.inputs.InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceGroupManagerInstanceLifecyclePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceGroupManagerInstanceLifecyclePolicyArgs Empty = new InstanceGroupManagerInstanceLifecyclePolicyArgs();

    /**
     * A bit indicating whether to forcefully apply the group&#39;s latest configuration when repairing a VM. Valid options are: - NO (default): If configuration updates are available, they are not forcefully applied during repair. However, if you&#39;ve set up a proactive type of update policy, then configuration updates are applied as usual. - YES: If configuration updates are available, they are applied during repair.
     * 
     */
    @Import(name="forceUpdateOnRepair")
    private @Nullable Output<InstanceGroupManagerInstanceLifecyclePolicyForceUpdateOnRepair> forceUpdateOnRepair;

    /**
     * @return A bit indicating whether to forcefully apply the group&#39;s latest configuration when repairing a VM. Valid options are: - NO (default): If configuration updates are available, they are not forcefully applied during repair. However, if you&#39;ve set up a proactive type of update policy, then configuration updates are applied as usual. - YES: If configuration updates are available, they are applied during repair.
     * 
     */
    public Optional<Output<InstanceGroupManagerInstanceLifecyclePolicyForceUpdateOnRepair>> forceUpdateOnRepair() {
        return Optional.ofNullable(this.forceUpdateOnRepair);
    }

    /**
     * The configuration for metadata based readiness signal sent by the instance during initialization when stopping / suspending an instance. The Instance Group Manager will wait for a signal that indicates successful initialization before stopping / suspending an instance. If a successful readiness signal is not sent before timeout, the corresponding instance will not be stopped / suspended. Instead, an error will be visible in the lastAttempt.errors field of the managed instance in the listmanagedinstances method. If metadataBasedReadinessSignal.timeoutSec is unset, the Instance Group Manager will directly proceed to suspend / stop instances, skipping initialization on them.
     * 
     */
    @Import(name="metadataBasedReadinessSignal")
    private @Nullable Output<InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalArgs> metadataBasedReadinessSignal;

    /**
     * @return The configuration for metadata based readiness signal sent by the instance during initialization when stopping / suspending an instance. The Instance Group Manager will wait for a signal that indicates successful initialization before stopping / suspending an instance. If a successful readiness signal is not sent before timeout, the corresponding instance will not be stopped / suspended. Instead, an error will be visible in the lastAttempt.errors field of the managed instance in the listmanagedinstances method. If metadataBasedReadinessSignal.timeoutSec is unset, the Instance Group Manager will directly proceed to suspend / stop instances, skipping initialization on them.
     * 
     */
    public Optional<Output<InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalArgs>> metadataBasedReadinessSignal() {
        return Optional.ofNullable(this.metadataBasedReadinessSignal);
    }

    private InstanceGroupManagerInstanceLifecyclePolicyArgs() {}

    private InstanceGroupManagerInstanceLifecyclePolicyArgs(InstanceGroupManagerInstanceLifecyclePolicyArgs $) {
        this.forceUpdateOnRepair = $.forceUpdateOnRepair;
        this.metadataBasedReadinessSignal = $.metadataBasedReadinessSignal;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceGroupManagerInstanceLifecyclePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceGroupManagerInstanceLifecyclePolicyArgs $;

        public Builder() {
            $ = new InstanceGroupManagerInstanceLifecyclePolicyArgs();
        }

        public Builder(InstanceGroupManagerInstanceLifecyclePolicyArgs defaults) {
            $ = new InstanceGroupManagerInstanceLifecyclePolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param forceUpdateOnRepair A bit indicating whether to forcefully apply the group&#39;s latest configuration when repairing a VM. Valid options are: - NO (default): If configuration updates are available, they are not forcefully applied during repair. However, if you&#39;ve set up a proactive type of update policy, then configuration updates are applied as usual. - YES: If configuration updates are available, they are applied during repair.
         * 
         * @return builder
         * 
         */
        public Builder forceUpdateOnRepair(@Nullable Output<InstanceGroupManagerInstanceLifecyclePolicyForceUpdateOnRepair> forceUpdateOnRepair) {
            $.forceUpdateOnRepair = forceUpdateOnRepair;
            return this;
        }

        /**
         * @param forceUpdateOnRepair A bit indicating whether to forcefully apply the group&#39;s latest configuration when repairing a VM. Valid options are: - NO (default): If configuration updates are available, they are not forcefully applied during repair. However, if you&#39;ve set up a proactive type of update policy, then configuration updates are applied as usual. - YES: If configuration updates are available, they are applied during repair.
         * 
         * @return builder
         * 
         */
        public Builder forceUpdateOnRepair(InstanceGroupManagerInstanceLifecyclePolicyForceUpdateOnRepair forceUpdateOnRepair) {
            return forceUpdateOnRepair(Output.of(forceUpdateOnRepair));
        }

        /**
         * @param metadataBasedReadinessSignal The configuration for metadata based readiness signal sent by the instance during initialization when stopping / suspending an instance. The Instance Group Manager will wait for a signal that indicates successful initialization before stopping / suspending an instance. If a successful readiness signal is not sent before timeout, the corresponding instance will not be stopped / suspended. Instead, an error will be visible in the lastAttempt.errors field of the managed instance in the listmanagedinstances method. If metadataBasedReadinessSignal.timeoutSec is unset, the Instance Group Manager will directly proceed to suspend / stop instances, skipping initialization on them.
         * 
         * @return builder
         * 
         */
        public Builder metadataBasedReadinessSignal(@Nullable Output<InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalArgs> metadataBasedReadinessSignal) {
            $.metadataBasedReadinessSignal = metadataBasedReadinessSignal;
            return this;
        }

        /**
         * @param metadataBasedReadinessSignal The configuration for metadata based readiness signal sent by the instance during initialization when stopping / suspending an instance. The Instance Group Manager will wait for a signal that indicates successful initialization before stopping / suspending an instance. If a successful readiness signal is not sent before timeout, the corresponding instance will not be stopped / suspended. Instead, an error will be visible in the lastAttempt.errors field of the managed instance in the listmanagedinstances method. If metadataBasedReadinessSignal.timeoutSec is unset, the Instance Group Manager will directly proceed to suspend / stop instances, skipping initialization on them.
         * 
         * @return builder
         * 
         */
        public Builder metadataBasedReadinessSignal(InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalArgs metadataBasedReadinessSignal) {
            return metadataBasedReadinessSignal(Output.of(metadataBasedReadinessSignal));
        }

        public InstanceGroupManagerInstanceLifecyclePolicyArgs build() {
            return $;
        }
    }

}
