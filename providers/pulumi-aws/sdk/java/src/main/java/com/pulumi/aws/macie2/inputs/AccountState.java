// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.macie2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountState extends com.pulumi.resources.ResourceArgs {

    public static final AccountState Empty = new AccountState();

    /**
     * The date and time, in UTC and extended RFC 3339 format, when the Amazon Macie account was created.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * Specifies how often to publish updates to policy findings for the account. This includes publishing updates to AWS Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch Events). Valid values are `FIFTEEN_MINUTES`, `ONE_HOUR` or `SIX_HOURS`.
     * 
     */
    @Import(name="findingPublishingFrequency")
    private @Nullable Output<String> findingPublishingFrequency;

    public Optional<Output<String>> findingPublishingFrequency() {
        return Optional.ofNullable(this.findingPublishingFrequency);
    }

    /**
     * The Amazon Resource Name (ARN) of the service-linked role that allows Macie to monitor and analyze data in AWS resources for the account.
     * 
     */
    @Import(name="serviceRole")
    private @Nullable Output<String> serviceRole;

    public Optional<Output<String>> serviceRole() {
        return Optional.ofNullable(this.serviceRole);
    }

    /**
     * Specifies the status for the account. To enable Amazon Macie and start all Macie activities for the account, set this value to `ENABLED`. Valid values are `ENABLED` or `PAUSED`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The date and time, in UTC and extended RFC 3339 format, of the most recent change to the status of the Macie account.
     * 
     */
    @Import(name="updatedAt")
    private @Nullable Output<String> updatedAt;

    public Optional<Output<String>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    private AccountState() {}

    private AccountState(AccountState $) {
        this.createdAt = $.createdAt;
        this.findingPublishingFrequency = $.findingPublishingFrequency;
        this.serviceRole = $.serviceRole;
        this.status = $.status;
        this.updatedAt = $.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountState $;

        public Builder() {
            $ = new AccountState();
        }

        public Builder(AccountState defaults) {
            $ = new AccountState(Objects.requireNonNull(defaults));
        }

        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        public Builder findingPublishingFrequency(@Nullable Output<String> findingPublishingFrequency) {
            $.findingPublishingFrequency = findingPublishingFrequency;
            return this;
        }

        public Builder findingPublishingFrequency(String findingPublishingFrequency) {
            return findingPublishingFrequency(Output.of(findingPublishingFrequency));
        }

        public Builder serviceRole(@Nullable Output<String> serviceRole) {
            $.serviceRole = serviceRole;
            return this;
        }

        public Builder serviceRole(String serviceRole) {
            return serviceRole(Output.of(serviceRole));
        }

        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        public Builder status(String status) {
            return status(Output.of(status));
        }

        public Builder updatedAt(@Nullable Output<String> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        public Builder updatedAt(String updatedAt) {
            return updatedAt(Output.of(updatedAt));
        }

        public AccountState build() {
            return $;
        }
    }

}
