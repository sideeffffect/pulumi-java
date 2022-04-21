// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.signer;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProfilePermissionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProfilePermissionArgs Empty = new ProfilePermissionArgs();

    @Import(name="action", required=true)
    private Output<String> action;

    public Output<String> action() {
        return this.action;
    }

    @Import(name="principal", required=true)
    private Output<String> principal;

    public Output<String> principal() {
        return this.principal;
    }

    @Import(name="profileName", required=true)
    private Output<String> profileName;

    public Output<String> profileName() {
        return this.profileName;
    }

    @Import(name="profileVersion")
    private @Nullable Output<String> profileVersion;

    public Optional<Output<String>> profileVersion() {
        return Optional.ofNullable(this.profileVersion);
    }

    @Import(name="statementId", required=true)
    private Output<String> statementId;

    public Output<String> statementId() {
        return this.statementId;
    }

    private ProfilePermissionArgs() {}

    private ProfilePermissionArgs(ProfilePermissionArgs $) {
        this.action = $.action;
        this.principal = $.principal;
        this.profileName = $.profileName;
        this.profileVersion = $.profileVersion;
        this.statementId = $.statementId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProfilePermissionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProfilePermissionArgs $;

        public Builder() {
            $ = new ProfilePermissionArgs();
        }

        public Builder(ProfilePermissionArgs defaults) {
            $ = new ProfilePermissionArgs(Objects.requireNonNull(defaults));
        }

        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        public Builder action(String action) {
            return action(Output.of(action));
        }

        public Builder principal(Output<String> principal) {
            $.principal = principal;
            return this;
        }

        public Builder principal(String principal) {
            return principal(Output.of(principal));
        }

        public Builder profileName(Output<String> profileName) {
            $.profileName = profileName;
            return this;
        }

        public Builder profileName(String profileName) {
            return profileName(Output.of(profileName));
        }

        public Builder profileVersion(@Nullable Output<String> profileVersion) {
            $.profileVersion = profileVersion;
            return this;
        }

        public Builder profileVersion(String profileVersion) {
            return profileVersion(Output.of(profileVersion));
        }

        public Builder statementId(Output<String> statementId) {
            $.statementId = statementId;
            return this;
        }

        public Builder statementId(String statementId) {
            return statementId(Output.of(statementId));
        }

        public ProfilePermissionArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.principal = Objects.requireNonNull($.principal, "expected parameter 'principal' to be non-null");
            $.profileName = Objects.requireNonNull($.profileName, "expected parameter 'profileName' to be non-null");
            $.statementId = Objects.requireNonNull($.statementId, "expected parameter 'statementId' to be non-null");
            return $;
        }
    }

}
