// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticbeanstalk.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationAppversionLifecycle {
    /**
     * Set to `true` to delete a version's source bundle from S3 when the application version is deleted.
     * 
     */
    private final @Nullable Boolean deleteSourceFromS3;
    /**
     * The number of days to retain an application version ('max_age_in_days' and 'max_count' cannot be enabled simultaneously.).
     * 
     */
    private final @Nullable Integer maxAgeInDays;
    /**
     * The maximum number of application versions to retain ('max_age_in_days' and 'max_count' cannot be enabled simultaneously.).
     * 
     */
    private final @Nullable Integer maxCount;
    /**
     * The ARN of an IAM service role under which the application version is deleted.  Elastic Beanstalk must have permission to assume this role.
     * 
     */
    private final String serviceRole;

    @OutputCustomType.Constructor({"deleteSourceFromS3","maxAgeInDays","maxCount","serviceRole"})
    private ApplicationAppversionLifecycle(
        @Nullable Boolean deleteSourceFromS3,
        @Nullable Integer maxAgeInDays,
        @Nullable Integer maxCount,
        String serviceRole) {
        this.deleteSourceFromS3 = deleteSourceFromS3;
        this.maxAgeInDays = maxAgeInDays;
        this.maxCount = maxCount;
        this.serviceRole = serviceRole;
    }

    /**
     * Set to `true` to delete a version's source bundle from S3 when the application version is deleted.
     * 
    */
    public Optional<Boolean> getDeleteSourceFromS3() {
        return Optional.ofNullable(this.deleteSourceFromS3);
    }
    /**
     * The number of days to retain an application version ('max_age_in_days' and 'max_count' cannot be enabled simultaneously.).
     * 
    */
    public Optional<Integer> getMaxAgeInDays() {
        return Optional.ofNullable(this.maxAgeInDays);
    }
    /**
     * The maximum number of application versions to retain ('max_age_in_days' and 'max_count' cannot be enabled simultaneously.).
     * 
    */
    public Optional<Integer> getMaxCount() {
        return Optional.ofNullable(this.maxCount);
    }
    /**
     * The ARN of an IAM service role under which the application version is deleted.  Elastic Beanstalk must have permission to assume this role.
     * 
    */
    public String getServiceRole() {
        return this.serviceRole;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationAppversionLifecycle defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean deleteSourceFromS3;
        private @Nullable Integer maxAgeInDays;
        private @Nullable Integer maxCount;
        private String serviceRole;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationAppversionLifecycle defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteSourceFromS3 = defaults.deleteSourceFromS3;
    	      this.maxAgeInDays = defaults.maxAgeInDays;
    	      this.maxCount = defaults.maxCount;
    	      this.serviceRole = defaults.serviceRole;
        }

        public Builder setDeleteSourceFromS3(@Nullable Boolean deleteSourceFromS3) {
            this.deleteSourceFromS3 = deleteSourceFromS3;
            return this;
        }

        public Builder setMaxAgeInDays(@Nullable Integer maxAgeInDays) {
            this.maxAgeInDays = maxAgeInDays;
            return this;
        }

        public Builder setMaxCount(@Nullable Integer maxCount) {
            this.maxCount = maxCount;
            return this;
        }

        public Builder setServiceRole(String serviceRole) {
            this.serviceRole = Objects.requireNonNull(serviceRole);
            return this;
        }
        public ApplicationAppversionLifecycle build() {
            return new ApplicationAppversionLifecycle(deleteSourceFromS3, maxAgeInDays, maxCount, serviceRole);
        }
    }
}
