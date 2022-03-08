// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetAccountAliasResult {
    /**
     * The alias associated with the AWS account.
     * 
     */
    private final String accountAlias;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;

    @OutputCustomType.Constructor({"accountAlias","id"})
    private GetAccountAliasResult(
        String accountAlias,
        String id) {
        this.accountAlias = accountAlias;
        this.id = id;
    }

    /**
     * The alias associated with the AWS account.
     * 
    */
    public String getAccountAlias() {
        return this.accountAlias;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountAliasResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountAlias;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountAliasResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountAlias = defaults.accountAlias;
    	      this.id = defaults.id;
        }

        public Builder setAccountAlias(String accountAlias) {
            this.accountAlias = Objects.requireNonNull(accountAlias);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetAccountAliasResult build() {
            return new GetAccountAliasResult(accountAlias, id);
        }
    }
}
