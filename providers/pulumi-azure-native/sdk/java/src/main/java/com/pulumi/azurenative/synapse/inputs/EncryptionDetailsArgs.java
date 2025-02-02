// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.inputs;

import com.pulumi.azurenative.synapse.inputs.CustomerManagedKeyDetailsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details of the encryption associated with the workspace
 * 
 */
public final class EncryptionDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final EncryptionDetailsArgs Empty = new EncryptionDetailsArgs();

    /**
     * Customer Managed Key Details
     * 
     */
    @Import(name="cmk")
    private @Nullable Output<CustomerManagedKeyDetailsArgs> cmk;

    /**
     * @return Customer Managed Key Details
     * 
     */
    public Optional<Output<CustomerManagedKeyDetailsArgs>> cmk() {
        return Optional.ofNullable(this.cmk);
    }

    private EncryptionDetailsArgs() {}

    private EncryptionDetailsArgs(EncryptionDetailsArgs $) {
        this.cmk = $.cmk;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EncryptionDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EncryptionDetailsArgs $;

        public Builder() {
            $ = new EncryptionDetailsArgs();
        }

        public Builder(EncryptionDetailsArgs defaults) {
            $ = new EncryptionDetailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cmk Customer Managed Key Details
         * 
         * @return builder
         * 
         */
        public Builder cmk(@Nullable Output<CustomerManagedKeyDetailsArgs> cmk) {
            $.cmk = cmk;
            return this;
        }

        /**
         * @param cmk Customer Managed Key Details
         * 
         * @return builder
         * 
         */
        public Builder cmk(CustomerManagedKeyDetailsArgs cmk) {
            return cmk(Output.of(cmk));
        }

        public EncryptionDetailsArgs build() {
            return $;
        }
    }

}
