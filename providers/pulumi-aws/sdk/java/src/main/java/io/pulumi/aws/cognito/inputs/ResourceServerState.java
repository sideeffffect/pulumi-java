// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.aws.cognito.inputs.ResourceServerScopeGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceServerState extends io.pulumi.resources.ResourceArgs {

    public static final ResourceServerState Empty = new ResourceServerState();

    /**
     * An identifier for the resource server.
     * 
     */
    @Import(name="identifier")
      private final @Nullable Output<String> identifier;

    public Output<String> identifier() {
        return this.identifier == null ? Codegen.empty() : this.identifier;
    }

    /**
     * A name for the resource server.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A list of all scopes configured for this resource server in the format identifier/scope_name.
     * 
     */
    @Import(name="scopeIdentifiers")
      private final @Nullable Output<List<String>> scopeIdentifiers;

    public Output<List<String>> scopeIdentifiers() {
        return this.scopeIdentifiers == null ? Codegen.empty() : this.scopeIdentifiers;
    }

    /**
     * A list of Authorization Scope.
     * 
     */
    @Import(name="scopes")
      private final @Nullable Output<List<ResourceServerScopeGetArgs>> scopes;

    public Output<List<ResourceServerScopeGetArgs>> scopes() {
        return this.scopes == null ? Codegen.empty() : this.scopes;
    }

    @Import(name="userPoolId")
      private final @Nullable Output<String> userPoolId;

    public Output<String> userPoolId() {
        return this.userPoolId == null ? Codegen.empty() : this.userPoolId;
    }

    public ResourceServerState(
        @Nullable Output<String> identifier,
        @Nullable Output<String> name,
        @Nullable Output<List<String>> scopeIdentifiers,
        @Nullable Output<List<ResourceServerScopeGetArgs>> scopes,
        @Nullable Output<String> userPoolId) {
        this.identifier = identifier;
        this.name = name;
        this.scopeIdentifiers = scopeIdentifiers;
        this.scopes = scopes;
        this.userPoolId = userPoolId;
    }

    private ResourceServerState() {
        this.identifier = Codegen.empty();
        this.name = Codegen.empty();
        this.scopeIdentifiers = Codegen.empty();
        this.scopes = Codegen.empty();
        this.userPoolId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceServerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> identifier;
        private @Nullable Output<String> name;
        private @Nullable Output<List<String>> scopeIdentifiers;
        private @Nullable Output<List<ResourceServerScopeGetArgs>> scopes;
        private @Nullable Output<String> userPoolId;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceServerState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identifier = defaults.identifier;
    	      this.name = defaults.name;
    	      this.scopeIdentifiers = defaults.scopeIdentifiers;
    	      this.scopes = defaults.scopes;
    	      this.userPoolId = defaults.userPoolId;
        }

        public Builder identifier(@Nullable Output<String> identifier) {
            this.identifier = identifier;
            return this;
        }
        public Builder identifier(@Nullable String identifier) {
            this.identifier = Codegen.ofNullable(identifier);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder scopeIdentifiers(@Nullable Output<List<String>> scopeIdentifiers) {
            this.scopeIdentifiers = scopeIdentifiers;
            return this;
        }
        public Builder scopeIdentifiers(@Nullable List<String> scopeIdentifiers) {
            this.scopeIdentifiers = Codegen.ofNullable(scopeIdentifiers);
            return this;
        }
        public Builder scopeIdentifiers(String... scopeIdentifiers) {
            return scopeIdentifiers(List.of(scopeIdentifiers));
        }
        public Builder scopes(@Nullable Output<List<ResourceServerScopeGetArgs>> scopes) {
            this.scopes = scopes;
            return this;
        }
        public Builder scopes(@Nullable List<ResourceServerScopeGetArgs> scopes) {
            this.scopes = Codegen.ofNullable(scopes);
            return this;
        }
        public Builder scopes(ResourceServerScopeGetArgs... scopes) {
            return scopes(List.of(scopes));
        }
        public Builder userPoolId(@Nullable Output<String> userPoolId) {
            this.userPoolId = userPoolId;
            return this;
        }
        public Builder userPoolId(@Nullable String userPoolId) {
            this.userPoolId = Codegen.ofNullable(userPoolId);
            return this;
        }        public ResourceServerState build() {
            return new ResourceServerState(identifier, name, scopeIdentifiers, scopes, userPoolId);
        }
    }
}
