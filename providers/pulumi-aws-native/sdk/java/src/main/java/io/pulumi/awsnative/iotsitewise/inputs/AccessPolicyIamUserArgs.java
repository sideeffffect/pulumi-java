// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains information for an IAM user identity in an access policy.
 * 
 */
public final class AccessPolicyIamUserArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessPolicyIamUserArgs Empty = new AccessPolicyIamUserArgs();

    /**
     * The ARN of the IAM user.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    public AccessPolicyIamUserArgs(@Nullable Input<String> arn) {
        this.arn = arn;
    }

    private AccessPolicyIamUserArgs() {
        this.arn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPolicyIamUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPolicyIamUserArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }
        public AccessPolicyIamUserArgs build() {
            return new AccessPolicyIamUserArgs(arn);
        }
    }
}
