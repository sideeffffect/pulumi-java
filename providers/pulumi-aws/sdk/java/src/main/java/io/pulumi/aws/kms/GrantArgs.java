// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kms;

import io.pulumi.aws.kms.inputs.GrantConstraintArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GrantArgs extends io.pulumi.resources.ResourceArgs {

    public static final GrantArgs Empty = new GrantArgs();

    /**
     * A structure that you can use to allow certain operations in the grant only when the desired encryption context is present. For more information about encryption context, see [Encryption Context](http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html).
     * 
     */
    @InputImport(name="constraints")
      private final @Nullable Input<List<GrantConstraintArgs>> constraints;

    public Input<List<GrantConstraintArgs>> getConstraints() {
        return this.constraints == null ? Input.empty() : this.constraints;
    }

    /**
     * A list of grant tokens to be used when creating the grant. See [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token) for more information about grant tokens.
     * 
     */
    @InputImport(name="grantCreationTokens")
      private final @Nullable Input<List<String>> grantCreationTokens;

    public Input<List<String>> getGrantCreationTokens() {
        return this.grantCreationTokens == null ? Input.empty() : this.grantCreationTokens;
    }

    /**
     * The principal that is given permission to perform the operations that the grant permits in ARN format. Note that due to eventual consistency issues around IAM principals, the providers's state may not always be refreshed to reflect what is true in AWS.
     * 
     */
    @InputImport(name="granteePrincipal", required=true)
      private final Input<String> granteePrincipal;

    public Input<String> getGranteePrincipal() {
        return this.granteePrincipal;
    }

    /**
     * The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN.
     * 
     */
    @InputImport(name="keyId", required=true)
      private final Input<String> keyId;

    public Input<String> getKeyId() {
        return this.keyId;
    }

    /**
     * A friendly name for identifying the grant.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A list of operations that the grant permits. The permitted values are: `Decrypt`, `Encrypt`, `GenerateDataKey`, `GenerateDataKeyWithoutPlaintext`, `ReEncryptFrom`, `ReEncryptTo`, `Sign`, `Verify`, `GetPublicKey`, `CreateGrant`, `RetireGrant`, `DescribeKey`, `GenerateDataKeyPair`, or `GenerateDataKeyPairWithoutPlaintext`.
     * 
     */
    @InputImport(name="operations", required=true)
      private final Input<List<String>> operations;

    public Input<List<String>> getOperations() {
        return this.operations;
    }

    /**
     * -(Defaults to false, Forces new resources) If set to false (the default) the grants will be revoked upon deletion, and if set to true the grants will try to be retired upon deletion. Note that retiring grants requires special permissions, hence why we default to revoking grants.
     * See [RetireGrant](https://docs.aws.amazon.com/kms/latest/APIReference/API_RetireGrant.html) for more information.
     * 
     */
    @InputImport(name="retireOnDelete")
      private final @Nullable Input<Boolean> retireOnDelete;

    public Input<Boolean> getRetireOnDelete() {
        return this.retireOnDelete == null ? Input.empty() : this.retireOnDelete;
    }

    /**
     * The principal that is given permission to retire the grant by using RetireGrant operation in ARN format. Note that due to eventual consistency issues around IAM principals, the providers's state may not always be refreshed to reflect what is true in AWS.
     * 
     */
    @InputImport(name="retiringPrincipal")
      private final @Nullable Input<String> retiringPrincipal;

    public Input<String> getRetiringPrincipal() {
        return this.retiringPrincipal == null ? Input.empty() : this.retiringPrincipal;
    }

    public GrantArgs(
        @Nullable Input<List<GrantConstraintArgs>> constraints,
        @Nullable Input<List<String>> grantCreationTokens,
        Input<String> granteePrincipal,
        Input<String> keyId,
        @Nullable Input<String> name,
        Input<List<String>> operations,
        @Nullable Input<Boolean> retireOnDelete,
        @Nullable Input<String> retiringPrincipal) {
        this.constraints = constraints;
        this.grantCreationTokens = grantCreationTokens;
        this.granteePrincipal = Objects.requireNonNull(granteePrincipal, "expected parameter 'granteePrincipal' to be non-null");
        this.keyId = Objects.requireNonNull(keyId, "expected parameter 'keyId' to be non-null");
        this.name = name;
        this.operations = Objects.requireNonNull(operations, "expected parameter 'operations' to be non-null");
        this.retireOnDelete = retireOnDelete;
        this.retiringPrincipal = retiringPrincipal;
    }

    private GrantArgs() {
        this.constraints = Input.empty();
        this.grantCreationTokens = Input.empty();
        this.granteePrincipal = Input.empty();
        this.keyId = Input.empty();
        this.name = Input.empty();
        this.operations = Input.empty();
        this.retireOnDelete = Input.empty();
        this.retiringPrincipal = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<GrantConstraintArgs>> constraints;
        private @Nullable Input<List<String>> grantCreationTokens;
        private Input<String> granteePrincipal;
        private Input<String> keyId;
        private @Nullable Input<String> name;
        private Input<List<String>> operations;
        private @Nullable Input<Boolean> retireOnDelete;
        private @Nullable Input<String> retiringPrincipal;

        public Builder() {
    	      // Empty
        }

        public Builder(GrantArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.constraints = defaults.constraints;
    	      this.grantCreationTokens = defaults.grantCreationTokens;
    	      this.granteePrincipal = defaults.granteePrincipal;
    	      this.keyId = defaults.keyId;
    	      this.name = defaults.name;
    	      this.operations = defaults.operations;
    	      this.retireOnDelete = defaults.retireOnDelete;
    	      this.retiringPrincipal = defaults.retiringPrincipal;
        }

        public Builder constraints(@Nullable Input<List<GrantConstraintArgs>> constraints) {
            this.constraints = constraints;
            return this;
        }

        public Builder constraints(@Nullable List<GrantConstraintArgs> constraints) {
            this.constraints = Input.ofNullable(constraints);
            return this;
        }

        public Builder grantCreationTokens(@Nullable Input<List<String>> grantCreationTokens) {
            this.grantCreationTokens = grantCreationTokens;
            return this;
        }

        public Builder grantCreationTokens(@Nullable List<String> grantCreationTokens) {
            this.grantCreationTokens = Input.ofNullable(grantCreationTokens);
            return this;
        }

        public Builder granteePrincipal(Input<String> granteePrincipal) {
            this.granteePrincipal = Objects.requireNonNull(granteePrincipal);
            return this;
        }

        public Builder granteePrincipal(String granteePrincipal) {
            this.granteePrincipal = Input.of(Objects.requireNonNull(granteePrincipal));
            return this;
        }

        public Builder keyId(Input<String> keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }

        public Builder keyId(String keyId) {
            this.keyId = Input.of(Objects.requireNonNull(keyId));
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder operations(Input<List<String>> operations) {
            this.operations = Objects.requireNonNull(operations);
            return this;
        }

        public Builder operations(List<String> operations) {
            this.operations = Input.of(Objects.requireNonNull(operations));
            return this;
        }

        public Builder retireOnDelete(@Nullable Input<Boolean> retireOnDelete) {
            this.retireOnDelete = retireOnDelete;
            return this;
        }

        public Builder retireOnDelete(@Nullable Boolean retireOnDelete) {
            this.retireOnDelete = Input.ofNullable(retireOnDelete);
            return this;
        }

        public Builder retiringPrincipal(@Nullable Input<String> retiringPrincipal) {
            this.retiringPrincipal = retiringPrincipal;
            return this;
        }

        public Builder retiringPrincipal(@Nullable String retiringPrincipal) {
            this.retiringPrincipal = Input.ofNullable(retiringPrincipal);
            return this;
        }
        public GrantArgs build() {
            return new GrantArgs(constraints, grantCreationTokens, granteePrincipal, keyId, name, operations, retireOnDelete, retiringPrincipal);
        }
    }
}
