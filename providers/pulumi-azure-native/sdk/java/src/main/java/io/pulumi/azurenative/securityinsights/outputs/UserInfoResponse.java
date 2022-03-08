// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class UserInfoResponse {
    /**
     * The email of the user.
     * 
     */
    private final String email;
    /**
     * The name of the user.
     * 
     */
    private final String name;
    /**
     * The object id of the user.
     * 
     */
    private final @Nullable String objectId;

    @OutputCustomType.Constructor({"email","name","objectId"})
    private UserInfoResponse(
        String email,
        String name,
        @Nullable String objectId) {
        this.email = email;
        this.name = name;
        this.objectId = objectId;
    }

    /**
     * The email of the user.
     * 
    */
    public String getEmail() {
        return this.email;
    }
    /**
     * The name of the user.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The object id of the user.
     * 
    */
    public Optional<String> getObjectId() {
        return Optional.ofNullable(this.objectId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String email;
        private String name;
        private @Nullable String objectId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.name = defaults.name;
    	      this.objectId = defaults.objectId;
        }

        public Builder setEmail(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setObjectId(@Nullable String objectId) {
            this.objectId = objectId;
            return this;
        }
        public UserInfoResponse build() {
            return new UserInfoResponse(email, name, objectId);
        }
    }
}
