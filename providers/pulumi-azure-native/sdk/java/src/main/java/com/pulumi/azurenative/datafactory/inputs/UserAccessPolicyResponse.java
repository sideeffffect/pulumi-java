// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Get Data Plane read only token request definition.
 * 
 */
public final class UserAccessPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final UserAccessPolicyResponse Empty = new UserAccessPolicyResponse();

    /**
     * The resource path to get access relative to factory. Currently only empty string is supported which corresponds to the factory resource.
     * 
     */
    @Import(name="accessResourcePath")
      private final @Nullable String accessResourcePath;

    public Optional<String> accessResourcePath() {
        return this.accessResourcePath == null ? Optional.empty() : Optional.ofNullable(this.accessResourcePath);
    }

    /**
     * Expiration time for the token. Maximum duration for the token is eight hours and by default the token will expire in eight hours.
     * 
     */
    @Import(name="expireTime")
      private final @Nullable String expireTime;

    public Optional<String> expireTime() {
        return this.expireTime == null ? Optional.empty() : Optional.ofNullable(this.expireTime);
    }

    /**
     * The string with permissions for Data Plane access. Currently only 'r' is supported which grants read only access.
     * 
     */
    @Import(name="permissions")
      private final @Nullable String permissions;

    public Optional<String> permissions() {
        return this.permissions == null ? Optional.empty() : Optional.ofNullable(this.permissions);
    }

    /**
     * The name of the profile. Currently only the default is supported. The default value is DefaultProfile.
     * 
     */
    @Import(name="profileName")
      private final @Nullable String profileName;

    public Optional<String> profileName() {
        return this.profileName == null ? Optional.empty() : Optional.ofNullable(this.profileName);
    }

    /**
     * Start time for the token. If not specified the current time will be used.
     * 
     */
    @Import(name="startTime")
      private final @Nullable String startTime;

    public Optional<String> startTime() {
        return this.startTime == null ? Optional.empty() : Optional.ofNullable(this.startTime);
    }

    public UserAccessPolicyResponse(
        @Nullable String accessResourcePath,
        @Nullable String expireTime,
        @Nullable String permissions,
        @Nullable String profileName,
        @Nullable String startTime) {
        this.accessResourcePath = accessResourcePath;
        this.expireTime = expireTime;
        this.permissions = permissions;
        this.profileName = profileName;
        this.startTime = startTime;
    }

    private UserAccessPolicyResponse() {
        this.accessResourcePath = null;
        this.expireTime = null;
        this.permissions = null;
        this.profileName = null;
        this.startTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserAccessPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessResourcePath;
        private @Nullable String expireTime;
        private @Nullable String permissions;
        private @Nullable String profileName;
        private @Nullable String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(UserAccessPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessResourcePath = defaults.accessResourcePath;
    	      this.expireTime = defaults.expireTime;
    	      this.permissions = defaults.permissions;
    	      this.profileName = defaults.profileName;
    	      this.startTime = defaults.startTime;
        }

        public Builder accessResourcePath(@Nullable String accessResourcePath) {
            this.accessResourcePath = accessResourcePath;
            return this;
        }
        public Builder expireTime(@Nullable String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Builder permissions(@Nullable String permissions) {
            this.permissions = permissions;
            return this;
        }
        public Builder profileName(@Nullable String profileName) {
            this.profileName = profileName;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }        public UserAccessPolicyResponse build() {
            return new UserAccessPolicyResponse(accessResourcePath, expireTime, permissions, profileName, startTime);
        }
    }
}
