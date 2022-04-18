// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.outputs;

import com.pulumi.azurenative.batch.outputs.AutoUserSpecificationResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserIdentityResponse {
    /**
     * The userName and autoUser properties are mutually exclusive; you must specify one but not both.
     * 
     */
    private final @Nullable AutoUserSpecificationResponse autoUser;
    /**
     * The userName and autoUser properties are mutually exclusive; you must specify one but not both.
     * 
     */
    private final @Nullable String userName;

    @CustomType.Constructor
    private UserIdentityResponse(
        @CustomType.Parameter("autoUser") @Nullable AutoUserSpecificationResponse autoUser,
        @CustomType.Parameter("userName") @Nullable String userName) {
        this.autoUser = autoUser;
        this.userName = userName;
    }

    /**
     * The userName and autoUser properties are mutually exclusive; you must specify one but not both.
     * 
    */
    public Optional<AutoUserSpecificationResponse> autoUser() {
        return Optional.ofNullable(this.autoUser);
    }
    /**
     * The userName and autoUser properties are mutually exclusive; you must specify one but not both.
     * 
    */
    public Optional<String> userName() {
        return Optional.ofNullable(this.userName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AutoUserSpecificationResponse autoUser;
        private @Nullable String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(UserIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUser = defaults.autoUser;
    	      this.userName = defaults.userName;
        }

        public Builder autoUser(@Nullable AutoUserSpecificationResponse autoUser) {
            this.autoUser = autoUser;
            return this;
        }
        public Builder userName(@Nullable String userName) {
            this.userName = userName;
            return this;
        }        public UserIdentityResponse build() {
            return new UserIdentityResponse(autoUser, userName);
        }
    }
}
