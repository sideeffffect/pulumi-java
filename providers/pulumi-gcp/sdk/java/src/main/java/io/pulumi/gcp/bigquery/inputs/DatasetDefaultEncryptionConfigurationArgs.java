// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DatasetDefaultEncryptionConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetDefaultEncryptionConfigurationArgs Empty = new DatasetDefaultEncryptionConfigurationArgs();

    /**
     * Describes the Cloud KMS encryption key that will be used to protect destination
     * BigQuery table. The BigQuery Service Account associated with your project requires
     * access to this encryption key.
     * 
     */
    @InputImport(name="kmsKeyName", required=true)
      private final Input<String> kmsKeyName;

    public Input<String> getKmsKeyName() {
        return this.kmsKeyName;
    }

    public DatasetDefaultEncryptionConfigurationArgs(Input<String> kmsKeyName) {
        this.kmsKeyName = Objects.requireNonNull(kmsKeyName, "expected parameter 'kmsKeyName' to be non-null");
    }

    private DatasetDefaultEncryptionConfigurationArgs() {
        this.kmsKeyName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetDefaultEncryptionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> kmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetDefaultEncryptionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
        }

        public Builder kmsKeyName(Input<String> kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }

        public Builder kmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Input.of(Objects.requireNonNull(kmsKeyName));
            return this;
        }
        public DatasetDefaultEncryptionConfigurationArgs build() {
            return new DatasetDefaultEncryptionConfigurationArgs(kmsKeyName);
        }
    }
}
