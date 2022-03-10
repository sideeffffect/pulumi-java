// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration that defines how Amazon S3 handles public access.
 * 
 */
public final class BucketPublicAccessBlockConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketPublicAccessBlockConfigurationArgs Empty = new BucketPublicAccessBlockConfigurationArgs();

    /**
     * Specifies whether Amazon S3 should block public access control lists (ACLs) for this bucket and objects in this bucket. Setting this element to TRUE causes the following behavior:
     * - PUT Bucket acl and PUT Object acl calls fail if the specified ACL is public.
     *  - PUT Object calls fail if the request includes a public ACL.
     *    Enabling this setting doesn't affect existing policies or ACLs.
     * 
     */
    @InputImport(name="blockPublicAcls")
      private final @Nullable Input<Boolean> blockPublicAcls;

    public Input<Boolean> getBlockPublicAcls() {
        return this.blockPublicAcls == null ? Input.empty() : this.blockPublicAcls;
    }

    /**
     * Specifies whether Amazon S3 should block public bucket policies for this bucket. Setting this element to TRUE causes Amazon S3 to reject calls to PUT Bucket policy if the specified bucket policy allows public access.
     * Enabling this setting doesn't affect existing bucket policies.
     * 
     */
    @InputImport(name="blockPublicPolicy")
      private final @Nullable Input<Boolean> blockPublicPolicy;

    public Input<Boolean> getBlockPublicPolicy() {
        return this.blockPublicPolicy == null ? Input.empty() : this.blockPublicPolicy;
    }

    /**
     * Specifies whether Amazon S3 should ignore public ACLs for this bucket and objects in this bucket. Setting this element to TRUE causes Amazon S3 to ignore all public ACLs on this bucket and objects in this bucket.
     * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set.
     * 
     */
    @InputImport(name="ignorePublicAcls")
      private final @Nullable Input<Boolean> ignorePublicAcls;

    public Input<Boolean> getIgnorePublicAcls() {
        return this.ignorePublicAcls == null ? Input.empty() : this.ignorePublicAcls;
    }

    /**
     * Specifies whether Amazon S3 should restrict public bucket policies for this bucket. Setting this element to TRUE restricts access to this bucket to only AWS services and authorized users within this account if the bucket has a public policy.
     * Enabling this setting doesn't affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked.
     * 
     */
    @InputImport(name="restrictPublicBuckets")
      private final @Nullable Input<Boolean> restrictPublicBuckets;

    public Input<Boolean> getRestrictPublicBuckets() {
        return this.restrictPublicBuckets == null ? Input.empty() : this.restrictPublicBuckets;
    }

    public BucketPublicAccessBlockConfigurationArgs(
        @Nullable Input<Boolean> blockPublicAcls,
        @Nullable Input<Boolean> blockPublicPolicy,
        @Nullable Input<Boolean> ignorePublicAcls,
        @Nullable Input<Boolean> restrictPublicBuckets) {
        this.blockPublicAcls = blockPublicAcls;
        this.blockPublicPolicy = blockPublicPolicy;
        this.ignorePublicAcls = ignorePublicAcls;
        this.restrictPublicBuckets = restrictPublicBuckets;
    }

    private BucketPublicAccessBlockConfigurationArgs() {
        this.blockPublicAcls = Input.empty();
        this.blockPublicPolicy = Input.empty();
        this.ignorePublicAcls = Input.empty();
        this.restrictPublicBuckets = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketPublicAccessBlockConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> blockPublicAcls;
        private @Nullable Input<Boolean> blockPublicPolicy;
        private @Nullable Input<Boolean> ignorePublicAcls;
        private @Nullable Input<Boolean> restrictPublicBuckets;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketPublicAccessBlockConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockPublicAcls = defaults.blockPublicAcls;
    	      this.blockPublicPolicy = defaults.blockPublicPolicy;
    	      this.ignorePublicAcls = defaults.ignorePublicAcls;
    	      this.restrictPublicBuckets = defaults.restrictPublicBuckets;
        }

        public Builder blockPublicAcls(@Nullable Input<Boolean> blockPublicAcls) {
            this.blockPublicAcls = blockPublicAcls;
            return this;
        }

        public Builder blockPublicAcls(@Nullable Boolean blockPublicAcls) {
            this.blockPublicAcls = Input.ofNullable(blockPublicAcls);
            return this;
        }

        public Builder blockPublicPolicy(@Nullable Input<Boolean> blockPublicPolicy) {
            this.blockPublicPolicy = blockPublicPolicy;
            return this;
        }

        public Builder blockPublicPolicy(@Nullable Boolean blockPublicPolicy) {
            this.blockPublicPolicy = Input.ofNullable(blockPublicPolicy);
            return this;
        }

        public Builder ignorePublicAcls(@Nullable Input<Boolean> ignorePublicAcls) {
            this.ignorePublicAcls = ignorePublicAcls;
            return this;
        }

        public Builder ignorePublicAcls(@Nullable Boolean ignorePublicAcls) {
            this.ignorePublicAcls = Input.ofNullable(ignorePublicAcls);
            return this;
        }

        public Builder restrictPublicBuckets(@Nullable Input<Boolean> restrictPublicBuckets) {
            this.restrictPublicBuckets = restrictPublicBuckets;
            return this;
        }

        public Builder restrictPublicBuckets(@Nullable Boolean restrictPublicBuckets) {
            this.restrictPublicBuckets = Input.ofNullable(restrictPublicBuckets);
            return this;
        }
        public BucketPublicAccessBlockConfigurationArgs build() {
            return new BucketPublicAccessBlockConfigurationArgs(blockPublicAcls, blockPublicPolicy, ignorePublicAcls, restrictPublicBuckets);
        }
    }
}
