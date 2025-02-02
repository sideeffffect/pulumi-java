// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBillingServiceAccountResult {
    /**
     * @return The ARN of the AWS billing service account.
     * 
     */
    private final String arn;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;

    @CustomType.Constructor
    private GetBillingServiceAccountResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("id") String id) {
        this.arn = arn;
        this.id = id;
    }

    /**
     * @return The ARN of the AWS billing service account.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBillingServiceAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBillingServiceAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public GetBillingServiceAccountResult build() {
            return new GetBillingServiceAccountResult(arn, id);
        }
    }
}
