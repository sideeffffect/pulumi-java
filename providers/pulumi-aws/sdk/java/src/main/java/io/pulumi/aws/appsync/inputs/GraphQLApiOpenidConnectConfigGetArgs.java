// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GraphQLApiOpenidConnectConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GraphQLApiOpenidConnectConfigGetArgs Empty = new GraphQLApiOpenidConnectConfigGetArgs();

    /**
     * Number of milliseconds a token is valid after being authenticated.
     * 
     */
    @Import(name="authTtl")
      private final @Nullable Output<Integer> authTtl;

    public Output<Integer> authTtl() {
        return this.authTtl == null ? Codegen.empty() : this.authTtl;
    }

    /**
     * Client identifier of the Relying party at the OpenID identity provider. This identifier is typically obtained when the Relying party is registered with the OpenID identity provider. You can specify a regular expression so the AWS AppSync can validate against multiple client identifiers at a time.
     * 
     */
    @Import(name="clientId")
      private final @Nullable Output<String> clientId;

    public Output<String> clientId() {
        return this.clientId == null ? Codegen.empty() : this.clientId;
    }

    /**
     * Number of milliseconds a token is valid after being issued to a user.
     * 
     */
    @Import(name="iatTtl")
      private final @Nullable Output<Integer> iatTtl;

    public Output<Integer> iatTtl() {
        return this.iatTtl == null ? Codegen.empty() : this.iatTtl;
    }

    /**
     * Issuer for the OpenID Connect configuration. The issuer returned by discovery MUST exactly match the value of iss in the ID Token.
     * 
     */
    @Import(name="issuer", required=true)
      private final Output<String> issuer;

    public Output<String> issuer() {
        return this.issuer;
    }

    public GraphQLApiOpenidConnectConfigGetArgs(
        @Nullable Output<Integer> authTtl,
        @Nullable Output<String> clientId,
        @Nullable Output<Integer> iatTtl,
        Output<String> issuer) {
        this.authTtl = authTtl;
        this.clientId = clientId;
        this.iatTtl = iatTtl;
        this.issuer = Objects.requireNonNull(issuer, "expected parameter 'issuer' to be non-null");
    }

    private GraphQLApiOpenidConnectConfigGetArgs() {
        this.authTtl = Codegen.empty();
        this.clientId = Codegen.empty();
        this.iatTtl = Codegen.empty();
        this.issuer = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GraphQLApiOpenidConnectConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> authTtl;
        private @Nullable Output<String> clientId;
        private @Nullable Output<Integer> iatTtl;
        private Output<String> issuer;

        public Builder() {
    	      // Empty
        }

        public Builder(GraphQLApiOpenidConnectConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authTtl = defaults.authTtl;
    	      this.clientId = defaults.clientId;
    	      this.iatTtl = defaults.iatTtl;
    	      this.issuer = defaults.issuer;
        }

        public Builder authTtl(@Nullable Output<Integer> authTtl) {
            this.authTtl = authTtl;
            return this;
        }
        public Builder authTtl(@Nullable Integer authTtl) {
            this.authTtl = Codegen.ofNullable(authTtl);
            return this;
        }
        public Builder clientId(@Nullable Output<String> clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder clientId(@Nullable String clientId) {
            this.clientId = Codegen.ofNullable(clientId);
            return this;
        }
        public Builder iatTtl(@Nullable Output<Integer> iatTtl) {
            this.iatTtl = iatTtl;
            return this;
        }
        public Builder iatTtl(@Nullable Integer iatTtl) {
            this.iatTtl = Codegen.ofNullable(iatTtl);
            return this;
        }
        public Builder issuer(Output<String> issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }
        public Builder issuer(String issuer) {
            this.issuer = Output.of(Objects.requireNonNull(issuer));
            return this;
        }        public GraphQLApiOpenidConnectConfigGetArgs build() {
            return new GraphQLApiOpenidConnectConfigGetArgs(authTtl, clientId, iatTtl, issuer);
        }
    }
}
