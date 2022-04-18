// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A set of Shielded Instance options.
 * 
 */
public final class ShieldedInstanceConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ShieldedInstanceConfigArgs Empty = new ShieldedInstanceConfigArgs();

    /**
     * Defines whether the instance has integrity monitoring enabled. Enabled by default.
     * 
     */
    @Import(name="enableIntegrityMonitoring")
      private final @Nullable Output<Boolean> enableIntegrityMonitoring;

    public Output<Boolean> enableIntegrityMonitoring() {
        return this.enableIntegrityMonitoring == null ? Codegen.empty() : this.enableIntegrityMonitoring;
    }

    /**
     * Defines whether the instance has Secure Boot enabled. Disabled by default.
     * 
     */
    @Import(name="enableSecureBoot")
      private final @Nullable Output<Boolean> enableSecureBoot;

    public Output<Boolean> enableSecureBoot() {
        return this.enableSecureBoot == null ? Codegen.empty() : this.enableSecureBoot;
    }

    /**
     * Defines whether the instance has the vTPM enabled. Enabled by default.
     * 
     */
    @Import(name="enableVtpm")
      private final @Nullable Output<Boolean> enableVtpm;

    public Output<Boolean> enableVtpm() {
        return this.enableVtpm == null ? Codegen.empty() : this.enableVtpm;
    }

    public ShieldedInstanceConfigArgs(
        @Nullable Output<Boolean> enableIntegrityMonitoring,
        @Nullable Output<Boolean> enableSecureBoot,
        @Nullable Output<Boolean> enableVtpm) {
        this.enableIntegrityMonitoring = enableIntegrityMonitoring;
        this.enableSecureBoot = enableSecureBoot;
        this.enableVtpm = enableVtpm;
    }

    private ShieldedInstanceConfigArgs() {
        this.enableIntegrityMonitoring = Codegen.empty();
        this.enableSecureBoot = Codegen.empty();
        this.enableVtpm = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShieldedInstanceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableIntegrityMonitoring;
        private @Nullable Output<Boolean> enableSecureBoot;
        private @Nullable Output<Boolean> enableVtpm;

        public Builder() {
    	      // Empty
        }

        public Builder(ShieldedInstanceConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableIntegrityMonitoring = defaults.enableIntegrityMonitoring;
    	      this.enableSecureBoot = defaults.enableSecureBoot;
    	      this.enableVtpm = defaults.enableVtpm;
        }

        public Builder enableIntegrityMonitoring(@Nullable Output<Boolean> enableIntegrityMonitoring) {
            this.enableIntegrityMonitoring = enableIntegrityMonitoring;
            return this;
        }
        public Builder enableIntegrityMonitoring(@Nullable Boolean enableIntegrityMonitoring) {
            this.enableIntegrityMonitoring = Codegen.ofNullable(enableIntegrityMonitoring);
            return this;
        }
        public Builder enableSecureBoot(@Nullable Output<Boolean> enableSecureBoot) {
            this.enableSecureBoot = enableSecureBoot;
            return this;
        }
        public Builder enableSecureBoot(@Nullable Boolean enableSecureBoot) {
            this.enableSecureBoot = Codegen.ofNullable(enableSecureBoot);
            return this;
        }
        public Builder enableVtpm(@Nullable Output<Boolean> enableVtpm) {
            this.enableVtpm = enableVtpm;
            return this;
        }
        public Builder enableVtpm(@Nullable Boolean enableVtpm) {
            this.enableVtpm = Codegen.ofNullable(enableVtpm);
            return this;
        }        public ShieldedInstanceConfigArgs build() {
            return new ShieldedInstanceConfigArgs(enableIntegrityMonitoring, enableSecureBoot, enableVtpm);
        }
    }
}
