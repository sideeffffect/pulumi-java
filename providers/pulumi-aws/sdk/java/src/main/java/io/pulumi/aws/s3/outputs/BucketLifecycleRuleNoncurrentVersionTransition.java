// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketLifecycleRuleNoncurrentVersionTransition {
    /**
     * Specifies the number of days noncurrent object versions transition.
     * 
     */
    private final @Nullable Integer days;
    /**
     * Specifies the Amazon S3 [storage class](https://docs.aws.amazon.com/AmazonS3/latest/API/API_Transition.html#AmazonS3-Type-Transition-StorageClass) to which you want the object to transition.
     * 
     */
    private final String storageClass;

    @CustomType.Constructor
    private BucketLifecycleRuleNoncurrentVersionTransition(
        @CustomType.Parameter("days") @Nullable Integer days,
        @CustomType.Parameter("storageClass") String storageClass) {
        this.days = days;
        this.storageClass = storageClass;
    }

    /**
     * Specifies the number of days noncurrent object versions transition.
     * 
    */
    public Optional<Integer> days() {
        return Optional.ofNullable(this.days);
    }
    /**
     * Specifies the Amazon S3 [storage class](https://docs.aws.amazon.com/AmazonS3/latest/API/API_Transition.html#AmazonS3-Type-Transition-StorageClass) to which you want the object to transition.
     * 
    */
    public String storageClass() {
        return this.storageClass;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleRuleNoncurrentVersionTransition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer days;
        private String storageClass;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleRuleNoncurrentVersionTransition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.storageClass = defaults.storageClass;
        }

        public Builder days(@Nullable Integer days) {
            this.days = days;
            return this;
        }
        public Builder storageClass(String storageClass) {
            this.storageClass = Objects.requireNonNull(storageClass);
            return this;
        }        public BucketLifecycleRuleNoncurrentVersionTransition build() {
            return new BucketLifecycleRuleNoncurrentVersionTransition(days, storageClass);
        }
    }
}
