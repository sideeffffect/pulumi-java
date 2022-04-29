// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceFleetEdgeOutputConfigArgs extends ResourceArgs {

    public static final DeviceFleetEdgeOutputConfigArgs Empty = new DeviceFleetEdgeOutputConfigArgs();

    /**
     * The KMS key id used for encryption on the S3 bucket
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    /**
     * @return The KMS key id used for encryption on the S3 bucket
     * 
     */
    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * The Amazon Simple Storage (S3) bucket URI
     * 
     */
    @Import(name="s3OutputLocation", required=true)
    private Output<String> s3OutputLocation;

    /**
     * @return The Amazon Simple Storage (S3) bucket URI
     * 
     */
    public Output<String> s3OutputLocation() {
        return this.s3OutputLocation;
    }

    private DeviceFleetEdgeOutputConfigArgs() {}

    private DeviceFleetEdgeOutputConfigArgs(DeviceFleetEdgeOutputConfigArgs $) {
        this.kmsKeyId = $.kmsKeyId;
        this.s3OutputLocation = $.s3OutputLocation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceFleetEdgeOutputConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceFleetEdgeOutputConfigArgs $;

        public Builder() {
            $ = new DeviceFleetEdgeOutputConfigArgs();
        }

        public Builder(DeviceFleetEdgeOutputConfigArgs defaults) {
            $ = new DeviceFleetEdgeOutputConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kmsKeyId The KMS key id used for encryption on the S3 bucket
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * @param kmsKeyId The KMS key id used for encryption on the S3 bucket
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        /**
         * @param s3OutputLocation The Amazon Simple Storage (S3) bucket URI
         * 
         * @return builder
         * 
         */
        public Builder s3OutputLocation(Output<String> s3OutputLocation) {
            $.s3OutputLocation = s3OutputLocation;
            return this;
        }

        /**
         * @param s3OutputLocation The Amazon Simple Storage (S3) bucket URI
         * 
         * @return builder
         * 
         */
        public Builder s3OutputLocation(String s3OutputLocation) {
            return s3OutputLocation(Output.of(s3OutputLocation));
        }

        public DeviceFleetEdgeOutputConfigArgs build() {
            $.s3OutputLocation = Objects.requireNonNull($.s3OutputLocation, "expected parameter 's3OutputLocation' to be non-null");
            return $;
        }
    }

}
