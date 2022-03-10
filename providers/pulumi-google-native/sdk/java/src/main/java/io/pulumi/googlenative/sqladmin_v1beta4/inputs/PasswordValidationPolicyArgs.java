// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.sqladmin_v1beta4.enums.PasswordValidationPolicyComplexity;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Database instance local user password validation policy
 * 
 */
public final class PasswordValidationPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final PasswordValidationPolicyArgs Empty = new PasswordValidationPolicyArgs();

    /**
     * The complexity of the password.
     * 
     */
    @InputImport(name="complexity")
      private final @Nullable Input<PasswordValidationPolicyComplexity> complexity;

    public Input<PasswordValidationPolicyComplexity> getComplexity() {
        return this.complexity == null ? Input.empty() : this.complexity;
    }

    /**
     * Disallow username as a part of the password.
     * 
     */
    @InputImport(name="disallowUsernameSubstring")
      private final @Nullable Input<Boolean> disallowUsernameSubstring;

    public Input<Boolean> getDisallowUsernameSubstring() {
        return this.disallowUsernameSubstring == null ? Input.empty() : this.disallowUsernameSubstring;
    }

    /**
     * Minimum number of characters allowed.
     * 
     */
    @InputImport(name="minLength")
      private final @Nullable Input<Integer> minLength;

    public Input<Integer> getMinLength() {
        return this.minLength == null ? Input.empty() : this.minLength;
    }

    /**
     * Minimum interval after which the password can be changed. This flag is only supported for PostgresSQL.
     * 
     */
    @InputImport(name="passwordChangeInterval")
      private final @Nullable Input<String> passwordChangeInterval;

    public Input<String> getPasswordChangeInterval() {
        return this.passwordChangeInterval == null ? Input.empty() : this.passwordChangeInterval;
    }

    /**
     * Number of previous passwords that cannot be reused.
     * 
     */
    @InputImport(name="reuseInterval")
      private final @Nullable Input<Integer> reuseInterval;

    public Input<Integer> getReuseInterval() {
        return this.reuseInterval == null ? Input.empty() : this.reuseInterval;
    }

    public PasswordValidationPolicyArgs(
        @Nullable Input<PasswordValidationPolicyComplexity> complexity,
        @Nullable Input<Boolean> disallowUsernameSubstring,
        @Nullable Input<Integer> minLength,
        @Nullable Input<String> passwordChangeInterval,
        @Nullable Input<Integer> reuseInterval) {
        this.complexity = complexity;
        this.disallowUsernameSubstring = disallowUsernameSubstring;
        this.minLength = minLength;
        this.passwordChangeInterval = passwordChangeInterval;
        this.reuseInterval = reuseInterval;
    }

    private PasswordValidationPolicyArgs() {
        this.complexity = Input.empty();
        this.disallowUsernameSubstring = Input.empty();
        this.minLength = Input.empty();
        this.passwordChangeInterval = Input.empty();
        this.reuseInterval = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PasswordValidationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PasswordValidationPolicyComplexity> complexity;
        private @Nullable Input<Boolean> disallowUsernameSubstring;
        private @Nullable Input<Integer> minLength;
        private @Nullable Input<String> passwordChangeInterval;
        private @Nullable Input<Integer> reuseInterval;

        public Builder() {
    	      // Empty
        }

        public Builder(PasswordValidationPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.complexity = defaults.complexity;
    	      this.disallowUsernameSubstring = defaults.disallowUsernameSubstring;
    	      this.minLength = defaults.minLength;
    	      this.passwordChangeInterval = defaults.passwordChangeInterval;
    	      this.reuseInterval = defaults.reuseInterval;
        }

        public Builder complexity(@Nullable Input<PasswordValidationPolicyComplexity> complexity) {
            this.complexity = complexity;
            return this;
        }

        public Builder complexity(@Nullable PasswordValidationPolicyComplexity complexity) {
            this.complexity = Input.ofNullable(complexity);
            return this;
        }

        public Builder disallowUsernameSubstring(@Nullable Input<Boolean> disallowUsernameSubstring) {
            this.disallowUsernameSubstring = disallowUsernameSubstring;
            return this;
        }

        public Builder disallowUsernameSubstring(@Nullable Boolean disallowUsernameSubstring) {
            this.disallowUsernameSubstring = Input.ofNullable(disallowUsernameSubstring);
            return this;
        }

        public Builder minLength(@Nullable Input<Integer> minLength) {
            this.minLength = minLength;
            return this;
        }

        public Builder minLength(@Nullable Integer minLength) {
            this.minLength = Input.ofNullable(minLength);
            return this;
        }

        public Builder passwordChangeInterval(@Nullable Input<String> passwordChangeInterval) {
            this.passwordChangeInterval = passwordChangeInterval;
            return this;
        }

        public Builder passwordChangeInterval(@Nullable String passwordChangeInterval) {
            this.passwordChangeInterval = Input.ofNullable(passwordChangeInterval);
            return this;
        }

        public Builder reuseInterval(@Nullable Input<Integer> reuseInterval) {
            this.reuseInterval = reuseInterval;
            return this;
        }

        public Builder reuseInterval(@Nullable Integer reuseInterval) {
            this.reuseInterval = Input.ofNullable(reuseInterval);
            return this;
        }
        public PasswordValidationPolicyArgs build() {
            return new PasswordValidationPolicyArgs(complexity, disallowUsernameSubstring, minLength, passwordChangeInterval, reuseInterval);
        }
    }
}
