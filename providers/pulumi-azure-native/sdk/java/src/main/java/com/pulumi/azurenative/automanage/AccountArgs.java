// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automanage;

import com.pulumi.azurenative.automanage.inputs.AccountIdentityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountArgs Empty = new AccountArgs();

    /**
     * Name of the Automanage account.
     * 
     */
    @Import(name="accountName")
      private final @Nullable Output<String> accountName;

    public Output<String> accountName() {
        return this.accountName == null ? Codegen.empty() : this.accountName;
    }

    /**
     * The identity of the Automanage account.
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<AccountIdentityArgs> identity;

    public Output<AccountIdentityArgs> identity() {
        return this.identity == null ? Codegen.empty() : this.identity;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public AccountArgs(
        @Nullable Output<String> accountName,
        @Nullable Output<AccountIdentityArgs> identity,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags) {
        this.accountName = accountName;
        this.identity = identity;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private AccountArgs() {
        this.accountName = Codegen.empty();
        this.identity = Codegen.empty();
        this.location = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountName;
        private @Nullable Output<AccountIdentityArgs> identity;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder accountName(@Nullable Output<String> accountName) {
            this.accountName = accountName;
            return this;
        }
        public Builder accountName(@Nullable String accountName) {
            this.accountName = Codegen.ofNullable(accountName);
            return this;
        }
        public Builder identity(@Nullable Output<AccountIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable AccountIdentityArgs identity) {
            this.identity = Codegen.ofNullable(identity);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public AccountArgs build() {
            return new AccountArgs(accountName, identity, location, resourceGroupName, tags);
        }
    }
}
