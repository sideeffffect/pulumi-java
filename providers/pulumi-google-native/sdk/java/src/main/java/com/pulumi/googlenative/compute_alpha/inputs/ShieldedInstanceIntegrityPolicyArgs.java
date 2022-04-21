// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The policy describes the baseline against which Instance boot integrity is measured.
 * 
 */
public final class ShieldedInstanceIntegrityPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ShieldedInstanceIntegrityPolicyArgs Empty = new ShieldedInstanceIntegrityPolicyArgs();

    /**
     * Updates the integrity policy baseline using the measurements from the VM instance&#39;s most recent boot.
     * 
     */
    @Import(name="updateAutoLearnPolicy")
    private @Nullable Output<Boolean> updateAutoLearnPolicy;

    public Optional<Output<Boolean>> updateAutoLearnPolicy() {
        return Optional.ofNullable(this.updateAutoLearnPolicy);
    }

    private ShieldedInstanceIntegrityPolicyArgs() {}

    private ShieldedInstanceIntegrityPolicyArgs(ShieldedInstanceIntegrityPolicyArgs $) {
        this.updateAutoLearnPolicy = $.updateAutoLearnPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ShieldedInstanceIntegrityPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ShieldedInstanceIntegrityPolicyArgs $;

        public Builder() {
            $ = new ShieldedInstanceIntegrityPolicyArgs();
        }

        public Builder(ShieldedInstanceIntegrityPolicyArgs defaults) {
            $ = new ShieldedInstanceIntegrityPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder updateAutoLearnPolicy(@Nullable Output<Boolean> updateAutoLearnPolicy) {
            $.updateAutoLearnPolicy = updateAutoLearnPolicy;
            return this;
        }

        public Builder updateAutoLearnPolicy(Boolean updateAutoLearnPolicy) {
            return updateAutoLearnPolicy(Output.of(updateAutoLearnPolicy));
        }

        public ShieldedInstanceIntegrityPolicyArgs build() {
            return $;
        }
    }

}
