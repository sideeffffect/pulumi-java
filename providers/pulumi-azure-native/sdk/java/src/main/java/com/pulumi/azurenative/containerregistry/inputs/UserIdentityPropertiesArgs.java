// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserIdentityPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserIdentityPropertiesArgs Empty = new UserIdentityPropertiesArgs();

    /**
     * The client id of user assigned identity.
     * 
     */
    @Import(name="clientId")
      private final @Nullable Output<String> clientId;

    public Output<String> clientId() {
        return this.clientId == null ? Codegen.empty() : this.clientId;
    }

    /**
     * The principal id of user assigned identity.
     * 
     */
    @Import(name="principalId")
      private final @Nullable Output<String> principalId;

    public Output<String> principalId() {
        return this.principalId == null ? Codegen.empty() : this.principalId;
    }

    public UserIdentityPropertiesArgs(
        @Nullable Output<String> clientId,
        @Nullable Output<String> principalId) {
        this.clientId = clientId;
        this.principalId = principalId;
    }

    private UserIdentityPropertiesArgs() {
        this.clientId = Codegen.empty();
        this.principalId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserIdentityPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clientId;
        private @Nullable Output<String> principalId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserIdentityPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.principalId = defaults.principalId;
        }

        public Builder clientId(@Nullable Output<String> clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder clientId(@Nullable String clientId) {
            this.clientId = Codegen.ofNullable(clientId);
            return this;
        }
        public Builder principalId(@Nullable Output<String> principalId) {
            this.principalId = principalId;
            return this;
        }
        public Builder principalId(@Nullable String principalId) {
            this.principalId = Codegen.ofNullable(principalId);
            return this;
        }        public UserIdentityPropertiesArgs build() {
            return new UserIdentityPropertiesArgs(clientId, principalId);
        }
    }
}
