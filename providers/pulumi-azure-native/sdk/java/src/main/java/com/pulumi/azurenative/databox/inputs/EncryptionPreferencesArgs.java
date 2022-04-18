// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.inputs;

import com.pulumi.azurenative.databox.enums.DoubleEncryption;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Preferences related to the Encryption.
 * 
 */
public final class EncryptionPreferencesArgs extends com.pulumi.resources.ResourceArgs {

    public static final EncryptionPreferencesArgs Empty = new EncryptionPreferencesArgs();

    /**
     * Defines secondary layer of software-based encryption enablement.
     * 
     */
    @Import(name="doubleEncryption")
      private final @Nullable Output<Either<String,DoubleEncryption>> doubleEncryption;

    public Output<Either<String,DoubleEncryption>> doubleEncryption() {
        return this.doubleEncryption == null ? Codegen.empty() : this.doubleEncryption;
    }

    public EncryptionPreferencesArgs(@Nullable Output<Either<String,DoubleEncryption>> doubleEncryption) {
        this.doubleEncryption = doubleEncryption == null ? Output.ofLeft("Disabled") : doubleEncryption;
    }

    private EncryptionPreferencesArgs() {
        this.doubleEncryption = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionPreferencesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,DoubleEncryption>> doubleEncryption;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionPreferencesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.doubleEncryption = defaults.doubleEncryption;
        }

        public Builder doubleEncryption(@Nullable Output<Either<String,DoubleEncryption>> doubleEncryption) {
            this.doubleEncryption = doubleEncryption;
            return this;
        }
        public Builder doubleEncryption(@Nullable Either<String,DoubleEncryption> doubleEncryption) {
            this.doubleEncryption = Codegen.ofNullable(doubleEncryption);
            return this;
        }        public EncryptionPreferencesArgs build() {
            return new EncryptionPreferencesArgs(doubleEncryption);
        }
    }
}
