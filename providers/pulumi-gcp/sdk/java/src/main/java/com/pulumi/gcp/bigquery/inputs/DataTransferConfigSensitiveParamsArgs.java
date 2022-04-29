// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


public final class DataTransferConfigSensitiveParamsArgs extends ResourceArgs {

    public static final DataTransferConfigSensitiveParamsArgs Empty = new DataTransferConfigSensitiveParamsArgs();

    /**
     * The Secret Access Key of the AWS account transferring data from.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="secretAccessKey", required=true)
    private Output<String> secretAccessKey;

    /**
     * @return The Secret Access Key of the AWS account transferring data from.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Output<String> secretAccessKey() {
        return this.secretAccessKey;
    }

    private DataTransferConfigSensitiveParamsArgs() {}

    private DataTransferConfigSensitiveParamsArgs(DataTransferConfigSensitiveParamsArgs $) {
        this.secretAccessKey = $.secretAccessKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataTransferConfigSensitiveParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataTransferConfigSensitiveParamsArgs $;

        public Builder() {
            $ = new DataTransferConfigSensitiveParamsArgs();
        }

        public Builder(DataTransferConfigSensitiveParamsArgs defaults) {
            $ = new DataTransferConfigSensitiveParamsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param secretAccessKey The Secret Access Key of the AWS account transferring data from.
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder secretAccessKey(Output<String> secretAccessKey) {
            $.secretAccessKey = secretAccessKey;
            return this;
        }

        /**
         * @param secretAccessKey The Secret Access Key of the AWS account transferring data from.
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder secretAccessKey(String secretAccessKey) {
            return secretAccessKey(Output.of(secretAccessKey));
        }

        public DataTransferConfigSensitiveParamsArgs build() {
            $.secretAccessKey = Objects.requireNonNull($.secretAccessKey, "expected parameter 'secretAccessKey' to be non-null");
            return $;
        }
    }

}
