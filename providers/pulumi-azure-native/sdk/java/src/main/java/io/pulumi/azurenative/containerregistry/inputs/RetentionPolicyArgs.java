// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.enums.PolicyStatus;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The retention policy for a container registry.
 * 
 */
public final class RetentionPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RetentionPolicyArgs Empty = new RetentionPolicyArgs();

    /**
     * The number of days to retain an untagged manifest after which it gets purged.
     * 
     */
    @InputImport(name="days")
      private final @Nullable Input<Integer> days;

    public Input<Integer> getDays() {
        return this.days == null ? Input.empty() : this.days;
    }

    /**
     * The value that indicates whether the policy is enabled or not.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<Either<String,PolicyStatus>> status;

    public Input<Either<String,PolicyStatus>> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public RetentionPolicyArgs(
        @Nullable Input<Integer> days,
        @Nullable Input<Either<String,PolicyStatus>> status) {
        this.days = days == null ? Input.ofNullable(7) : days;
        this.status = status == null ? Input.ofLeft("disabled") : status;
    }

    private RetentionPolicyArgs() {
        this.days = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RetentionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> days;
        private @Nullable Input<Either<String,PolicyStatus>> status;

        public Builder() {
    	      // Empty
        }

        public Builder(RetentionPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.status = defaults.status;
        }

        public Builder days(@Nullable Input<Integer> days) {
            this.days = days;
            return this;
        }

        public Builder days(@Nullable Integer days) {
            this.days = Input.ofNullable(days);
            return this;
        }

        public Builder status(@Nullable Input<Either<String,PolicyStatus>> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable Either<String,PolicyStatus> status) {
            this.status = Input.ofNullable(status);
            return this;
        }
        public RetentionPolicyArgs build() {
            return new RetentionPolicyArgs(days, status);
        }
    }
}
