// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LayerVersionPermissionState extends io.pulumi.resources.ResourceArgs {

    public static final LayerVersionPermissionState Empty = new LayerVersionPermissionState();

    /**
     * Action, which will be allowed. `lambda:GetLayerVersion` value is suggested by AWS documantation.
     * 
     */
    @InputImport(name="action")
      private final @Nullable Input<String> action;

    public Input<String> getAction() {
        return this.action == null ? Input.empty() : this.action;
    }

    /**
     * The name or ARN of the Lambda Layer, which you want to grant access to.
     * 
     */
    @InputImport(name="layerName")
      private final @Nullable Input<String> layerName;

    public Input<String> getLayerName() {
        return this.layerName == null ? Input.empty() : this.layerName;
    }

    /**
     * An identifier of AWS Organization, which should be able to use your Lambda Layer. `principal` should be equal to `*` if `organization_id` provided.
     * 
     */
    @InputImport(name="organizationId")
      private final @Nullable Input<String> organizationId;

    public Input<String> getOrganizationId() {
        return this.organizationId == null ? Input.empty() : this.organizationId;
    }

    /**
     * Full Lambda Layer Permission policy.
     * 
     */
    @InputImport(name="policy")
      private final @Nullable Input<String> policy;

    public Input<String> getPolicy() {
        return this.policy == null ? Input.empty() : this.policy;
    }

    /**
     * AWS account ID which should be able to use your Lambda Layer. `*` can be used here, if you want to share your Lambda Layer widely.
     * 
     */
    @InputImport(name="principal")
      private final @Nullable Input<String> principal;

    public Input<String> getPrincipal() {
        return this.principal == null ? Input.empty() : this.principal;
    }

    /**
     * A unique identifier for the current revision of the policy.
     * 
     */
    @InputImport(name="revisionId")
      private final @Nullable Input<String> revisionId;

    public Input<String> getRevisionId() {
        return this.revisionId == null ? Input.empty() : this.revisionId;
    }

    /**
     * The name of Lambda Layer Permission, for example `dev-account` - human readable note about what is this permission for.
     * 
     */
    @InputImport(name="statementId")
      private final @Nullable Input<String> statementId;

    public Input<String> getStatementId() {
        return this.statementId == null ? Input.empty() : this.statementId;
    }

    /**
     * Version of Lambda Layer, which you want to grant access to. Note: permissions only apply to a single version of a layer.
     * 
     */
    @InputImport(name="versionNumber")
      private final @Nullable Input<Integer> versionNumber;

    public Input<Integer> getVersionNumber() {
        return this.versionNumber == null ? Input.empty() : this.versionNumber;
    }

    public LayerVersionPermissionState(
        @Nullable Input<String> action,
        @Nullable Input<String> layerName,
        @Nullable Input<String> organizationId,
        @Nullable Input<String> policy,
        @Nullable Input<String> principal,
        @Nullable Input<String> revisionId,
        @Nullable Input<String> statementId,
        @Nullable Input<Integer> versionNumber) {
        this.action = action;
        this.layerName = layerName;
        this.organizationId = organizationId;
        this.policy = policy;
        this.principal = principal;
        this.revisionId = revisionId;
        this.statementId = statementId;
        this.versionNumber = versionNumber;
    }

    private LayerVersionPermissionState() {
        this.action = Input.empty();
        this.layerName = Input.empty();
        this.organizationId = Input.empty();
        this.policy = Input.empty();
        this.principal = Input.empty();
        this.revisionId = Input.empty();
        this.statementId = Input.empty();
        this.versionNumber = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LayerVersionPermissionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> action;
        private @Nullable Input<String> layerName;
        private @Nullable Input<String> organizationId;
        private @Nullable Input<String> policy;
        private @Nullable Input<String> principal;
        private @Nullable Input<String> revisionId;
        private @Nullable Input<String> statementId;
        private @Nullable Input<Integer> versionNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(LayerVersionPermissionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.layerName = defaults.layerName;
    	      this.organizationId = defaults.organizationId;
    	      this.policy = defaults.policy;
    	      this.principal = defaults.principal;
    	      this.revisionId = defaults.revisionId;
    	      this.statementId = defaults.statementId;
    	      this.versionNumber = defaults.versionNumber;
        }

        public Builder action(@Nullable Input<String> action) {
            this.action = action;
            return this;
        }

        public Builder action(@Nullable String action) {
            this.action = Input.ofNullable(action);
            return this;
        }

        public Builder layerName(@Nullable Input<String> layerName) {
            this.layerName = layerName;
            return this;
        }

        public Builder layerName(@Nullable String layerName) {
            this.layerName = Input.ofNullable(layerName);
            return this;
        }

        public Builder organizationId(@Nullable Input<String> organizationId) {
            this.organizationId = organizationId;
            return this;
        }

        public Builder organizationId(@Nullable String organizationId) {
            this.organizationId = Input.ofNullable(organizationId);
            return this;
        }

        public Builder policy(@Nullable Input<String> policy) {
            this.policy = policy;
            return this;
        }

        public Builder policy(@Nullable String policy) {
            this.policy = Input.ofNullable(policy);
            return this;
        }

        public Builder principal(@Nullable Input<String> principal) {
            this.principal = principal;
            return this;
        }

        public Builder principal(@Nullable String principal) {
            this.principal = Input.ofNullable(principal);
            return this;
        }

        public Builder revisionId(@Nullable Input<String> revisionId) {
            this.revisionId = revisionId;
            return this;
        }

        public Builder revisionId(@Nullable String revisionId) {
            this.revisionId = Input.ofNullable(revisionId);
            return this;
        }

        public Builder statementId(@Nullable Input<String> statementId) {
            this.statementId = statementId;
            return this;
        }

        public Builder statementId(@Nullable String statementId) {
            this.statementId = Input.ofNullable(statementId);
            return this;
        }

        public Builder versionNumber(@Nullable Input<Integer> versionNumber) {
            this.versionNumber = versionNumber;
            return this;
        }

        public Builder versionNumber(@Nullable Integer versionNumber) {
            this.versionNumber = Input.ofNullable(versionNumber);
            return this;
        }
        public LayerVersionPermissionState build() {
            return new LayerVersionPermissionState(action, layerName, organizationId, policy, principal, revisionId, statementId, versionNumber);
        }
    }
}
