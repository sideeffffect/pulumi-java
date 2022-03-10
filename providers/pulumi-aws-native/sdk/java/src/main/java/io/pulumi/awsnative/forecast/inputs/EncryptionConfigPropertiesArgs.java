// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.forecast.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EncryptionConfigPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncryptionConfigPropertiesArgs Empty = new EncryptionConfigPropertiesArgs();

    @InputImport(name="kmsKeyArn")
      private final @Nullable Input<String> kmsKeyArn;

    public Input<String> getKmsKeyArn() {
        return this.kmsKeyArn == null ? Input.empty() : this.kmsKeyArn;
    }

    @InputImport(name="roleArn")
      private final @Nullable Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn == null ? Input.empty() : this.roleArn;
    }

    public EncryptionConfigPropertiesArgs(
        @Nullable Input<String> kmsKeyArn,
        @Nullable Input<String> roleArn) {
        this.kmsKeyArn = kmsKeyArn;
        this.roleArn = roleArn;
    }

    private EncryptionConfigPropertiesArgs() {
        this.kmsKeyArn = Input.empty();
        this.roleArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionConfigPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kmsKeyArn;
        private @Nullable Input<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionConfigPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder kmsKeyArn(@Nullable Input<String> kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        public Builder kmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = Input.ofNullable(kmsKeyArn);
            return this;
        }

        public Builder roleArn(@Nullable Input<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = Input.ofNullable(roleArn);
            return this;
        }
        public EncryptionConfigPropertiesArgs build() {
            return new EncryptionConfigPropertiesArgs(kmsKeyArn, roleArn);
        }
    }
}
