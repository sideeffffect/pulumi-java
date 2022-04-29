// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterNodeConfigShieldedInstanceConfigArgs extends ResourceArgs {

    public static final ClusterNodeConfigShieldedInstanceConfigArgs Empty = new ClusterNodeConfigShieldedInstanceConfigArgs();

    /**
     * Defines if the instance has integrity monitoring enabled.
     * 
     */
    @Import(name="enableIntegrityMonitoring")
    private @Nullable Output<Boolean> enableIntegrityMonitoring;

    /**
     * @return Defines if the instance has integrity monitoring enabled.
     * 
     */
    public Optional<Output<Boolean>> enableIntegrityMonitoring() {
        return Optional.ofNullable(this.enableIntegrityMonitoring);
    }

    /**
     * Defines if the instance has Secure Boot enabled.
     * 
     */
    @Import(name="enableSecureBoot")
    private @Nullable Output<Boolean> enableSecureBoot;

    /**
     * @return Defines if the instance has Secure Boot enabled.
     * 
     */
    public Optional<Output<Boolean>> enableSecureBoot() {
        return Optional.ofNullable(this.enableSecureBoot);
    }

    private ClusterNodeConfigShieldedInstanceConfigArgs() {}

    private ClusterNodeConfigShieldedInstanceConfigArgs(ClusterNodeConfigShieldedInstanceConfigArgs $) {
        this.enableIntegrityMonitoring = $.enableIntegrityMonitoring;
        this.enableSecureBoot = $.enableSecureBoot;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterNodeConfigShieldedInstanceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterNodeConfigShieldedInstanceConfigArgs $;

        public Builder() {
            $ = new ClusterNodeConfigShieldedInstanceConfigArgs();
        }

        public Builder(ClusterNodeConfigShieldedInstanceConfigArgs defaults) {
            $ = new ClusterNodeConfigShieldedInstanceConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableIntegrityMonitoring Defines if the instance has integrity monitoring enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableIntegrityMonitoring(@Nullable Output<Boolean> enableIntegrityMonitoring) {
            $.enableIntegrityMonitoring = enableIntegrityMonitoring;
            return this;
        }

        /**
         * @param enableIntegrityMonitoring Defines if the instance has integrity monitoring enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableIntegrityMonitoring(Boolean enableIntegrityMonitoring) {
            return enableIntegrityMonitoring(Output.of(enableIntegrityMonitoring));
        }

        /**
         * @param enableSecureBoot Defines if the instance has Secure Boot enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableSecureBoot(@Nullable Output<Boolean> enableSecureBoot) {
            $.enableSecureBoot = enableSecureBoot;
            return this;
        }

        /**
         * @param enableSecureBoot Defines if the instance has Secure Boot enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableSecureBoot(Boolean enableSecureBoot) {
            return enableSecureBoot(Output.of(enableSecureBoot));
        }

        public ClusterNodeConfigShieldedInstanceConfigArgs build() {
            return $;
        }
    }

}
