// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mq.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetBrokerEncryptionOption extends io.pulumi.resources.InvokeArgs {

    public static final GetBrokerEncryptionOption Empty = new GetBrokerEncryptionOption();

    @InputImport(name="kmsKeyId", required=true)
      private final String kmsKeyId;

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    @InputImport(name="useAwsOwnedKey", required=true)
      private final Boolean useAwsOwnedKey;

    public Boolean getUseAwsOwnedKey() {
        return this.useAwsOwnedKey;
    }

    public GetBrokerEncryptionOption(
        String kmsKeyId,
        Boolean useAwsOwnedKey) {
        this.kmsKeyId = Objects.requireNonNull(kmsKeyId, "expected parameter 'kmsKeyId' to be non-null");
        this.useAwsOwnedKey = Objects.requireNonNull(useAwsOwnedKey, "expected parameter 'useAwsOwnedKey' to be non-null");
    }

    private GetBrokerEncryptionOption() {
        this.kmsKeyId = null;
        this.useAwsOwnedKey = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBrokerEncryptionOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKeyId;
        private Boolean useAwsOwnedKey;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBrokerEncryptionOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.useAwsOwnedKey = defaults.useAwsOwnedKey;
        }

        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = Objects.requireNonNull(kmsKeyId);
            return this;
        }

        public Builder useAwsOwnedKey(Boolean useAwsOwnedKey) {
            this.useAwsOwnedKey = Objects.requireNonNull(useAwsOwnedKey);
            return this;
        }
        public GetBrokerEncryptionOption build() {
            return new GetBrokerEncryptionOption(kmsKeyId, useAwsOwnedKey);
        }
    }
}
