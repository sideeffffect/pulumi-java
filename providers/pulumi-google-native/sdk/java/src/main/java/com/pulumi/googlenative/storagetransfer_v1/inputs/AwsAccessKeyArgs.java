// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * AWS access key (see [AWS Security Credentials](https://docs.aws.amazon.com/general/latest/gr/aws-security-credentials.html)). For information on our data retention policy for user credentials, see [User credentials](/storage-transfer/docs/data-retention#user-credentials).
 * 
 */
public final class AwsAccessKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AwsAccessKeyArgs Empty = new AwsAccessKeyArgs();

    /**
     * AWS access key ID.
     * 
     */
    @Import(name="accessKeyId", required=true)
    private Output<String> accessKeyId;

    public Output<String> accessKeyId() {
        return this.accessKeyId;
    }

    /**
     * AWS secret access key. This field is not returned in RPC responses.
     * 
     */
    @Import(name="secretAccessKey", required=true)
    private Output<String> secretAccessKey;

    public Output<String> secretAccessKey() {
        return this.secretAccessKey;
    }

    private AwsAccessKeyArgs() {}

    private AwsAccessKeyArgs(AwsAccessKeyArgs $) {
        this.accessKeyId = $.accessKeyId;
        this.secretAccessKey = $.secretAccessKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsAccessKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsAccessKeyArgs $;

        public Builder() {
            $ = new AwsAccessKeyArgs();
        }

        public Builder(AwsAccessKeyArgs defaults) {
            $ = new AwsAccessKeyArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessKeyId(Output<String> accessKeyId) {
            $.accessKeyId = accessKeyId;
            return this;
        }

        public Builder accessKeyId(String accessKeyId) {
            return accessKeyId(Output.of(accessKeyId));
        }

        public Builder secretAccessKey(Output<String> secretAccessKey) {
            $.secretAccessKey = secretAccessKey;
            return this;
        }

        public Builder secretAccessKey(String secretAccessKey) {
            return secretAccessKey(Output.of(secretAccessKey));
        }

        public AwsAccessKeyArgs build() {
            $.accessKeyId = Objects.requireNonNull($.accessKeyId, "expected parameter 'accessKeyId' to be non-null");
            $.secretAccessKey = Objects.requireNonNull($.secretAccessKey, "expected parameter 'secretAccessKey' to be non-null");
            return $;
        }
    }

}
