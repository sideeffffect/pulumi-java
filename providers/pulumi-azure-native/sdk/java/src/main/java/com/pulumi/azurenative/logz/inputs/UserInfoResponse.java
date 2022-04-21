// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logz.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final UserInfoResponse Empty = new UserInfoResponse();

    /**
     * Email of the user used by Logz for contacting them if needed
     * 
     */
    @Import(name="emailAddress")
    private @Nullable String emailAddress;

    public Optional<String> emailAddress() {
        return Optional.ofNullable(this.emailAddress);
    }

    /**
     * First Name of the user
     * 
     */
    @Import(name="firstName")
    private @Nullable String firstName;

    public Optional<String> firstName() {
        return Optional.ofNullable(this.firstName);
    }

    /**
     * Last Name of the user
     * 
     */
    @Import(name="lastName")
    private @Nullable String lastName;

    public Optional<String> lastName() {
        return Optional.ofNullable(this.lastName);
    }

    /**
     * Phone number of the user used by Logz for contacting them if needed
     * 
     */
    @Import(name="phoneNumber")
    private @Nullable String phoneNumber;

    public Optional<String> phoneNumber() {
        return Optional.ofNullable(this.phoneNumber);
    }

    private UserInfoResponse() {}

    private UserInfoResponse(UserInfoResponse $) {
        this.emailAddress = $.emailAddress;
        this.firstName = $.firstName;
        this.lastName = $.lastName;
        this.phoneNumber = $.phoneNumber;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserInfoResponse $;

        public Builder() {
            $ = new UserInfoResponse();
        }

        public Builder(UserInfoResponse defaults) {
            $ = new UserInfoResponse(Objects.requireNonNull(defaults));
        }

        public Builder emailAddress(@Nullable String emailAddress) {
            $.emailAddress = emailAddress;
            return this;
        }

        public Builder firstName(@Nullable String firstName) {
            $.firstName = firstName;
            return this;
        }

        public Builder lastName(@Nullable String lastName) {
            $.lastName = lastName;
            return this;
        }

        public Builder phoneNumber(@Nullable String phoneNumber) {
            $.phoneNumber = phoneNumber;
            return this;
        }

        public UserInfoResponse build() {
            return $;
        }
    }

}
