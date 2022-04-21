// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.util.Objects;


/**
 * The Amazon S3 settings needed for the interim Amazon S3 when copying from Amazon Redshift with unload. With this, data from Amazon Redshift source will be unloaded into S3 first and then copied into the targeted sink from the interim S3.
 * 
 */
public final class RedshiftUnloadSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final RedshiftUnloadSettingsArgs Empty = new RedshiftUnloadSettingsArgs();

    /**
     * The bucket of the interim Amazon S3 which will be used to store the unloaded data from Amazon Redshift source. The bucket must be in the same region as the Amazon Redshift source. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="bucketName", required=true)
    private Output<Object> bucketName;

    public Output<Object> bucketName() {
        return this.bucketName;
    }

    /**
     * The name of the Amazon S3 linked service which will be used for the unload operation when copying from the Amazon Redshift source.
     * 
     */
    @Import(name="s3LinkedServiceName", required=true)
    private Output<LinkedServiceReferenceArgs> s3LinkedServiceName;

    public Output<LinkedServiceReferenceArgs> s3LinkedServiceName() {
        return this.s3LinkedServiceName;
    }

    private RedshiftUnloadSettingsArgs() {}

    private RedshiftUnloadSettingsArgs(RedshiftUnloadSettingsArgs $) {
        this.bucketName = $.bucketName;
        this.s3LinkedServiceName = $.s3LinkedServiceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RedshiftUnloadSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RedshiftUnloadSettingsArgs $;

        public Builder() {
            $ = new RedshiftUnloadSettingsArgs();
        }

        public Builder(RedshiftUnloadSettingsArgs defaults) {
            $ = new RedshiftUnloadSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucketName(Output<Object> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        public Builder bucketName(Object bucketName) {
            return bucketName(Output.of(bucketName));
        }

        public Builder s3LinkedServiceName(Output<LinkedServiceReferenceArgs> s3LinkedServiceName) {
            $.s3LinkedServiceName = s3LinkedServiceName;
            return this;
        }

        public Builder s3LinkedServiceName(LinkedServiceReferenceArgs s3LinkedServiceName) {
            return s3LinkedServiceName(Output.of(s3LinkedServiceName));
        }

        public RedshiftUnloadSettingsArgs build() {
            $.bucketName = Objects.requireNonNull($.bucketName, "expected parameter 'bucketName' to be non-null");
            $.s3LinkedServiceName = Objects.requireNonNull($.s3LinkedServiceName, "expected parameter 's3LinkedServiceName' to be non-null");
            return $;
        }
    }

}
