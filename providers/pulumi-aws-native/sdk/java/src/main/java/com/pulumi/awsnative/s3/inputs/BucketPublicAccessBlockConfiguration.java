// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration that defines how Amazon S3 handles public access.
 * 
 */
public final class BucketPublicAccessBlockConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final BucketPublicAccessBlockConfiguration Empty = new BucketPublicAccessBlockConfiguration();

    /**
     * Specifies whether Amazon S3 should block public access control lists (ACLs) for this bucket and objects in this bucket. Setting this element to TRUE causes the following behavior:
     * - PUT Bucket acl and PUT Object acl calls fail if the specified ACL is public.
     *  - PUT Object calls fail if the request includes a public ACL.
     *    Enabling this setting doesn&#39;t affect existing policies or ACLs.
     * 
     */
    @Import(name="blockPublicAcls")
    private @Nullable Boolean blockPublicAcls;

    public Optional<Boolean> blockPublicAcls() {
        return Optional.ofNullable(this.blockPublicAcls);
    }

    /**
     * Specifies whether Amazon S3 should block public bucket policies for this bucket. Setting this element to TRUE causes Amazon S3 to reject calls to PUT Bucket policy if the specified bucket policy allows public access.
     * Enabling this setting doesn&#39;t affect existing bucket policies.
     * 
     */
    @Import(name="blockPublicPolicy")
    private @Nullable Boolean blockPublicPolicy;

    public Optional<Boolean> blockPublicPolicy() {
        return Optional.ofNullable(this.blockPublicPolicy);
    }

    /**
     * Specifies whether Amazon S3 should ignore public ACLs for this bucket and objects in this bucket. Setting this element to TRUE causes Amazon S3 to ignore all public ACLs on this bucket and objects in this bucket.
     * Enabling this setting doesn&#39;t affect the persistence of any existing ACLs and doesn&#39;t prevent new public ACLs from being set.
     * 
     */
    @Import(name="ignorePublicAcls")
    private @Nullable Boolean ignorePublicAcls;

    public Optional<Boolean> ignorePublicAcls() {
        return Optional.ofNullable(this.ignorePublicAcls);
    }

    /**
     * Specifies whether Amazon S3 should restrict public bucket policies for this bucket. Setting this element to TRUE restricts access to this bucket to only AWS services and authorized users within this account if the bucket has a public policy.
     * Enabling this setting doesn&#39;t affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked.
     * 
     */
    @Import(name="restrictPublicBuckets")
    private @Nullable Boolean restrictPublicBuckets;

    public Optional<Boolean> restrictPublicBuckets() {
        return Optional.ofNullable(this.restrictPublicBuckets);
    }

    private BucketPublicAccessBlockConfiguration() {}

    private BucketPublicAccessBlockConfiguration(BucketPublicAccessBlockConfiguration $) {
        this.blockPublicAcls = $.blockPublicAcls;
        this.blockPublicPolicy = $.blockPublicPolicy;
        this.ignorePublicAcls = $.ignorePublicAcls;
        this.restrictPublicBuckets = $.restrictPublicBuckets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketPublicAccessBlockConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketPublicAccessBlockConfiguration $;

        public Builder() {
            $ = new BucketPublicAccessBlockConfiguration();
        }

        public Builder(BucketPublicAccessBlockConfiguration defaults) {
            $ = new BucketPublicAccessBlockConfiguration(Objects.requireNonNull(defaults));
        }

        public Builder blockPublicAcls(@Nullable Boolean blockPublicAcls) {
            $.blockPublicAcls = blockPublicAcls;
            return this;
        }

        public Builder blockPublicPolicy(@Nullable Boolean blockPublicPolicy) {
            $.blockPublicPolicy = blockPublicPolicy;
            return this;
        }

        public Builder ignorePublicAcls(@Nullable Boolean ignorePublicAcls) {
            $.ignorePublicAcls = ignorePublicAcls;
            return this;
        }

        public Builder restrictPublicBuckets(@Nullable Boolean restrictPublicBuckets) {
            $.restrictPublicBuckets = restrictPublicBuckets;
            return this;
        }

        public BucketPublicAccessBlockConfiguration build() {
            return $;
        }
    }

}
