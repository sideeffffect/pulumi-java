// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DatasetDefaultEncryptionConfigurationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatasetDefaultEncryptionConfigurationGetArgs Empty = new DatasetDefaultEncryptionConfigurationGetArgs();

    /**
     * Describes the Cloud KMS encryption key that will be used to protect destination
     * BigQuery table. The BigQuery Service Account associated with your project requires
     * access to this encryption key.
     * 
     */
    @Import(name="kmsKeyName", required=true)
    private Output<String> kmsKeyName;

    public Output<String> kmsKeyName() {
        return this.kmsKeyName;
    }

    private DatasetDefaultEncryptionConfigurationGetArgs() {}

    private DatasetDefaultEncryptionConfigurationGetArgs(DatasetDefaultEncryptionConfigurationGetArgs $) {
        this.kmsKeyName = $.kmsKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetDefaultEncryptionConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetDefaultEncryptionConfigurationGetArgs $;

        public Builder() {
            $ = new DatasetDefaultEncryptionConfigurationGetArgs();
        }

        public Builder(DatasetDefaultEncryptionConfigurationGetArgs defaults) {
            $ = new DatasetDefaultEncryptionConfigurationGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder kmsKeyName(Output<String> kmsKeyName) {
            $.kmsKeyName = kmsKeyName;
            return this;
        }

        public Builder kmsKeyName(String kmsKeyName) {
            return kmsKeyName(Output.of(kmsKeyName));
        }

        public DatasetDefaultEncryptionConfigurationGetArgs build() {
            $.kmsKeyName = Objects.requireNonNull($.kmsKeyName, "expected parameter 'kmsKeyName' to be non-null");
            return $;
        }
    }

}
