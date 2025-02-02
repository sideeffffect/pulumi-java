// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.aws.s3.outputs.BucketLifecycleConfigurationV2RuleAbortIncompleteMultipartUpload;
import com.pulumi.aws.s3.outputs.BucketLifecycleConfigurationV2RuleExpiration;
import com.pulumi.aws.s3.outputs.BucketLifecycleConfigurationV2RuleFilter;
import com.pulumi.aws.s3.outputs.BucketLifecycleConfigurationV2RuleNoncurrentVersionExpiration;
import com.pulumi.aws.s3.outputs.BucketLifecycleConfigurationV2RuleNoncurrentVersionTransition;
import com.pulumi.aws.s3.outputs.BucketLifecycleConfigurationV2RuleTransition;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketLifecycleConfigurationV2Rule {
    /**
     * @return Configuration block that specifies the days since the initiation of an incomplete multipart upload that Amazon S3 will wait before permanently removing all parts of the upload documented below.
     * 
     */
    private final @Nullable BucketLifecycleConfigurationV2RuleAbortIncompleteMultipartUpload abortIncompleteMultipartUpload;
    /**
     * @return Configuration block that specifies the expiration for the lifecycle of the object in the form of date, days and, whether the object has a delete marker documented below.
     * 
     */
    private final @Nullable BucketLifecycleConfigurationV2RuleExpiration expiration;
    /**
     * @return Configuration block used to identify objects that a Lifecycle Rule applies to documented below. If not specified, the `rule` will default to using `prefix`.
     * 
     */
    private final @Nullable BucketLifecycleConfigurationV2RuleFilter filter;
    /**
     * @return Unique identifier for the rule. The value cannot be longer than 255 characters.
     * 
     */
    private final String id;
    /**
     * @return Configuration block that specifies when noncurrent object versions expire documented below.
     * 
     */
    private final @Nullable BucketLifecycleConfigurationV2RuleNoncurrentVersionExpiration noncurrentVersionExpiration;
    /**
     * @return Set of configuration blocks that specify the transition rule for the lifecycle rule that describes when noncurrent objects transition to a specific storage class documented below.
     * 
     */
    private final @Nullable List<BucketLifecycleConfigurationV2RuleNoncurrentVersionTransition> noncurrentVersionTransitions;
    /**
     * @return **DEPRECATED** Use `filter` instead. This has been deprecated by Amazon S3. Prefix identifying one or more objects to which the rule applies. Defaults to an empty string (`&#34;&#34;`) if `filter` is not specified.
     * 
     * @deprecated
     * Use filter instead
     * 
     */
    @Deprecated /* Use filter instead */
    private final @Nullable String prefix;
    /**
     * @return Whether the rule is currently being applied. Valid values: `Enabled` or `Disabled`.
     * 
     */
    private final String status;
    /**
     * @return Set of configuration blocks that specify when an Amazon S3 object transitions to a specified storage class documented below.
     * 
     */
    private final @Nullable List<BucketLifecycleConfigurationV2RuleTransition> transitions;

    @CustomType.Constructor
    private BucketLifecycleConfigurationV2Rule(
        @CustomType.Parameter("abortIncompleteMultipartUpload") @Nullable BucketLifecycleConfigurationV2RuleAbortIncompleteMultipartUpload abortIncompleteMultipartUpload,
        @CustomType.Parameter("expiration") @Nullable BucketLifecycleConfigurationV2RuleExpiration expiration,
        @CustomType.Parameter("filter") @Nullable BucketLifecycleConfigurationV2RuleFilter filter,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("noncurrentVersionExpiration") @Nullable BucketLifecycleConfigurationV2RuleNoncurrentVersionExpiration noncurrentVersionExpiration,
        @CustomType.Parameter("noncurrentVersionTransitions") @Nullable List<BucketLifecycleConfigurationV2RuleNoncurrentVersionTransition> noncurrentVersionTransitions,
        @CustomType.Parameter("prefix") @Nullable String prefix,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("transitions") @Nullable List<BucketLifecycleConfigurationV2RuleTransition> transitions) {
        this.abortIncompleteMultipartUpload = abortIncompleteMultipartUpload;
        this.expiration = expiration;
        this.filter = filter;
        this.id = id;
        this.noncurrentVersionExpiration = noncurrentVersionExpiration;
        this.noncurrentVersionTransitions = noncurrentVersionTransitions;
        this.prefix = prefix;
        this.status = status;
        this.transitions = transitions;
    }

    /**
     * @return Configuration block that specifies the days since the initiation of an incomplete multipart upload that Amazon S3 will wait before permanently removing all parts of the upload documented below.
     * 
     */
    public Optional<BucketLifecycleConfigurationV2RuleAbortIncompleteMultipartUpload> abortIncompleteMultipartUpload() {
        return Optional.ofNullable(this.abortIncompleteMultipartUpload);
    }
    /**
     * @return Configuration block that specifies the expiration for the lifecycle of the object in the form of date, days and, whether the object has a delete marker documented below.
     * 
     */
    public Optional<BucketLifecycleConfigurationV2RuleExpiration> expiration() {
        return Optional.ofNullable(this.expiration);
    }
    /**
     * @return Configuration block used to identify objects that a Lifecycle Rule applies to documented below. If not specified, the `rule` will default to using `prefix`.
     * 
     */
    public Optional<BucketLifecycleConfigurationV2RuleFilter> filter() {
        return Optional.ofNullable(this.filter);
    }
    /**
     * @return Unique identifier for the rule. The value cannot be longer than 255 characters.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Configuration block that specifies when noncurrent object versions expire documented below.
     * 
     */
    public Optional<BucketLifecycleConfigurationV2RuleNoncurrentVersionExpiration> noncurrentVersionExpiration() {
        return Optional.ofNullable(this.noncurrentVersionExpiration);
    }
    /**
     * @return Set of configuration blocks that specify the transition rule for the lifecycle rule that describes when noncurrent objects transition to a specific storage class documented below.
     * 
     */
    public List<BucketLifecycleConfigurationV2RuleNoncurrentVersionTransition> noncurrentVersionTransitions() {
        return this.noncurrentVersionTransitions == null ? List.of() : this.noncurrentVersionTransitions;
    }
    /**
     * @return **DEPRECATED** Use `filter` instead. This has been deprecated by Amazon S3. Prefix identifying one or more objects to which the rule applies. Defaults to an empty string (`&#34;&#34;`) if `filter` is not specified.
     * 
     * @deprecated
     * Use filter instead
     * 
     */
    @Deprecated /* Use filter instead */
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }
    /**
     * @return Whether the rule is currently being applied. Valid values: `Enabled` or `Disabled`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Set of configuration blocks that specify when an Amazon S3 object transitions to a specified storage class documented below.
     * 
     */
    public List<BucketLifecycleConfigurationV2RuleTransition> transitions() {
        return this.transitions == null ? List.of() : this.transitions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleConfigurationV2Rule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BucketLifecycleConfigurationV2RuleAbortIncompleteMultipartUpload abortIncompleteMultipartUpload;
        private @Nullable BucketLifecycleConfigurationV2RuleExpiration expiration;
        private @Nullable BucketLifecycleConfigurationV2RuleFilter filter;
        private String id;
        private @Nullable BucketLifecycleConfigurationV2RuleNoncurrentVersionExpiration noncurrentVersionExpiration;
        private @Nullable List<BucketLifecycleConfigurationV2RuleNoncurrentVersionTransition> noncurrentVersionTransitions;
        private @Nullable String prefix;
        private String status;
        private @Nullable List<BucketLifecycleConfigurationV2RuleTransition> transitions;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleConfigurationV2Rule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abortIncompleteMultipartUpload = defaults.abortIncompleteMultipartUpload;
    	      this.expiration = defaults.expiration;
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
    	      this.noncurrentVersionExpiration = defaults.noncurrentVersionExpiration;
    	      this.noncurrentVersionTransitions = defaults.noncurrentVersionTransitions;
    	      this.prefix = defaults.prefix;
    	      this.status = defaults.status;
    	      this.transitions = defaults.transitions;
        }

        public Builder abortIncompleteMultipartUpload(@Nullable BucketLifecycleConfigurationV2RuleAbortIncompleteMultipartUpload abortIncompleteMultipartUpload) {
            this.abortIncompleteMultipartUpload = abortIncompleteMultipartUpload;
            return this;
        }
        public Builder expiration(@Nullable BucketLifecycleConfigurationV2RuleExpiration expiration) {
            this.expiration = expiration;
            return this;
        }
        public Builder filter(@Nullable BucketLifecycleConfigurationV2RuleFilter filter) {
            this.filter = filter;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder noncurrentVersionExpiration(@Nullable BucketLifecycleConfigurationV2RuleNoncurrentVersionExpiration noncurrentVersionExpiration) {
            this.noncurrentVersionExpiration = noncurrentVersionExpiration;
            return this;
        }
        public Builder noncurrentVersionTransitions(@Nullable List<BucketLifecycleConfigurationV2RuleNoncurrentVersionTransition> noncurrentVersionTransitions) {
            this.noncurrentVersionTransitions = noncurrentVersionTransitions;
            return this;
        }
        public Builder noncurrentVersionTransitions(BucketLifecycleConfigurationV2RuleNoncurrentVersionTransition... noncurrentVersionTransitions) {
            return noncurrentVersionTransitions(List.of(noncurrentVersionTransitions));
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder transitions(@Nullable List<BucketLifecycleConfigurationV2RuleTransition> transitions) {
            this.transitions = transitions;
            return this;
        }
        public Builder transitions(BucketLifecycleConfigurationV2RuleTransition... transitions) {
            return transitions(List.of(transitions));
        }        public BucketLifecycleConfigurationV2Rule build() {
            return new BucketLifecycleConfigurationV2Rule(abortIncompleteMultipartUpload, expiration, filter, id, noncurrentVersionExpiration, noncurrentVersionTransitions, prefix, status, transitions);
        }
    }
}
