// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datadog.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * User info
 * 
 */
public final class UserInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final UserInfoResponse Empty = new UserInfoResponse();

    /**
     * Email of the user used by Datadog for contacting them if needed
     * 
     */
    @Import(name="emailAddress")
      private final @Nullable String emailAddress;

    public Optional<String> emailAddress() {
        return this.emailAddress == null ? Optional.empty() : Optional.ofNullable(this.emailAddress);
    }

    /**
     * Name of the user
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Phone number of the user used by Datadog for contacting them if needed
     * 
     */
    @Import(name="phoneNumber")
      private final @Nullable String phoneNumber;

    public Optional<String> phoneNumber() {
        return this.phoneNumber == null ? Optional.empty() : Optional.ofNullable(this.phoneNumber);
    }

    public UserInfoResponse(
        @Nullable String emailAddress,
        @Nullable String name,
        @Nullable String phoneNumber) {
        this.emailAddress = emailAddress;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    private UserInfoResponse() {
        this.emailAddress = null;
        this.name = null;
        this.phoneNumber = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String emailAddress;
        private @Nullable String name;
        private @Nullable String phoneNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(UserInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emailAddress = defaults.emailAddress;
    	      this.name = defaults.name;
    	      this.phoneNumber = defaults.phoneNumber;
        }

        public Builder emailAddress(@Nullable String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder phoneNumber(@Nullable String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }        public UserInfoResponse build() {
            return new UserInfoResponse(emailAddress, name, phoneNumber);
        }
    }
}
