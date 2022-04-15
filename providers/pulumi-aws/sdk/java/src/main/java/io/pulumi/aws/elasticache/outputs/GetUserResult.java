// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticache.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetUserResult {
    /**
     * A string for what access a user possesses within the associated ElastiCache replication groups or clusters.
     * 
     */
    private final @Nullable String accessString;
    private final @Nullable String engine;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable Boolean noPasswordRequired;
    private final @Nullable List<String> passwords;
    /**
     * The identifier for the user.
     * 
     */
    private final String userId;
    /**
     * The user name of the user.
     * 
     */
    private final @Nullable String userName;

    @CustomType.Constructor
    private GetUserResult(
        @CustomType.Parameter("accessString") @Nullable String accessString,
        @CustomType.Parameter("engine") @Nullable String engine,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("noPasswordRequired") @Nullable Boolean noPasswordRequired,
        @CustomType.Parameter("passwords") @Nullable List<String> passwords,
        @CustomType.Parameter("userId") String userId,
        @CustomType.Parameter("userName") @Nullable String userName) {
        this.accessString = accessString;
        this.engine = engine;
        this.id = id;
        this.noPasswordRequired = noPasswordRequired;
        this.passwords = passwords;
        this.userId = userId;
        this.userName = userName;
    }

    /**
     * A string for what access a user possesses within the associated ElastiCache replication groups or clusters.
     * 
    */
    public Optional<String> accessString() {
        return Optional.ofNullable(this.accessString);
    }
    public Optional<String> engine() {
        return Optional.ofNullable(this.engine);
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    public Optional<Boolean> noPasswordRequired() {
        return Optional.ofNullable(this.noPasswordRequired);
    }
    public List<String> passwords() {
        return this.passwords == null ? List.of() : this.passwords;
    }
    /**
     * The identifier for the user.
     * 
    */
    public String userId() {
        return this.userId;
    }
    /**
     * The user name of the user.
     * 
    */
    public Optional<String> userName() {
        return Optional.ofNullable(this.userName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessString;
        private @Nullable String engine;
        private String id;
        private @Nullable Boolean noPasswordRequired;
        private @Nullable List<String> passwords;
        private String userId;
        private @Nullable String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessString = defaults.accessString;
    	      this.engine = defaults.engine;
    	      this.id = defaults.id;
    	      this.noPasswordRequired = defaults.noPasswordRequired;
    	      this.passwords = defaults.passwords;
    	      this.userId = defaults.userId;
    	      this.userName = defaults.userName;
        }

        public Builder accessString(@Nullable String accessString) {
            this.accessString = accessString;
            return this;
        }
        public Builder engine(@Nullable String engine) {
            this.engine = engine;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder noPasswordRequired(@Nullable Boolean noPasswordRequired) {
            this.noPasswordRequired = noPasswordRequired;
            return this;
        }
        public Builder passwords(@Nullable List<String> passwords) {
            this.passwords = passwords;
            return this;
        }
        public Builder passwords(String... passwords) {
            return passwords(List.of(passwords));
        }
        public Builder userId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }
        public Builder userName(@Nullable String userName) {
            this.userName = userName;
            return this;
        }        public GetUserResult build() {
            return new GetUserResult(accessString, engine, id, noPasswordRequired, passwords, userId, userName);
        }
    }
}
