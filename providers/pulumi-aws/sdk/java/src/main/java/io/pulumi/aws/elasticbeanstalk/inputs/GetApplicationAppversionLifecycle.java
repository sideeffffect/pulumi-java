// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticbeanstalk.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetApplicationAppversionLifecycle extends io.pulumi.resources.InvokeArgs {

    public static final GetApplicationAppversionLifecycle Empty = new GetApplicationAppversionLifecycle();

    /**
     * Specifies whether delete a version's source bundle from S3 when the application version is deleted.
     * 
     */
    @Import(name="deleteSourceFromS3", required=true)
      private final Boolean deleteSourceFromS3;

    public Boolean deleteSourceFromS3() {
        return this.deleteSourceFromS3;
    }

    /**
     * The number of days to retain an application version.
     * 
     */
    @Import(name="maxAgeInDays", required=true)
      private final Integer maxAgeInDays;

    public Integer maxAgeInDays() {
        return this.maxAgeInDays;
    }

    /**
     * The maximum number of application versions to retain.
     * 
     */
    @Import(name="maxCount", required=true)
      private final Integer maxCount;

    public Integer maxCount() {
        return this.maxCount;
    }

    /**
     * The ARN of an IAM service role under which the application version is deleted.  Elastic Beanstalk must have permission to assume this role.
     * 
     */
    @Import(name="serviceRole", required=true)
      private final String serviceRole;

    public String serviceRole() {
        return this.serviceRole;
    }

    public GetApplicationAppversionLifecycle(
        Boolean deleteSourceFromS3,
        Integer maxAgeInDays,
        Integer maxCount,
        String serviceRole) {
        this.deleteSourceFromS3 = Objects.requireNonNull(deleteSourceFromS3, "expected parameter 'deleteSourceFromS3' to be non-null");
        this.maxAgeInDays = Objects.requireNonNull(maxAgeInDays, "expected parameter 'maxAgeInDays' to be non-null");
        this.maxCount = Objects.requireNonNull(maxCount, "expected parameter 'maxCount' to be non-null");
        this.serviceRole = Objects.requireNonNull(serviceRole, "expected parameter 'serviceRole' to be non-null");
    }

    private GetApplicationAppversionLifecycle() {
        this.deleteSourceFromS3 = null;
        this.maxAgeInDays = null;
        this.maxCount = null;
        this.serviceRole = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationAppversionLifecycle defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean deleteSourceFromS3;
        private Integer maxAgeInDays;
        private Integer maxCount;
        private String serviceRole;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationAppversionLifecycle defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteSourceFromS3 = defaults.deleteSourceFromS3;
    	      this.maxAgeInDays = defaults.maxAgeInDays;
    	      this.maxCount = defaults.maxCount;
    	      this.serviceRole = defaults.serviceRole;
        }

        public Builder deleteSourceFromS3(Boolean deleteSourceFromS3) {
            this.deleteSourceFromS3 = Objects.requireNonNull(deleteSourceFromS3);
            return this;
        }
        public Builder maxAgeInDays(Integer maxAgeInDays) {
            this.maxAgeInDays = Objects.requireNonNull(maxAgeInDays);
            return this;
        }
        public Builder maxCount(Integer maxCount) {
            this.maxCount = Objects.requireNonNull(maxCount);
            return this;
        }
        public Builder serviceRole(String serviceRole) {
            this.serviceRole = Objects.requireNonNull(serviceRole);
            return this;
        }        public GetApplicationAppversionLifecycle build() {
            return new GetApplicationAppversionLifecycle(deleteSourceFromS3, maxAgeInDays, maxCount, serviceRole);
        }
    }
}
