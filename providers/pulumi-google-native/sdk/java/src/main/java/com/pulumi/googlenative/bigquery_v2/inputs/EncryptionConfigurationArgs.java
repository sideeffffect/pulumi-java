// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EncryptionConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final EncryptionConfigurationArgs Empty = new EncryptionConfigurationArgs();

    /**
     * [Optional] Describes the Cloud KMS encryption key that will be used to protect destination BigQuery table. The BigQuery Service Account associated with your project requires access to this encryption key.
     * 
     */
    @Import(name="kmsKeyName")
    private @Nullable Output<String> kmsKeyName;

    /**
     * @return [Optional] Describes the Cloud KMS encryption key that will be used to protect destination BigQuery table. The BigQuery Service Account associated with your project requires access to this encryption key.
     * 
     */
    public Optional<Output<String>> kmsKeyName() {
        return Optional.ofNullable(this.kmsKeyName);
    }

    private EncryptionConfigurationArgs() {}

    private EncryptionConfigurationArgs(EncryptionConfigurationArgs $) {
        this.kmsKeyName = $.kmsKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EncryptionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EncryptionConfigurationArgs $;

        public Builder() {
            $ = new EncryptionConfigurationArgs();
        }

        public Builder(EncryptionConfigurationArgs defaults) {
            $ = new EncryptionConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kmsKeyName [Optional] Describes the Cloud KMS encryption key that will be used to protect destination BigQuery table. The BigQuery Service Account associated with your project requires access to this encryption key.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(@Nullable Output<String> kmsKeyName) {
            $.kmsKeyName = kmsKeyName;
            return this;
        }

        /**
         * @param kmsKeyName [Optional] Describes the Cloud KMS encryption key that will be used to protect destination BigQuery table. The BigQuery Service Account associated with your project requires access to this encryption key.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(String kmsKeyName) {
            return kmsKeyName(Output.of(kmsKeyName));
        }

        public EncryptionConfigurationArgs build() {
            return $;
        }
    }

}
