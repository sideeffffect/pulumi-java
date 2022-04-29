// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


public final class TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyArgs extends ResourceArgs {

    public static final TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyArgs Empty = new TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyArgs();

    /**
     * AWS Key ID.
     * 
     */
    @Import(name="accessKeyId", required=true)
    private Output<String> accessKeyId;

    /**
     * @return AWS Key ID.
     * 
     */
    public Output<String> accessKeyId() {
        return this.accessKeyId;
    }

    /**
     * AWS Secret Access Key.
     * 
     */
    @Import(name="secretAccessKey", required=true)
    private Output<String> secretAccessKey;

    /**
     * @return AWS Secret Access Key.
     * 
     */
    public Output<String> secretAccessKey() {
        return this.secretAccessKey;
    }

    private TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyArgs() {}

    private TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyArgs(TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyArgs $) {
        this.accessKeyId = $.accessKeyId;
        this.secretAccessKey = $.secretAccessKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyArgs $;

        public Builder() {
            $ = new TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyArgs();
        }

        public Builder(TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyArgs defaults) {
            $ = new TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKeyId AWS Key ID.
         * 
         * @return builder
         * 
         */
        public Builder accessKeyId(Output<String> accessKeyId) {
            $.accessKeyId = accessKeyId;
            return this;
        }

        /**
         * @param accessKeyId AWS Key ID.
         * 
         * @return builder
         * 
         */
        public Builder accessKeyId(String accessKeyId) {
            return accessKeyId(Output.of(accessKeyId));
        }

        /**
         * @param secretAccessKey AWS Secret Access Key.
         * 
         * @return builder
         * 
         */
        public Builder secretAccessKey(Output<String> secretAccessKey) {
            $.secretAccessKey = secretAccessKey;
            return this;
        }

        /**
         * @param secretAccessKey AWS Secret Access Key.
         * 
         * @return builder
         * 
         */
        public Builder secretAccessKey(String secretAccessKey) {
            return secretAccessKey(Output.of(secretAccessKey));
        }

        public TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyArgs build() {
            $.accessKeyId = Objects.requireNonNull($.accessKeyId, "expected parameter 'accessKeyId' to be non-null");
            $.secretAccessKey = Objects.requireNonNull($.secretAccessKey, "expected parameter 'secretAccessKey' to be non-null");
            return $;
        }
    }

}
