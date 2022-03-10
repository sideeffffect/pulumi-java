// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Encryption settings for the cluster.
 * 
 */
public final class EncryptionConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncryptionConfigArgs Empty = new EncryptionConfigArgs();

    /**
     * Optional. The Cloud KMS key name to use for PD disk encryption for all instances in the cluster.
     * 
     */
    @InputImport(name="gcePdKmsKeyName")
      private final @Nullable Input<String> gcePdKmsKeyName;

    public Input<String> getGcePdKmsKeyName() {
        return this.gcePdKmsKeyName == null ? Input.empty() : this.gcePdKmsKeyName;
    }

    public EncryptionConfigArgs(@Nullable Input<String> gcePdKmsKeyName) {
        this.gcePdKmsKeyName = gcePdKmsKeyName;
    }

    private EncryptionConfigArgs() {
        this.gcePdKmsKeyName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> gcePdKmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gcePdKmsKeyName = defaults.gcePdKmsKeyName;
        }

        public Builder gcePdKmsKeyName(@Nullable Input<String> gcePdKmsKeyName) {
            this.gcePdKmsKeyName = gcePdKmsKeyName;
            return this;
        }

        public Builder gcePdKmsKeyName(@Nullable String gcePdKmsKeyName) {
            this.gcePdKmsKeyName = Input.ofNullable(gcePdKmsKeyName);
            return this;
        }
        public EncryptionConfigArgs build() {
            return new EncryptionConfigArgs(gcePdKmsKeyName);
        }
    }
}
