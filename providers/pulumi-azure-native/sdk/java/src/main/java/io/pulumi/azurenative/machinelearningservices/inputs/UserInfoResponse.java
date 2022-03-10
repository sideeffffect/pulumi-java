// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * User who created.
 * 
 */
public final class UserInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final UserInfoResponse Empty = new UserInfoResponse();

    /**
     * A user alternate sec id. This represents the user in a different identity provider system Eg.1:live.com:puid
     * 
     */
    @InputImport(name="userAltSecId")
      private final @Nullable String userAltSecId;

    public Optional<String> getUserAltSecId() {
        return this.userAltSecId == null ? Optional.empty() : Optional.ofNullable(this.userAltSecId);
    }

    /**
     * A user identity provider. Eg live.com
     * 
     */
    @InputImport(name="userIdp")
      private final @Nullable String userIdp;

    public Optional<String> getUserIdp() {
        return this.userIdp == null ? Optional.empty() : Optional.ofNullable(this.userIdp);
    }

    /**
     * The issuer which issued the token for this user.
     * 
     */
    @InputImport(name="userIss")
      private final @Nullable String userIss;

    public Optional<String> getUserIss() {
        return this.userIss == null ? Optional.empty() : Optional.ofNullable(this.userIss);
    }

    /**
     *  A user's full name or a service principal's app ID.
     * 
     */
    @InputImport(name="userName")
      private final @Nullable String userName;

    public Optional<String> getUserName() {
        return this.userName == null ? Optional.empty() : Optional.ofNullable(this.userName);
    }

    /**
     * A user or service principal's object ID..
     * 
     */
    @InputImport(name="userObjectId")
      private final @Nullable String userObjectId;

    public Optional<String> getUserObjectId() {
        return this.userObjectId == null ? Optional.empty() : Optional.ofNullable(this.userObjectId);
    }

    /**
     * A user or service principal's PuID.
     * 
     */
    @InputImport(name="userPuId")
      private final @Nullable String userPuId;

    public Optional<String> getUserPuId() {
        return this.userPuId == null ? Optional.empty() : Optional.ofNullable(this.userPuId);
    }

    /**
     * A user or service principal's tenant ID.
     * 
     */
    @InputImport(name="userTenantId")
      private final @Nullable String userTenantId;

    public Optional<String> getUserTenantId() {
        return this.userTenantId == null ? Optional.empty() : Optional.ofNullable(this.userTenantId);
    }

    public UserInfoResponse(
        @Nullable String userAltSecId,
        @Nullable String userIdp,
        @Nullable String userIss,
        @Nullable String userName,
        @Nullable String userObjectId,
        @Nullable String userPuId,
        @Nullable String userTenantId) {
        this.userAltSecId = userAltSecId;
        this.userIdp = userIdp;
        this.userIss = userIss;
        this.userName = userName;
        this.userObjectId = userObjectId;
        this.userPuId = userPuId;
        this.userTenantId = userTenantId;
    }

    private UserInfoResponse() {
        this.userAltSecId = null;
        this.userIdp = null;
        this.userIss = null;
        this.userName = null;
        this.userObjectId = null;
        this.userPuId = null;
        this.userTenantId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String userAltSecId;
        private @Nullable String userIdp;
        private @Nullable String userIss;
        private @Nullable String userName;
        private @Nullable String userObjectId;
        private @Nullable String userPuId;
        private @Nullable String userTenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.userAltSecId = defaults.userAltSecId;
    	      this.userIdp = defaults.userIdp;
    	      this.userIss = defaults.userIss;
    	      this.userName = defaults.userName;
    	      this.userObjectId = defaults.userObjectId;
    	      this.userPuId = defaults.userPuId;
    	      this.userTenantId = defaults.userTenantId;
        }

        public Builder userAltSecId(@Nullable String userAltSecId) {
            this.userAltSecId = userAltSecId;
            return this;
        }

        public Builder userIdp(@Nullable String userIdp) {
            this.userIdp = userIdp;
            return this;
        }

        public Builder userIss(@Nullable String userIss) {
            this.userIss = userIss;
            return this;
        }

        public Builder userName(@Nullable String userName) {
            this.userName = userName;
            return this;
        }

        public Builder userObjectId(@Nullable String userObjectId) {
            this.userObjectId = userObjectId;
            return this;
        }

        public Builder userPuId(@Nullable String userPuId) {
            this.userPuId = userPuId;
            return this;
        }

        public Builder userTenantId(@Nullable String userTenantId) {
            this.userTenantId = userTenantId;
            return this;
        }
        public UserInfoResponse build() {
            return new UserInfoResponse(userAltSecId, userIdp, userIss, userName, userObjectId, userPuId, userTenantId);
        }
    }
}
