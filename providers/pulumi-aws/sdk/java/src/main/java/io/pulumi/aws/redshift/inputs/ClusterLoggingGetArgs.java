// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.redshift.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterLoggingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterLoggingGetArgs Empty = new ClusterLoggingGetArgs();

    /**
     * The name of an existing S3 bucket where the log files are to be stored. Must be in the same region as the cluster and the cluster must have read bucket and put object permissions.
     * For more information on the permissions required for the bucket, please read the AWS [documentation](http://docs.aws.amazon.com/redshift/latest/mgmt/db-auditing.html#db-auditing-enable-logging)
     * 
     */
    @InputImport(name="bucketName")
      private final @Nullable Input<String> bucketName;

    public Input<String> getBucketName() {
        return this.bucketName == null ? Input.empty() : this.bucketName;
    }

    /**
     * Enables logging information such as queries and connection attempts, for the specified Amazon Redshift cluster.
     * 
     */
    @InputImport(name="enable", required=true)
      private final Input<Boolean> enable;

    public Input<Boolean> getEnable() {
        return this.enable;
    }

    /**
     * The prefix applied to the log file names.
     * 
     */
    @InputImport(name="s3KeyPrefix")
      private final @Nullable Input<String> s3KeyPrefix;

    public Input<String> getS3KeyPrefix() {
        return this.s3KeyPrefix == null ? Input.empty() : this.s3KeyPrefix;
    }

    public ClusterLoggingGetArgs(
        @Nullable Input<String> bucketName,
        Input<Boolean> enable,
        @Nullable Input<String> s3KeyPrefix) {
        this.bucketName = bucketName;
        this.enable = Objects.requireNonNull(enable, "expected parameter 'enable' to be non-null");
        this.s3KeyPrefix = s3KeyPrefix;
    }

    private ClusterLoggingGetArgs() {
        this.bucketName = Input.empty();
        this.enable = Input.empty();
        this.s3KeyPrefix = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterLoggingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bucketName;
        private Input<Boolean> enable;
        private @Nullable Input<String> s3KeyPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterLoggingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.enable = defaults.enable;
    	      this.s3KeyPrefix = defaults.s3KeyPrefix;
        }

        public Builder bucketName(@Nullable Input<String> bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        public Builder bucketName(@Nullable String bucketName) {
            this.bucketName = Input.ofNullable(bucketName);
            return this;
        }

        public Builder enable(Input<Boolean> enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }

        public Builder enable(Boolean enable) {
            this.enable = Input.of(Objects.requireNonNull(enable));
            return this;
        }

        public Builder s3KeyPrefix(@Nullable Input<String> s3KeyPrefix) {
            this.s3KeyPrefix = s3KeyPrefix;
            return this;
        }

        public Builder s3KeyPrefix(@Nullable String s3KeyPrefix) {
            this.s3KeyPrefix = Input.ofNullable(s3KeyPrefix);
            return this;
        }
        public ClusterLoggingGetArgs build() {
            return new ClusterLoggingGetArgs(bucketName, enable, s3KeyPrefix);
        }
    }
}
