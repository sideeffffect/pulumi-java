// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessPointPublicAccessBlockConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessPointPublicAccessBlockConfigurationArgs Empty = new AccessPointPublicAccessBlockConfigurationArgs();

    /**
     * Whether Amazon S3 should block public ACLs for buckets in this account. Defaults to `true`. Enabling this setting does not affect existing policies or ACLs. When set to `true` causes the following behavior:
     * * PUT Bucket acl and PUT Object acl calls fail if the specified ACL is public.
     * * PUT Object calls fail if the request includes a public ACL.
     * * PUT Bucket calls fail if the request includes a public ACL.
     * 
     */
    @InputImport(name="blockPublicAcls")
      private final @Nullable Input<Boolean> blockPublicAcls;

    public Input<Boolean> getBlockPublicAcls() {
        return this.blockPublicAcls == null ? Input.empty() : this.blockPublicAcls;
    }

    /**
     * Whether Amazon S3 should block public bucket policies for buckets in this account. Defaults to `true`. Enabling this setting does not affect existing bucket policies. When set to `true` causes Amazon S3 to:
     * * Reject calls to PUT Bucket policy if the specified bucket policy allows public access.
     * 
     */
    @InputImport(name="blockPublicPolicy")
      private final @Nullable Input<Boolean> blockPublicPolicy;

    public Input<Boolean> getBlockPublicPolicy() {
        return this.blockPublicPolicy == null ? Input.empty() : this.blockPublicPolicy;
    }

    /**
     * Whether Amazon S3 should ignore public ACLs for buckets in this account. Defaults to `true`. Enabling this setting does not affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set. When set to `true` causes Amazon S3 to:
     * * Ignore all public ACLs on buckets in this account and any objects that they contain.
     * 
     */
    @InputImport(name="ignorePublicAcls")
      private final @Nullable Input<Boolean> ignorePublicAcls;

    public Input<Boolean> getIgnorePublicAcls() {
        return this.ignorePublicAcls == null ? Input.empty() : this.ignorePublicAcls;
    }

    /**
     * Whether Amazon S3 should restrict public bucket policies for buckets in this account. Defaults to `true`. Enabling this setting does not affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked. When set to `true`:
     * * Only the bucket owner and AWS Services can access buckets with public policies.
     * 
     */
    @InputImport(name="restrictPublicBuckets")
      private final @Nullable Input<Boolean> restrictPublicBuckets;

    public Input<Boolean> getRestrictPublicBuckets() {
        return this.restrictPublicBuckets == null ? Input.empty() : this.restrictPublicBuckets;
    }

    public AccessPointPublicAccessBlockConfigurationArgs(
        @Nullable Input<Boolean> blockPublicAcls,
        @Nullable Input<Boolean> blockPublicPolicy,
        @Nullable Input<Boolean> ignorePublicAcls,
        @Nullable Input<Boolean> restrictPublicBuckets) {
        this.blockPublicAcls = blockPublicAcls;
        this.blockPublicPolicy = blockPublicPolicy;
        this.ignorePublicAcls = ignorePublicAcls;
        this.restrictPublicBuckets = restrictPublicBuckets;
    }

    private AccessPointPublicAccessBlockConfigurationArgs() {
        this.blockPublicAcls = Input.empty();
        this.blockPublicPolicy = Input.empty();
        this.ignorePublicAcls = Input.empty();
        this.restrictPublicBuckets = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPointPublicAccessBlockConfigurationArgs defaults) {
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

        public Builder(AccessPointPublicAccessBlockConfigurationArgs defaults) {
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
        public AccessPointPublicAccessBlockConfigurationArgs build() {
            return new AccessPointPublicAccessBlockConfigurationArgs(blockPublicAcls, blockPublicPolicy, ignorePublicAcls, restrictPublicBuckets);
        }
    }
}
