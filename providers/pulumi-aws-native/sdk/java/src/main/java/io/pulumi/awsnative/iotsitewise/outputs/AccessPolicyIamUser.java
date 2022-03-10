// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AccessPolicyIamUser {
    /**
     * The ARN of the IAM user.
     * 
     */
    private final @Nullable String arn;

    @OutputCustomType.Constructor
    private AccessPolicyIamUser(@OutputCustomType.Parameter("arn") @Nullable String arn) {
        this.arn = arn;
    }

    /**
     * The ARN of the IAM user.
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPolicyIamUser defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPolicyIamUser defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public AccessPolicyIamUser build() {
            return new AccessPolicyIamUser(arn);
        }
    }
}
