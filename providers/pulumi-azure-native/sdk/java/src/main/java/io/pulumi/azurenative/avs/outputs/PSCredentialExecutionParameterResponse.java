// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PSCredentialExecutionParameterResponse {
    /**
     * The parameter name
     * 
     */
    private final String name;
    /**
     * password for login
     * 
     */
    private final @Nullable String password;
    /**
     * The type of execution parameter
     * Expected value is 'Credential'.
     * 
     */
    private final String type;
    /**
     * username for login
     * 
     */
    private final @Nullable String username;

    @OutputCustomType.Constructor({"name","password","type","username"})
    private PSCredentialExecutionParameterResponse(
        String name,
        @Nullable String password,
        String type,
        @Nullable String username) {
        this.name = name;
        this.password = password;
        this.type = type;
        this.username = username;
    }

    /**
     * The parameter name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * password for login
     * 
    */
    public Optional<String> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * The type of execution parameter
     * Expected value is 'Credential'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * username for login
     * 
    */
    public Optional<String> getUsername() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PSCredentialExecutionParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable String password;
        private String type;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(PSCredentialExecutionParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.password = defaults.password;
    	      this.type = defaults.type;
    	      this.username = defaults.username;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = username;
            return this;
        }
        public PSCredentialExecutionParameterResponse build() {
            return new PSCredentialExecutionParameterResponse(name, password, type, username);
        }
    }
}
