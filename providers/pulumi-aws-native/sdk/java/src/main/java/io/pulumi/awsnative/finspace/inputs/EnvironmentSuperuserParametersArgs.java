// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.finspace.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Parameters of the first Superuser for the FinSpace Environment
 * 
 */
public final class EnvironmentSuperuserParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentSuperuserParametersArgs Empty = new EnvironmentSuperuserParametersArgs();

    /**
     * Email address
     * 
     */
    @InputImport(name="emailAddress")
      private final @Nullable Input<String> emailAddress;

    public Input<String> getEmailAddress() {
        return this.emailAddress == null ? Input.empty() : this.emailAddress;
    }

    /**
     * First name
     * 
     */
    @InputImport(name="firstName")
      private final @Nullable Input<String> firstName;

    public Input<String> getFirstName() {
        return this.firstName == null ? Input.empty() : this.firstName;
    }

    /**
     * Last name
     * 
     */
    @InputImport(name="lastName")
      private final @Nullable Input<String> lastName;

    public Input<String> getLastName() {
        return this.lastName == null ? Input.empty() : this.lastName;
    }

    public EnvironmentSuperuserParametersArgs(
        @Nullable Input<String> emailAddress,
        @Nullable Input<String> firstName,
        @Nullable Input<String> lastName) {
        this.emailAddress = emailAddress;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private EnvironmentSuperuserParametersArgs() {
        this.emailAddress = Input.empty();
        this.firstName = Input.empty();
        this.lastName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentSuperuserParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> emailAddress;
        private @Nullable Input<String> firstName;
        private @Nullable Input<String> lastName;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentSuperuserParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emailAddress = defaults.emailAddress;
    	      this.firstName = defaults.firstName;
    	      this.lastName = defaults.lastName;
        }

        public Builder emailAddress(@Nullable Input<String> emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public Builder emailAddress(@Nullable String emailAddress) {
            this.emailAddress = Input.ofNullable(emailAddress);
            return this;
        }

        public Builder firstName(@Nullable Input<String> firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder firstName(@Nullable String firstName) {
            this.firstName = Input.ofNullable(firstName);
            return this;
        }

        public Builder lastName(@Nullable Input<String> lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder lastName(@Nullable String lastName) {
            this.lastName = Input.ofNullable(lastName);
            return this;
        }
        public EnvironmentSuperuserParametersArgs build() {
            return new EnvironmentSuperuserParametersArgs(emailAddress, firstName, lastName);
        }
    }
}
