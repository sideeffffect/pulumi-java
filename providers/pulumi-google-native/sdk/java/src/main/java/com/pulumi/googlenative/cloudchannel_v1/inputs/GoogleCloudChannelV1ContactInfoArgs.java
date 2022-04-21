// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudchannel_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contact information for a customer account.
 * 
 */
public final class GoogleCloudChannelV1ContactInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudChannelV1ContactInfoArgs Empty = new GoogleCloudChannelV1ContactInfoArgs();

    /**
     * The customer account&#39;s contact email. Required for entitlements that create admin.google.com accounts, and serves as the customer&#39;s username for those accounts. Use this email to invite Team customers.
     * 
     */
    @Import(name="email")
    private @Nullable Output<String> email;

    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
    }

    /**
     * The customer account contact&#39;s first name. Optional for Team customers.
     * 
     */
    @Import(name="firstName")
    private @Nullable Output<String> firstName;

    public Optional<Output<String>> firstName() {
        return Optional.ofNullable(this.firstName);
    }

    /**
     * The customer account contact&#39;s last name. Optional for Team customers.
     * 
     */
    @Import(name="lastName")
    private @Nullable Output<String> lastName;

    public Optional<Output<String>> lastName() {
        return Optional.ofNullable(this.lastName);
    }

    /**
     * The customer account&#39;s contact phone number.
     * 
     */
    @Import(name="phone")
    private @Nullable Output<String> phone;

    public Optional<Output<String>> phone() {
        return Optional.ofNullable(this.phone);
    }

    /**
     * Optional. The customer account contact&#39;s job title.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    private GoogleCloudChannelV1ContactInfoArgs() {}

    private GoogleCloudChannelV1ContactInfoArgs(GoogleCloudChannelV1ContactInfoArgs $) {
        this.email = $.email;
        this.firstName = $.firstName;
        this.lastName = $.lastName;
        this.phone = $.phone;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudChannelV1ContactInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudChannelV1ContactInfoArgs $;

        public Builder() {
            $ = new GoogleCloudChannelV1ContactInfoArgs();
        }

        public Builder(GoogleCloudChannelV1ContactInfoArgs defaults) {
            $ = new GoogleCloudChannelV1ContactInfoArgs(Objects.requireNonNull(defaults));
        }

        public Builder email(@Nullable Output<String> email) {
            $.email = email;
            return this;
        }

        public Builder email(String email) {
            return email(Output.of(email));
        }

        public Builder firstName(@Nullable Output<String> firstName) {
            $.firstName = firstName;
            return this;
        }

        public Builder firstName(String firstName) {
            return firstName(Output.of(firstName));
        }

        public Builder lastName(@Nullable Output<String> lastName) {
            $.lastName = lastName;
            return this;
        }

        public Builder lastName(String lastName) {
            return lastName(Output.of(lastName));
        }

        public Builder phone(@Nullable Output<String> phone) {
            $.phone = phone;
            return this;
        }

        public Builder phone(String phone) {
            return phone(Output.of(phone));
        }

        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        public Builder title(String title) {
            return title(Output.of(title));
        }

        public GoogleCloudChannelV1ContactInfoArgs build() {
            return $;
        }
    }

}
